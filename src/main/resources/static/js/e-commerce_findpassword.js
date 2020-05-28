/**
 * e-commerce_findpassword.js
 */
function keyLogin(){
	console.log("按下回车键");
 if (event.keyCode==13){	//回车键的键值为13
	 $(".login-btn").click(); //调用登录按钮的登录事件
 } 
}
/********验证码************/
$(".verificationcode").on("click", function() {
	var time = new Date().getTime();
	$(this).attr('src',"verification_code?t=" + time);
})
/*****找回密码**********/
$(".login-btn").on("click",function(){
	var cellphone = $(".cellphone").val();
	var code = $(".code").val();	
	var newpassword1 = $(".newpassword1").val();
	var newpassword2 = $(".newpassword2").val();
	if(cellphone != null && cellphone !='' && code != null && code != '' && newpassword1 != null && newpassword1 != '' && newpassword2 != null && newpassword2 != ''){
		if(newpassword1 != newpassword2){
			$("#msg").css("display", "block");
	        $("#msg").text("两次输入的密码不一致");
		}else{
			$.ajax({
		        url:"/findMemberPassword",
		        type:"post",
		        data:{
		        	"cellphone":cellphone,
		        	"code":code,
		        	"newpassword1":newpassword1
		        },
		        success:function (data) {
		        	if(data.sendcode==1){
		        		$("#msg").css("display", "block");
		                $("#msg").text("改密成功");
		        	}else if(data.sendcode==2){
		        		$("#msg").css("display", "block");
		                $("#msg").text("用户不存在");
		        	}else if(data.sendcode==3){
		        		$("#msg").css("display", "block");
		                $("#msg").text("验证码错误");
		        	}
		        	else{
		        		$("#msg").css("display", "block");
		                $("#msg").text("改密失败");
		        	}
		        },
		        error:function(){
		        	alert("error");
		        }
		    });
		}
	}else{
		$("#msg").css("display", "block");
        $("#msg").text("输入不能为空!!!");
	}
})