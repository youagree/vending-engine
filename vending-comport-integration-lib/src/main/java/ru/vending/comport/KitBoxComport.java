package ru.vending.comport;

import jssc.SerialPort;
import jssc.SerialPortException;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * Класс реализующий возможность отправить данные на компорт KitBox (String) и вычитывать ответ (String).
 * Настройки порта: 9600.8.1.NONE
 */

@Slf4j
@Component
public class KitBoxComport {
    private static final SerialPort kitBoxComport = new SerialPort("COM7");
    // TODO узнать адрес порта, который будет соединяться с KitBox

    @SneakyThrows(value = {SerialPortException.class, InterruptedException.class})
    public void sendDataOnKitBoxComport(String data) {
        log.info("Current data: {}", data);
        kitBoxComport.openPort();
        log.info("KitBox comport is opened");
        kitBoxComport.setParams(SerialPort.BAUDRATE_9600, SerialPort.DATABITS_8, SerialPort.STOPBITS_1, SerialPort.PARITY_NONE);
        log.info("KitBox comport settings: 9600.8.1.NONE");
        kitBoxComport.writeBytes(data.getBytes());
        log.info("Written bytes: {}", data.getBytes());
        Thread.sleep(100);
        kitBoxComport.closePort();
        log.info("KitBox comport is closed");
    }

    @SneakyThrows(value = {SerialPortException.class, InterruptedException.class})
    public String kitBoxResponseWaiting() {
        byte[] bytesOnPort = null;
        kitBoxComport.openPort();
        log.info("KitBox comport is opened");
        kitBoxComport.setParams(SerialPort.BAUDRATE_9600, SerialPort.DATABITS_8, SerialPort.STOPBITS_1, SerialPort.PARITY_NONE);
        log.info("KitBox comport settings: 9600.8.1.NONE");

        // TODO придумать более надежный способ проверки есть ли в порту байты и все ли байты записались.
        while (bytesOnPort == null) {
            log.info("No bytes on comport");
            bytesOnPort = kitBoxComport.readBytes();
            Thread.sleep(200);
        }
        log.info("Bytes on comport: {}", new String(bytesOnPort));
        kitBoxComport.closePort();
        log.info("KitBox comport is closed");

        return new String(bytesOnPort);
    }

    @SneakyThrows(value = {SerialPortException.class, InterruptedException.class})
    public void paymentCancel(String currentMoney) {
        log.info("Current price: {}", currentMoney);
        if (kitBoxComport.isOpened()) {
            log.info("Payment cancel start!");
            String cancel = "pc " + currentMoney;
            kitBoxComport.writeBytes(cancel.getBytes());
            log.info("Written bytes on comport: {}", cancel.getBytes());
        } else {
            kitBoxComport.openPort();
            log.info("KitBox comport is opened");
            kitBoxComport.setParams(SerialPort.BAUDRATE_9600, SerialPort.DATABITS_8, SerialPort.STOPBITS_1, SerialPort.PARITY_NONE);
            log.info("KitBox comport settings: 9600.8.1.NONE");
            String cancel = "pc " + currentMoney;
            kitBoxComport.writeBytes(cancel.getBytes());
            log.info("Written bytes on comport: {}", cancel.getBytes());
        }
        Thread.sleep(300);
        kitBoxComport.purgePort(SerialPort.PURGE_RXCLEAR | SerialPort.PURGE_TXCLEAR);
        log.info("KitBox comport flush is completed");
        kitBoxComport.closePort();
        log.info("KitBox comport is closed");
    }
}
