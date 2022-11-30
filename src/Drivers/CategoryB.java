package Drivers;

import Drivers.Driver;
import Transports.Competing;

public class CategoryB extends Driver {
    public CategoryB(String fio, boolean havingALicense, int experience) {
        super(fio, havingALicense, experience);
    }

    public void startMoving(){
        System.out.println("Начал движение на легковом авто");
    }
    public void finishMoving(){
        System.out.println("Остановился на легковом авто");
    }
    public void refuel(){
        System.out.println("Заправил легковое авто");
    }

}
