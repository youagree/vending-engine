package ru.vending.comport;

import jssc.SerialPort;
import jssc.SerialPortException;
import lombok.SneakyThrows;
import org.springframework.stereotype.Component;
import java.util.Arrays;

/**
 * Класс реализующий деятельность компорта связанного с моторами спиралей, умеет писать и
 * ждать ответа о завершении.
 * Настройки порта: 9600.8.1.NONE
 */
@Component
public class SpiralMotorComport {
    private static final SerialPort raspberryComport = new SerialPort("COM5"); // TODO узнать адрес этого порта на расбери

    @SneakyThrows(value = {SerialPortException.class, InterruptedException.class})
    public void sendSpiralNumberOnComport(String spiralNumber) {
        raspberryComport.openPort();
        raspberryComport.setParams(SerialPort.BAUDRATE_9600, SerialPort.DATABITS_8, SerialPort.STOPBITS_1, SerialPort.PARITY_NONE);
        raspberryComport.writeBytes(spiralNumber.getBytes());
        Thread.sleep(100);
        raspberryComport.closePort();
    }

    @SneakyThrows(value = {SerialPortException.class, InterruptedException.class})
    public String spiralMotorsResponseWaiting() {
        byte[] bytesOnPort = null;
        raspberryComport.openPort();
        raspberryComport.setParams(SerialPort.BAUDRATE_9600, SerialPort.DATABITS_8, SerialPort.STOPBITS_1, SerialPort.PARITY_NONE);

        // TODO придумать более надежный способ проверки есть ли в порту байты и все ли байты записались.
        while (bytesOnPort == null) {
            bytesOnPort = raspberryComport.readBytes();
            Thread.sleep(200);
        }
        raspberryComport.closePort();
        return new String(bytesOnPort);
    }

}
