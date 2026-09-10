public class BloxburgGame
{
    public static void main(String[] args)
    {
        System.out.println("Welcome to Bloxburg Business Simulator!");

        // Create businesses using overloaded constructors
        Business pizzaPlace =
            new Business("Pizza Palace", "Alex", 5000.0);

        Business burgerShop =
            new Business("Blox Burgers", 3500.0);

        // Hire employees
        pizzaPlace.hireEmployee("John", "Chef", 15.0);
        pizzaPlace.hireEmployee("Sarah", "Cashier");

        burgerShop.hireEmployee("Mike", "Manager", 20.0);

        System.out.println(
            "Total businesses created: " +
            Business.getTotalBusinesses()
        );

        System.out.println();

        // Display first business
        System.out.println("Business: " + pizzaPlace.getName());
        System.out.println("Owner: " + pizzaPlace.getOwner());
        System.out.println(
            "Funds before taxes: $" + pizzaPlace.getFunds()
        );

        pizzaPlace.payTaxes();

        System.out.println(
            "Funds after taxes: $" + pizzaPlace.getFunds()
        );

        System.out.println();

        pizzaPlace.displayEmployees();

        System.out.println();

        // Demonstrate salary payments
        System.out.println(
            "Funds before salary payments: $" +
            pizzaPlace.getFunds()
        );

        pizzaPlace.paySalaries();

        System.out.println(
            "Funds after salary payments: $" +
            pizzaPlace.getFunds()
        );
    }
}
