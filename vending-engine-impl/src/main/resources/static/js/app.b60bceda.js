(function(t){function e(e){for(var r,n,o=e[0],i=e[1],u=e[2],d=0,l=[];d<o.length;d++)n=o[d],Object.prototype.hasOwnProperty.call(c,n)&&c[n]&&l.push(c[n][0]),c[n]=0;for(r in i)Object.prototype.hasOwnProperty.call(i,r)&&(t[r]=i[r]);p&&p(e);while(l.length)l.shift()();return s.push.apply(s,u||[]),a()}function a(){for(var t,e=0;e<s.length;e++){for(var a=s[e],r=!0,n=1;n<a.length;n++){var o=a[n];0!==c[o]&&(r=!1)}r&&(s.splice(e--,1),t=i(i.s=a[0]))}return t}var r={},n={app:0},c={app:0},s=[];function o(t){return i.p+"js/"+({}[t]||t)+"."+{"chunk-2d2cfd83":"efa272d5"}[t]+".js"}function i(e){if(r[e])return r[e].exports;var a=r[e]={i:e,l:!1,exports:{}};return t[e].call(a.exports,a,a.exports,i),a.l=!0,a.exports}i.e=function(t){var e=[],a={"chunk-2d2cfd83":1};n[t]?e.push(n[t]):0!==n[t]&&a[t]&&e.push(n[t]=new Promise((function(e,a){for(var r="css/"+({}[t]||t)+"."+{"chunk-2d2cfd83":"dcc7a58f"}[t]+".css",c=i.p+r,s=document.getElementsByTagName("link"),o=0;o<s.length;o++){var u=s[o],d=u.getAttribute("data-href")||u.getAttribute("href");if("stylesheet"===u.rel&&(d===r||d===c))return e()}var l=document.getElementsByTagName("style");for(o=0;o<l.length;o++){u=l[o],d=u.getAttribute("data-href");if(d===r||d===c)return e()}var p=document.createElement("link");p.rel="stylesheet",p.type="text/css",p.onload=e,p.onerror=function(e){var r=e&&e.target&&e.target.src||c,s=new Error("Loading CSS chunk "+t+" failed.\n("+r+")");s.code="CSS_CHUNK_LOAD_FAILED",s.request=r,delete n[t],p.parentNode.removeChild(p),a(s)},p.href=c;var m=document.getElementsByTagName("head")[0];m.appendChild(p)})).then((function(){n[t]=0})));var r=c[t];if(0!==r)if(r)e.push(r[2]);else{var s=new Promise((function(e,a){r=c[t]=[e,a]}));e.push(r[2]=s);var u,d=document.createElement("script");d.charset="utf-8",d.timeout=120,i.nc&&d.setAttribute("nonce",i.nc),d.src=o(t);var l=new Error;u=function(e){d.onerror=d.onload=null,clearTimeout(p);var a=c[t];if(0!==a){if(a){var r=e&&("load"===e.type?"missing":e.type),n=e&&e.target&&e.target.src;l.message="Loading chunk "+t+" failed.\n("+r+": "+n+")",l.name="ChunkLoadError",l.type=r,l.request=n,a[1](l)}c[t]=void 0}};var p=setTimeout((function(){u({type:"timeout",target:d})}),12e4);d.onerror=d.onload=u,document.head.appendChild(d)}return Promise.all(e)},i.m=t,i.c=r,i.d=function(t,e,a){i.o(t,e)||Object.defineProperty(t,e,{enumerable:!0,get:a})},i.r=function(t){"undefined"!==typeof Symbol&&Symbol.toStringTag&&Object.defineProperty(t,Symbol.toStringTag,{value:"Module"}),Object.defineProperty(t,"__esModule",{value:!0})},i.t=function(t,e){if(1&e&&(t=i(t)),8&e)return t;if(4&e&&"object"===typeof t&&t&&t.__esModule)return t;var a=Object.create(null);if(i.r(a),Object.defineProperty(a,"default",{enumerable:!0,value:t}),2&e&&"string"!=typeof t)for(var r in t)i.d(a,r,function(e){return t[e]}.bind(null,r));return a},i.n=function(t){var e=t&&t.__esModule?function(){return t["default"]}:function(){return t};return i.d(e,"a",e),e},i.o=function(t,e){return Object.prototype.hasOwnProperty.call(t,e)},i.p="/",i.oe=function(t){throw console.error(t),t};var u=window["webpackJsonp"]=window["webpackJsonp"]||[],d=u.push.bind(u);u.push=e,u=u.slice();for(var l=0;l<u.length;l++)e(u[l]);var p=d;s.push([0,"chunk-vendors"]),a()})({0:function(t,e,a){t.exports=a("56d7")},"0319":function(t,e,a){"use strict";var r=a("a5fa"),n=a.n(r);n.a},"05c2":function(t,e,a){"use strict";var r=a("b697"),n=a.n(r);n.a},1084:function(t,e,a){"use strict";var r=a("36f2"),n=a.n(r);n.a},"1c96":function(t,e,a){"use strict";var r=a("7207"),n=a.n(r);n.a},"21bc":function(t,e,a){"use strict";a.r(e);var r=function(){var t=this,e=t.$createElement,a=t._self._c||e;return a("div",[a("div",{staticClass:"payment-method"},[a("div",{staticClass:"payment-method__col"},[a("button",{staticClass:"button button_payment payment-method__button",class:{active:1===this.methodId},on:{click:function(e){return t.setPaymentMethod(1)}}},[t._v(" Купюрами и монетами ")]),t._m(0)]),a("div",{staticClass:"payment-method__col"},[a("button",{staticClass:"button button_payment payment-method__button",class:{active:2===this.methodId},on:{click:function(e){return t.setPaymentMethod(2)}}},[t._v(" Бесконтактно ")]),a("p",{staticClass:"payment-method__card"},[t._v("Оплата с помощью карты или смартфона с функцией NFC")]),t._m(1)])])])},n=[function(){var t=this,e=t.$createElement,a=t._self._c||e;return a("ul",{staticClass:"payment-method__coins"},[a("li",[a("p",[t._v("Принимаются купюры номиналом в 10 ₽, 50 ₽, 100 ₽, 200 ₽.")])]),a("li",[a("p",[t._v("Принимаются монеты номиналом в 1 ₽, 2 ₽, 5 ₽, 10 ₽.")])])])},function(){var t=this,e=t.$createElement,a=t._self._c||e;return a("div",{staticClass:"payment-method__pays"},[a("p",[t._v("Поддерживаемые платежные системы")]),a("div",{staticClass:"payment-method__pay"},[a("ul",[a("li",[a("img",{attrs:{src:"/payment-logo/mir.png",alt:"mir"}})]),a("li",[a("img",{attrs:{src:"/payment-logo/visa.png",alt:"visa"}})]),a("li",[a("img",{attrs:{src:"/payment-logo/mastercard.png",alt:"mastercard"}})]),a("li",[a("img",{attrs:{src:"/payment-logo/g-pay.png",alt:"google pay"}})]),a("li",[a("img",{attrs:{src:"/payment-logo/apple_pay_logo.png",alt:"apple pay"}})])])])])}],c=a("5530"),s=a("bc3a"),o=a.n(s),i=a("2f62"),u={name:"PaymentMethod",created:function(){this.dev_mode=0},data:function(){return{timerId:0,methodId:0,isCheckPayStatus:!1}},methods:{setPaymentMethod:function(){var t=arguments.length>0&&void 0!==arguments[0]?arguments[0]:0;this.methodId=t;var e,a=1===t?"n":"b";this.$emit("changePaymentMethod",t),this.dev_mode?e="payment".concat(this.product.id,".json"):(e="payment/"+this.product.id,o.a.post(e,{payMethod:this.product.price+" "+a})),this.isCheckPayStatus=!0,this.checkPayStatus()},checkPayStatus:function(){var t,e=this;t=this.dev_mode?"payment/".concat(this.product.id,"/payStatus.json"):"payment/"+this.product.id+"/payStatus?price="+this.product.price,this.timerId=setInterval((function(){e.isCheckPayStatus&&o.a.get(t).then((function(t){var a,r=null!==(a=t.data.currentMoney)&&void 0!==a?a:0;e.$store.commit("setIncomeSum",r),"s"===t.data.paymentStatus&&r>=e.product.price&&(e.isCheckPayStatus=!1,clearInterval(e.timerId),e.giveProduct())}))}),2e3)},giveProduct:function(){this.$emit("setThirdStep")}},beforeDestroy:function(){clearInterval(this.timerId)},computed:Object(c["a"])({},Object(i["b"])(["product"]))},d=u,l=(a("05c2"),a("2877")),p=Object(l["a"])(d,r,n,!1,null,null,null);e["default"]=p.exports},2614:function(t,e,a){"use strict";a.r(e);var r=function(){var t=this,e=t.$createElement,a=t._self._c||e;return a("div",{staticClass:"main"},[a("div",{staticClass:"main__content"},[a("div",{staticClass:"main__content-wrap"},[a("header",{staticClass:"main__header"},[a("span",{staticClass:"main__title"},[t._v("Весь ассортимент")]),a("span",{staticClass:"main__count"},[t._v(t._s(t.products.length)+" товаров")])]),a("div",{staticClass:"main__lists"},t._l(t.products,(function(t){return a("ProductCard",{key:t.id,attrs:{product:t}})})),1)])]),t._m(0)])},n=[function(){var t=this,e=t.$createElement,a=t._self._c||e;return a("div",{staticClass:"main__info info-line info-line_bottom"},[a("span",[t._v("Возникли проблемы? Звоните по номеру горячей линии: +7 (903) 766-34-67")])])}],c=a("5530"),s=a("2f62"),o={name:"Main",computed:Object(c["a"])({},Object(s["b"])(["products"]))},i=o,u=(a("fa01"),a("2877")),d=Object(u["a"])(i,r,n,!1,null,null,null);e["default"]=d.exports},"2c91":function(t,e,a){},"2dd5":function(t,e,a){},3525:function(t,e,a){},3654:function(t,e,a){"use strict";var r=a("caba"),n=a.n(r);n.a},"36f2":function(t,e,a){},"4a76":function(t,e,a){},"56d7":function(t,e,a){"use strict";a.r(e);a("d81d"),a("b0c0"),a("d3b7"),a("ac1f"),a("1276"),a("ddb0"),a("e260"),a("e6cf"),a("cca6"),a("a79d");var r=a("2b0e"),n=function(){var t=this,e=t.$createElement,a=t._self._c||e;return a("div",{staticClass:"app",attrs:{id:"app"}},[a("router-view")],1)},c=[],s=(a("cf25"),a("2877")),o={},i=Object(s["a"])(o,n,c,!1,null,null,null),u=i.exports,d=a("8c4f"),l=function(){var t=this,e=t.$createElement,a=t._self._c||e;return a("div",{staticClass:"home"},[a("Sidebar"),a("Main")],1)},p=[],m={name:"Home"},f=m,v=(a("3654"),Object(s["a"])(f,l,p,!1,null,null,null)),_=v.exports,h=[{path:"/",name:"Home",component:_},{path:"/order/:id",name:"Order",component:function(){return a.e("chunk-2d2cfd83").then(a.bind(null,"cf2a"))}},{path:"*",name:"NotFound",component:_}];r["a"].use(d["a"]);var g=new d["a"]({mode:"history",base:"/",routes:h}),y=g,b=a("2f62"),C={categories:[],currentCategory:null,product:{id:"0",choiceNumber:11,image:"",description:"",price:0},products:[],incomeSum:0},O=(a("b64b"),a("53ca")),j=a("bc3a"),P=a.n(j),S=0;P.a.defaults.baseURL="/ui/vending";var k={setCategories:function(t){var e;e=S?"categories.json":"categories",P.a.get(e).then((function(e){var a=e.data;a.map((function(t){t.image="data:image/png;base64,"+t.image})),t.categories=a}))},setCurrentCategory:function(t){var e=arguments.length>1&&void 0!==arguments[1]?arguments[1]:null;if(e)t.currentCategory=e;else if("object"==Object(O["a"])(t.categories)&&Object.keys(t.categories).length){var a;t.currentCategory=null!==(a=t.categories[0].id)&&void 0!==a?a:null}},setProducts:function(t){var e;t.currentCategory&&(e=S?"category".concat(t.currentCategory,".json"):"categories/".concat(t.currentCategory),P.a.get(e).then((function(e){var a=e.data,r=a.products;r.map((function(t){t.image="data:image/png;base64,"+t.image})),t.products=r})))},setProduct:function(t){var e,a=arguments.length>1&&void 0!==arguments[1]?arguments[1]:null;t&&a&&(e=S?"products".concat(a,".json"):"products/".concat(a),P.a.get(e).then((function(e){var a=e.data;a.image="data:image/png;base64,"+a.image,t.product=a})))},setIncomeSum:function(t,e){t&&(t.incomeSum=e)}},E={},x={categories:function(t){return t.categories},product:function(t){return t.product},products:function(t){return t.products},currentCategory:function(t){return t.currentCategory},incomeSum:function(t){return t.incomeSum}};r["a"].use(b["a"]);var $=new b["a"].Store({state:C,getters:x,mutations:k,actions:E}),w=(a("2c91"),a("6ae9"));w.keys().map((function(t){var e;r["a"].component(null!==(e=w(t).default.name)&&void 0!==e?e:t.split("/").pop().split(".")[0],w(t).default)})),r["a"].prototype.$axios=P.a,r["a"].config.productionTip=!1,new r["a"]({router:y,store:$,render:function(t){return t(u)}}).$mount("#app")},"5e86":function(t,e,a){"use strict";a.r(e);var r=function(){var t=this,e=t.$createElement,a=t._self._c||e;return a("div",{staticClass:"order-card"},[a("div",{staticClass:"order-card__image"},[a("img",{attrs:{src:t.product.image,alt:t.product.name}})]),a("div",{staticClass:"order-card__box"},[a("span",{staticClass:"order-card__info"},[t._v("Вы покупаете")]),a("p",{staticClass:"order-card__description"},[t._v(t._s(t.product.description))]),a("span",{staticClass:"order-card__price"},[t._v(t._s(t.product.price)+" ₽")])])])},n=[],c={name:"OrderCard",props:{product:{type:Object,required:!0}}},s=c,o=(a("7f06"),a("2877")),i=Object(o["a"])(s,r,n,!1,null,null,null);e["default"]=i.exports},"5ea5":function(t,e,a){"use strict";a.r(e);var r=function(){var t=this,e=t.$createElement,a=t._self._c||e;return a("aside",{staticClass:"sidebar"},[t._m(0),a("div",{staticClass:"sidebar__content"},[a("div",{staticClass:"sidebar__content-wrap"},t._l(t.categories,(function(t){return a("CategoryCard",{key:t.id,attrs:{category:t}})})),1)])])},n=[function(){var t=this,e=t.$createElement,a=t._self._c||e;return a("div",{staticClass:"sidebar__info info-line info-line_top"},[a("span",[t._v("Категории товаров")])])}],c=a("5530"),s=a("2f62"),o={name:"Sidebar",mounted:function(){this.$store.commit("setCategories")},watch:{categories:function(){this.$store.commit("setCurrentCategory")},currentCategory:function(){this.$store.commit("setProducts")}},computed:Object(c["a"])({},Object(s["b"])(["categories","currentCategory"]))},i=o,u=(a("d1d9"),a("2877")),d=Object(u["a"])(i,r,n,!1,null,null,null);e["default"]=d.exports},"6ae9":function(t,e,a){var r={"./CategoryCard.vue":"90c7","./Main.vue":"2614","./OrderBoxHeader.vue":"a063","./OrderCard.vue":"5e86","./Payment.vue":"92b7","./PaymentMethod.vue":"21bc","./ProductCard.vue":"e915","./ReceiptGood.vue":"e939","./Sidebar.vue":"5ea5"};function n(t){var e=c(t);return a(e)}function c(t){if(!a.o(r,t)){var e=new Error("Cannot find module '"+t+"'");throw e.code="MODULE_NOT_FOUND",e}return r[t]}n.keys=function(){return Object.keys(r)},n.resolve=c,t.exports=n,n.id="6ae9"},7207:function(t,e,a){},"7f06":function(t,e,a){"use strict";var r=a("91c4"),n=a.n(r);n.a},"8cfe":function(t,e,a){"use strict";var r=a("2dd5"),n=a.n(r);n.a},"8dca":function(t,e,a){},"90c7":function(t,e,a){"use strict";a.r(e);var r=function(){var t=this,e=t.$createElement,a=t._self._c||e;return a("div",{staticClass:"category-card",class:{"is-active":t.currentCategory===t.category.id},on:{click:function(e){return t.$store.commit("setCurrentCategory",t.category.id)}}},[a("div",{staticClass:"overlay"}),a("div",{staticClass:"category-card__image"},[a("img",{attrs:{src:t.category.image,alt:t.category.name}})]),a("span",{staticClass:"category-card__name"},[t._v(t._s(t.category.name))])])},n=[],c=a("5530"),s=a("2f62"),o={name:"CategoryCard",props:{category:{type:Object,required:!0}},computed:Object(c["a"])({},Object(s["b"])(["currentCategory"]))},i=o,u=(a("9c45"),a("2877")),d=Object(u["a"])(i,r,n,!1,null,null,null);e["default"]=d.exports},"91c4":function(t,e,a){},"92b7":function(t,e,a){"use strict";a.r(e);var r=function(){var t=this,e=t.$createElement,a=t._self._c||e;return a("div",{staticClass:"payment"},[a("div",{staticClass:"payment-method"},[a("div",{staticClass:"payment-method__col"},[a("div",{staticClass:"sum"},[a("span",{staticClass:"income-sum",class:{"full-price":t.isFullPrice()}},[t._v(t._s(t.incomeSum))]),t._v(" / "),a("span",{staticClass:"target-sum"},[t._v(t._s(t.sum)+" ₽")])]),a("p",{staticClass:"sum-description"},[t._v("Внесённая сумма (₽)")])]),a("div",{staticClass:"payment-method__col"},[2===t.paymentMethod?a("div",{staticClass:"tip"},[a("strong",[t._v("ПОДСКАЗКА")]),a("p",[t._v("Поднесите устройство оплаты к терминалу, расположенному под планшетом")])]):t._e(),t._m(0)])])])},n=[function(){var t=this,e=t.$createElement,a=t._self._c||e;return a("div",{staticClass:"cancel-payment"},[a("a",{attrs:{href:"#"}},[t._v("Отменить покупку")]),a("p",[t._v("После оплаты товара отмена покупки невозможна")])])}],c=a("5530"),s=a("2f62"),o={name:"Payment",props:["paymentMethod","sum"],methods:{isFullPrice:function(){return this.sum<=this.incomeSum}},computed:Object(c["a"])({},Object(s["b"])(["incomeSum"]))},i=o,u=(a("1084"),a("2877")),d=Object(u["a"])(i,r,n,!1,null,null,null);e["default"]=d.exports},"9c45":function(t,e,a){"use strict";var r=a("4a76"),n=a.n(r);n.a},a063:function(t,e,a){"use strict";a.r(e);var r=function(){var t=this,e=t.$createElement,a=t._self._c||e;return a("div",{staticClass:"order__box-header"},[a("span",{staticClass:"order__box-step"},[t._v(t._s(t.step))]),a("div",{staticClass:"order__box-title"},[t._v(t._s(t.label))])])},n=[],c={name:"OrderBoxHeader",props:{step:String,label:String}},s=c,o=(a("0319"),a("2877")),i=Object(o["a"])(s,r,n,!1,null,null,null);e["default"]=i.exports},a5fa:function(t,e,a){},b697:function(t,e,a){},caba:function(t,e,a){},cf25:function(t,e,a){"use strict";var r=a("fea6"),n=a.n(r);n.a},d1d9:function(t,e,a){"use strict";var r=a("3525"),n=a.n(r);n.a},e915:function(t,e,a){"use strict";a.r(e);var r=function(){var t=this,e=t.$createElement,a=t._self._c||e;return a("div",{staticClass:"product-card"},[a("div",{staticClass:"product-card__image"},[a("img",{attrs:{src:t.product.image,alt:t.product.name}})]),a("p",{staticClass:"product-card__description"},[t._v(t._s(t.product.description))]),a("div",{staticClass:"product-card__actions"},[a("router-link",{staticClass:"button button_accent product-card__buy",attrs:{tag:"a",to:"/order/"+t.product.id}},[t._v("Купить")]),a("div",{staticClass:"product-card__price"},[t._v(t._s(t.product.price)+" ₽")])],1)])},n=[],c={name:"ProductCard",props:{product:{type:Object,required:!0}}},s=c,o=(a("8cfe"),a("2877")),i=Object(o["a"])(s,r,n,!1,null,null,null);e["default"]=i.exports},e939:function(t,e,a){"use strict";a.r(e);var r=function(){var t=this,e=t.$createElement,a=t._self._c||e;return a("div",[a("div",{staticClass:"receipt-good"},[a("div",{staticClass:"progress-bar"},[a("div",{staticClass:"progress-bar-value",style:{width:t.progressPercent+"%"}})]),a("p",[t._v("Автомат подготавливает товар к получению")])])])},n=[],c=a("5530"),s=a("2f62"),o=a("bc3a"),i=a.n(o),u={name:"ReceiptGood",created:function(){this.progressPercent=20,this.dev_mode=0,this.productGive()},data:function(){return{progressPercent:0}},methods:{productGive:function(){var t,e=this,a=this.product.choiceNumber;t=this.dev_mode?"motors".concat(a,".json"):"motors/"+a,i.a.post(t).then((function(t){"s"===t.data.motorStatus&&(e.progressPercent=100,setTimeout((function(){e.$emit("eventEndOrder")}),1e3))}))}},computed:Object(c["a"])({},Object(s["b"])(["product"]))},d=u,l=(a("1c96"),a("2877")),p=Object(l["a"])(d,r,n,!1,null,null,null);e["default"]=p.exports},fa01:function(t,e,a){"use strict";var r=a("8dca"),n=a.n(r);n.a},fea6:function(t,e,a){}});
//# sourceMappingURL=app.b60bceda.js.map