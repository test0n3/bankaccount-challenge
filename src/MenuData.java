public class MenuData {
    static String MENU = """
                        Bienvenido a la Aplicación Bancaria
                        -----------------------------------
                        
                        Menu
                        ----
                        1. Consultar saldo.
                        2. Retirar
                        3. Depositar
                        9. Salir
            """;

    public static String mainMenu() {
        return "\n" + MENU;
    }
}
