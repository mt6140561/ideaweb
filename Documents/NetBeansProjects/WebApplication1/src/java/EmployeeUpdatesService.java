

public class EmployeeUpdatesService implements PMOService {
	
	String page = "";
	
	public String process(String subRequestType)
	{
		if(subRequestType.equals("UpdateEmployeeDetails"))
		{
			updateEmployeeDetails();
		}
		else if(subRequestType.equals("RealignReporting"))
		{
			realignReporting();
		}
		else if(subRequestType.equals("BroadcastMail"))
		{
			broadcastMail();
		}
		else if(subRequestType.equals("UploadCV"))
		{
			uploadCV();
		}
		else if(subRequestType.equals("DownloadCV"))
		{
			downloadCV();
		}
		else if(subRequestType.equals("ProfileProposals"))
		{
			profileProposals();
		}
		else if(subRequestType.equals("ProfileFeedback"))
		{
			profileFeedback();
		}
		
		
		return page;
	}
	
	public void updateEmployeeDetails()
	{		
	}

	public void realignReporting()
	{		
	}
	
	public void broadcastMail()
	{		
	}
	
	public void uploadCV()
	{		
	}
	
	public void downloadCV()
	{		
	}
	
	public void profileProposals()
	{		
	}
	
	public void profileFeedback()
	{		
	}
	
}
