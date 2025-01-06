package server__flow;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ProductSearchPageServlet {

    @WebServlet
    public static class productSearchPageServlet extends HttpServlet {

        private List<Map<String, Object>> productList = List.of(
                Map.of("productName", "상품1"),
                Map.of("productName", "상품2"),
                Map.of("productName", "상품3"),
                Map.of("productName", "상품4"),
                Map.of("productName", "상품5")
        );

        @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
            String searchValue = request.getParameter("searchValue");
            request.setAttribute("productList", productList);
            if (searchValue !=null) {
                if (!searchValue.isBlank()){
                    request.setAttribute("products", productList.stream(). filter(p -> p.get("productName").toString().contains(searchValue))
                            .collect(Collectors.toList()));

                }          }


            request.getRequestDispatcher("/WEB-INF/product_search.jsp");
        }
    }
}
