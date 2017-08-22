Ext.define('Test.view.HomePanel', {
	extend : 'Ext.form.Panel',
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
        }
    ]
});