package main.model.vehicles;

import main.model.vehicles.cars.Car;
import main.model.vehicles.cars.Saab95;
import main.model.vehicles.cars.Volvo240;
import main.model.vehicles.transport.Scania;

import java.util.ArrayList;
import java.util.List;

public class CarFactory {

    static List<Car> listOfCars = new ArrayList<>();

    public static void createVolvo240(){
        listOfCars.add(new Volvo240());
    }

    public static void createSaab95(){
        listOfCars.add(new Saab95());
    }

    public static void createScania(){
        listOfCars.add(new Scania());
    }
}

