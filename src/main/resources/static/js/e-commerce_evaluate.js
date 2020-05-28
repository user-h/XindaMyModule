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
/*
$(".evaluate_btn").on("click",function(){
	gotoEvaluation($(this).siblings(".evaluateid").val());
})
*/
/**********点击去[去评价]************/
$(".evaluate_btn").on("click", function(event){
	gotoEvaluation($(this).siblings(".evaluateid").val());
	//$(".masking").show();
})
/*******保存评价********/
$(".save").on("click", function(event){
	var judgeId = $(".judgeId").val();
	var evaluateMessage = $(".evaluateMessage").val();
	var type = $("input[name=evaluate]:checked").val()
	$.ajax({
		url:"/addEvaluation",
		type:"post",
		data:{
			"judgeId":judgeId,
			"evaluateMessage":evaluateMessage,
			"type":type,
		},
		success:function(data){
			if(data.code==1){
				alert("评价提交成功！！！");
				$(".masking").hide();
			    console.log("保存");
				//history.back(-1);
				location.href="/e-commerce_evaluate";
			}
		},
		error:function(){
			alert("提交失败");
		}
	})
    
})
/******点击取消******/
$(".cancel").on("click", function(event){
    $(".masking").hide();
    console.log("取消");
})   
/*****加载弹窗内容******/
function gotoEvaluation(judgeId){
	//alert(judgeId);
	//location.href="selectAddEvaluation?judgeId=" + judgeId;
	$.ajax({
		url:"/selectAddEvaluation",
        type:"post",
        data:{"judgeId":judgeId},
        success:function (data) {
        	console.log(data);
        	$(".judgeId").val(data.judgeId);
        	$(".orderId").text(data.businessOrder.id);
        	$(".orderInfo").text(data.businessOrder.orderInfo);
        	$(".totalPrice").text(data.businessOrder.totalPrice);
        	$(".createtime").text(data.businessOrder.createTime);
        	
        },
        error:function(){
        	alert("error");
        	//console.error(arguments[1]);
        }
	})
	$(".masking").show();
}
/**********切换已评价/未评价 ajax动态生成查到的内容 ***********/
$(".content-nav li").on("click", function(event){
    $(".content-nav li").removeClass("nav-active");
    $(event.target).addClass("nav-active");
    //alert("value=" + $(".nav-active .status").val());
    var status = $(".nav-active .status").val();
    $.ajax({
        url:"/selectOrderJudge",
        type:"post",
        data:{"status":status},
        success:function (data) {
        	//console.log(data);
        	if(data.code==1){
        		var str = "";
        		$.each(data.businessOrderList,function(index,item){
        			if(item.serviceJudge.status==1){
        				//console.log(item.id);
        				str+=`
        				<div class="article">
            				<img src="./images/user-lg.png" alt="图片" />
            				<ul class="article-info">
            					<li text="` + item.orderInfo +`"> ` + item.orderInfo + `</li>
            				</ul>
            				<p th:text="` + item.createTime + `">`+ item.createTime +`</p>
            				<p class="evaluate_btn" onclick="gotoEvaluation('` + item.serviceJudge.id +`')">去评价</p>
            			</div>
            			`;
        			}else{
        				str+=`
        				<div class="article">
            				<img src="./images/user-lg.png" alt="图片" />
            				<ul class="article-info">
            					<li text="` + item.orderInfo +`"> ` + item.orderInfo + `</li>
            				</ul>
            				<p th:text="` + item.createTime + `">`+ item.createTime +`</p>
            				<p class="evaluate_btn">已评价</p>
            			</div>`;
        			}
        		});
        		
        		$(".box").html(str);
        	}else{
        		$(".box").html("<p style='font-size:20px'>未找到订单</p>");;
        	}
        },
        error:function(){
        	console.error(arguments[1]);
        }
    });
})
/**********搜索*************/
$(".search-btn").on("click",function(){
	var name = $(".select-name").val();
	location.href= $(".font-aqua .selectType").val() + "?name=" + name;
	
})
