package customerBilling;

public abstract class Customer {
    int Adverts;
    int Products;

    public Customer (int Adverts, int Products){
        this.Adverts = Adverts;
        this.Products = Products;
    };

    public int getAdverts() {
        return Adverts;
    }

    public int getProducts() {
        return Products;
    }

    abstract int getCostPerAdvert();

    int getCostPerProduct() {
        return 10;
    }
}
