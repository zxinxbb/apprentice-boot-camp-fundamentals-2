package customerBilling;

public class PrivateCustomer extends Customer{

    public PrivateCustomer(int Adverts, int Products) {
        super(Adverts, Products);
    }

    public int getCostPerAdvert() {
        return 20;
    }
}
