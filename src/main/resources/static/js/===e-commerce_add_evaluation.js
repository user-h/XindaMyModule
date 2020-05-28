/**
 * e-commerce_add_evaluation.js
 */

$(".save").on("click",function(){
			console.log("0000");
			//console.log($(".judgeId").val());
			//console.log($(".evaluateMessage").val());
			//console.log($("input[name=evaluate]:checked").val());
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
						//history.back(-1);
						location.href="/e-commerce_evaluate";
					}
				},
				error:function(){
					alert("提交失败");
				}
			})
})