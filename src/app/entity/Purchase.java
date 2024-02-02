package app.entity;

public class Purchase {

    private final int quota;
    private final double price;
    private final int delivery;

    public Purchase(int quota, double price,int delivery) {
        this.quota = quota;
        this.price = price;
        this.delivery = delivery;
    }

    public int getQuota() {
        return quota;
    }

    public double getPrice() {
        return price;
    }

    public int getDelivery() {
        return delivery;
    }
}
