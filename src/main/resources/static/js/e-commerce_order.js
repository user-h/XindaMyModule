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

$(".user-action a").on("click", function(event){
    $(".user-action a").removeClass("bg-gray");
    $(event.target).addClass("bg-gray");
})

/*$(".payment").on("click",function(){
	var orderId = $(this).parent().parent().parent().children().children(".orderId").text();
	//console.log();
	$.ajax({
        url:"/payment",
        type:"get",
        data:{"orderId":orderId},
        success:function (data) {
        	if(data.code==1){
        		alert("支付成功");
        		window.location.reload()
        	}else{
        		alert("支付失败");
        	}
        }
    })
})*/
$(".payment").on("click",function(){
	var serverId = $(this).siblings(".serverId").val();
	location.href="e-commerce_settlement?serviceId=" + serverId;
})
function payment(serverId){
	//console.log(serverId);
	location.href="e-commerce_settlement?serviceId=" + serverId;
}
/*****点击删除订单*****/
$(".deleteOrder").on("click",function(){
	var orderId = $(this).parent().parent().parent().children().children(".orderId").text();
	
	if (confirm("确认删除订单？？？")==true){
		$.ajax({
	        url:"/deleteOrder",
	        type:"get",
	        data:{"orderId":orderId},
	        success:function (data) {
	        	if(data.code==1){
	        		alert("删除成功");
	        		window.location.reload()
	        	}else{
	        		alert("删除失败");
	        	}
	        }
	    })
    }else{
    	
    }
})
function deleteOrder(orderId){
	//console.log(orderId);
	if (confirm("确认删除订单？？？")==true){
		$.ajax({
	        url:"/deleteOrder",
	        type:"get",
	        data:{"orderId":orderId},
	        success:function (data) {
	        	if(data.code==1){
	        		alert("删除成功");
	        		window.location.reload()
	        	}else{
	        		alert("删除失败");
	        	}
	        }
	    })
    }else{
    	
    }
}
/****按时间 或 订单号 查询*****/
$(".selectOrderButton").on("click",function(){
	//var serverId = $(this).siblings(".serverId").val();
	var partOrderId = $(".selectOrderInput").val();
	var beginDate = $(".beginDate").val();
	var endDate = $(".endDate").val();
	//alert($(".beginDate").val() + "" + $(".endDate").val());
	$.ajax({
        url:"/selectLikeByOrderId",
        type:"get",
        data:{
        	"partOrderId":partOrderId,
        	"beginDate":beginDate,
        	"endDate":endDate,
        },
        success:function (data) {
        	//console.log(data);
        	var str = "";
        	var i;
        	if(data.code==1){
        		//console.log(data);
        		//console.log(data.businessOrderList[0].id);
        		console.log(data.businessOrderList[0].status);
        		$.each(data.businessOrderList,function(index,item){
        			
        			if(item.status == 1){
        				str+= `
        	        		<div class="orders">
        	                	<div class="order-num">订单号：<span style="height:50px" class="orderId" text="`+ item.id +`">`+item.id +`</span> 下单时间：<span class="createTime" text="`+data.businessOrderList[0].createTime+`">`+data.businessOrderList[0].createTime+`</span></div>
        	                	<ul class="order-details">
        	                	<li>
        	                		<img src="./images/user-lg.png" alt="图片">
        	                		<ul>
        	                			<li text="`+item.orderInfo+`">
        	                			`+item.orderInfo+`
        	                			</li>
        	                    		<!-- <li>云智汇咨询服务有限公司</li>
        	                    		<li>代理记账（一年）</li> -->
        	                		</ul>
        	                		<p>¥<span class="price" text="`+item.totalPrice+`">` + item.totalPrice +`</span></p>
        	                		<p>1</p>
        	                	</li>
        	           	 		<li class="font-aqua">¥<span class="totalPrice" text="`+item.totalPrice+`">`+item.totalPrice+`</span></li>
        	                	<li class="font-aqua">已付款</li>
        	           	 		<li>
        	            			<i>交易完成</i>
        	           	 		</li>
        	                	</ul>
        	                </div>
        	        		`;
        			}else{
        				str+=`
        					<div class="orders">
        					<div class="order-num">订单号：<span style="height:50px" class="orderId" text="`+ item.id +`">`+item.id +`</span> 下单时间：<span class="createTime" text="`+data.businessOrderList[0].createTime+`">`+data.businessOrderList[0].createTime+`</span></div>
        	                	<ul class="order-details">
        	                	<li>
        	                		<img src="./images/user-lg.png" alt="图片">
        	                		<ul>
        	                			<li text="`+item.orderInfo+`">
        	                			`+item.orderInfo+`
        	                			</li>
        	                    		<!-- <li>云智汇咨询服务有限公司</li>
        	                    		<li>代理记账（一年）</li> -->
        	                		</ul>
        	                		<p>¥<span class="price" text="`+item.totalPrice+`">` + item.totalPrice +`</span></p>
        	                		<p>1</p>
        	                	</li>
        	           	 		<li class="font-aqua">¥<span class="totalPrice" text="`+item.totalPrice+`">`+item.totalPrice+`</span></li>
        	                	<li class="font-aqua">未付款</li>
        	           	 		<li>
        	           	 			<input type="hidden" class="serverId" value="`+item.serverId+`">
        	           	 			<p class="payment" onclick="payment('`+item.serverId+`')">付款</p>
        	           	 			<span class="deleteOrder" onclick="deleteOrder('`+item.id +`')">删除订单</span>
        	           	 		</li>
        	           	 		</ul>
        	           	 	</div>
        				`;
        			}
        			
        		});
        		$(".orderBox").html(str);
        		//location.href="/e-commerce_order";
         	}else{
        		$(".orderBox").html("<p style='font-size:20px'>未找到订单</p>");
        	}
        },
        error:function(){
        	
        }
    });
})
/********搜索*********/
$(".search-btn").on("click",function(){
	var name = $(".select-name").val();
	location.href= $(".font-aqua .selectType").val() + "?name=" + name;
	
})