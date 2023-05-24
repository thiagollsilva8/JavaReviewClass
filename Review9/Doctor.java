package Review9;

public class Doctor {

    public String firstName, lastName;
    protected String specialty;
    int yearsOfExperience;
    double salary;

    String location;
    public static boolean degree;

    Doctor(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;

    }

    /*
    To have more than 1 constructor, we need to change the number of the parameters or type of the parameter
     */
    public Doctor(String firstName, String lastName, String specialty, String location) {
        this(firstName, lastName); // this() => calling a current class constructor
        this.specialty = specialty; // this. is referring to the current class instance variables
        this.location = location;
    }

    public void printInfo() {
        System.out.println("Doctor's name is " + firstName + " " + lastName + ", and his specialty is " + specialty);
    }


    protected void treat() {
        System.out.println("Doctors treat patients");

    }

    // in overloading we look only at the signature (name + parameters)
    // signature must be different

    protected void treat(String patient) {
        System.out.println("Doctors treats "+patient);
    }

    void prescribeMedicine (String medicine) {
        System.out.println("Doctor prescribed "+medicine);
    }

    // private members do not participate in the inheritance
    private double getSalary() {

        return salary;
    }


}
