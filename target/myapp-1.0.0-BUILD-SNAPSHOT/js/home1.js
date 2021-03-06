Ext.define(  
  'oaSystem.view.login.Login',  
  {  
    requires:['js.home'],  
    extend: 'Ext.window.Window',  
    controller: 'login',  
    closable: false,  
    resizable : false,  
    modal: true,  
    //draggable: false,  
    autoShow: true,  
    title: '用户登录---OA办公系统',  
    glyph: 'xf007@FontAwesome',   
    items:[{  
        xtype:'form',//父窗体  
        reference: 'form',  
        bodyPadding: 20,  
        items:[{  
            xtype: 'textfield',  
            name: 'username',  
            labelWidth: 50,  
            fieldLabel: '用户名',  
            allowBlank: false,  
            emptyText: '用户名或邮箱地址'  
          },{  
            xtype: 'textfield',  
            name: 'password',  
            labelWidth: 50,  
            inputType: 'password',   
            fieldLabel: '密  码',  
            allowBlank: false,  
            emptyText: '请输入您的密码'  
          }]  
    }],  
    buttons: [{  
                name: 'registbutton',  
                text: '用户注册',  
                glyph: 'xf118@FontAwesome'  
              },{  
                name: 'loginbutton',  
                text: '用户登录',  
                glyph: 'xf110@FontAwesome',  
                region: 'center',  
                listeners:{  
                  click: 'onLoginbtnClick'//单击事件 调用LoginConroller.js中的onLoginbtnClick函数  
                }  
              }]  
  }  
);  

Ext.onReady(function () {
    Ext.create('oaSystem.view.login.Login', {
        renderTo: Ext.getBody(),
    });
});