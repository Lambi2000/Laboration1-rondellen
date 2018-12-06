package main.views;

import main.model.vehicles.cars.Car;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Locale;
import javax.imageio.ImageIO;
import javax.swing.*;

// This panel represent the animated part of the view with the car images.

public class DrawPanel extends JPanel {


    ArrayList<Car> cars;

    // Initializes the panel and reads the images
    public DrawPanel(int x, int y, ArrayList<Car> cars) {
        this.setDoubleBuffered(true);
        this.setPreferredSize(new Dimension(x, y));
        this.setBackground(Color.white);
        this.cars = cars;
        // Print an error message in case file is not found with a try/catch block

            // You can remove the "src\\pics" part if running outside of IntelliJ and
            // everything is in the same main folder.
            // Rememember to rightclick src New -> Package -> name: pics -> MOVE *.jpg to pics.
            // if you are starting in IntelliJ.
            // Linux users need to modify \ to / in path string

    }

    // This method is called each time the panel updates/refreshes/repaints itself
    // TODO: Change to suit your needs.
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        cars.forEach(car -> {
            g.drawImage(getImage(car), car.point.x, car.point.y, null); // see javadoc for more info on the parameters
        });
    }


    public static enum OSType {
        Windows, MacOS, Linux;
    }



    private static OSType detectedOS;

    public BufferedImage getImage(Car car){
            String path = "";
            try {
                return ImageIO.read(new File("src" + File.separator + "pics" + File.separator + car.getClass().getSimpleName() + ".jpg"));
            }catch (Exception e){

            }
            return null;

    }
}