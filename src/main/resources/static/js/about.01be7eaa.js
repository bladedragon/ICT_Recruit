(window["webpackJsonp"]=window["webpackJsonp"]||[]).push([["about"],{4697:function(e,i,t){},"5f25":function(e,i,t){e.exports=t.p+"img/返回.30c18af1.png"},"9c15":function(e,i,t){"use strict";var n=t("4697"),a=t.n(n);a.a},f3ba:function(e,i,t){"use strict";t.r(i);var n=function(){var e=this,i=e.$createElement,n=e._self._c||i;return n("div",{staticClass:"info"},[n("router-link",{staticClass:"pageToHome",attrs:{to:"/"}},[n("p",{staticClass:"inWord animated delay-1s duration-1s fadeInUpBig"},[e._v("返回首页")]),n("img",{staticClass:"inPic animated delay-1s duration-1s fadeInUpBig",attrs:{src:t("5f25"),width:"30%"}})]),n("div",{staticClass:"form animated delay-1s duration-1s fadeInUpBig"},[n("div",{staticClass:"popup"}),n("div",{staticClass:"detail"},[n("div",{staticClass:"head"},[e._v("报名表")]),n("div",{staticClass:"content"},[n("p",[e._v("姓名：")]),n("van-field",{staticClass:"inputBox",attrs:{size:"large",maxlength:"14","input-align":"center"},model:{value:e.info.stuname,callback:function(i){e.$set(e.info,"stuname",i)},expression:"info.stuname"}}),n("br"),n("p",[e._v("学号：")]),n("van-field",{staticClass:"inputBox",attrs:{size:"large","input-align":"center",type:"number",maxlength:"20",placeholder:"例:2018210200"},model:{value:e.info.stuid,callback:function(i){e.$set(e.info,"stuid",i)},expression:"info.stuid"}}),n("br"),n("p",[e._v("班级：")]),n("van-field",{staticClass:"inputBox",attrs:{size:"large","input-align":"center",type:"number",maxlength:"20",placeholder:"例:01011801"},model:{value:e.info.classid,callback:function(i){e.$set(e.info,"classid",i)},expression:"info.classid"}}),n("br"),n("p",[e._v("手机号：")]),n("van-field",{staticClass:"inputBox",attrs:{size:"large",maxlength:"20",type:"number","input-align":"center"},model:{value:e.info.telephone,callback:function(i){e.$set(e.info,"telephone",i)},expression:"info.telephone"}}),n("br"),n("div",{staticClass:"select"},[n("div",{staticClass:"select-left"},[n("p",[e._v("专业：")]),n("van-field",{staticClass:"inputBox",attrs:{readonly:"",clickable:"",value:e.collegeShow,placeholder:"选择","input-align":"center"},on:{click:function(i){e.showPicker=!0}}}),n("van-popup",{attrs:{"get-container":"body",position:"bottom"},model:{value:e.showPicker,callback:function(i){e.showPicker=i},expression:"showPicker"}},[n("van-picker",{attrs:{"show-toolbar":"",columns:e.columns2},on:{cancel:function(i){e.showPicker=!1},confirm:e.onConfirm}})],1)],1),n("div",{staticClass:"select-right"},[n("p",[e._v("年级：")]),n("van-field",{staticClass:"inputBox",attrs:{readonly:"",clickable:"",value:e.gradeShow,placeholder:"选择","input-align":"center"},on:{click:function(i){e.showPicker2=!0}}}),n("van-popup",{attrs:{"get-container":"body",position:"bottom"},model:{value:e.showPicker2,callback:function(i){e.showPicker2=i},expression:"showPicker2"}},[n("van-picker",{attrs:{"show-toolbar":"",columns:e.columns1},on:{cancel:function(i){e.showPicker2=!1},confirm:e.onConfirm2}})],1)],1)]),n("p",[e._v("QQ号(选填)：")]),n("van-field",{staticClass:"inputBox",attrs:{type:"number",size:"large","input-align":"center",maxlength:"20"},model:{value:e.info.qid,callback:function(i){e.$set(e.info,"qid",i)},expression:"info.qid"}}),n("br"),n("p",[e._v("综合排名(选填)：")]),n("van-field",{staticClass:"inputBox",attrs:{size:"large","input-align":"center",type:"number",maxlength:"5"},model:{value:e.info.rank_com,callback:function(i){e.$set(e.info,"rank_com",i)},expression:"info.rank_com"}}),n("br"),n("p",[e._v("专业排名(选填)：")]),n("van-field",{staticClass:"inputBox",attrs:{size:"large","input-align":"center",type:"number",maxlength:"5"},model:{value:e.info.rank_spec,callback:function(i){e.$set(e.info,"rank_spec",i)},expression:"info.rank_spec"}}),n("br"),n("p",[e._v("已加入组织(选填)：")]),n("van-field",{staticClass:"inputArea",attrs:{size:"large",type:"textarea",autosize:"",maxlength:"100",placeholder:"例：XX部门/XX实验室/XX社"},model:{value:e.info.experience,callback:function(i){e.$set(e.info,"experience",i)},expression:"info.experience"}}),n("br"),n("p",[e._v("爱好特长：")]),n("van-field",{staticClass:"inputArea",attrs:{size:"large",type:"textarea",autosize:"",maxlength:"100",placeholder:"注：字数不大于100字"},model:{value:e.info.hobby,callback:function(i){e.$set(e.info,"hobby",i)},expression:"info.hobby"}}),n("br")],1),n("div",{staticClass:"submit"},[n("van-button",{staticClass:"button",attrs:{type:"info",size:"large",loading:e.openLoading},on:{click:e.submitInfo}},[e._v("点击提交")])],1)])])],1)},a=[],s={data:function(){return{info:{stuname:"",stuid:"",classid:"",telephone:"",college:"",grade:"",qid:"",rank_com:"",rank_spec:"",experience:"",hobby:""},collegeShow:"",gradeShow:"",showPicker:!1,showPicker2:!1,columns1:["大一","大二","大三","大四","其他"],columns2:["通信工程","电子信息工程","信息工程","数媒","其他"],openLoading:!1}},methods:{onConfirm:function(e){switch(this.collegeShow=e,this.showPicker=!1,e){case"通信工程":this.info.college=1;break;case"电子信息工程":this.info.college=2;break;case"信息工程":this.info.college=3;break;case"数媒":this.info.college=4;break;case"其他":this.info.college=5}},onConfirm2:function(e){switch(this.gradeShow=e,this.showPicker2=!1,e){case"大一":this.info.grade=1;break;case"大二":this.info.grade=2;break;case"大三":this.info.grade=3;break;case"大四":this.info.grade=4;break;case"其他":this.info.grade=5}},submitInfo:function(){var e=this;if(this.openLoading=!0,""==this.info.stuname||""==this.info.stuid||""==this.info.classid||""==this.info.telephone||""==this.info.college||""==this.info.grade)return this.openLoading=!1,this.$toast.fail("请完善报名表");""==this.info.qid&&(this.info.qid="44444444");var i="http://zblade.top/recruit/addInfo",t=JSON.stringify(this.info);this.info.qid="",this.axios.post(i,t,{timeout:3e4,headers:{"Content-Type":"application/json"}}).then(function(i){200==i.data.code?(e.$toast.success("报名成功"),e.openLoading=!1,e.$router.push("/")):413==i.data.code?(e.$toast.success("你已提交"),e.openLoading=!1):(e.$toast.fail("提交失败"),e.openLoading=!1)},function(){e.$toast.fail("请求异常"),e.openLoading=!1})}}},o=s,l=(t("9c15"),t("2877")),c=Object(l["a"])(o,n,a,!1,null,"0b55c9ee",null);i["default"]=c.exports}}]);
//# sourceMappingURL=about.01be7eaa.js.map