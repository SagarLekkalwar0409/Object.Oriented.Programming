import java.util.*;

public class BikeRider {
    public static void main(String[] args) {
        Bike bike = new Bike();
        Scanner scn = new Scanner(System.in);

        System.out.println("Bike\n 1.ON\n 2.OFF");

        bike.setBikeStart(scn.nextByte());

        while (true) {
            try {
                System.out.println("Change Gear ");
                bike.setGears(scn.nextInt());


                bike.BikeRunnerOnGear();

            } catch (InputMismatchException e) {
                System.out.println(e.getMessage());
                scn.nextLine();
            }
        }
    }
}
