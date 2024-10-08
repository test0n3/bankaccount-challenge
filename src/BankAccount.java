public class BankAccount {
    private String name = "Tony Stark";
    private String accountType = "corriente";
    private Double availableBalance = 1599.99;
    private String accountCurrency = "$";

    public void accountDetails() {
        System.out.println("Nombre del cliente: " + name
                            + "\nTipo de cuenta: " + accountType
                            + "\nSaldo disponible: " + accountCurrency + availableBalance);
    }

    public void withdrawal(double amount) {
        if (amount <= availableBalance) {
            availableBalance = availableBalance - amount;
            System.out.println("Saldo restante: " + accountCurrency + availableBalance);
        } else {
            System.out.println("Saldo insuficiente");
        }
    }

    public void deposit(double amount) {
        availableBalance = availableBalance + amount;
        System.out.println("Saldo disponible: " + accountCurrency + availableBalance);
    }
}
