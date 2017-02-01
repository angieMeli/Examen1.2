/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ac.cr.una.backend.service;
import ac.cr.una.backend.dao.AuthorContactDAO;
import ac.cr.una.backend.model.AuthorContact;
import ac.cr.una.backend.model.Author;
import ac.cr.una.backend.dao.AuthorDAO;

import java.util.List;

/**
 *
 * @author Tuti
 */
public class AuthorServiceImpl implements AuthorService {
    
    private AuthorDAO authorDAO;
     private AuthorContactDAO authorContactDAO;

    public AuthorServiceImpl() {
    }
    
     @Override
    public Author findByName(String name) {
        return authorDAO.findByName(name);
    }

    
     @Override
    public List<AuthorContact> findAll() {
        return authorContactDAO.findAll();
    }
    
    @Override
    public AuthorContact save(AuthorContact authorContact) {
        return authorContactDAO.save(authorContact);        
    }
      @Override
    public boolean deleteALL() {
        return authorContactDAO.deleteALL(); 
    }

    
    
    

    public AuthorServiceImpl(AuthorDAO authorDAO) {
        this.authorDAO = authorDAO;
    }
    
    
    
    public AuthorDAO getAuthorDAO() {
        return authorDAO;
    }

    public void setAuthorDAO(AuthorDAO authorDAO) {
        this.authorDAO = authorDAO;
    }

    public AuthorContactDAO getAuthorContactDAO() {
        return authorContactDAO;
    }

    public void setAuthorContactDAO(AuthorContactDAO authorContactDAO) {
        this.authorContactDAO = authorContactDAO;
    }

  
   
    
}
