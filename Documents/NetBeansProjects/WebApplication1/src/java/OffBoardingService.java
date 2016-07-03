
public class OffBoardingService implements PMOService {
	
	String page = "";
	
	public String process(String subRequestType)
	{
		if(subRequestType.equals("ThanksEmail"))
		{
			thanksEmail();
		}
		else if(subRequestType.equals("DeactivateEmployee"))
		{
			deactivateEmployee();
		}
		else if(subRequestType.equals("UpdateReleasePlan"))
		{
			updateReleasePlan();
		}
		
		return page;
	}
	
	public void thanksEmail()
	{		
	}

	public void deactivateEmployee()
	{		
	}
	
	public void updateReleasePlan()
	{		
	}
	
	
}
