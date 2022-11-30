package Drivers;

import Transports.Competing;
import Transports.Transport;

public class  Driver <D extends Transport & Competing> {
    protected final String fio;
    protected final boolean HavingALicense;
    protected  final int experience;

    public Driver(String fio, boolean havingALicense, int experience) {
        if (fio == null || fio == "") {
            this.fio = "default";
        }else{
            this.fio = fio;
        }
        HavingALicense = havingALicense;

        if (experience <= 0) {
            this.experience = 3;
        }else{
            this.experience = experience;
        }
    }
    public void drive(D transport) {
        System.out.println("Водитель ["+getFio()+"] управляет автомобилем ["+transport.getBrand()+"] и будет участвовать в заезде");
    }

    public String getFio() {
        return fio;
    }

    public boolean isHavingALicense() {
        return HavingALicense;
    }

    public int getExperience() {
        return experience;
    }
    public void startMoving(){

    }
    public void finishMoving(){

    }
    public void refuel(){

    }


}

