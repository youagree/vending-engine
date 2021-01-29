(function (t) {
    function e(e) {
        for (var n, r, o = e[0], i = e[1], u = e[2], d = 0, l = []; d < o.length; d++) r = o[d], Object.prototype.hasOwnProperty.call(c, r) && c[r] && l.push(c[r][0]), c[r] = 0;
        for (n in i) Object.prototype.hasOwnProperty.call(i, n) && (t[n] = i[n]);
        p && p(e);
        while (l.length) l.shift()();
        return s.push.apply(s, u || []), a()
    }

    function a() {
        for (var t, e = 0; e < s.length; e++) {
            for (var a = s[e], n = !0, r = 1; r < a.length; r++) {
                var o = a[r];
                0 !== c[o] && (n = !1)
            }
            n && (s.splice(e--, 1), t = i(i.s = a[0]))
        }
        return t
    }

    var n = {}, r = {app: 0}, c = {app: 0}, s = [];

    function o(t) {
        return i.p + "js/" + ({}[t] || t) + "." + {"chunk-2d2cfd83": "550dcb26"}[t] + ".js"
    }

    function i(e) {
        if (n[e]) return n[e].exports;
        var a = n[e] = {i: e, l: !1, exports: {}};
        return t[e].call(a.exports, a, a.exports, i), a.l = !0, a.exports
    }

    i.e = function (t) {
        var e = [], a = {"chunk-2d2cfd83": 1};
        r[t] ? e.push(r[t]) : 0 !== r[t] && a[t] && e.push(r[t] = new Promise((function (e, a) {
            for (var n = "css/" + ({}[t] || t) + "." + {"chunk-2d2cfd83": "dcc7a58f"}[t] + ".css", c = i.p + n, s = document.getElementsByTagName("link"), o = 0; o < s.length; o++) {
                var u = s[o], d = u.getAttribute("data-href") || u.getAttribute("href");
                if ("stylesheet" === u.rel && (d === n || d === c)) return e()
            }
            var l = document.getElementsByTagName("style");
            for (o = 0; o < l.length; o++) {
                u = l[o], d = u.getAttribute("data-href");
                if (d === n || d === c) return e()
            }
            var p = document.createElement("link");
            p.rel = "stylesheet", p.type = "text/css", p.onload = e, p.onerror = function (e) {
                var n = e && e.target && e.target.src || c,
                    s = new Error("Loading CSS chunk " + t + " failed.\n(" + n + ")");
                s.code = "CSS_CHUNK_LOAD_FAILED", s.request = n, delete r[t], p.parentNode.removeChild(p), a(s)
            }, p.href = c;
            var m = document.getElementsByTagName("head")[0];
            m.appendChild(p)
        })).then((function () {
            r[t] = 0
        })));
        var n = c[t];
        if (0 !== n) if (n) e.push(n[2]); else {
            var s = new Promise((function (e, a) {
                n = c[t] = [e, a]
            }));
            e.push(n[2] = s);
            var u, d = document.createElement("script");
            d.charset = "utf-8", d.timeout = 120, i.nc && d.setAttribute("nonce", i.nc), d.src = o(t);
            var l = new Error;
            u = function (e) {
                d.onerror = d.onload = null, clearTimeout(p);
                var a = c[t];
                if (0 !== a) {
                    if (a) {
                        var n = e && ("load" === e.type ? "missing" : e.type), r = e && e.target && e.target.src;
                        l.message = "Loading chunk " + t + " failed.\n(" + n + ": " + r + ")", l.name = "ChunkLoadError", l.type = n, l.request = r, a[1](l)
                    }
                    c[t] = void 0
                }
            };
            var p = setTimeout((function () {
                u({type: "timeout", target: d})
            }), 12e4);
            d.onerror = d.onload = u, document.head.appendChild(d)
        }
        return Promise.all(e)
    }, i.m = t, i.c = n, i.d = function (t, e, a) {
        i.o(t, e) || Object.defineProperty(t, e, {enumerable: !0, get: a})
    }, i.r = function (t) {
        "undefined" !== typeof Symbol && Symbol.toStringTag && Object.defineProperty(t, Symbol.toStringTag, {value: "Module"}), Object.defineProperty(t, "__esModule", {value: !0})
    }, i.t = function (t, e) {
        if (1 & e && (t = i(t)), 8 & e) return t;
        if (4 & e && "object" === typeof t && t && t.__esModule) return t;
        var a = Object.create(null);
        if (i.r(a), Object.defineProperty(a, "default", {
            enumerable: !0,
            value: t
        }), 2 & e && "string" != typeof t) for (var n in t) i.d(a, n, function (e) {
            return t[e]
        }.bind(null, n));
        return a
    }, i.n = function (t) {
        var e = t && t.__esModule ? function () {
            return t["default"]
        } : function () {
            return t
        };
        return i.d(e, "a", e), e
    }, i.o = function (t, e) {
        return Object.prototype.hasOwnProperty.call(t, e)
    }, i.p = "/", i.oe = function (t) {
        throw console.error(t), t
    };
    var u = window["webpackJsonp"] = window["webpackJsonp"] || [], d = u.push.bind(u);
    u.push = e, u = u.slice();
    for (var l = 0; l < u.length; l++) e(u[l]);
    var p = d;
    s.push([0, "chunk-vendors"]), a()
})({
    0: function (t, e, a) {
        t.exports = a("56d7")
    }, "0319": function (t, e, a) {
        "use strict";
        var n = a("a5fa"), r = a.n(n);
        r.a
    }, "05c2": function (t, e, a) {
        "use strict";
        var n = a("b697"), r = a.n(n);
        r.a
    }, 1084: function (t, e, a) {
        "use strict";
        var n = a("36f2"), r = a.n(n);
        r.a
    }, "1c96": function (t, e, a) {
        "use strict";
        var n = a("7207"), r = a.n(n);
        r.a
    }, "21bc": function (t, e, a) {
        "use strict";
        a.r(e);
        var n = function () {
            var t = this, e = t.$createElement, a = t._self._c || e;
            return a("div", [a("div", {staticClass: "payment-method"}, [a("div", {staticClass: "payment-method__col"}, [a("button", {
                staticClass: "button button_payment payment-method__button",
                class: {active: 1 === this.methodId},
                attrs: {disabled: !this.canDispense},
                on: {
                    click: function (e) {
                        return t.setPaymentMethod(1)
                    }
                }
            }, [t._v(" Купюрами и монетами ")]), t._m(0)]), a("div", {staticClass: "payment-method__col"}, [a("button", {
                staticClass: "button button_payment payment-method__button",
                class: {active: 2 === this.methodId},
                on: {
                    click: function (e) {
                        return t.setPaymentMethod(2)
                    }
                }
            }, [t._v(" Бесконтактно ")]), a("p", {staticClass: "payment-method__card"}, [t._v("Оплата с помощью карты или смартфона с функцией NFC")]), t._m(1)])])])
        }, r = [function () {
            var t = this, e = t.$createElement, a = t._self._c || e;
            return a("ul", {staticClass: "payment-method__coins"}, [a("li", [a("p", [t._v("Принимаются купюры номиналом в 10 ₽, 50 ₽, 100 ₽, 200 ₽.")])]), a("li", [a("p", [t._v("Принимаются монеты номиналом в 1 ₽, 2 ₽, 5 ₽, 10 ₽.")])])])
        }, function () {
            var t = this, e = t.$createElement, a = t._self._c || e;
            return a("div", {staticClass: "payment-method__pays"}, [a("p", [t._v("Поддерживаемые платежные системы")]), a("div", {staticClass: "payment-method__pay"}, [a("ul", [a("li", [a("img", {
                attrs: {
                    src: "/payment-logo/mir.png",
                    alt: "mir"
                }
            })]), a("li", [a("img", {
                attrs: {
                    src: "/payment-logo/visa.png",
                    alt: "visa"
                }
            })]), a("li", [a("img", {
                attrs: {
                    src: "/payment-logo/mastercard.png",
                    alt: "mastercard"
                }
            })]), a("li", [a("img", {
                attrs: {
                    src: "/payment-logo/g-pay.png",
                    alt: "google pay"
                }
            })]), a("li", [a("img", {attrs: {src: "/payment-logo/apple_pay_logo.png", alt: "apple pay"}})])])])])
        }], c = a("5530"), s = a("bc3a"), o = a.n(s), i = a("2f62"), u = {
            name: "PaymentMethod", created: function () {
                this.dev_mode = 0, this.checkCanDispense()
            }, data: function () {
                return {timerId: 0, methodId: 0, isCheckPayStatus: !1, canDispense: !1}
            }, props: ["paramPaymentMethod"], methods: {
                setPaymentMethod: function () {
                    var t = arguments.length > 0 && void 0 !== arguments[0] ? arguments[0] : 0;
                    this.methodId = t;
                    var e, a = 1 === t ? "n" : "b";
                    this.$emit("changePaymentMethod", t), this.dev_mode ? e = "payment".concat(this.product.id, ".json") : (e = "payment/" + this.product.id, o.a.post(e, {payMethod: a})), this.isCheckPayStatus = !0, this.checkPayStatus()
                }, checkPayStatus: function () {
                    var t, e = this;
                    t = this.dev_mode ? "payment/".concat(this.product.id, "/payStatus.json") : "payment/" + this.product.id + "/payStatus?price=" + this.product.price, this.timerId = setInterval((function () {
                        e.isCheckPayStatus && o.a.get(t).then((function (t) {
                            var a, n = null !== (a = t.data.currentMoney) && void 0 !== a ? a : 0;
                            e.$store.commit("setIncomeSum", n), "s" === t.data.paymentStatus && n >= e.product.price && (e.isCheckPayStatus = !1, clearInterval(e.timerId), e.giveProduct())
                        }))
                    }), 2e3)
                }, giveProduct: function () {
                    this.$emit("setThirdStep")
                }, checkCanDispense: function () {
                    var t, e = this;
                    t = this.dev_mode ? "canDispense.json" : "canDispense";
                    try {
                        o.a.get(t).then((function (t) {
                            e.canDispense = "true" === t.data.canDispense
                        }))
                    } catch (a) {
                        console.warn(a.message)
                    }
                }
            }, emits: ["changePaymentMethod", "setThirdStep"], watch: {
                paramPaymentMethod: function (t) {
                    this.methodId = t, 0 === this.methodId && (this.isCheckPayStatus = !1)
                }
            }, beforeDestroy: function () {
                clearInterval(this.timerId)
            }, computed: Object(c["a"])({}, Object(i["b"])(["product"]))
        }, d = u, l = (a("05c2"), a("2877")), p = Object(l["a"])(d, n, r, !1, null, null, null);
        e["default"] = p.exports
    }, 2614: function (t, e, a) {
        "use strict";
        a.r(e);
        var n = function () {
                var t = this, e = t.$createElement, a = t._self._c || e;
                return a("div", {staticClass: "main"}, [a("div", {staticClass: "main__content"}, [a("div", {staticClass: "main__content-wrap"}, [a("header", {staticClass: "main__header"}, [a("span", {staticClass: "main__title"}, [t._v("Весь ассортимент")]), a("span", {staticClass: "main__count"}, [t._v(t._s(t.products.length) + " товаров")])]), a("div", {staticClass: "main__lists"}, t._l(t.products, (function (t) {
                    return a("ProductCard", {key: t.id, attrs: {product: t}})
                })), 1)])]), t._m(0)])
            }, r = [function () {
                var t = this, e = t.$createElement, a = t._self._c || e;
                return a("div", {staticClass: "main__info info-line info-line_bottom"}, [a("span", [t._v("Возникли проблемы? Звоните по номеру горячей линии: +7 (903) 766-34-67")])])
            }], c = a("5530"), s = a("2f62"),
            o = {name: "Main", computed: Object(c["a"])({}, Object(s["b"])(["products"]))}, i = o,
            u = (a("fa01"), a("2877")), d = Object(u["a"])(i, n, r, !1, null, null, null);
        e["default"] = d.exports
    }, "2c91": function (t, e, a) {
    }, "2dd5": function (t, e, a) {
    }, 3525: function (t, e, a) {
    }, 3654: function (t, e, a) {
        "use strict";
        var n = a("caba"), r = a.n(n);
        r.a
    }, "36f2": function (t, e, a) {
    }, "4a76": function (t, e, a) {
    }, "56d7": function (t, e, a) {
        "use strict";
        a.r(e);
        a("d81d"), a("b0c0"), a("d3b7"), a("ac1f"), a("1276"), a("ddb0"), a("e260"), a("e6cf"), a("cca6"), a("a79d");
        var n = a("2b0e"), r = function () {
                var t = this, e = t.$createElement, a = t._self._c || e;
                return a("div", {staticClass: "app", attrs: {id: "app"}}, [a("router-view")], 1)
            }, c = [], s = (a("cf25"), a("2877")), o = {}, i = Object(s["a"])(o, r, c, !1, null, null, null), u = i.exports,
            d = a("8c4f"), l = function () {
                var t = this, e = t.$createElement, a = t._self._c || e;
                return a("div", {staticClass: "home"}, [a("Sidebar"), a("Main")], 1)
            }, p = [], m = {name: "Home"}, f = m, v = (a("3654"), Object(s["a"])(f, l, p, !1, null, null, null)),
            _ = v.exports, h = [{path: "/", name: "Home", component: _}, {
                path: "/order/:id", name: "Order", component: function () {
                    return a.e("chunk-2d2cfd83").then(a.bind(null, "cf2a"))
                }
            }, {path: "*", name: "NotFound", component: _}];
        n["a"].use(d["a"]);
        var g = new d["a"]({mode: "history", base: "/", routes: h}), y = g, b = a("2f62"), C = {
            categories: [],
            currentCategory: null,
            product: {id: "0", choiceNumber: 11, image: "", description: "", price: 0},
            products: [],
            incomeSum: 0
        }, O = (a("b64b"), a("53ca")), j = a("bc3a"), P = a.n(j), S = 0;
        P.a.defaults.baseURL = "/ui/vending";
        var k = {
            setCategories: function (t) {
                var e;
                e = S ? "categories.json" : "categories", P.a.get(e).then((function (e) {
                    var a = e.data;
                    a.map((function (t) {
                        t.image = "data:image/png;base64," + t.image
                    })), t.categories = a
                }))
            }, setCurrentCategory: function (t) {
                var e = arguments.length > 1 && void 0 !== arguments[1] ? arguments[1] : null;
                if (e) t.currentCategory = e; else if ("object" == Object(O["a"])(t.categories) && Object.keys(t.categories).length) {
                    var a;
                    t.currentCategory = null !== (a = t.categories[0].id) && void 0 !== a ? a : null
                }
            }, setProducts: function (t) {
                var e;
                t.currentCategory && (e = S ? "category".concat(t.currentCategory, ".json") : "categories/".concat(t.currentCategory), P.a.get(e).then((function (e) {
                    var a = e.data, n = a.products;
                    n.map((function (t) {
                        t.image = "data:image/png;base64," + t.image
                    })), t.products = n
                })))
            }, setProduct: function (t) {
                var e, a = arguments.length > 1 && void 0 !== arguments[1] ? arguments[1] : null;
                t && a && (e = S ? "products".concat(a, ".json") : "products/".concat(a), P.a.get(e).then((function (e) {
                    var a = e.data;
                    a.image = "data:image/png;base64," + a.image, t.product = a
                })))
            }, setIncomeSum: function (t, e) {
                t && (t.incomeSum = e)
            }
        }, w = {}, E = {
            categories: function (t) {
                return t.categories
            }, product: function (t) {
                return t.product
            }, products: function (t) {
                return t.products
            }, currentCategory: function (t) {
                return t.currentCategory
            }, incomeSum: function (t) {
                return t.incomeSum
            }
        };
        n["a"].use(b["a"]);
        var $ = new b["a"].Store({state: C, getters: E, mutations: k, actions: w}), x = (a("2c91"), a("6ae9"));
        x.keys().map((function (t) {
            var e;
            n["a"].component(null !== (e = x(t).default.name) && void 0 !== e ? e : t.split("/").pop().split(".")[0], x(t).default)
        })), n["a"].prototype.$axios = P.a, n["a"].config.productionTip = !1, new n["a"]({
            router: y,
            store: $,
            render: function (t) {
                return t(u)
            }
        }).$mount("#app")
    }, "5e86": function (t, e, a) {
        "use strict";
        a.r(e);
        var n = function () {
                var t = this, e = t.$createElement, a = t._self._c || e;
                return a("div", {staticClass: "order-card"}, [a("div", {staticClass: "order-card__image"}, [a("img", {
                    attrs: {
                        src: t.product.image,
                        alt: t.product.name
                    }
                })]), a("div", {staticClass: "order-card__box"}, [a("span", {staticClass: "order-card__info"}, [t._v("Вы покупаете")]), a("p", {staticClass: "order-card__description"}, [t._v(t._s(t.product.description))]), a("span", {staticClass: "order-card__price"}, [t._v(t._s(t.product.price) + " ₽")])])])
            }, r = [], c = {name: "OrderCard", props: {product: {type: Object, required: !0}}}, s = c,
            o = (a("7f06"), a("2877")), i = Object(o["a"])(s, n, r, !1, null, null, null);
        e["default"] = i.exports
    }, "5ea5": function (t, e, a) {
        "use strict";
        a.r(e);
        var n = function () {
            var t = this, e = t.$createElement, a = t._self._c || e;
            return a("aside", {staticClass: "sidebar"}, [t._m(0), a("div", {staticClass: "sidebar__content"}, [a("div", {staticClass: "sidebar__content-wrap"}, t._l(t.categories, (function (t) {
                return a("CategoryCard", {key: t.id, attrs: {category: t}})
            })), 1)])])
        }, r = [function () {
            var t = this, e = t.$createElement, a = t._self._c || e;
            return a("div", {staticClass: "sidebar__info info-line info-line_top"}, [a("span", [t._v("Категории товаров")])])
        }], c = a("5530"), s = a("2f62"), o = {
            name: "Sidebar", mounted: function () {
                this.$store.commit("setCategories")
            }, watch: {
                categories: function () {
                    this.$store.commit("setCurrentCategory")
                }, currentCategory: function () {
                    this.$store.commit("setProducts")
                }
            }, computed: Object(c["a"])({}, Object(s["b"])(["categories", "currentCategory"]))
        }, i = o, u = (a("d1d9"), a("2877")), d = Object(u["a"])(i, n, r, !1, null, null, null);
        e["default"] = d.exports
    }, "6ae9": function (t, e, a) {
        var n = {
            "./CategoryCard.vue": "90c7",
            "./Main.vue": "2614",
            "./OrderBoxHeader.vue": "a063",
            "./OrderCard.vue": "5e86",
            "./Payment.vue": "92b7",
            "./PaymentMethod.vue": "21bc",
            "./ProductCard.vue": "e915",
            "./ReceiptGood.vue": "e939",
            "./Sidebar.vue": "5ea5"
        };

        function r(t) {
            var e = c(t);
            return a(e)
        }

        function c(t) {
            if (!a.o(n, t)) {
                var e = new Error("Cannot find module '" + t + "'");
                throw e.code = "MODULE_NOT_FOUND", e
            }
            return n[t]
        }

        r.keys = function () {
            return Object.keys(n)
        }, r.resolve = c, t.exports = r, r.id = "6ae9"
    }, 7207: function (t, e, a) {
    }, "7f06": function (t, e, a) {
        "use strict";
        var n = a("91c4"), r = a.n(n);
        r.a
    }, "8cfe": function (t, e, a) {
        "use strict";
        var n = a("2dd5"), r = a.n(n);
        r.a
    }, "8dca": function (t, e, a) {
    }, "90c7": function (t, e, a) {
        "use strict";
        a.r(e);
        var n = function () {
            var t = this, e = t.$createElement, a = t._self._c || e;
            return a("div", {
                staticClass: "category-card",
                class: {"is-active": t.currentCategory === t.category.id},
                on: {
                    click: function (e) {
                        return t.$store.commit("setCurrentCategory", t.category.id)
                    }
                }
            }, [a("div", {staticClass: "overlay"}), a("div", {staticClass: "category-card__image"}, [a("img", {
                attrs: {
                    src: t.category.image,
                    alt: t.category.name
                }
            })]), a("span", {staticClass: "category-card__name"}, [t._v(t._s(t.category.name))])])
        }, r = [], c = a("5530"), s = a("2f62"), o = {
            name: "CategoryCard",
            props: {category: {type: Object, required: !0}},
            computed: Object(c["a"])({}, Object(s["b"])(["currentCategory"]))
        }, i = o, u = (a("9c45"), a("2877")), d = Object(u["a"])(i, n, r, !1, null, null, null);
        e["default"] = d.exports
    }, "91c4": function (t, e, a) {
    }, "92b7": function (t, e, a) {
        "use strict";
        a.r(e);
        var n = function () {
            var t = this, e = t.$createElement, a = t._self._c || e;
            return a("div", {staticClass: "payment"}, [a("div", {staticClass: "payment-method"}, [a("div", {staticClass: "payment-method__col"}, [a("div", {staticClass: "sum"}, [a("span", {
                staticClass: "income-sum",
                class: {"full-price": t.isFullPrice()}
            }, [t._v(t._s(t.incomeSum))]), t._v(" / "), a("span", {staticClass: "target-sum"}, [t._v(t._s(t.sum) + " ₽")])]), a("p", {staticClass: "sum-description"}, [t._v("Внесённая сумма (₽)")])]), a("div", {staticClass: "payment-method__col"}, [2 === t.paymentMethod ? a("div", {staticClass: "tip"}, [a("strong", [t._v("ПОДСКАЗКА")]), a("p", [t._v("Поднесите устройство оплаты к терминалу, расположенному под планшетом")])]) : t._e(), a("div", {staticClass: "cancel-payment"}, [a("a", {
                attrs: {href: "#"},
                on: {
                    click: function (e) {
                        e.preventDefault(), t.modalCancelStatus = !0
                    }
                }
            }, [t._v("Отменить покупку")]), a("p", [t._v("После оплаты товара отмена покупки невозможна")])]), a("div", {
                staticClass: "modal",
                class: {active: t.modalCancelStatus}
            }, [a("div", {staticClass: "modal-content"}, [a("p", {staticClass: "title"}, [t._v("Отмена покупки")]), a("p", {staticClass: "description"}, [t._v("Вы действительно хотите отменить покупку?")]), a("div", {staticClass: "buttons"}, [a("button", {
                staticClass: "button",
                on: {
                    click: function (e) {
                        return e.preventDefault(), t.requestCancelPayment(e)
                    }
                }
            }, [t._v("Да")]), a("button", {
                staticClass: "button", on: {
                    click: function (e) {
                        e.preventDefault(), t.modalCancelStatus = !1
                    }
                }
            }, [t._v("Нет")])])])])])])])
        }, r = [], c = a("5530"), s = a("2f62"), o = a("bc3a"), i = a.n(o), u = {
            name: "Payment", props: ["paymentMethod", "sum"], created: function () {
                this.dev_mode = 0
            }, data: function () {
                return {modalCancelStatus: !1}
            }, methods: {
                isFullPrice: function () {
                    return this.sum <= this.incomeSum
                }, requestCancelPayment: function () {
                    var t;
                    this.$emit("setFirstStep"), this.$store.commit("setIncomeSum", 0), this.dev_mode ? t = "paymentCancel.json" : (t = "paymentCancel", i.a.post(t, {currentMoneyCount: this.incomeSum}))
                }
            }, computed: Object(c["a"])({}, Object(s["b"])(["incomeSum"]))
        }, d = u, l = (a("1084"), a("2877")), p = Object(l["a"])(d, n, r, !1, null, null, null);
        e["default"] = p.exports
    }, "9c45": function (t, e, a) {
        "use strict";
        var n = a("4a76"), r = a.n(n);
        r.a
    }, a063: function (t, e, a) {
        "use strict";
        a.r(e);
        var n = function () {
                var t = this, e = t.$createElement, a = t._self._c || e;
                return a("div", {staticClass: "order__box-header"}, [a("span", {staticClass: "order__box-step"}, [t._v(t._s(t.step))]), a("div", {staticClass: "order__box-title"}, [t._v(t._s(t.label))])])
            }, r = [], c = {name: "OrderBoxHeader", props: {step: String, label: String}}, s = c,
            o = (a("0319"), a("2877")), i = Object(o["a"])(s, n, r, !1, null, null, null);
        e["default"] = i.exports
    }, a5fa: function (t, e, a) {
    }, b697: function (t, e, a) {
    }, caba: function (t, e, a) {
    }, cf25: function (t, e, a) {
        "use strict";
        var n = a("fea6"), r = a.n(n);
        r.a
    }, d1d9: function (t, e, a) {
        "use strict";
        var n = a("3525"), r = a.n(n);
        r.a
    }, e915: function (t, e, a) {
        "use strict";
        a.r(e);
        var n = function () {
                var t = this, e = t.$createElement, a = t._self._c || e;
                return a("div", {staticClass: "product-card"}, [a("div", {staticClass: "product-card__image"}, [a("img", {
                    attrs: {
                        src: t.product.image,
                        alt: t.product.name
                    }
                })]), a("p", {staticClass: "product-card__description"}, [t._v(t._s(t.product.description))]), a("div", {staticClass: "product-card__actions"}, [a("router-link", {
                    staticClass: "button button_accent product-card__buy",
                    attrs: {tag: "a", to: "/order/" + t.product.id}
                }, [t._v("Купить")]), a("div", {staticClass: "product-card__price"}, [t._v(t._s(t.product.price) + " ₽")])], 1)])
            }, r = [], c = {name: "ProductCard", props: {product: {type: Object, required: !0}}}, s = c,
            o = (a("8cfe"), a("2877")), i = Object(o["a"])(s, n, r, !1, null, null, null);
        e["default"] = i.exports
    }, e939: function (t, e, a) {
        "use strict";
        a.r(e);
        var n = function () {
            var t = this, e = t.$createElement, a = t._self._c || e;
            return a("div", [a("div", {staticClass: "receipt-good"}, [a("div", {staticClass: "progress-bar"}, [a("div", {
                staticClass: "progress-bar-value",
                style: {width: t.progressPercent + "%"}
            })]), a("p", [t._v("Автомат подготавливает товар к получению")])])])
        }, r = [], c = a("5530"), s = a("2f62"), o = a("bc3a"), i = a.n(o), u = {
            name: "ReceiptGood", created: function () {
                this.progressPercent = 20, this.dev_mode = 0, this.productGive()
            }, data: function () {
                return {progressPercent: 0}
            }, methods: {
                productGive: function () {
                    var t, e = this, a = this.product.choiceNumber, n = function (t) {
                        "s" === t.data.motorStatus && (e.progressPercent = 100, setTimeout((function () {
                            e.$emit("eventEndOrder")
                        }), 1e3))
                    };
                    this.dev_mode ? (t = "motors".concat(a, ".json"), i.a.get(t).then(n)) : (t = "motors/" + a, i.a.post(t).then(n))
                }
            }, computed: Object(c["a"])({}, Object(s["b"])(["product"]))
        }, d = u, l = (a("1c96"), a("2877")), p = Object(l["a"])(d, n, r, !1, null, null, null);
        e["default"] = p.exports
    }, fa01: function (t, e, a) {
        "use strict";
        var n = a("8dca"), r = a.n(n);
        r.a
    }, fea6: function (t, e, a) {
    }
});
//# sourceMappingURL=app.48ffc41f.js.map