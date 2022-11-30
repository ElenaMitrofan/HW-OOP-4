package Drivers;

import Drivers.Driver;

public class CategoryC extends Driver {
    public CategoryC(String fio, boolean havingALicense, int experience) {
        super(fio, havingALicense, experience);
    }
    public void startMoving(){
        System.out.println("Начал движение на грузовом авто");
    }
    public void finishMoving(){
        System.out.println("Остановился на грузовом авто");

    }
    public void refuel(){
        System.out.println("Заправил грузовое авто");
    }
}
