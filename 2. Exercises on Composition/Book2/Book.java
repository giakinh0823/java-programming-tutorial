/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Book2;

import java.util.Arrays;

/**
 *
 * @author GIA KINH
 */

class Author {
    private String name;
    private String email;
    private char gender;

    public Author() {
    }
    
    
    
    public Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        if (gender == 'm' || gender == 'f') {
            this.gender = gender;
        }else{
            System.out.println("Gender of 'm' or 'f'");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        if (gender == 'm' || gender == 'f') {
            this.gender = gender;
        }else{
            System.out.println("Gender of 'm' or 'f'");
        }
    }

    @Override
    public String toString() {
        return "Author[" + "name=" + name + ",email=" + email + ",gender=" + gender + ']';
    }
}


public class Book {
    private String name;
    private Author[] authors;
    private double price;
    private int qty;
    
    public Book() {
    }

    public Book(String name, Author[] authors, double price) {
        this.name = name;
        this.authors = authors;
        this.price = price;
    }
    
    
    public Book(String name, Author[] authors, double price, int qty) {
        this.name = name;
        this.authors = authors;
        this.price = price;
        this.qty = qty;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Author[] getAuthors() {
        return authors;
    }

    public void setAuthors(Author[] authors) {
        this.authors = authors;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }
    
    public  String getAuthorNames(){
        String authorNames="";
        for(Author item: authors){
            authorNames+=item.getName() +",";
        }
        StringBuilder newAuthorNames = new StringBuilder(authorNames);
        newAuthorNames.deleteCharAt(newAuthorNames.length()-1);
        return newAuthorNames.toString();
    }

    @Override
    public String toString() {
        String author="";
        for(Author item: authors){
            author+=item.toString()+",";
        }
        StringBuilder newAuthors = new StringBuilder(author);
        newAuthors.deleteCharAt(newAuthors.length()-1);
        return "Book[" + "name=" + name + ",author={" + newAuthors + "},price=" + price + ",qty=" + qty + ']';
    }
}


class TestBook{
    public static void main(String[] args) {
        Book book = new Book("Python", new Author[]{new Author("Gia Kinh", "giakinh2000@gmail.com", 'm'),new Author("Lan anh", "lanh@gmail.com", 'f')}, 200.5, 30);
        System.out.println(book.getAuthorNames());
        System.out.println(book.toString());
    }
}