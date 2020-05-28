/**
 * 退出登录
 */
$(".user-quit").hover(  
	    function() {  
	         this.style.cursor = 'pointer';  
	    }  
); 
$(".user-quit").on("click",function(){
	/*var r = window.confirm("确认退出");
	if (r == true) {
		window.location.href="/doLogOut";
	} else {
		window.location.href="#";
	}*/
	swal({
        title: "确认退出？",
        text: "您将退出登录！",
        type: "warning",
        showCancelButton: true,
        confirmButtonColor: "#DD6B55",
        cancelButtonText: "取消",
        confirmButtonText: "确认",
        closeOnConfirm: false,
        closeOnCancel: false
    }, function(isConfirm) {
        if (isConfirm) {
        	window.location.href="/doLogOut";               
        } else{
        	 swal({
        		    title: '取消',
        		    //text: '?秒后自动关闭。',
        		    timer: 500
        		}).then(
        		    function () {},
        		    // handling the promise rejection
        		    function (dismiss) {
        		        if (dismiss === 'timer') {
        		            console.log('I was closed by the timer')
        		        }
        		    }
        		)
        }
    })
})
