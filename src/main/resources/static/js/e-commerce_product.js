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
/********* 单击select-name 清除内容 ************/
$(".select-name").on("click",function(){
	$(this).val("");
})

$(".gotoe-commerce_shoping-car").on("click", function(){
	var memberId = $(".memberId").val();
	if(memberId != null && memberId != '' && memberId != null && memberId!= ''){
		location.href="/selectCartByMemberId";
	}else{
		swal({
			title:'请登录',
			text:'请点击登录',
			type:'error',
			confirmButtonText: "确定"
		},function(isConfirm){
			setTimeout(function () {
				location.href="index.html";
			}, 100);
		});
	}
})
$(".gotoe-commerce_order").on("click", function(){
	var memberId = $(".memberId").val();
	if(memberId != null && memberId != '' && memberId != null && memberId!= ''){
		location.href="/e-commerce_order";
	}else{
		swal({
			title:'请登录',
			text:'请点击登录',
			type:'error',
			confirmButtonText: "确定"
		},function(isConfirm){
			setTimeout(function () {
				location.href="index.html";
			}, 100);
		});
	}
})
$(".content-nav li").on("click", function(event){
    $(".content-nav li").removeClass("nav-active");
    $(event.target).addClass("nav-active");
    
    var orderByClause = 0;
    if($(".nav-active input").val()==1){
    	orderByClause = Math.ceil(Math.random()+0.5);
    }
    location.href= $(".font-aqua .selectType").val()+  "?name=" + $("#name").val() + '&orderByClause=' + orderByClause;
})
/********搜索*********/
$(".search-btn").on("click",function(){
	console.log($(".font-aqua .selectType").val());
	//$(".article").hide();
	var name = $(".select-name").val();
	location.href= $(".font-aqua .selectType").val() + "?name=" + name;
	
})
/****** 添加到购物车 ******/
$(".addIntoCart").on("click",function(){
	var addIntoCartPost = $(this).siblings(".addIntoCartPost").val();
	//console.log($(this).parent().parent().children().children(".addIntoCartPost"));
	//alert($(this).siblings(".addIntoCartPost").val());
	var memberId = $(".memberId").val();
	//alert(addIntoCartPost + "?=====?" + $(".username").text());
	if(memberId != null && memberId != '' && memberId != null && memberId!= ''){
		$.ajax({
			url:"/addIntoCart",
			type:"post",
			data:{
				"providerId":addIntoCartPost,
				"memberId":memberId
			},
			success:function(data){
				if(data.code==1){
					swal({
				        title: "已添加",
				        text: "已成功加入购物车",
				        type: "success",
				        showCancelButton: true,
				        confirmButtonColor: "#DD6B55",
				        cancelButtonText: "返回",
				        confirmButtonText: "确认",
				        closeOnConfirm: false,
				        closeOnCancel: false
				    }, function(isConfirm) {
				        if (isConfirm) {
				        	window.location.href="/selectCartByMemberId";               
				        }else{
				        	swal({
				                title: "返回",
				                //text: "2秒后自动关闭",
				                timer: 100,
				                showConfirmButton: false
				            })
				        }
				    })
				}else if(data.code==-1){
					swal({
						title:'已存在',
						text:'此商品已存在于购物车',
						type:'warning',
						confirmButtonText: "确定",
						//timer: 2000
					},function(isConfirm){
						setTimeout(function () {
							location.reload();		//刷新页面
						}, 100);
					});
				}else{
					swal({
						title:'添加失败',
						text:'加入购物车失败',
						type:'error',
						confirmButtonText: "确定"
						//timer: 2000
					},function(isConfirm){
						setTimeout(function () {
							location.reload();		//刷新页面
						}, 100);
					});
				}
			},
			error:function(){
				alert("error22222!!!");
				location.href="#";
			}
		});
	}else{
		swal({
			title:'请登录',
			text:'请点击登录',
			type:'error',
			confirmButtonText: "确定"
			//timer: 2000
		},function(isConfirm){
			setTimeout(function () {
				location.href="index.html";
			}, 100);
		});
	}
	
})
/********** 立即购买 **********/
$(".payForService").on("click",function(){
	var serviceId = $(this).siblings(".addIntoCartPost").val();
	location.href="/e-commerce_settlement?serviceId=" + serviceId;
})

