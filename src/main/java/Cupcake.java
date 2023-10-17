public class Cupcake extends Cake {

    private String[] toppings;

    public Cupcake(String name, String[] toppings){
        super(name);
        this.toppings = toppings;
    }

    @Override
    public double calculatePrice() {
        double basePrice = 2.0;
        double toppingPrice = 0.5;
        double totalToppingPrice = toppings.length * toppingPrice;
        return basePrice + totalToppingPrice;
    }
}
