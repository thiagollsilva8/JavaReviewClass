package review10;

public class FacebookTester {

    public static void main(String[] args) {

        FacebookUser vlad = new FacebookUser("Vlad", "user123", "pass123", "1950-1-1");

        System.out.println(vlad.getDOB());
        System.out.println(vlad.getUserName());
        vlad.setUserName("TSwift123");
        System.out.println(vlad.getUserName());

    }
}
