package funcional.test.ac.cr.una.backend;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import ac.cr.una.backend.dao.BookTypeDAOImple;
import ac.cr.una.backend.dao.BookTypeDAO;
import ac.cr.una.backend.model.BookType;
import ac.cr.una.backend.service.BookTypeServiceImpl;
import ac.cr.una.backend.service.BookTypeService;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
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


public class BookTypeServiceTest {
    
    private BookTypeDAO bookTypeDAO;
    private BookTypeService bookTypeService;
    private BookType bookType = null;
    
   @Test    
    public void deleteALL() {
        bookTypeDAO = new BookTypeDAOImple();
        bookTypeService = new BookTypeServiceImpl(bookTypeDAO);
    } 
    
     @Test
    public void testSave() {
        bookTypeDAO = mock(BookTypeDAOImple.class);
        bookTypeService = new BookTypeServiceImpl(bookTypeDAO);

         BookType bookType = new BookType();
         bookType.setType("historia");
       
      
       
        when(bookTypeDAO.save(any(BookType.class)))
                .thenAnswer(new Answer<BookType>() {
                    @Override
                    public BookType answer(InvocationOnMock invocation) throws Throwable {
                        BookType bookType = (BookType) invocation.getArguments()[0];
                        bookType.setIdType(1);
                        return bookType;
                    }
                });
    
}
    
    
    @Test
    public void testFindByName() {
         bookTypeDAO = mock( BookTypeDAOImple.class);
         bookTypeService = new  BookTypeServiceImpl(bookTypeDAO);

        BookType bookType = new BookType();
        bookType.setType("historia");
       

        when(bookTypeService.findByName("")).thenReturn(bookType);

        assertThat(bookType.getType(), is("historia"));
    }
    
}
