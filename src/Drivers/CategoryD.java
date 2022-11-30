package Drivers;

import Drivers.Driver;

public class CategoryD extends Driver {
    public CategoryD(String fio, boolean havingALicense, int experience) {
        super(fio, havingALicense, experience);
    }
    public void startMoving(){
        System.out.println("Начал движение на автобусе");
    }
    public void finishMoving(){
        System.out.println("Остановился на автобусе");

    }
    public void refuel(){
        System.out.println("Заправил автобус");
    }
}
