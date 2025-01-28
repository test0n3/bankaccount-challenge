public class BankAccount {
    private final String name = "Tony Stark";
    private final String accountType = "corriente";
    private final String accountCurrency = "$";
    private Double availableBalance = 1599.99;

    public String withdrawal(double amount) {
        if (amount <= availableBalance) {
            this.availableBalance -= amount;
            return "\nSaldo restante: " + this.accountCurrency + this.availableBalance;
        } else {
            return "\nSaldo insuficiente.";
        }
    }

    public String deposit(double amount) {
        this.availableBalance += amount;
        return "\nSaldo disponible: " + this.accountCurrency + this.availableBalance;
    }

    @Override
    public String toString() {
        return "\nDetalle de cuenta" +
                "\n-----------------" +
                "\nNombre del cliente: " + this.name +
                "\nTipo de cuenta: " + this.accountType +
                "\nSaldo disponible: " + this.accountCurrency + this.availableBalance;
    }
}
