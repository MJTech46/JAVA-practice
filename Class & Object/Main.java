public class Main {
    public static void main(String[] args) {
        /* creating object of the Vehicle class */
        Vehicle v1 = new Vehicle("KL46P6556","Devid's car", 4);

        // using getter
        v1.GetVehicle();
        
        // using setter
        v1.setMilesPerLitre(25.7);
        v1.setColor("White");

        // calling getter after setter
        System.out.println("\n/* After using setter */\n");
        v1.GetVehicle();

        /* Expected output */

        //************ KL46P6556 **************
        // Name: Devid's car       
        // No of Tyres: 4
        // Color: null
        // Miles per Litre: 0.0    

        // /* After using setter */

        // ************ KL46P6556 **************
        // Name: Devid's car
        // No of Tyres: 4
        // Color: White
        // Miles per Litre: 25.7
    }
}
