package ru.vending.comport;

import jssc.SerialPort;
import jssc.SerialPortException;
import lombok.SneakyThrows;
import org.springframework.stereotype.Component;

/**
 * Класс реализующий возможность отправить данные на компорт KitBox (String) и вычитывать ответ (String).
 * Настройки порта: 9600.8.1.NONE
 */

@Component
public class KitBoxComport {
    private static final SerialPort kitBoxComport = new SerialPort("COM7");
    // TODO узнать адрес порта, который будет соединяться с KitBox

    @SneakyThrows(value = {SerialPortException.class, InterruptedException.class})
    public void sendDataOnKitBoxComport(String data) {
        kitBoxComport.openPort();
        kitBoxComport.setParams(SerialPort.BAUDRATE_9600, SerialPort.DATABITS_8, SerialPort.STOPBITS_1, SerialPort.PARITY_NONE);
        kitBoxComport.writeBytes(data.getBytes());
        Thread.sleep(100);
        kitBoxComport.closePort();
    }

    @SneakyThrows(value = {SerialPortException.class, InterruptedException.class})
    public String kitBoxResponseWaiting() {
        byte[] bytesOnPort = null;
        kitBoxComport.openPort();
        kitBoxComport.setParams(SerialPort.BAUDRATE_9600, SerialPort.DATABITS_8, SerialPort.STOPBITS_1, SerialPort.PARITY_NONE);

        // TODO придумать более надежный способ проверки есть ли в порту байты и все ли байты записались.
        while (bytesOnPort == null) {
            bytesOnPort = kitBoxComport.readBytes();
            Thread.sleep(200);
        }
        kitBoxComport.closePort();

        return new String(bytesOnPort);
    }


}