$(document).ready(function(){
	
		var pcount=$('#count').val();
		var psize=$('#pageSize').val();
		var pstart=$('#pageStart').val();
		var nowpage=Math.floor(pstart/psize)+1;		//pstart/psize+1;				//Math.floor(pstart/psize)+1;			//(pstart-pstart%psize)/psize+1;
		var name=$('#name').val();
		var findmode = $("#findMode").val();
		var orderByClause = $("#orderByClause").val();
		var cpage=Math.ceil(pcount/psize);
		var strhtml="";
		
		if(cpage<=10){
			for(var i=1;i<=cpage;i++){
				if(i==nowpage){
					strhtml+='<a href=/'+ findmode +'?pageStart='+psize*(i-1)+ '&name=' + name +"&orderByClause=" + orderByClause +' style="background-color:#aaaaaa;font-weight:700">'+i+'</a>';
				}else{
					strhtml+='<span> <a href=/'+ findmode +'?pageStart='+psize*(i-1)+'&name=' + name +"&orderByClause=" + orderByClause +'>'+i+'</a></span>';
				}
			}
		}else if(cpage>10 && 1<=nowpage && nowpage<=6){		//pagestart=20 nowpage=11 cpage=15
			//alert("111111===" + nowpage);
			for(var i=1;i<=10;i++){
				if(i==nowpage){
					strhtml+='<a href=/'+ findmode +'?pageStart='+psize*(i-1)+'&name=' + name +"&orderByClause=" + orderByClause +' style="background-color:#aaaaaa;font-weight:700">'+i+'</a>';
					//strhtml+='<a href=/selectByProviderName?pageStart='+psize*(i-1)+' style="background-color:#aaaaaa"><div class="nowpage">'+i+'</div></a>';
				}else{
					strhtml+='<span> <a href=/'+ findmode +'?pageStart='+psize*(i-1)+'&name=' + name +"&orderByClause=" + orderByClause +'>'+i+'</a></span>';
				}
			}
		}else if(cpage>10 && nowpage<=cpage-4){
			//alert("222222===" + nowpage);
			for(var i=nowpage-5;i<=nowpage+4;i++){//6--15
				if(i==nowpage){
					strhtml+='<a href=/'+ findmode +'?pageStart='+psize*(i-1)+'&name=' + name +"&orderByClause=" + orderByClause +' style="background-color:#aaaaaa;font-weight:700">'+i+'</a>';
				}else{
					strhtml+='<span><a href=/'+ findmode +'?pageStart='+psize*(i-1)+'&name=' + name +"&orderByClause=" + orderByClause +'>'+i+'</a></span>';
				}
			}
		}else if(cpage>10 && cpage-4<nowpage && nowpage<=cpage){
			//alert("333333===" + nowpage);
			for(var i=cpage-9;i<=cpage;i++){
				if(i==nowpage){
					strhtml+='<a href=/'+ findmode +'?pageStart='+psize*(i-1)+'&name=' + name +"&orderByClause=" + orderByClause +' style="background-color:#aaaaaa;font-weight:700">'+i+'</a>';
				}else{
					strhtml+='<span> <a href=/'+ findmode +'?pageStart='+psize*(i-1)+'&name=' + name +"&orderByClause=" + orderByClause +'>'+i+'</a></span>';
				}
			}
		}else{
			console.error(00000000);
		}
		$("#mydiv").html(strhtml);
		
		//console.log(findmode=="selectByServiceName");
		if(findmode=="selectByServiceName"){
			$(".search-service").addClass("font-aqua");
		    $(".search-product").removeClass("font-aqua");
		}
		if(orderByClause==0){
		}else{
			$(".content-nav li").eq(0).removeClass("nav-active");
		    $(".content-nav li").eq(1).addClass("nav-active");
		}
		if(name!='' && name!=null){
			$(".select-name").val(name);
		}
	});
