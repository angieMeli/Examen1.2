

/*
 * Copyright (C) 2017 mguzmana
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 * 
 * Universidad Nacional de Costa Rica, Prof: Maikol Guzman Alan.
 */

package funcional.test.ac.cr.una.backend;

import ac.cr.una.backend.dao.AuthorContactDAO;
import ac.cr.una.backend.dao.AuthorContactDAOImple;
import ac.cr.una.backend.dao.AuthorDAO;
import ac.cr.una.backend.dao.AuthorDAOImple;
import ac.cr.una.backend.model.Author;
import ac.cr.una.backend.model.AuthorContact;
import ac.cr.una.backend.service.AuthorService;
import ac.cr.una.backend.service.AuthorServiceImpl;
import static org.hamcrest.CoreMatchers.any;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import org.junit.Test;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.stubbing.Answer;



/**
 *
 * @author Tuti
 */


public class AuthorServiceTest {
    
     private AuthorDAO authorDAO;
    private AuthorService authorService;
    private Author author = null;
    private AuthorContactDAO authorContactDAO; 
    private AuthorContact authorContact = null;

    public AuthorServiceTest() {
    }
    
   @Test
    public void testFindByName() {
         authorDAO = mock( AuthorDAOImple.class);
         authorService = new  AuthorServiceImpl(authorDAO);

        Author author = new Author();
        author.setName("Marco");
       

        when(authorService.findByName("")).thenReturn(author);

        assertThat(author.getName(), is("Marco"));
    }
    

    
}
