package ru.vending.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.vending.api.ComportInterfaceIntegration;
import ru.vending.comport.KitBoxComport;
import ru.vending.comport.SpiralMotorComport;

@Service
public class ComportService implements ComportInterfaceIntegration {
    private KitBoxComport kitBoxComport;
    private SpiralMotorComport spiralMotorComport;

    @Autowired
    public void setComports(KitBoxComport kitBoxComport, SpiralMotorComport spiralMotorComport) {
        this.kitBoxComport = kitBoxComport;
        this.spiralMotorComport = spiralMotorComport;
    }

    @Override
    public void spiralMotorInput(Integer spiralNumber) {
        spiralMotorComport.sendSpiralNumberOnComport(spiralNumber);
    }

    @Override
    public Integer spiralMotorWaiting() {
        return spiralMotorComport.spiralMotorsResponseWaiting();
    }

    @Override
    public void kitBoxInput(String data) {
        kitBoxComport.sendDataOnKitBoxComport(data);
    }

    @Override
    public String kitBoxWaiting() {
        return kitBoxComport.kitBoxResponseWaiting();
    }
}
