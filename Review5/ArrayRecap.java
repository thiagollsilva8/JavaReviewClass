package Review5;

public class ArrayRecap {

    public static void main(String[] args) {

        String[] languages = {"English", "Russian", "Turkish", "French", "Spanish"};

        for (String language : languages) {
            System.out.print(language+" ");
        }

        // I want to print elements in reverse order
        System.out.println();

        for (int i = languages.length - 1; i >= 0 ; i--) {
            System.out.print(languages[i]+" ");
        }
    }
}
