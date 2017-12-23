/**
 * 登录页面相关
 */
window.Index = (function($,module){
    $("#userLogin").click(function(){
        window.location.href="/vote/jsp/login.jsp?&type=user";
    });
    $("#groupLogin").click(function(){
        window.location.href="/vote/jsp/login.jsp?&type=group";
    });
    
    function init(){
        pageTips();
        //点击登录
        loginPage();
        //点击注册
        newUser();
    }
    
    /**
     * 页面提示信息
     */
    function pageTips(){
        var type = location.search.split("=")[1];
        if(type == "user")
        {
            $("#welcomeLogin").html("欢迎个人登录");
        }
        else{
            $("#welcomeLogin").html("欢迎团队登录");
        }
    }
    
    //登陆页面，登陆成功后进入答题系统
    function loginPage(){
        $("#loginSystem").click(function(){
            $.ajax({
                type: "get",
                dataType: "json",
                url: '../theme/loginSystem.action',
                data: {
                    params:getParams(),
                },
                success: function (data) {
                    if (data != "") {
                        $("#pager").pager({ pagenumber: pagenumber, pagecount: data.split("$$")[1], buttonClickCallback: PageClick });
                        $("#anhtml").html(data.split("$$")[0]);

                    }
                },
                error: function(data) {
                    alert(data);
                }
            });
            
        });
    }
    
     //注册账号，弹框注册，注册完成后进行登录
    function newUser(){
        
    }
    
    //获取页面相关参数
    function getParams(){
        return {
            "account":123456,
            "pass" : 123
        };
    }
    
    module.init = init;
    return module;

}($,window.Index||{}));
$(function(){
    window.Index.init();
});