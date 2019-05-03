package org.fundacionjala.licorstore.services;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
import java.io.StringWriter;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

public class LicorStoreTest {

    @Mock private HttpServletRequest request;
    @Mock private HttpServletResponse response;
    @Mock private RequestDispatcher requestDispatcher;

    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
    }


    @Test
    public void helloWorld () {
    String expected= "Hello world";
        assertEquals(expected, "Hello world");
    }
        //    @Test
//    public void doPostWithoutName() throws Exception {
//        when(request.getRequestDispatcher("response.jsp"))
//                .thenReturn(requestDispatcher);
//
//        new SelectLiquorServlet().doPost(request, response);
//
//        verify(request).setAttribute("user", "World");
//        verify(requestDispatcher).forward(request,response);
//    }

//    @Test
//    public void doPostWithName() throws Exception {
//        when(request.getParameter("name")).thenReturn("Dolly");
//        when(request.getRequestDispatcher("response.jsp"))
//                .thenReturn(requestDispatcher);
//
//        new SelectLiquorServlet().doPost(request, response);
//
//        verify(request).setAttribute("user", "Dolly");
//        verify(requestDispatcher).forward(request,response);
//    }

}
