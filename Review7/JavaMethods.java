package Review7;

public class JavaMethods {

        /*
        Method is a re-usable block of code to perform specific tasks
        In the future we have to develop methods:
            open/close browser
            click on buttons
            opening excel
            extracting data from excel
         */

        /*
        Methods: return value
            do not return anything

        Methods: with parameters
            without parameters
         */

    void hello() {
        System.out.println("Hello");
    }

    void helloName(String name) {
        System.out.println("Hello "+ name);
    }

    // I want a method that accepts 3 Strings, concatenates them and return a new Concatenated String

    String concatenate(String str1, String str2, String str3) {

        return str1.concat(str2).concat(str3);

    }

    // I want to create a method that will return me the largest numbers from given 2 numbers

    int largest (int num1, int num2) {

        int large;
        if (num1 > num2) {
            large = num1;
        } else {
            large = num2;
        }

        return large;

    }

    // We need a method that will convert Celsius to Fahrenheit and return the value

    double convert(double Celsius) {

        double fahrenheit = (Celsius * 1.8) + 32;
        return fahrenheit;

    }

    // Create a method that will return an array of words from given sentence

    String[] arr(String sentence) {

        String[] arr = sentence.split(" ");
        return arr;


    }


    }


