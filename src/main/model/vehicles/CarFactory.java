package main.model.vehicles;

import main.model.vehicles.cars.Car;
import main.model.vehicles.cars.Saab95;
import main.model.vehicles.cars.Volvo240;
import main.model.vehicles.transport.Scania;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class CarFactory {

    static List<Car> listOfCars = new ArrayList<>();

    public static void createVolvo240(Point point){
        Volvo240 volvo = new Volvo240();
        volvo.point.setLocation(point);
        listOfCars.add(volvo);
    }

    public static void createSaab95(Point point){
        Saab95 saab = new Saab95();
        saab.point.setLocation(point);
        listOfCars.add(saab);
    }

    public static void createScania(Point point){
        Scania scania = new Scania();
        scania.point.setLocation(point);
        listOfCars.add(scania);
    }
}

