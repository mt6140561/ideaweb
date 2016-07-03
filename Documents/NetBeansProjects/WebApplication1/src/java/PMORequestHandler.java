

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import sun.print.resources.serviceui;

import javax.servlet.*;
import javax.servlet.http.HttpServlet;
import javax.servlet.annotation.WebServlet;

@WebServlet("/reqHandler")

public class PMORequestHandler extends HttpServlet { 
	
	public String requestType = "";
	public String subRequestType = "";
	
	PMOService service = null;
        public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
            doGet(req, res);
        }
        public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
            processRequest(req, res);
           
	
        } 
        
	public void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
            PrintWriter out = response.getWriter();
             out.println("<HTML>");
                        out.println("<HEAD><TITLE>Hello World</TITLE></HEAD>");
                        out.println("<BODY>");
                        out.println("<H1>Hello World</H1>");
		requestType = request.getParameter("RequestType");
		subRequestType = request.getParameter("SubRequestType");
		
		if(requestType.equals("OnBoarding"))
		{
			service = new OnBoardingService();
			
                        
                      
                        out.println(requestType);
                        out.println(service.process(subRequestType));
                        if(subRequestType.equals("FutureOnboarding"))
		{
//			futureOnboarding();
		}
		else if(subRequestType.equals("AddNewEmployee"))
		{
//			addNewEmployee();
                    response.sendRedirect("AddNewEmployee.jsp");
//                        page = "AddNewEmployee.jsp";
		}
		else if(subRequestType.equals("SendWelcomeMail"))
		{
//			sendWelcomeMail();
		}
		else if(subRequestType.equals("SendInductionMail"))
		{
//			sendInductionMail();
		}
		else if(subRequestType.equals("ActivateEmployee"))
		{
//			activateEmployee();
		}
		else if(subRequestType.equals("MailToManager"))
		{
//			mailToManager();
		}
                       
			service.process(subRequestType);
		}
		else if(requestType.equals("OffBoarding"))
		{
			service  = new OffBoardingService();
			
//			service.process(subRequestType);
		}
		else if(requestType.equals("EmployeeUpdates"))
		{
			service  = new EmployeeUpdatesService();
			
//			service.process(subRequestType);
		}
		else if(requestType.equals("Reports"))
		{
			service  = new ReportsService();
			
//			service.process(subRequestType);
		}
		else if(requestType.equals("AdminConfig"))
		{
			service  = new AdminConfiguratorService();
			
//			service.process(subRequestType);
		}
                 out.println("</BODY></HTML>");
	}
}
