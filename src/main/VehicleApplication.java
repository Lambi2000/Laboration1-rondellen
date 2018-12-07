package main;

import main.controllers.CarController;
import main.model.vehicles.CarFactory;
import main.model.vehicles.cars.Car;
import main.model.vehicles.cars.Volvo240;
import main.views.CarView;
import main.views.DrawPanel;

public class VehicleApplication {

    CarView frame;

    //DrawPanel drawPanel = new DrawPanel(X, Y-240, cc.getCars());

    CarController cc = new CarController();

    public void main(String[] args) {
        // Instance of this class


        cc.createVehicle("Volvo240");
        cc.createVehicle("Saab95");
        cc.createVehicle("Scania");

        //cc.getCars().add(CarFactory.createVolvo240());
        //
        //Car saab = CarFactory.createSaab95();
        //saab.point.setLocation(0,100);
        //cc.getCars().add(saab);
        //
        //Car scania = CarFactory.createScania();
        //scania.point.setLocation(0,200);
        //cc.getCars().add(scania);

        // Start a new view and send a reference of self
        this.frame = new CarView("CarSim 1.0", cc);

        // Start the timer
        // TODO cc.startTimer();
    }



}
