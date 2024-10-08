public class BankAccount {
    private final String name = "Tony Stark";
    private final String accountType = "corriente";
    private final String accountCurrency = "$";
    private Double availableBalance = 1599.99;

    public void accountDetails() {
        System.out.println("\nDetalle de cuenta\n------------------");
        System.out.println("Nombre del cliente: " + name
                            + "\nTipo de cuenta: " + accountType
                            + "\nSaldo disponible: " + accountCurrency + availableBalance);
    }

    public void withdrawal(double amount) {
        if (amount <= availableBalance) {
            availableBalance = availableBalance - amount;
            System.out.println("\nSaldo restante: " + accountCurrency + availableBalance);
        } else {
            System.out.println("\nSaldo insuficiente.");
        }
    }

    public void deposit(double amount) {
        availableBalance = availableBalance + amount;
        System.out.println("\nSaldo disponible: " + accountCurrency + availableBalance);
    }
}
