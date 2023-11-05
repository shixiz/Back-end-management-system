package shop.domain;

public class Shop {
    private int shop_id;
    private String shop_name;
    private double shop_price;
    private String shop_brand;
    private String shop_number;
    private int shop_inventory;
    private int shop_sales;
    private int shop_status;

    public Shop(int shop_id, String shop_name, double shop_price, String shop_brand, String shop_number, int shop_inventory, int shop_sales, int shop_status) {
        this.shop_id = shop_id;
        this.shop_name = shop_name;
        this.shop_price = shop_price;
        this.shop_brand = shop_brand;
        this.shop_number = shop_number;
        this.shop_inventory = shop_inventory;
        this.shop_sales = shop_sales;
        this.shop_status = shop_status;
    }

    public Shop() {
    }

    public int getShop_id() {
        return shop_id;
    }



    public String getShop_name() {
        return shop_name;
    }

    public double getShop_price() {
        return shop_price;
    }

    public String getShop_brand() {
        return shop_brand;
    }

    public String getShop_number() {
        return shop_number;
    }

    public int getShop_inventory() {
        return shop_inventory;
    }

    public int getShop_sales() {
        return shop_sales;
    }

    public int getShop_status() {
        return shop_status;
    }

    public void setShop_id(int shop_id) {
        this.shop_id = shop_id;
    }



    public void setShop_name(String shop_name) {
        this.shop_name = shop_name;
    }

    public void setShop_price(double shop_price) {
        this.shop_price = shop_price;
    }

    public void setShop_brand(String shop_brand) {
        this.shop_brand = shop_brand;
    }

    public void setShop_number(String shop_number) {
        this.shop_number = shop_number;
    }

    public void setShop_inventory(int shop_inventory) {
        this.shop_inventory = shop_inventory;
    }

    public void setShop_sales(int shop_sales) {
        this.shop_sales = shop_sales;
    }

    public void setShop_status(int shop_status) {
        this.shop_status = shop_status;
    }

    @Override
    public String toString() {
        return "Shop{" +
                "shop_id=" + shop_id +
                ", shop_name='" + shop_name + '\'' +
                ", shop_price=" + shop_price +
                ", shop_brand='" + shop_brand + '\'' +
                ", shop_number='" + shop_number + '\'' +
                ", shop_inventory=" + shop_inventory +
                ", shop_sales=" + shop_sales +
                ", shop_status=" + shop_status +
                '}';
    }
}
