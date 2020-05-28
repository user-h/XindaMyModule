/**** 自运行  加载验证码 和 省市区 *****/	
$(function(){
		var time = new Date().getTime();
		$(".verificationscode").attr('src',"verification_code?t=" + time);
		
		$("#province").change(function(){
			var pr_name = $(this).val();//$("#province").val()
			//alert(pr_name);
			$.ajax({
				url:"/findcity",	//"/findcity?pr_name" + pr_name		//ajax参数为数组类型 用","分隔开
				type:"get",
				data:{"pr_name":pr_name},
				dataType:"json",
				success:function(data){		//data从控制器传来的数据List
					console.log(data);
					$("#city").html("<option value=''>请选择市</option>");
					$("#county").html("<option value=''>请选择县/区</option>");
					if(data!=null){
						$(data).each(function(index){		//参数:(index,value)
							$("#city").append("<option value="+ data[index].ci_name +">" + data[index].ci_name + "</option>");
						});
					}else{
						alert("error");
					}
				},
			});
		});
		
		
		$("#city").change(function(){
			var ci_name = $(this).val();
			//alert(ci_name);
			$.ajax({
				url:"/findcounty",	//ajax参数为数组类型 用","分隔开
				type:"get",
				data:{"ci_name":ci_name},
				dataType:"json",
				success:function(data){		//data从控制器传来的数据List
					$("#county").html("<option value=''>请选择县/区</option>");
					if(data!=null){
						$(data).each(function(item){		//参数:(index,value)
							$("#county").append("<option value="+ data[item].co_name +">" + data[item].co_name + "</option>");
						});
					}else{
						alert("error");
					}
				},
			});
		});
		
		
	});
/***** 单击验证码 *******/
	$(".verificationcode").on("click", function() {
		var time = new Date().getTime();
		$(this).attr('src',"verification_code?t=" + time);
	})


	function keyLogin(){
		console.log("按下回车键");
	 if (event.keyCode==13)  //回车键的键值为13
		 $(".login-btn").click(); //调用登录按钮的登录事件
	}
/********* [注册] ***********/
	$(".login-btn").on("click", function() {
		var cellphone = $(".cellphone").val();
		var membername = $(".membername").val();
		var password = $(".password").val();
		var region = $("#province option:selected").val() +  $("#city option:selected").val() + $("#county option:selected").val();
		var code = $(".code").val();
		//alert(cellphone + "====" + password + "=====" + region );
		if(cellphone =='' || cellphone == null ){
			//window.alert("手机号不能为空");
			$("#msg").css("display", "block");
	        $("#msg").text("手机号不能为空!!!");
		}else if(password=="" || password == null){
			//window.alert("密码不能为空");
			$("#msg").css("display", "block");
	        $("#msg").text("密码不能为空!!!");
		}else if(code =="" || code==null ){
			//window.alert("验证码不能为空");
			$("#msg").css("display", "block");
	        $("#msg").text("验证码不能为空!!!");
		}else{
			$.ajax({
				// 请求类型
				type : "post",
				// 请求路径
				url : "/memberRegister",
				// 请求参数
				data : {
					"cellphone":cellphone,
					"membername":membername,
					"password":password,
					"region":region,
					"code":code
				},
				dataType:'json',
				// 返回数据类型
				// 请求成功后调用函数
				success : function(data) {
					$("#msg").css("display", "block");
			        $("#msg").text("");
			        //var b = JSON.stringify(data);		//把Object对象显示为字符串
			        //alert(data.sendcode);
			        if(data.sendcode == 0){
			        	alert("注册失败");
			        }else if(data.sendcode == 1){
			        	alert("注册成功  请登录！！！");
			        	location.href="/e-commerce_login";
					}else if(data.sendcode == 2){
						$("#msg").css("display", "block");
				        $("#msg").text("手机号不足11位");
					}
					else if(data.sendcode == 3){
						$("#msg").css("display", "block");
				        $("#msg").text("手机号已存在");
					}
					else if(data.sendcode == 4){
						$("#msg").css("display", "block");
				        $("#msg").text("验证码错误");
					}else{
						alert("error");
					}
				},
				// 请求失败后调用函数
				error : function(data) {
					alert("error===" + arguments[0]);
					console.log(arguments[1]);
				}
			});
		}
	})
