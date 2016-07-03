
import javax.servlet.http.HttpServletResponse;


public class OnBoardingService implements PMOService {
	
	String page = "";
	
	public String process(String subRequestType)
	{
		if(subRequestType.equals("FutureOnboarding"))
		{
			futureOnboarding();
		}
		else if(subRequestType.equals("AddNewEmployee"))
		{
			addNewEmployee();
		}
		else if(subRequestType.equals("SendWelcomeMail"))
		{
			sendWelcomeMail();
		}
		else if(subRequestType.equals("SendInductionMail"))
		{
			sendInductionMail();
		}
		else if(subRequestType.equals("ActivateEmployee"))
		{
			activateEmployee();
		}
		else if(subRequestType.equals("MailToManager"))
		{
			mailToManager();
		}
		
		
		return page;
	}
	
	public void futureOnboarding()
	{		
	}

	public void addNewEmployee()
	{		
	}
	
	public void sendWelcomeMail()
	{		
	}
	
	public void sendInductionMail()
	{		
	}
	
	public void activateEmployee()
	{		
	}
	
	public void mailToManager()
	{		
	}

    void processr(String subRequestType, HttpServletResponse response) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    boolean processr(String subRequestType) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
	
}
