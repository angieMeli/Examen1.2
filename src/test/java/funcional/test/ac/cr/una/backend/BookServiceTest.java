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
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.stubbing.Answer;

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
    public void deleteALL() {
        bookDAO = new BookDAOImple();
        bookService = new BookServiceImpl(bookDAO);
    } 
    
    
   @Test
    public void testSave() {
        bookDAO = mock(BookDAOImple.class);
        bookService = new BookServiceImpl(bookDAO);

         Book book = new Book();
        book.setName("angie");
       
      
       
        when(bookDAO.save(any(Book.class)))
                .thenAnswer(new Answer<Book>() {
                    @Override
                    public Book answer(InvocationOnMock invocation) throws Throwable {
                        Book book = (Book) invocation.getArguments()[0];
                        book.setIdBook(1);
                        return book;
                    }
                });
    
}
}