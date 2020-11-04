package ru.vending.api;


public interface ComportInterfaceIntegration {

    /** Метод для записи данных в компорт двигателей.
     * @param spiralNumber - номер ряда и спирали одним числом, например 26: 2 - номер ряда,
     *                                                                       6 - номер спирали в этом ряду
     */
    void spiralMotorInput(String spiralNumber);

    /** Метод для ожидания ответа после завершения работы двигателей.
     * @return Integer - (1 - работа завершена успешно, товар получен покупателем,
     *                    0 - работа двигателей была завершена некорректно)
     */
    String spiralMotorWaiting();

    /** Метод для записи данных в компорт Kit Box.
     * @param data - сумма, которую должен заплатить покупатель и способ оплаты
     *             ("80 bn" - 80 рублей, безналичная оплата (n - оплата наличными))
     */
    void kitBoxInput(String data);

    /** Метод для ожидания ответа после завершения оплаты.
     * @return String - варианты ответа: "s" - успешная оплата
     *                                   "e" - ошибка
     */
    String kitBoxWaiting();


    /** Метод для отмены оплаты, отправляет String "Payment cancel" в порт оплаты,
     * закрывает и чистит порт взаимодействия с портом оплаты
     */
    void paymentCancel(String currentMoney);

}
