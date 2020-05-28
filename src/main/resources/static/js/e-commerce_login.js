$(".verificationcode").on("click", function() {
		var time = new Date().getTime();
		$(this).attr('src',"verification_code?t=" + time);
})

/**** 自运行（加载验证码） ***/
$(function() {
	var time = new Date().getTime();
	$(".verificationscode").attr('src',"verification_code?t=" + time);
})

function keyLogin(){
	console.log("按下回车键");
 if (event.keyCode==13)  //回车键的键值为13
   $(".login-btn").click(); //调用登录按钮的登录事件
}
/********点击[立即登录]*********/
$(".login-btn").on("click", function() {
	var cellphone = $(".cellphone").val();
	var password = $(".password").val();
	var code = $(".code").val();
	//alert(cellphone + "====" + password + "=====" + code );
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
			url : "/userLoginIn",
			// 请求参数
			data : {
				"cellphone" : cellphone,
				"password" : password,
				"code" : code,
			},
			dataType:'json',
			// 返回数据类型
			// 请求成功后调用函数
			success : function(data) {
				$("#msg").css("display", "block");
		        $("#msg").text("");
		        //var b = JSON.stringify(data);		//把Object对象显示为字符串
		        //alert(data.sendcode);
		        if(data.sendcode==1){
		        	location.href="selectByProviderName";
		        }else{
		        	alert(data.message);
		        	location.href="e-commerce_login";
		        }
			},
			// 请求失败后调用函数
			error : function(data) {
				alert("error===" + arguments[1]);
				//location.href = "e-commerce_login";
				//console.log("失败后返回数据", data);
				console.log(arguments[1]);
			}
		});
	}
})
