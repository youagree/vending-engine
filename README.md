# Документация к API

### Получение всех категорий - `GET /ui/vending/categories`

Метод, возвращает список всех категорий, картинки самих категорий, а так же содержащиеся в каждой категории продукты.

**Формат ответа:**
```sh
[
    {
        "id": 1,
        "name": "название категории",
        "image": "картинка в BASE64",
        "products": [ 
            {
                "id": 1, - Id товара
                "choiceNumber": 11, - (первая цифра - ряд, вторая - номер спирали)
                "description": "описание продукта",
                "price": 30, - цена товара
                "image": "картинка в BASE64",
                "count": 10 - количество товара в вендинге
            },
            {
                "id": 2, - Id товара
                "choiceNumber": 12,
                "description": "описание продукта",
                "price": 40, - цена товара
                "image": "картинка в BASE64",
                "count": 10 - количество товара в вендинге
            }
        ]
    },
    {
        "id": 1,
        "name": "название категории",
        "image": "картинка в BASE64",
        "products": [ лист продуктов, аналогичный выше показанному ]
    }
]
```

### Получение одной категории по Id `GET /ui/vending/categories/{id}` 

Метод, возвращает определенную категорию и все продукты с картинками, которые в ней есть.

**Список параметров:**
`@PathVariable {Long id}` (id товара, который покупают)

**Формат ответа:**

```sh
[
    {
        "id": 1,
        "name": "название категории",
        "image": "картинка в BASE64",
        "products": [ 
            {
                "id": 1, - Id товара
                "choiceNumber": 11,
                "description": "описание продукта",
                "price": 30, - цена
                "image": "картинка в BASE64",
                "count": 10 - количество товара в вендинге
            }
        ]
    }
]
```

### Получение списка всех товаров `GET /ui/vending/products`

Метод, возвращает все имеющиеся товары в вендинге.

**Формат ответа:**

```sh
[
    {
        "id": 1, - Id товара
        "choiceNumber": 11,
        "description": "описание продукта",
        "price": 30, - цена товара
        "image": "картинка в BASE64",
        "count": 10 - количество товара в вендинге
    },
    {
        "id": 2, - Id товара
        "choiceNumber": 12,
        "description": "описание продукта",
        "price": 40, - цена товара
        "image": "картинка в BASE64",
        "count": 10 - количество товара в вендинге
    }
]
```

### Получение товара по Id `GET /ui/vending/products/{id}`

Метод, возвращает один товар по Id 
**Список параметров:**
`@PathVariable {Long id}` (id товара, который покупают)

**Формат ответа:**

```sh
{
    "id": 1, - Id товара
    "choiceNumber": 11,
    "description": "описание продукта",
    "price": 30, - цена товара
   "image": "картинка в BASE64",
    "count": 10 - количество товара в вендинге
}
```

### Запуск процесса оплаты `POST /ui/vending/payment/{id}`

Метод, который запускает процесс оплаты, передает в **компорт модуля оплаты** цену и способ оплаты в формате "30 b", где **30** - цена, **"b"** - **способ оплаты**.

**Список параметров:**
`@PathVariable {Long id}` (id товара, который покупают)
`@RequestParam {String способ оплаты}` (b - безналичная оплата, n - оплата наличными)

**Формат ответа:**
Не предусматривает ответ

### Запрос текущего количества внесенных средств `GET /ui/payment/{id}/payStatus`

Метод, который запрашивает количество денег, которое внес покупатель. Количество денег автоматически складывается внутри метода, а так же при условии, что внесенных средств больше стоимости товара - отдает статус оплаты. Информация о внесенных средствах поступает от модуля оплаты через **компорт** в формате числа. Номинал каждой внесенной купюры должен быть отправлен в компорт. Покупаетель внес 50 рублей, и от модуля оплаты через **компорт** должно поступить число 50. После заверщения работы **модуля оплаты** в **компорт** должен быть записан статус оплаты, то есть **"s"** или **"e"**, **success** и **error** соотвественно.

