package customerBilling;

public class BillingRun {


    public int bill(Customer customer) {
        return (customer.getCostPerAdvert() * customer.getAdverts()) +
                (customer.getCostPerProduct() * customer.getProducts() * customer.getAdverts());
    }
}
