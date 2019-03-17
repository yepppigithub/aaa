import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;


public class Myservlet extends HttpServlet{

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=euc-kr");
		PrintWriter writer=response.getWriter();
		writer.println("<html><head><title>서블릿테스트</title></head>");
		writer.println("<body>");
		writer.println("<h1>안녕하세요 JSP세계에 오신 걸 환영합니다.</h1>");
		writer.println("</body></html>");
	}
}