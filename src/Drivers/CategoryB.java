package Drivers;

import Drivers.Driver;
import Transports.Car;
import Transports.Competing;
import Transports.Transport;

public class CategoryB extends Category{
    public boolean canDrive(Transport transport){
        return transport instanceof Car;
    }

}
