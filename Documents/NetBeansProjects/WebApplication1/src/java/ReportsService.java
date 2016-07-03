

public class ReportsService implements PMOService {
	
	String page = "";
	
	public String process(String subRequestType)
	{
		if(subRequestType.equals("HCByTowerBAM"))
		{
			hCByTowerBAM();
		}
		else if(subRequestType.equals("BandMixByTowerBAM"))
		{
			bandMixByTowerBAM();
		}
		else if(subRequestType.equals("OnboardingReport"))
		{
			onboardingReport();
		}
		else if(subRequestType.equals("OffboardingReport"))
		{
			offboardingReport();
		}
		else if(subRequestType.equals("AttritionDashboard"))
		{
			attritionDashboard();
		}
		else if(subRequestType.equals("RollOffDashboard"))
		{
			rollOffDashboard();
		}
		else if(subRequestType.equals("AssignmentEndAlerts"))
		{
			assignmentEndAlerts();
		}
		else if(subRequestType.equals("xIDEAResources"))
		{
			xIDEAResources();
		}
		else if(subRequestType.equals("CurrentResources"))
		{
			currentResources();
		}
		else if(subRequestType.equals("AccountTenurity"))
		{
			accountTenurity();
		}
		else if(subRequestType.equals("HCProjection"))
		{
			hCProjection();
		}
		else if(subRequestType.equals("BandMixProjection"))
		{
			bandMixProjection();
		}
		else if(subRequestType.equals("OrganizationChart"))
		{
			organizationChart();
		}
		
		
		return page;
	}
	
	public void hCByTowerBAM()
	{		
	}

	public void bandMixByTowerBAM()
	{		
	}
	
	public void onboardingReport()
	{		
	}
	
	public void offboardingReport()
	{		
	}
	
	public void attritionDashboard()
	{		
	}
	
	public void rollOffDashboard()
	{		
	}
	
	public void assignmentEndAlerts()
	{		
	}
	
	
	public void xIDEAResources()
	{		
	}
	
	public void currentResources()
	{		
	}
	
	public void accountTenurity()
	{		
	}
	
	public void hCProjection()
	{		
	}
	
	public void bandMixProjection()
	{		
	}
	
	public void organizationChart()
	{		
	}	
	
}
