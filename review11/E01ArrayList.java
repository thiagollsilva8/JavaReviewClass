package review11;

public class E01ArrayList {

    public static void main(String[] args) {

        // Problems with arrays
        // 1. Arrays are fixed in size

        String[] names = new String[3];
        names[0] = "Thiago";
        names[1] = "Wayne";
        names[2] = "Kent";

        // 2. No built-in methods are available for arrays

        for (String name : names) {
            if (name.equals("Thiago")) {
                System.out.println("Found");
            }

        }

    }
}