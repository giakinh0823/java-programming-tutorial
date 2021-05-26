/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Book3;

/**
 *
 * @author GIA KINH
 */

class Author {
    private String name;
    private String email;

    public Author(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public Author() {
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

    @Override
    public String toString() {
        return "Author[" + "name=" + name + ",email=" + email + ']';
    }
 
}




public class Book {
    private String isbn;
    private String name;
    private Author author;
    private Double price;
    private int qty;

    public Book(String isbn, String name, Author author, Double price) {
        this.isbn = isbn;
        this.name = name;
        this.author = author;
        this.price = price;
    }

    public Book(String isbn, String name, Author author, Double price, int qty) {
        this.isbn = isbn;
        this.name = name;
        this.author = author;
        this.price = price;
        this.qty = qty;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }
    
    public String getAuthorName(){
        return this.author.getName();
    }

    @Override
    public String toString() {
        return "Book[" + "isbn=" + isbn + ",name=" + name + "," + author + ",price=" + price + ",qty=" + qty + ']';
    } 
}


class TestBook{
    public static void main(String[] args) {
      // Test Author class
      Author a1 = new Author("Tan Ah Teck", "ahteck@nowhere.com");
      System.out.println(a1);

      a1.setEmail("ahteck@somewhere.com");
      System.out.println(a1);
      System.out.println("name is: " + a1.getName());
      System.out.println("email is: " + a1.getEmail());

      // Test Book class
      Book b1 = new Book("12345", "Java for dummies", a1, 8.8, 88);
      System.out.println(b1);

      b1.setPrice(9.9);
      b1.setQty(99);
      System.out.println(b1);
      System.out.println("isbn is: " + b1.getName());
      System.out.println("name is: " + b1.getName());
      System.out.println("price is: " + b1.getPrice());
      System.out.println("qty is: " + b1.getQty());
      System.out.println("author is: " + b1.getAuthor());  // Author's toString()
      System.out.println("author's name: " + b1.getAuthorName());
      System.out.println("author's name: " + b1.getAuthor().getName());
      System.out.println("author's email: " + b1.getAuthor().getEmail());
   }
}
