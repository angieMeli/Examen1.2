/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ac.cr.una.backend.service;
import ac.cr.una.backend.model.Book;
import java.util.List;

/**
 *
 * @author Tuti
 */
public interface BookService {
    public boolean deleteALL();
     public Book save(Book book);
      public List<Book> findAll();
      public float totalPriceAll();
}
