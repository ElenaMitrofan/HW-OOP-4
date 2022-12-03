import Drivers.*;
import Transports.Bus;
import Transports.Car;
import Transports.Transport;
import Transports.Truck;

public class Main {
    public static void main(String[] args) {
        Car bmw = new Car("BMW", "Z8", 3.2);
        System.out.println(bmw);
        bmw.pitStop();
        bmw.bestLapTime();
        bmw.maxSpeed();
        Driver<Car, CategoryB> ivan = new Driver<>("Иван Ианович Иванов", true, 3, new CategoryB());
        ivan.participatesInTheRace(bmw);
        System.out.println();

        Truck gazelle = new Truck("ГАЗель", "Next", 2.9);
        System.out.println(gazelle);
        gazelle.pitStop();
        gazelle.bestLapTime();
        gazelle.maxSpeed();
        Driver<Truck, CategoryC> misha = new Driver<>("Михайлов Михаил Михайлович", true, 4, new CategoryC());
        misha.participatesInTheRace(gazelle);
        System.out.println();

        Bus zis = new Bus("ЗИС", "154", 4.5);
        System.out.println(zis);
        zis.pitStop();
        zis.bestLapTime();
        zis.maxSpeed();
        Driver<Bus, CategoryC> alex = new Driver<> ("Александров Александр Александрович", true, 5, new CategoryC());
        alex.participatesInTheRace(zis);
        System.out.println();

    }
}