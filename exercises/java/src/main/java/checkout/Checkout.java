package checkout;

class Checkout {
    private int total;
    private int numberOfA = 0;
    private int numberOfB = 0;
    private Receipt receipt = new Receipt();

    void scan(String sku) {
        if ("A".equals(sku)) {
            if (++numberOfA % 3 == 0) {
                total += 30;
            }
            else {
                total += 50;
            }
            receipt.scannedA();
        } else if ("B".equals(sku)) {
            if (++numberOfB % 2 == 0) {
                total += 15;
            }
            else {
                total += 30;
            }
            receipt.scannedB();
        } else if ("C".equals(sku)) {
            total += 20;
            receipt.scannedC();
        } else if ("D".equals(sku)) {
            total += 15;
            receipt.scannedD();
        }
    }

    int total() {
        return total;
    }

    String receipt() {
        return receipt.text();
    }
}
