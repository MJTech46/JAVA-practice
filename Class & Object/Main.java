public class Main {
    public static void main(String[] args) {
        /* creating object of the Vehicle class */
        Vehicle v1 = new Vehicle("KL46P6556","Devid's car", 4);

        // using getter
        v1.getVehicle();
        
        // using setter
        v1.setMilesPerLitre(25.7);
        v1.setColor("White");

        // calling getter after setter
        System.out.println("\n/* After using setter */\n");
        v1.getVehicle();

        System.err.println("\n\n\n Creating new Car obj \n\n\n");

        /* creating new object of the Car class */
        Car c1 = new Car("KL17X4678","My Car", 4, "Black", 17.8);

        c1.getVehicle();

        /* Expected output */
        
        // noOfDriver is set to 1.


        // ************ KL46P6556 **************
        // Name: Devid's car
        // No of Tyres: 4
        // Color: null
        // Miles per Litre: 0.0
        // No of Driver: 1
        // ============ KL46P6556 ==============

        // /* After using setter */

        // ************ KL46P6556 **************
        // Name: Devid's car
        // No of Tyres: 4
        // Color: White
        // Miles per Litre: 25.7
        // No of Driver: 1
        // ============ KL46P6556 ==============



        //  Creating new Car obj



        // ************ KL17X4678 **************
        // Name: My Car
        // No of Tyres: 4
        // Color: Black
        // Miles per Litre: 17.8
        // No of Driver: 1
        // ============ KL17X4678 ==============

    }
}
