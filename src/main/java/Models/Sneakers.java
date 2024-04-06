package Models;

public class Sneakers {
    private int id;
    private String name;
    private String brand;
    private String sport;
    private float size;
    private int quantity;
    private float price;

    public Sneakers(int id, String name, String brand, String sport,
                    int quantity, float price) {
        id = 6;
        name = " ";
        brand= " ";
        sport = " ";
        quantity = 10;
        price = 80.00f;

    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getSport() {
        return sport;
    }

    public void setSport(String sport) {
        this.sport = sport;
    }

    public float getSize() {
        return size;
    }

    public void setSize(float size) {
        this.size = size;
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
}
