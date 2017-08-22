Ext.define('Test.view.homePanel', {
	extend : 'Ext.form.Panel',
	alias : 'widget.homePanel',
    renderTo: document.body,
    title: '用户注册',
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
        }
    ]
});

Ext.define('Test.model.User', {
	extend: 'Ext.data.Model',

    fields: [{
    	name: 'id',
    	type: 'int'
    },
    {
        name: 'name',
        type: 'string'
    }]
});