public class Car extends Vehicle {
    /* All the public or protected are inherited here excluding Constructors */

    /* Data members */
    // String id;
    // String name;
    // int noOfTyre;
    // String color;
    // double milesPerLitre;
    // static int noOfDriver;

    /* Methods */
    // getters //
    //getId()
    //getName()
    //getMilesPerLitre()
    //GetVehicle()

    // setters //
    //setMilesPerLitre(double milesPerLitre)
    //setColor(String color)

    /* Constructors */
    public Car(){}

    // using super()
    public Car(String id, String name, int noOfTyre, String color, double milesPerLitre){
        super(id, name, noOfTyre, color, milesPerLitre); // this calls the parent constructor

    }
}
