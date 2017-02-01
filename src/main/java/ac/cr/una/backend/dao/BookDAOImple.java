/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ac.cr.una.backend.dao;
import ac.cr.una.backend.model.Book;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author Tuti
 */
public class BookDAOImple implements BookDAO {
     private final Session session = HibernateUtil.getSessionFactory().openSession();
    
    
     @Override
    public Book save(Book book) {
        session.beginTransaction();
        session.save(book);
        session.getTransaction().commit();

        return book;
    }
    
  
   

    @Override
    public boolean deleteALL() {
       Book book = null;
        String stringQuery = "DELETE FROM authorContacList";
        Query query = session.createQuery(stringQuery);
        int delete = query.executeUpdate();
       
        return delete > 0;
    }

    /**
     *
     * @return
     */
    @Override
    public List<Book> findAll() {
         List<Book> bookList = new ArrayList<>();

        bookList = session.createCriteria(Book.class).list();

        return bookList;
    }

   
}
