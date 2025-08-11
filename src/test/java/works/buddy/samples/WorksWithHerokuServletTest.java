package works.buddy.samples;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.ByteArrayOutputStream;
import java.io.PrintWriter;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class WorksWithHerokuServletTest {

    private WorksWithHerokuServlet servlet;

    @Mock
    private HttpServletRequest request;

    @Mock
    private HttpServletResponse response;

    @Before
    public void setUp() {
        servlet = new WorksWithHerokuServlet();
    }

    @Test
    public void testDoGet() throws Exception {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        PrintWriter writer = new PrintWriter(out, true); // auto-flush enabled

        when(response.getWriter()).thenReturn(writer);

        servlet.doGet(request, response);

        writer.flush(); // ensure all data is written
        String result = out.toString("UTF-8").trim();

        assertEquals("Buddy Works with Heroku", result);
    }
}
