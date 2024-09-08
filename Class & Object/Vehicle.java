public class Vehicle {
    /* This is a base class for all the vehicles */

    /* Data members or Attributes */
    protected String id;
    protected String name;
    protected int noOfTyre;
    protected String color;
    protected double milesPerLitre;
    protected static int noOfDriver;

    /* Static initializer */
    static {
        // This block run only at the time of this class file loaded.
        // And this is the 1st block which start the execution.
        noOfDriver = 1;
        System.out.println("\n\nnoOfDriver is set to "+noOfDriver+" using the static block.\n\n");
    }

    /* Constructors */

    // Default
    public Vehicle(){}

    // Partial constructor
    public Vehicle( String id, String name, int noOfTyre){
        // it does not init color, milesPerLitre
        this.id = id;
        this.name = name;
        this.noOfTyre = noOfTyre;
    }

    // 'this' constructor
    public Vehicle( String id, String name, int noOfTyre, String color){
        // 'this' constructor calls pre constructor and add the other attributes 
        this(id, name, noOfTyre);
        this.color = color;
    }

    // complete constructor
    public Vehicle( String id, String name, int noOfTyre, String color, double milesPerLitre){
        // As the name suggest, it's init all the attributes present in it.
        this.id = id;
        this.name = name;
        this.noOfTyre = noOfTyre;
        this.color = color;
        this.milesPerLitre = milesPerLitre;
    }

    /* Methods */

    // getters
    public void getId(){
        System.out.println("id: "+this.id);
    }

    public void getName(){
        System.out.println("id: "+this.name);
    }

    public void getMilesPerLitre(){
        System.out.println("id: "+this.milesPerLitre);
    }
    public void getVehicle(){
        System.out.println("************ "+this.id+" **************");
        System.out.println("Name: "+this.name);
        System.out.println("No of Tyres: "+this.noOfTyre);
        System.out.println("Color: "+this.color);
        System.out.println("Miles per Litre: "+this.milesPerLitre);
        System.out.println("No of Driver: "+noOfDriver);
        System.out.println("************ "+this.id+" ************");
    }

    // setters
    public void setMilesPerLitre(double milesPerLitre){
        this.milesPerLitre = milesPerLitre;
    }

    public void setColor(String color){
        this.color = color;
    }

    public static void setNoOfDriver(int driversCount){
        noOfDriver = driversCount;
    }
}
