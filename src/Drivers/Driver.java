package Drivers;

import Transports.*;

public class  Driver <T extends Transport, C extends Category>{
    protected final String fio;
    protected final boolean HavingALicense;
    protected  final int experience;

    private final Category category;

    public Driver(String fio, boolean havingALicense, int experience, C category) {
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

        this.category = category;
    }
    public void participatesInTheRace (T car){
        if (category.canDrive(car) == true) {
            System.out.println("водитель [" + getFio() + "] управляет автомобилем [" + car.getBrand() + "] и будет участвовать в заезде");
        } else {
            System.out.println("Водитель не может принять участие");
        }
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

