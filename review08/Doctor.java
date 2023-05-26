package review08;

public class Doctor {

    public String firstName, lastName;
    protected String specialty;
    int yearsOfExperience;
    double salary;

    public static boolean degree;

    Doctor(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;

    }

    /*
    To have more than 1 constructor, we need to change the number of the parameters or type of the parameter
     */
    public Doctor(String firstName, String lastName, String specialty) {
        this(firstName, lastName); // this() => calling a current class constructor
        this.specialty = specialty; // this. is referring to the current class instance variables

    }

    public void printInfo() {
        System.out.println("Doctor's name is " + firstName + " " + lastName + ", and his specialty is " + specialty);
    }


    void treat() {
        System.out.println("Doctors treat patients");

    }

    private double getSalary() {
        return salary;
    }


}
