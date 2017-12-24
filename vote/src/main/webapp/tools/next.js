/**
 * 按钮事件
 */
window.Next = (function($,module){
    
    //上一题存储
    var preStack = [];
    //剩余题存储
    var nextStack = [];
    //现有展示题
    var nowQueseion = [];
    
    function init(){
        
        //设置题目
        setNextStack();
        //点击上一题
        clickPreButton();
        //点击下一题
        clickNextButton();
        //按钮状态
        buttonStatus();
        //展示题目
        showQuestion();
    }
    
     //点击上一题
    function clickPreButton() {
        $("#preQuestion").click(function(){
            nextStack.unshift(nowQueseion);
            nowQueseion = preStack[preStack.length-1];
            showQuestion();
            preStack.pop();
            buttonStatus();
        });
    }
     //点击下一题
    function clickNextButton() {
        $("#nextQuestion").click(function(){
            preStack.push(nowQueseion);
            nowQueseion = nextStack[0];
            nextStack.shift();
            showQuestion();
            buttonStatus();
        });
    }
    
    function  buttonStatus(){
        if(nextStack == ""){
            $("#nextQuestion").attr("disabled","disabled");
        }
        else {
            $("#nextQuestion").removeAttr("disabled");
        }
        if(preStack == ""){
            $("#preQuestion").attr("disabled","disabled");
        }
        else {
            $("#preQuestion").removeAttr("disabled");
        }
    }
    //展示题
    function showQuestion(stauts){
      $("#show").html(nowQueseion);
    }
    //调用设置题目信息
    function setNextStack(nextStackInfo) {
        nextStack = ["第一题","第二题","第三题","第四题"];
        nowQueseion = nextStack[0];
        nextStack.shift();
    }
    module.init = init;
    module.nextStack = nextStack;
    return module;

}($,window.Next||{}));
$(function(){
    window.Next.init();
});