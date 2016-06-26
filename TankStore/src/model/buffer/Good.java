package model.buffer;

import model.storage.GoodCategories;

import java.awt.*;

public class Good {
    private long id;
    private  String name;
    private GoodCategories category;

    private Image[] imgGood;

    private int quantity;
    private double inPrice;
    private  double outPrice;

    private String description;

    public Good() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public GoodCategories getCategory() {
        return category;
    }

    public void setCategory(GoodCategories category) {
        this.category = category;
    }

    public Image[] getImgGood() {
        return imgGood;
    }

    public void setImgGood(Image[] imgGood) {
        this.imgGood = imgGood;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getInPrice() {
        return inPrice;
    }

    public void setInPrice(double inPrice) {
        this.inPrice = inPrice;
    }

    public double getOutPrice() {
        return outPrice;
    }

    public void setOutPrice(double outPrice) {
        this.outPrice = outPrice;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
