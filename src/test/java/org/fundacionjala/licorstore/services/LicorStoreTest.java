package org.fundacionjala.licorstore.services;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import static org.junit.Assert.assertEquals;

/**
 * this will contains unit tests.
 */
public class LicorStoreTest {

    @Mock private HttpServletRequest request;
    @Mock private HttpServletResponse response;
    @Mock private RequestDispatcher requestDispatcher;

    /**
     *
     * @throws Exception mockito annotations.
     */
    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
    }

    /**
     * this is a hello world test(not a real one).
     */
    @Test
    public void helloWorld() {
    String expected = "Hello world";
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
