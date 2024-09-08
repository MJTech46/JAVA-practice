public class Main {
    public static void main(String[] args) {
        /* creating object of the Vehicle class */
        Vehicle v1 = new Vehicle("KL46P6556","Devid's Bike", 2);

        // using getter
        v1.getVehicle();
        
        // using setter
        v1.setMilesPerLitre(25.7);
        v1.setColor("White");

        System.out.println("\n/* After using setter */\n");

        // calling getter after setter
        v1.getVehicle();

        System.out.println("\n\n\n Creating new Car obj \n\n\n");

        /* creating new object of the Car class */
        Car c1 = new Car("KL17X4678","My Car", 4, "Black", 17.8);

        c1.getVehicle();

        /* Calling static method */
        Car.setNoOfDriver(2);

        System.out.println("\n/* Creating new obj after calling static method */\n");

        /* new car obj */
        Car c2 =  new Car("KL17X4678","My Car", 4, "Black", 17.8);

        // getters
        c2.getVehicle();
        
    }
}
/* Expected output */


// noOfDriver is set to 1 using the static block.

// ************ KL46P6556 **************
// Name: Devid's Bike
// No of Tyres: 2
// Color: null
// Miles per Litre: 0.0
// No of Driver: 1
// ************ KL46P6556 ************ 

// /* After using setter */

// ************ KL46P6556 **************
// Name: Devid's Bike
// No of Tyres: 2
// Color: White
// Miles per Litre: 25.7
// No of Driver: 1
// ************ KL46P6556 ************

//  Creating new Car obj

// ************ KL17X4678 **************
// Name: My Car
// No of Tyres: 4
// Color: Black
// Miles per Litre: 17.8
// No of Driver: 1
// ************ KL17X4678 ************

// /* Creating new obj after calling static method */

// ************ KL17X4678 **************
// Name: My Car
// No of Tyres: 4
// Color: Black
// Miles per Litre: 17.8
// No of Driver: 2
// ************ KL17X4678 ************

