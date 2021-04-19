import java.util.Scanner;
public class ATM {

    public static double BALANCE = 500;
    public static Scanner input = new Scanner(System.in);

    public static void mainMenu()
    {
        System.out.println("Main Menu");
        System.out.println("1. Check Balance");
        System.out.println("2. Withdraw");
        System.out.println("3. Deposit");
        System.out.println("4. Exit");
    }

    public static void enterChoice()
    {
        System.out.println("Enter Choice: ");
        int choiceNumber = input.nextInt();
        choice(choiceNumber);
    }

    public static void withdraw()
    {
        System.out.println("Enter Amount: ");
        double withdrawAmount = input.nextDouble();
        if(BALANCE < withdrawAmount)
        {
            System.out.println("Your Request Amount is Larger Then Your Current Balance");
            System.exit(0);
        }
        System.out.println("Withdraw Request Successfully Send");
    }
    public static void deposit()
    {
        System.out.println("Enter Amount: ");
        double depositAmount = input.nextDouble();
        BALANCE += depositAmount;
        System.out.println("Your Current Balance " + BALANCE);
        mainMenu();
        enterChoice();
    }
    public static void choice(int choice)
    {
        switch (choice)
        {
            case 1:
                System.out.println(BALANCE);
                mainMenu();
                enterChoice();
                break;
            case 2:
                withdraw();
                break;
            case 3:
                deposit();
                break;
            case 4:
                System.exit(0);
                break;
            default:
                System.out.println("Please valid input number");
                break;
        }
    }

    public static void main(String[] args)
    {
        final long ACCOUNTNUMBER = 654321;
        final String PASSWORD = "mahadi";

        System.out.println("Enter Your Account No : ");
        long accountNumber = input.nextLong();
        System.out.println("Enter Your Password : ");
        String password = input.next();

        if(ACCOUNTNUMBER != accountNumber && PASSWORD != password) {
            System.out.println("Incorrect username or password");
            System.exit(0);
        }
        System.out.println("Login successfully");
        mainMenu();
        enterChoice();
        System.exit(0);
    }
}
