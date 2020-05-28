/********** 支付 ************/
$(".payment li").eq(1).on("click", function(){
    //location.href="e-commerce_shoping-car.html";
	var orderId = $("#orderId").text();
	//alert($("#orderId").text());
	$.ajax({
		url:"/payment",
		type:"get",
		data:{"orderId":orderId},
		dataType:"json",
		success:function(data){
			if(data.code==1){
				alert("支付成功");
				location.href="/selectByProviderName";
			}else if(data.code==0){
				alert("支付失败");
				location.href="#";
			}else{
				alert("未找到订单");
				location.href="#";
			}
		},
		error:function(){
			alert("支付失败2");
			location.href="#";
		}
	})
})
