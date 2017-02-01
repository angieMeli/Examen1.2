/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ac.cr.una.backend.service;
import ac.cr.una.backend.model.Book;
import ac.cr.una.backend.dao.BookDAO;
import java.util.List;


/**
 *
 * @author Tuti
 */
public class BookServiceImpl implements BookService {
    private BookDAO bookDAO;

    public BookServiceImpl() {
    }

    public BookServiceImpl(BookDAO bookDAO) {
        this.bookDAO = bookDAO;
    }
    
     @Override
    public boolean deleteALL() {
        return bookDAO.deleteALL();
    }
     @Override
    public Book save(Book book) {
        return bookDAO.save(book);
    }
    
     @Override
    public List<Book> findAll() {
        return bookDAO.findAll();
    }

    @Override
    public float totalPriceAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public BookDAO getBookDAO() {
        return bookDAO;
    }

    public void setBookDAO(BookDAO bookDAO) {
        this.bookDAO = bookDAO;
    }
    
    
}
