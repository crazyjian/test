/*Ext.define(  
   'ExtJSTest.MyPanel',  
  {  
  
     extend : 'Ext.Panel',  
  
     title  : 'Hello World',  
  
     html   : 'Hello <b>World</b>...'  
  
   }); 

Ext.application({  
    name: "ExtJSTest",  
    launch: function(){  
          
      Ext.create('ExtJSTest.MyPanel', {  
        renderTo     : Ext.getBody(),  
        title        : 'MyFirst Panel',  
        html         : 'MyFirst Panel'  
      });  
      Ext.create('ExtJSTest.MyPanel', {  
          renderTo     : Ext.getBody(),
          title:'r23r'
      });        
  }  
});*/

Ext.define('MyApp.Panel', {
    extend: 'Ext.panel.Panel',
    alias: 'widget.mypanel',
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
            {xtype: 'mypanel', html: 'Xtype1!'},
            {xtype: 'mypanel', html: 'Xtyoe2!'}
        ]
    });


});
