/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funcional.test.ac.cr.una.backend;

import ac.cr.una.backend.dao.BookDAO;
import ac.cr.una.backend.dao.BookDAOImple;
import ac.cr.una.backend.model.Book;
import ac.cr.una.backend.service.BookService;
import ac.cr.una.backend.service.BookServiceImpl;
import org.junit.After;
import static org.junit.Assert.assertNotNull;
import org.junit.Test;

/**
 *
 * @author Tuti
 */
public class BookServiceTest {
    private BookDAO bookDAO;
    private BookService bookService;
    private Book book = null;

    public BookServiceTest() {
    }

    @Test
    public void testHibernateSaveBook() {
        bookDAO = new BookDAOImple();
        bookService = new BookServiceImpl(bookDAO);

        book = new Book();

        book.setName("maria");
        book.setPrice(1000);

        book = bookService.save(book);
        assertNotNull(book.getIdBook());
    }

  

    @After    
    public void deleteAll() {
        bookDAO = new BookDAOImple();
        bookService = new BookServiceImpl(bookDAO);
    } 
    
}
