

import java.sql.ResultSet;

public interface BaseDAO {
	
	public int insertStaffingData();
	
	public int updateStaffingData();
	
	public ResultSet readStaffingData();
	
	public int deleteStaffingData();

}
