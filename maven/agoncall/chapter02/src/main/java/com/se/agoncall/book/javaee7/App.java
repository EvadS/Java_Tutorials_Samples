package com.se.agoncall.book.javaee7;

import org.jboss.weld.environment.se.Weld;
import org.jboss.weld.environment.se.WeldContainer;
/**
 * Hello world!
 *
 */
public class App 
{

    public static void main(String[] args) {

        try {
            Weld weld = new Weld();
            WeldContainer container = weld.initialize();

            BookService bookService = container.instance().select(BookService.class).get();

            Book book = bookService.createBook("H2G2", 12.5f, "Geeky scifi Book");

            System.out.println(book);

            weld.shutdown();
        }catch (Exception ex){

            ex.printStackTrace();
        }
    }
}
