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
    var type = location.search.split("=")[1];
    //记录账号信息
    var accountInfo={};
    //账号异常信息
    var msg = {
    }
    
    function init(){
        //页面提示信息
        pageTips();
        //查询数据库中个人账号相关信息
        queryAccuntInfo();
        //事件绑定
        buttonClick();
    }
    
    /**
     * 页面提示信息
     */
    function pageTips(){
        if(type == "user")
        {
            $("#welcomeLogin").html("欢迎个人登录");
        }
        else{
            $("#welcomeLogin").html("欢迎团队登录");
        }
    }
    
    //查询用户账号信息
    function queryAccuntInfo(){
        $.ajax({
            type: "get",
            dataType: "json",
            url: '../login/queryAccountInfo.action',
            data: {
                params:JSON.stringify(getParams(true))
            },
            success: function (data) {
                accountInfo = data;
//                if (data) {
//                    window.location.href="/vote/jsp/login.jsp?&type="+ type;
//                }
//                else{
//                    newUser();
//                }  
            },
            error: function(data) {
                console.log(data);
            }
        });
    }
    
    //事件绑定
    function buttonClick(){
        $("#loginSystem").click(function(){
            var curInfo = getParams(true);
            var acc = curInfo.account;
            var pas = curInfo.password;
            var flag = true;
            if(accountInfo)
            {
                for(var i=0;i<accountInfo.length;i++)
                {
                    if(acc == accountInfo[i].account && pas == accountInfo[i].password){
                        window.location.href="/vote/jsp/login.jsp?&type="+ type;
                        flag = false;
                    }
                }
                if(flag)
                {
                    errorAccountInfo();
                }
            }
        });
        
        $('#newSystem').click(function(){
            newUserDialog();
        });
    }
    //账号异常弹框
    function errorAccountInfo(msg)
    {
        var onlyChoseAlert = simpleAlert({
            "title":"提示",
            "content":"账号信息有误，请重新输入或前往注册",
            "buttons":{
                "确定":function () {
                    onlyChoseAlert.close();
                }
            }
        })
    }
     //注册账号，弹框注册，注册完成后进行登录
    function newUserDialog(){
        //单次双选弹框
            var dblChoseAlert = simpleAlert({
                "title":"注册",
                "content":$("#newAccount").html(),
                "buttons":{
                    "注册":function () {
                        newUser();
                        dblChoseAlert.close();
                    },
                    "取消":function () {
                        dblChoseAlert.close();
                    }
                }
            })
    }
    
    //注册账号页面
    function newUser()
    {
        if(accountInfo)
        {
            for(var i=0;i<accountInfo.length;i++)
            {
                if(newAccount == accountInfo[i].account){
                    alert("用户名重复");
                }
            }
        }
//        if(getParams(false).newAccount == "" || newPass == "")
//        {
//            alert("注册账号为空");
//        }
        $.ajax({
            type: "get",
            dataType: "json",
            url: '../login/addAccount.action',
            data: {
                params:JSON.stringify(getParams(false)),
            },
            success: function (data) {
                accountInfo = data;
//                if (data) {
//                    window.location.href="/vote/jsp/login.jsp?&type="+ type;
//                }
//                else{
//                    newUser();
//                }  
            },
            error: function(data) {
                console.log(data);
            }
        });
        
        
    }
    /**
     * 获取页面相关参数
     * @param status 登录状态
     */
    function getParams(status){
        if(status){
            return {
                "account":$("#userName").val(),
                "password": $("#userPass").val(),
                "type": type,
            };
        }
        return {
            "newAccount" : $("#newName").val(),
            "newPass" : $("#newPass").val(),
            "newSign" : $("#newSign").val(),
            "type": type,
        }
    }
    
    module.init = init;
    return module;

}($,window.Index||{}));
$(function(){
    window.Index.init();
});