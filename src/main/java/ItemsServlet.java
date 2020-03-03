import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/items")
public class ItemsServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse resp) throws ServletException, IOException {
        Items productsDao = DaoFactory.getItemsDao();
       List<Item> items = productsDao.all();
        request.setAttribute("items", items);
        request.getRequestDispatcher("/items/index.jsp").forward(request, resp);
    }

}