/*
Develop  a program encapsulation Bike gear to allow Driver to set only 0 -5 gear
if Driver sets wrong values throw exception
if Driver set correct value, display message
Bike is running on gear num
 */

import java.util.InputMismatchException;

public class Bike {
    private int bikeStart;
    private int gears;

    public void setBikeStart(int bikeStart) {
        if (bikeStart == 1) {
            System.out.println("Bike is Started and it is on Neutral");
            System.out.println("");

        } else if (bikeStart == 2) {
            System.out.println("Bike is OFF");

            System.exit(0); // exit from program
        }
        this.bikeStart = bikeStart;
    }

    public void setGears(int gears) throws InputMismatchException {

        if (gears < 0 || gears > 5) {
            throw new InputMismatchException("Enter Gear Bet 0 - 5");
        }else if(gears == 0){
            System.out.println("Bike is On Neutral");

        }
        this.gears = gears;
    }

    public void BikeRunnerOnGear() {
        if(gears == 5){
            System.out.println("Bike is On Top Gear");

        } else {
            System.out.println("Bike Running On Gear Number : " + gears);
        }
    }
}
