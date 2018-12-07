package main;

import main.controllers.CarController;
import main.model.vehicles.CarFactory;
import main.model.vehicles.cars.Car;
import main.views.CarView;

public class VehicleApplication {

    CarView frame;


    CarController cc = new CarController();

    public void main(String[] args) {
        // Instance of this class


        cc.cars.add(CarFactory.createVolvo240());

        Car saab = CarFactory.createSaab95();
        saab.point.setLocation(0,100);
        cc.cars.add(saab);

        Car scania = CarFactory.createScania();
        scania.point.setLocation(0,200);
        cc.cars.add(scania);

        // Start a new view and send a reference of self
        this.frame = new CarView("CarSim 1.0", cc);

        // Start the timer
        cc.timer.start();
    }



}
