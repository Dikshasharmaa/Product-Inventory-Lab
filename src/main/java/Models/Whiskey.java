package Models;

public class Whiskey {
    private int id;
    private int quantity;
    private float price;
    private String brand;

    public Whiskey(int id, String brand, int quantity, float price) {
        this.id = id;
        this.brand = brand;
        this.quantity = quantity;
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    @Override
    public String toString(){
        return "Id: "+this.id +", Brand: "+this.brand + ", Quantity: "+ this.quantity+ ", Price: "+ this.price;
    }
}
