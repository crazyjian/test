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
    title: '�û���¼---OA�칫ϵͳ',  
    glyph: 'xf007@FontAwesome',   
    items:[{  
        xtype:'form',//������  
        reference: 'form',  
        bodyPadding: 20,  
        items:[{  
            xtype: 'textfield',  
            name: 'username',  
            labelWidth: 50,  
            fieldLabel: '�û���',  
            allowBlank: false,  
            emptyText: '�û����������ַ'  
          },{  
            xtype: 'textfield',  
            name: 'password',  
            labelWidth: 50,  
            inputType: 'password',   
            fieldLabel: '��  ��',  
            allowBlank: false,  
            emptyText: '��������������'  
          }]  
    }],  
    buttons: [{  
                name: 'registbutton',  
                text: '�û�ע��',  
                glyph: 'xf118@FontAwesome'  
              },{  
                name: 'loginbutton',  
                text: '�û���¼',  
                glyph: 'xf110@FontAwesome',  
                region: 'center',  
                listeners:{  
                  click: 'onLoginbtnClick'//�����¼� ����LoginConroller.js�е�onLoginbtnClick����  
                }  
              }]  
  }  
);  

Ext.onReady(function () {
    Ext.create('oaSystem.view.login.Login', {
        renderTo: Ext.getBody(),
    });
});