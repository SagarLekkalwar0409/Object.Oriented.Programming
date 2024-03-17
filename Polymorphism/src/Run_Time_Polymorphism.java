/**
 * Consider a scenario where Bank is a class that provides a method to get the rate of interest.
 * However, the rate of interest may differ according to banks. For example, SBI, ICICI, and AXIS
 * banks are providing 8.4%, 7.3%, and 9.7% rate of interest.
 */
class Bank {
    public float getRateOfInterest() {
        return 0;
    }
}

class SBI extends Bank {
    @Override
    public float getRateOfInterest() {
        return 8.4f;
    }
}

class ICICI extends Bank {
    @Override
    public float getRateOfInterest() {
        return 7.3f;
    }
}

class AXIS extends Bank {
    @Override
    public float getRateOfInterest() {
        return 9.7f;
    }
}

public class Run_Time_Polymorphism {
    public static void main(String[] args) {
        Bank bank1 = new SBI();
        System.out.println("Rate of Interest in SBI : " + bank1.getRateOfInterest() + " %");

        Bank bank2 = new AXIS();
        System.out.println("Rate of Interest in AXIS : " + bank2.getRateOfInterest() + " %");

        Bank bank3 = new ICICI();
        System.out.println("Rate of Interest in ICICI : " + bank3.getRateOfInterest() + " %");
    }
}
