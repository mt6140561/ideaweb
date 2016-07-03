
public class AdminConfiguratorService implements PMOService {
	
	String page = "";
	
	public String process(String subRequestType)
	{
		if(subRequestType.equals("BandMix"))
		{
			bandMix();
		}
		else if(subRequestType.equals("DistributionLists"))
		{
			distributionLists();
		}
		else if(subRequestType.equals("OrganizationStructure"))
		{
			organizationStructure();
		}
		else if(subRequestType.equals("MessageTemplates"))
		{
			messageTemplates();
		}
		else if(subRequestType.equals("Skill"))
		{
			skill();
		}
		else if(subRequestType.equals("ExportToExcel"))
		{
			exportToExcel();
		}
		else if(subRequestType.equals("ImportFromExcel"))
		{
			importFromExcel();
		}
		else if(subRequestType.equals("UpdateFromExcel"))
		{
			updateFromExcel();
		}
		else if(subRequestType.equals("SetUpRoles"))
		{
			setUpRoles();
		}
		
		
		
		return page;
	}
	
	public void bandMix()
	{		
	}

	public void distributionLists()
	{		
	}
	
	public void organizationStructure()
	{		
	}
	
	public void messageTemplates()
	{		
	}
	
	public void skill()
	{		
	}
	
	public void exportToExcel()
	{		
	}
	
	public void importFromExcel()
	{		
	}
	
	
	public void updateFromExcel()
	{		
	}
	
	public void setUpRoles()
	{		
	}
		
	
}