**Примечание:** данный метод нужно опрашивать в цикле до получения статуса, и при условии, что инициализация оплаты, `GET /ui/vending/payment/{id}`, прошла успешно.

**Список параметров:**
`@PathVariable {Long id}` (id товара, который покупают)
`@RequestParam {Integer price}` (цена товара)

**Формат ответа:**
До получения статуса от модулей оплаты: 
```sh
{
    "currentMoney": "50", - увеличивается от внесенных средств
    "paymentStatus": null - статус ("s" или "e")
}
```

После получения статуса:
```sh
{
    "currentMoney": "60", - должно быть равно или больше цены товара
    "paymentStatus": "s" - статус ("s" или "e")
}
```

`String` **"s"** (success)
`String` **"e"** (error)

### Запрос статуса оплаты `GET /ui/payment/{id}/status`

Метод, который возвращает статус оплаты, который может быть `String` "s" или `String` "e", успешно и ошибка соотвественно.

**Список параметров:**
`@PathVariable {Long id}`

**Формат ответа:**
```sh
{
    "currentMoney": null, - сумма внесенных средств
    "paymentStatus": "s" - статус ("s" или "e")
}
```
`String` **"s"** или **"e"** - success и error соотвественно.

### Запрос на отмену оплаты `POST /ui/payment/paymentCancel`

Метод, который отправляет в **компорт модуля оплаты** `String` **"pc [текущая сумма]"**, затем чистит все порты и закрывает их если они открыты.
Далее происходит redirect на главную страницу, state обнуляется.

**Список параметров:**
`@RequestParam {String currentMoneyCount}` - текущая внесенная сумма денег

**Формат ответа:**
```sh
{
    "paymentCancelStatus": "payment canceled"
}
```

### Запуск двигателей для выдачи товара `POST /ui/vending/motors/{id}`

Метод, который отправляет в **компорт для запуска двигателей** число, в котором указаны ряд и номер спирали, где находится товар покупателя. Число записано в формате двузначного числа, и расшифровывается как:

*Число 26 означает, что **первая цифра** то есть 2, это номер ряда, а **вторая цифра**, то есть 6, номер спирали в этом ряду.*

После успешного завершения работы двигателей ожидается ответ от **платы, которая управляет запуском двигателей спиралей** через **компорт** в формате **"1"** если всё прошло хорошо и **"2"** в случае ошибки.

Далее формируется ответ об успешной покупке и отправляется на **frontend**.

**Список параметров:**
`@PathVariable {Long id}` (id товара, который покупают)

**Формат ответа:**
```sh
{
    "motorStatus": "s" - статус работы моторов ("s" или "e")
}
```
### Запрос на выдачу сдачи `POST /ui/payment/dispense/{dispenseValue}`

Данный запрос отвечает за выдачу сдачи покупателю, после успешно отработанного
метода `POST /ui/vending/motors/{id}`. Его необходимо реквестить на данной ui форме
(7 страница в макете vending.pdf), держать кнопку главное меню неактивной до получения 
успешного статуса выдачи сдачи "s".

**Список параметров:**
`@PathVariable {Long dispenseValue}` (скольно нужно выдать сдачи, число)

**Формат ответа:**
```sh
{
    "dispenseStatus": "s" - статус выдачи сдачи ("s" или "e")
}
```
### Запрос на проверку возможности оплаты наличным способом `GET /ui/payment/dispense/canDispense`
Данный запрос необходимо отправлять после нажатия на кнопку купить, для проверки
возможности оплаты наличным способом, если метод вернул "false", то на странице
оплаты необходимо выключать возможность оплаты наличным способом(можно сделать
button неактивным)

**Список параметров:**
`без параметров`

**Формат ответа:**
```sh
{
    "canDispense": "true" или "false"
}
```

---
### Обработка ошибок
`HttpStatus.OK - 200` - операция выполнена успешно.
`HttpStatus.ENTERNAL_SERVER_ERROR - 500` - возникли ошибки в ходе операции.
---
