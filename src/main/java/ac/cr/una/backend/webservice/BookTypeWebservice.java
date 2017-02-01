/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ac.cr.una.backend.webservice;

import ac.cr.una.backend.dao.BookTypeDAO;
import ac.cr.una.backend.dao.BookTypeDAOImple;
import ac.cr.una.backend.model.BookType;
import ac.cr.una.backend.service.BookTypeService;
import ac.cr.una.backend.service.BookTypeServiceImpl;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriInfo;

/**
 *
 * @author Tuti
 */
@Path("bookTypes")
public class BookTypeWebservice {
    
    BookTypeDAO bookTypeDAO;
    BookTypeService bookTypeService;
    
     @Context
    private UriInfo context;

    public BookTypeWebservice() {
    }
     
       @GET
    @Path("/{name}")
    @Produces(MediaType.APPLICATION_JSON)
    public BookType getByName(@PathParam("name") String name) {
        BookType bookType = null;
        bookTypeDAO = new BookTypeDAOImple();
        bookTypeService = new BookTypeServiceImpl(bookTypeDAO);

        bookType = bookTypeService.findByName(name);

        return bookType;
    }
     
        @DELETE
    @Path("/{idType}")
    public boolean deleteALL(@PathParam("idType") int idType) {
        boolean result;
        bookTypeDAO = new BookTypeDAOImple();
        bookTypeService = new BookTypeServiceImpl(bookTypeDAO);

        result = bookTypeService.deleteALL();

        return result;
    }
    
  
    
}
