(window["webpackJsonp"] = window["webpackJsonp"] || []).push([["chunk-2d2cfd83"], {
    "04a6": function (t, e, s) {
        "use strict";
        var a = s("298b"), r = s.n(a);
        r.a
    }, "298b": function (t, e, s) {
    }, cf2a: function (t, e, s) {
        "use strict";
        s.r(e);
        var a = function () {
            var t = this, e = t.$createElement, s = t._self._c || e;
            return s("div", {staticClass: "order"}, [0 === t.stepStates[4] ? s("div", [s("div", {staticClass: "order__header"}, [s("router-link", {
                staticClass: "order__back",
                attrs: {to: "/"}
            }, [s("svg", {
                attrs: {
                    xmlns: "http://www.w3.org/2000/svg",
                    "xmlns:xlink": "http://www.w3.org/1999/xlink",
                    viewBox: "0 0 512.006 512.006"
                }
            }, [s("path", {attrs: {d: "M388.419,475.59L168.834,256.005L388.418,36.421c8.341-8.341,8.341-21.824,0-30.165s-21.824-8.341-30.165,0    L123.586,240.923c-8.341,8.341-8.341,21.824,0,30.165l234.667,234.667c4.16,4.16,9.621,6.251,15.083,6.251    c5.461,0,10.923-2.091,15.083-6.251C396.76,497.414,396.76,483.931,388.419,475.59z"}})]), s("span", [t._v("На главный экран")])]), s("OrderCard", {
                staticClass: "order__card",
                attrs: {product: t.product}
            })], 1), s("div", {staticClass: "order__main"}, [s("div", {
                staticClass: "order__box",
                class: t.getBoxClass(1)
            }, [s("OrderBoxHeader", {
                attrs: {
                    step: "1",
                    label: "Выберите способ оплаты"
                }
            }), t.stepStates[1] ? s("div", {staticClass: "order__box-content"}, [s("PaymentMethod", {
                on: {
                    changePaymentMethod: t.changePaymentMethod,
                    setThirdStep: t.setThirdStep
                }
            })], 1) : t._e()], 1), s("div", {
                staticClass: "order__box",
                class: t.getBoxClass(2)
            }, [s("OrderBoxHeader", {
                attrs: {
                    step: "2",
                    label: "Оплата"
                }
            }), t.stepStates[2] ? s("div", {staticClass: "order__box-content"}, [s("Payment", {
                attrs: {
                    paymentMethod: t.paymentMethod,
                    sum: t.product.price
                }
            })], 1) : t._e()], 1), s("div", {
                staticClass: "order__box",
                class: t.getBoxClass(3)
            }, [s("OrderBoxHeader", {
                attrs: {
                    step: "3",
                    label: "Получение товара"
                }
            }), t.stepStates[3] ? s("div", {staticClass: "order__box-content"}, [s("ReceiptGood", {on: {eventEndOrder: t.eventEndOrder}})], 1) : t._e()], 1)])]) : s("div", {staticClass: "end-step"}, [s("img", {
                attrs: {
                    src: "/icon-success.png",
                    alt: "success order"
                }
            }), t.getCashBack() ? s("div", {staticClass: "cash-back"}, [t._v(" Ваша сдача: " + t._s(t.getCashBack()) + " ₽ ")]) : t._e(), s("h1", [t._v("Спасибо за покупку. Заберите товар в нижнем окне")]), s("button", {
                staticClass: "button button_accent",
                on: {
                    click: function (e) {
                        return t.$router.push("/")
                    }
                }
            }, [t._v("На главный экран")])])])
        }, r = [], n = s("5530"), c = s("2f62"), o = {
            name: "Order", created: function () {
                var t = this.$route.params.id;
                this.$store.commit("setProduct", t)
            }, data: function () {
                return {paymentMethod: 0, stepStates: {1: 1, 2: 0, 3: 0, 4: 0}}
            }, methods: {
                getBoxClass: function (t) {
                    switch (this.stepStates[t]) {
                        case 1:
                            return "is-active";
                        case 2:
                            return "is-done";
                        default:
                            return ""
                    }
                }, changePaymentMethod: function () {
                    var t = arguments.length > 0 && void 0 !== arguments[0] ? arguments[0] : 0;
                    this.paymentMethod = t, t ? (this.stepStates[1] = 2, this.stepStates[2] = 1) : (this.stepStates[1] = 1, this.stepStates[2] = 0)
                }, setThirdStep: function () {
                    this.stepStates[2] = 2, this.stepStates[3] = 1
                }, eventEndOrder: function () {
                    console.log("end order"), this.stepStates[4] = 2
                }, getCashBack: function () {
                    return this.incomeSum - this.product.price
                }
            }, computed: Object(n["a"])({}, Object(c["b"])(["product", "incomeSum"]))
        }, i = o, d = (s("04a6"), s("2877")), l = Object(d["a"])(i, a, r, !1, null, null, null);
        e["default"] = l.exports
    }
}]);
//# sourceMappingURL=chunk-2d2cfd83.efa272d5.js.map