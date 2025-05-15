package customerBilling;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class BillingRunTest {
//    Given I am a dealer with 20 adverts and 1 product I expect to be charged £1200
//    Given I am a dealer with 1000 adverts and 2 products I expect to be charged £70,000
//    Given I am a private dealer with 3 adverts and no products I expect to be charged £60
//    Given I am a private dealer with 1 adverts and 1 product I expect to be charged £30

    @Test
    public void dealerWith20AdvertsAnd1Product_willBeCharged1200() {
        Dealer dealer = new Dealer(20, 1);
        BillingRun billingRun = new BillingRun();
        int bill = billingRun.bill(dealer);
        assertThat(bill).isEqualTo(1200);
    }

    @Test
    public void dealerWith1000AdvertsAnd2Products_charged70000() {
        Dealer dealer = new Dealer(1000, 2);
        BillingRun billingRun = new BillingRun();
        int bill = billingRun.bill(dealer);
        assertThat(bill).isEqualTo(70000);
    }

    @Test
    public void privateCustomerWith1AdvertsAnd1Product_charged30(){
        PrivateCustomer privateCustomer = new PrivateCustomer(1,1);
        BillingRun billingRun = new BillingRun();
        int bill = billingRun.bill(privateCustomer);
        assertThat(bill).isEqualTo(30);
    }

    @Test
    public void privateCustomerWith3AdvertsAndNoProducts_charged60(){
        PrivateCustomer privateCustomer = new PrivateCustomer(3,0);
        BillingRun billingRun = new BillingRun();
        int bill = billingRun.bill(privateCustomer);
        assertThat(bill).isEqualTo(60);
    }
}
