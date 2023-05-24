package Review8;

public class Hospital {

    public static void main(String[] args) {

        Doctor doctor = new Doctor("Thiago", "Silva");
        doctor.printInfo();

        Doctor doctor1 = new Doctor("Thiago", "Silva", "Cardiologist");
        doctor1.printInfo(); // public
        doctor1.treat(); //
        // doctor1.prescribedMedicine("antibiotics");


    }
}
