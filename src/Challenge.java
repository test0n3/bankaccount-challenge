import java.util.Scanner;

public class Challenge {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        boolean activeSystem = true;
        Scanner userInput = new Scanner(System.in);
        while (activeSystem) {
            System.out.println(MenuData.mainMenu());
            System.out.print("\nIngrese la opción adecuada: ");
            String option = userInput.nextLine();
            double amount;
            switch (option) {
                case "1":
                    System.out.println(bankAccount);
                    break;
                case "2":
                    System.out.print("\n¿Cuál es el valor que desea retirar? ");
                    amount = userInput.nextDouble();
                    userInput.nextLine();
                    System.out.println(bankAccount.withdrawal(amount));
                    break;
                case "3":
                    System.out.print("\n¿Cuál es el valor que desea depositar? ");
                    amount = userInput.nextDouble();
                    userInput.nextLine();
                    System.out.println(bankAccount.deposit(amount));
                    break;
                case "9":
                    activeSystem = false;
                    break;
                default:
                    throw new IllegalStateException("Unexpected value: " + option);
            }
        }
        userInput.close();
    }
}
