package model.buffer;

import model.storage.GoodCategories;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Buffer {
    private List<Good> goods;
    private Set<User> users;
    private List<Transaction> transactions; //HashMap?
    private List<GoodCategories> categories;

    public Buffer() {
        goods = new ArrayList<>();
        transactions = new ArrayList<>();
        categories = new ArrayList<>();

    }

    public Set<User> getUsers() {
        return users;
    }

    public void setUsers(Set<User> users) {
        this.users = users;
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }

    public void setTransactions(List<Transaction> transactions) {
        this.transactions = transactions;
    }

    public List<GoodCategories> getCategories() {
        return categories;
    }

    public void setCategories(List<GoodCategories> categories) {
        this.categories = categories;
    }

    public List<Good> getGoods() {
        return goods;
    }

    public void setGoods(List<Good> goods) {
        this.goods = goods;
    }
}
