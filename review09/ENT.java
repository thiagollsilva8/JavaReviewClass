package review09;

public class ENT extends Doctor {

    String location;

    ENT(String firstName, String lastName, String specialty, String location) {
        super(firstName, lastName, specialty, location);
        this.location = location;


    }

    /*
    override prescribeMedicine
        1. We MUST have inheritance
        2. Method signature MUST be the same (name+parameter)
        3. Return type MUST be the same
        4. Access modifiers can be the same or give higher visibility
     */

    public void prescribeMedicine(String medicine) {
        System.out.println("ENT doctor prescribes " + medicine + " when needed it");
    }

    protected void inspect (String bodyPart) {
        System.out.println("Ent doctor checks "+bodyPart);
    }

    public static void main(String[] args) {

        ENT ent = new ENT("John", "Snow", "ENT", "Maryland");
        ent.printInfo(); // from parent
        ent.treat(); // from parent
        ent.treat("John Wick"); // from parent
        ent.prescribeMedicine("Fluticasone nasal preparations"); // overriding method
        ent.inspect("Nose"); //ent own method

        // Casting of non primitives: upcasting and downcasting
        // the below case is upcasting

        Doctor ent1 = new ENT("John", "Wick", "ENT", "Miami");
        ent1.printInfo();
        ent1.treat();
        ent1.treat("Jane Smith");
        ent1.prescribeMedicine("Some medicine"); // runtime polymorphism

        // during the compilation, the compiler gives access to all methods based on the reference type
        // during runtime - java looks always at the Object type


    }

}
