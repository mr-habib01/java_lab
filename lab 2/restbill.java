import java.util.Scanner;

public class restbill {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double burgerprize = 250;
        double pizzaprize = 500;
        double coffeprize = 150;

        System.out.println("Enter the quantity of Burger: ");
        int BurgQty = input.nextInt();

        System.out.println("Enter the quantity of Pizza: ");
        int PizzaQty = input.nextInt();

        System.out.println("Enter the quantity of Coffe: ");
        int coffeeQty = input.nextInt();

        double burgertotal = burgerprize * BurgQty;
        double pizzatotal = pizzaprize * PizzaQty;
        double coffetotal = coffeprize * coffeeQty;

        double Total = burgertotal + pizzatotal + coffetotal;

        System.out.println("Restaurent Bill ------------");
        System.out.println("Burger : " + BurgQty + "*" + burgerprize + " = " + burgertotal);
        System.out.println("Pizza : " + PizzaQty + "*" + pizzaprize + " = " + pizzatotal);
        System.out.println("Coffee : " + coffeeQty + "*" + coffeeQty + " = " + coffetotal);

        System.out.println("---------------------");
        System.out.println("Total bill is: " + Total);

    }
}