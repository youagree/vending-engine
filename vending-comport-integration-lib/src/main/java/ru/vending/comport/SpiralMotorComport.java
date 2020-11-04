package ru.vending.comport;

import jssc.SerialPort;
import jssc.SerialPortException;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * Класс реализующий деятельность компорта связанного с моторами спиралей, умеет писать и
 * ждать ответа о завершении.
 * Настройки порта: 9600.8.1.NONE
 */

@Slf4j
@Component
public class SpiralMotorComport {
    private static final SerialPort raspberryComport = new SerialPort("COM5"); // TODO узнать адрес этого порта на расбери

    @SneakyThrows(value = {SerialPortException.class, InterruptedException.class})
    public void sendSpiralNumberOnComport(String spiralNumber) {
        log.info("Current spiral number: {}", spiralNumber);
        raspberryComport.openPort();
        log.info("Raspberry comport is opened");
        raspberryComport.setParams(SerialPort.BAUDRATE_9600, SerialPort.DATABITS_8, SerialPort.STOPBITS_1, SerialPort.PARITY_NONE);
        log.info("Raspberry comport settings: 9600.8.1.NONE");
        raspberryComport.writeBytes(spiralNumber.getBytes());
        log.info("Written bytes on comport: {}", spiralNumber.getBytes());
        Thread.sleep(100);
        raspberryComport.closePort();
        log.info("Raspberry comport is closed");
    }

    @SneakyThrows(value = {SerialPortException.class, InterruptedException.class})
    public String spiralMotorsResponseWaiting() {
        byte[] bytesOnPort = null;
        raspberryComport.openPort();
        log.info("Raspberry comport is opened");
        raspberryComport.setParams(SerialPort.BAUDRATE_9600, SerialPort.DATABITS_8, SerialPort.STOPBITS_1, SerialPort.PARITY_NONE);
        log.info("Raspberry comport settings: 9600.8.1.NONE");
        // TODO придумать более надежный способ проверки есть ли в порту байты и все ли байты записались.
        while (bytesOnPort == null) {
            bytesOnPort = raspberryComport.readBytes();
            log.info("No bytes on comport");
            Thread.sleep(200);
        }

        log.info("Bytes on comport: {}", new String(bytesOnPort));
        raspberryComport.closePort();
        log.info("Raspberry comport is closed");
        return new String(bytesOnPort);
    }
}
