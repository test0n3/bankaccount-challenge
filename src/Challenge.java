import java.util.Scanner;

public class Challenge {
    public final static String menu = """
            Menu
            ----
            1. Consultar saldo.
            2. Retirar
            3. Depositar
            9. Salir""";
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        boolean activeSystem = true;
        while (activeSystem) {
            System.out.println("Bienvenido a la Aplicación Bancaria\n-----------------------------------");
            System.out.println(menu);
            Scanner userInput = new Scanner(System.in);
            System.out.println("Ingrese la opción adecuada:");
            String option = userInput.nextLine();
            double amount;
            switch (option) {
                case "1":
                    bankAccount.accountDetails();
                    break;
                case "2":
                    System.out.println("Cuál es el valor que desea retirar?");
                    amount = userInput.nextDouble();
                    bankAccount.withdrawal(amount);
                    break;
                case "3":
                    System.out.println("Cuál es el valor que desea depositar?");
                    amount = userInput.nextDouble();
                    bankAccount.deposit(amount);
                    break;
                case "9":
                    activeSystem = false;
                    break;
                default:
                    throw new IllegalStateException("Unexpected value: " + option);
            }
        }
    }
}
