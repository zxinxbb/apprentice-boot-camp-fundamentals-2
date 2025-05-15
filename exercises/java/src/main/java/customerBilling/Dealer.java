package customerBilling;

public class Dealer extends Customer {

    public Dealer(int Adverts, int Products) {
        super(Adverts, Products);
    }

    public int getCostPerAdvert() {
        return 50;
    }
}
