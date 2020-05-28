$(".search-product").on("click", function(){
    $(".search-product").addClass("font-aqua");
    $(".search-service").removeClass("font-aqua");
})
$(".search-service").on("click", function(){
    $(".search-service").addClass("font-aqua");
    $(".search-product").removeClass("font-aqua");
})

$(".banner a").on("click", function(event){
    $(".banner a").removeClass("border-b");
    $(event.target).addClass("border-b");
})

$(".content-nav li").on("click", function(event){
    $(".content-nav a").removeClass("nav-active");
    $(event.target).addClass("nav-active");
})
/******点击“-”时执行 ************/
$(".subcart").on("click",function(){
	var productId = $(this).parent().parent().children().children(".productId").val();
	var getbuynum = $(this).siblings(".buynum");
	var buynum = getbuynum.val();
	var allPrice = $(".allPrice").text();
	var getTotalPrice = $(this).parent().parent().children().children(".totalPrice");
	if(buynum > 1){
		buynum--;
		$.ajax({
			url:"/changeBuyNumCart",
			type:"post",
			data:{
				"productId":productId,
				"buynum":buynum
			},
			dataType:"json",
			success:function(data){
				if(data.code == 1){
					getbuynum.val(data.buynum);
					getTotalPrice.text(data.totalPrice);
					$(".allPrice").text(parseInt(allPrice)+data.changePrice);
				}else{
					alert("修改失败");
				}
				
			},
			error:function(){
				alert("操作失败");
			}
		});
	}else{
		location.href="#";
		alert("<=0");
	}
})
/*******点击“+”时执行 *************************/
$(".addcart").on("click",function(){
	var productId = $(this).parent().parent().children().children(".productId").val();
	var getbuynum = $(this).siblings(".buynum");
	var buynum = getbuynum.val();
	var allPrice = $(".allPrice").text();
	var getTotalPrice = $(this).parent().parent().children().children(".totalPrice");
	if(buynum < 99){
		buynum++;
		$.ajax({
			url:"/changeBuyNumCart",
			type:"post",
			data:{
				"productId":productId,
				"buynum":buynum
			},
			dataType:"json",
			success:function(data){
				//alert("1111111");
				if(data.code == 1){
					//alert(data.buynum + "===" + data.totalPrice + "====" + allPrice);
					getbuynum.val(data.buynum);
					getTotalPrice.text(data.totalPrice);
					$(".allPrice").text(parseInt(allPrice)+data.changePrice);
				}else{
					alert("修改失败");
				}
				
			},
			error:function(){
				alert("操作失败");
			}
		});
	}else{
		location.href="#";
		alert("数量须小于等于99");
	}
})
/********输入数目时(数目改变)*********/
$(".buynum").change(function(){
	var productId = $(this).parent().parent().children().children(".productId").val();
	var buynum = $(this).val();
	var allPrice = $(".allPrice").text();
	var getTotalPrice = $(this).parent().parent().children().children(".totalPrice");
	$.ajax({
		url:"/changeBuyNumCart",
		type:"post",
		data:{
			"productId":productId,
			"buynum":buynum
		},
		dataType:"json",
		success:function(data){
			//alert("1111111");
			if(data.code == 1){
				//alert(data.buynum + "===" + data.totalPrice + "====" + allPrice);
				getTotalPrice.text(data.totalPrice);
				$(".allPrice").text(parseInt(allPrice)+data.changePrice);
			}else{
				alert("修改失败");
			}
			
		},
		error:function(){
			alert("操作失败");
		}
	});
})
/**** 改变鼠标移到“删除”时的样式 **************/
$(".deleteFromCart").hover(  
	    function() {  
	         this.style.cursor = 'pointer';  
	    }  
); 
/****点击删除时 执行删除 **************/
$(".deleteFromCart").on("click",function(){
	var cartId = $(this).parent().parent().children().children(".cartId").val();
	var getdiv = $(this).parent().parent().parent();
	//alert(cartId);
	$.ajax({
		url:"/deleteFromCart",
		type:"post",
		data:{"cartId":cartId},
		dataType:"json",
		success:function(data){
			if(data.code==1){
				//alert(data.cartnum);
				getdiv.hide();
				//$(this).parent().parent().parent().hide();
				$(".cartnum").text(data.cartnum);
				$(".count").text(data.cartnum);
				$(".allPrice").text(data.allPrice);
			}else{
				alert("未找到信息");
			}
		},
		error:function(){
			alert("操作失败");
		}
	});
	
})
/********搜索*********/
$(".search-btn").on("click",function(){
	var name = $(".select-name").val();
	location.href= $(".font-aqua .selectType").val() + "?name=" + name;
	
})