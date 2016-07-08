package model.buffer;

import model.storage.GoodCategories;

import java.awt.*;

public class User {
    private long id;
    private String login;
    private Image imgUser;

    private String name;
    private String password;

    private double balance;
    private String email;
    private double sumMoneySpend;

    public User() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public Image getImgUser() {
        return imgUser;
    }

    public void setImgUser(Image imgUser) {
        this.imgUser = imgUser;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getSumMoneySpend() {
        return sumMoneySpend;
    }

    public void setSumMoneySpend(double sumMoneySpend) {
        this.sumMoneySpend = sumMoneySpend;
    }
}
