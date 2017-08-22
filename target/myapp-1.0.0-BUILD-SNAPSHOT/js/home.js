Ext.onReady(function () {
	Ext.create('Ext.form.Panel', {
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
});

/*Ext.define('MyApp.Panel', {
    extend: 'Ext.panel.Panel',
    //alias: 'widget.mypanel',
    xtype: 'mypanel',
    title: 'MyPanel'
});

Ext.onReady(function(){
    // 使用 Ext.create
    Ext.create('widget.mypanel',{
        html: 'Create Widget!',
        width: 400,
        height: 200,
        broder: true,
        renderTo: Ext.getBody()});

    // 使用xtype
    Ext.widget('panel', {
        renderTo: Ext.getBody(),
        width: 400,
        margin: '10 0 0 10 ',
        broder: true,
        items: [
            {xtype: 'mypanel', html: 'Xtype11!'},
            {xtype: 'mypanel', html: 'Xtyoe2!'}
        ]
    });


});*/

/*Ext.define('MyApp.view.TestViewModel', {
    extend: 'Ext.app.ViewModel',

    alias: 'viewmodel.test', // connects to viewModel/type below

    data: {
        firstName: 'John',
        lastName: 'Doe'
    },

    formulas: {
        // We'll explain formulas in more detail soon.
        name: function (get) {
            var fn = get('firstName'), ln = get('lastName');
            return (fn && ln) ? (fn + ' ' + ln) : (fn || ln || '');
        }
    }
});

Ext.define('MyApp.view.TestView', {
    extend: 'Ext.panel.Panel',
    layout: 'form',

    // Always use this form when defining a view class. This
    // allows the creator of the component to pass data without
    // erasing the ViewModel type that we want.
    viewModel: {
        type: 'test'  // references alias "viewmodel.test"
    },

    bind: {
        title: 'Hello {name}'
    },

    defaultType: 'textfield',
    items: [{
        fieldLabel: 'First Name',
        bind: '{firstName}'
    },{
        fieldLabel: 'Last Name',
        bind: '{lastName}'
    },{
        xtype: 'button',
        text: 'Submit',
        bind: {
            hidden: '{!name}'
        }
    }]
});

Ext.onReady(function () {
    Ext.create('MyApp.view.TestView', {
        renderTo: Ext.getBody(),
        width: 400
    });
});
*/