import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;


public class Myservlet extends HttpServlet{

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=euc-kr");
		PrintWriter writer=response.getWriter();
		writer.println("<html><head><title>�����׽�Ʈ</title></head>");
		writer.println("<body>");
		writer.println("<h1>�ȳ��ϼ��� JSP���迡 ���� �� ȯ���մϴ�.</h1>");
		writer.println("</body></html>");
	}
}