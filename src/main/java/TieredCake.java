public class TieredCake extends Cake implements ICelebrate {

    private int tier;

    public TieredCake(String name, int tier){
        super(name);
        this.tier = tier;
    }

    @Override
    public double calculatePrice(){
        double basePrice = 10.0;
        double tierPrice = 5.0;
        double totalTierPrice = tier * tierPrice;
        return basePrice + totalTierPrice;
    }

    @Override
    public String celebrate(int numberOfAttendees) {
        return this.name + "needed for" + numberOfAttendees;
    }
}
