package Review7;

public class BankOfAmerica {

    public static void main(String[] args) {

        BankAccount bank = new BankAccount();
        bank.accountHolder = "John Smith";
        bank.accountNumber = 32340928345L;
        bank.accBalance = 20;
        bank.ssn = 918-98-8281;

        // accessing static variables
        System.out.println(BankAccount.bankName);

        BankAccount bank1 = new BankAccount();
        bank1.accountHolder = "Joane Smith";
        bank1.accountNumber = 323428345L;
        bank1.accBalance = 2000;
        bank1.ssn = 918-98-8290;

        System.out.println("---------------before---------------");
        System.out.println(bank1.bankName); // NOT the right way to access Static variables - but it is possible

        bank1.bankName = "Chase";

        System.out.println("-------------after------------------");

        System.out.println(BankAccount.bankName);

    }



}
