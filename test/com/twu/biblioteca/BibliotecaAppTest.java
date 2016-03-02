package com.twu.biblioteca;


import org.junit.Test;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class BibliotecaAppTest {
    BibliotecaApp bibliotecaApp = new BibliotecaApp();

    @Test
    public void welcomeMessageTest() {
        //编写测试用例
        String tem = "Welcome to Biblioteca.";
        //测试
        assertEquals(tem, bibliotecaApp.welcomeMessage());
    }

    @Test
    public void bookListTest(){
        //编写测试用例
        Map<String, Book> tem = new HashMap<String, Book>();
        Book book1 = new Book("javascript", "feng", "2010");
        Book book2 = new Book("html5", "lee", "2012");
        tem.put(book1.getName(), book1);
        tem.put(book2.getName(), book2);
        //测试
        assertEquals(tem, bibliotecaApp.bookList());
    }

//    @Test
//    public void bookDetailTest(){
//        Book book = new Book("html5", "lee", "2012");
//        assertEquals(true, bibliotecaApp.bookDetail(book.getName()));
//    }

    @Test
    public void mainMenuTest(){
         bibliotecaApp.mainMenu();
    }
}
