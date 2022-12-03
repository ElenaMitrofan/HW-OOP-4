package Drivers;

import Drivers.Driver;
import Transports.Bus;
import Transports.Car;
import Transports.Transport;
import Transports.Truck;

public class CategoryC extends Category{
    public boolean canDrive(Transport transport){
        return transport instanceof Bus;
    }

}
