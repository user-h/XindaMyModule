$(".search-product").on("click", function () {
    $(".search-product").addClass("font-aqua");
    $(".search-service").removeClass("font-aqua");
})
$(".search-service").on("click", function () {
    $(".search-service").addClass("font-aqua");
    $(".search-product").removeClass("font-aqua");
})

$(".banner a").on("click", function (event) {
    $(".banner a").removeClass("border-b");
    $(event.target).addClass("border-b");
})

$(".user-action a").on("click", function (event) {
    $(".user-action a").removeClass("bg-gray");
    $(event.target).addClass("bg-gray");
})
$(".content-nav li").on("click", function (event) {
    $(".content-nav li").removeClass("nav-active");
    $(event.target).addClass("nav-active");
})

$(".content-banner li").eq(0).on("click", function (event) {
    $(".content-banner li").removeClass("border-b1");
    $(event.target).addClass("border-b1");
    $(".change-password").hide();
    $(".account-info").show();
})
$(".content-banner li").eq(1).on("click", function (event) {
    $(".content-banner li").removeClass("border-b1");
    $(event.target).addClass("border-b1");
    $(".change-password").show();
    $(".account-info").hide();
})

/**********修改密码**********/
$(".change-password .save").on("click",function(){
	var id = $(".thismemberid").val();
	var oldpassword = $(".oldpassword").val();
	var newpassword1 = $(".newpassword1").val();
	var newpassword2 = $(".newpassword2").val();
	//alert(id + oldpassword +newpassword1 + newpassword2)
	if(oldpassword != null && oldpassword != '' && newpassword1 != null && newpassword1 != '' && newpassword2 != null && newpassword2 != ''){
		if(newpassword1 != newpassword2){
			$("#msg").css("display", "block");
	        $("#msg").text("两次输入的密码不一致");
		}else{
			$.ajax({
		        url:"/changMemberPassword",
		        type:"post",
		        data:{
		        	"id":id,
		        	"oldpassword":oldpassword,
		        	"newpassword1":newpassword1
		        },
		        success:function (data) {
		        	if(data.code==1){
		        		$("#msg").css("display", "block");
		                $("#msg").text("修改成功");
		        	}else if(data.code==-1){
		        		$("#msg").css("display", "block");
		                $("#msg").text("旧密码输入错误");
		        	}else{
		        		$("#msg").css("display", "block");
		                $("#msg").text("修改失败");
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
/*********修改基本信息**************/
$(".account-info .save").on("click",function(){
	var id = $(".thismemberid");
	var gender = $("input[name=sex]:checked");
	var name = $(".membername");
	var email = $(".email");
	var member = {"id":id.val(),"gender":gender.val(),"name":name.val(),"email":email.val()};
	//console.log(member);
	$.ajax({
        url:"/changBasicInformation",
        type:"post",
        data:member,
        success:function (data) {
        	if(data.code==1){
        		alert("修改成功");
        		location.href="/e-commerce_account"
        	}else{
        		location.href="error";
        	}
        },
        error:function(){
        	console.error(arguments[0])
        }
    });
})

$("input[name='updatemessage']").focus(function(){
	$(this).val("");
});
/******加载性别******/
$(document).ready(function(){
	//alert(sessionStorage.getItem("username"));//alert($.session.get("username"));
	console.log($(".gender").val());
	if($(".gender").val()==1){
		$("input[name=sex][value=1]").attr("checked",true);
	}else{
		$("input[name=sex][value=2]").attr("checked",true)
	}
});
/********搜索**********/
$(".search-btn").on("click",function(){
	console.log($(".font-aqua .selectType").val());
	//$(".article").hide();
	var name = $(".select-name").val();
	location.href= $(".font-aqua .selectType").val() + "?name=" + name;
	
})