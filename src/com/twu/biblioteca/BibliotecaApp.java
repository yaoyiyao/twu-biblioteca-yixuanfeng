package com.twu.biblioteca;
import java.util.*;

public class BibliotecaApp {
    static Map<String, Book> unchecked = new HashMap<String, Book>();
    static Map<String, Book> checked = new HashMap<String, Book>();
    static Book book1 = new Book("javascript", "feng", "2010");
    static Book book2 = new Book("html5", "lee", "2012");
    static {
        unchecked.put(book1.getName(), book1);
        unchecked.put(book2.getName(), book2);
    }

    public static void main(String[] args) {

    }

    public String welcomeMessage() {
        String a = "Welcome to Biblioteca.";
        System.out.println(a);
        return a;
    }

    public Map bookList() {
        for (Book book : unchecked.values())
        System.out.println(book1.getName() + "," + book2.getName());
        return unchecked;
    }

    public void bookDetail(){
        for(Book book : unchecked.values()){
            System.out.println(book.getName() + "," + book.getAuthor() + "," + book.getYear());
        }
    }

    public void checkOutBook(String name) {
        if (unchecked.containsKey(name)) {
            checked.put(name, unchecked.get(name));
            unchecked.remove(name);
            System.out.println("Thank you! Enjoy the book.");
        } else {
            System.out.println("That book is not available.");
        }
    }

    public void returnBook(String name) {
        if (checked.containsKey(name)) {
            unchecked.put(name, checked.get(name));
            checked.remove(name);
            System.out.println("Thank you for returning the book.");
        } else {
            System.out.println("That is not a valid book to return.");
        }
    }

    public void mainMenu() {
        System.out.println("0 : Quit" + '\n' +"1 : List Books" + '\n');
        Scanner s = new Scanner(System.in);
        int in = s.nextInt();
        while (in != 0) {
            switch(in){
                case 1 :
                    bookDetail();
                    break;
                case 2 :
                    System.out.println("input book name:");
                    String str = s.nextLine();
                    checkOutBook(str);
                    break;
                case 3 :
                    System.out.println("return book name:");
                    String str2 = s.nextLine();
                    returnBook(str2);
                    break;
                default:
                    System.out.println("Select a valid option!");
            }
            System.out.println("0 : Quit" + '\n' +"1 : List Books" + '\n');
            in = s.nextInt();
        }
    }
}
