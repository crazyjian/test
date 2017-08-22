Ext.define('Test.view.HomePanel', {
	extend : 'Ext.Panel',
	alias : 'widget.HomePanel',
    title: '用户信息',
    height: 250,
    width: 300,
    bodyPadding: 10,
    html: '<h1 style="text-align:center">登录</h1>',
    defaultType: 'textfield',
    items: [
        {
            fieldLabel: 'First Name',
            name: 'firstName'
        },
        {
            fieldLabel: 'Last Name',
            name: 'lastName'
        },
        {
            fieldLabel: 'Email',
            name: 'email',
        },
        {
            xtype: 'datefield',
            fieldLabel: 'Date of Birth',
            name: 'birthDate'
        },
        {
        	xtype: 'button',
            text: '查 询',
            scale:'small',
            iconCls: 'common-icon-serach',
           /* listeners: {
            	 mouseover: function() {
                     this.hide();
                 },
                 hide: function() {
                     // Waits 1 second (1000ms), then shows the button again
                     Ext.defer(function() {
                         this.show();
                     }, 1000, this);
                 }
            }*/
        }
    ]
});


Ext.application({  
    name: 'ExtJSTest',  
    launch: function(){  
    	var button =  Ext.create('Test.view.HomePanel', {  
    	  renderTo: Ext.getBody()
    	}); 
    	button.on('click', function() {
    	    Ext.Msg.alert('Event listener attached by .on');
    	});
    }  
});  