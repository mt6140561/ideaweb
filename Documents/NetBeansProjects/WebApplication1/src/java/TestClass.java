/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;
/**
 *
 * @author Rishab-pc
 */
@WebServlet("/hi")

public class TestClass extends HttpServlet {


    public void doPost(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {
        doGet(req, res);
    }
   public void doGet(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {


	res.setContentType("text/html");
	PrintWriter out = res.getWriter();
        res.addHeader("key", "value");

	out.println("<HTML>");
	out.println("<HEAD><TITLE>Hello World</TITLE></HEAD>");
	out.println("<BODY>");
	out.println("<H1>Hello World</H1>");
	out.println(req.getParameter("reqHandler"));
	out.println(res.getHeaderNames().size());
	out.println(req.getParameter("hello"));
	out.println("</BODY></HTML>");
        
   } // doGet

} // HelloWorld
