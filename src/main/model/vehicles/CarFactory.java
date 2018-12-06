package main.model.vehicles;

import main.model.vehicles.cars.Car;
import main.model.vehicles.cars.Saab95;
import main.model.vehicles.cars.Volvo240;
import main.model.vehicles.transport.Scania;

public class CarFactory {

    public static Car createVolvo240(){
        return new Volvo240();
    }

    public static Car createSaab95(){
        return new Saab95();
    }

    public static Car createScania(){
        return new Scania();
    }
}

