/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week4;

/**
 *
 * @author chanakarnkin
 */
public class Book {
    
    private String name;
    private Author author;
    private double price;
    private int qty = 0;
    
    public Book (String name, Author author, double price) {
        this.name = name;
        this.author = author;
        this.price = price;
    }
    public Book (String name, Author author, double price, int qty) {
       this.name = name;
       this.author = author;
       this.price = price;
       this.qty = qty;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @return the author
     */
    public Author getAuthor() {
        return author;
    }

    /**
     * @return the price
     */
    public double getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * @return the qty
     */
    public int getQty() {
        return qty;
    }

    /**
     * @param qty the qty to set
     */
    public void setQty(int qty) {
        this.qty = qty;
    }
    
    public String toString () {
    
        return String.format("Book[name=%s, %s, price=%f, qty=%d]", name, author, price, qty);
    }
}
