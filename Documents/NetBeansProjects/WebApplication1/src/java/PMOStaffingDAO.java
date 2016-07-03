


import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.*;
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.SQLException;
//import java.sql.Statement;



public class PMOStaffingDAO implements BaseDAO {
	
	public ResultSet rs = null;
	public int insertCnt = 0;
	public int updateCnt = 0;
	public int deleteCnt = 0;
        
        public PMOStaffingDAO(){
            try {
                Class.forName("oracle.jdbc.driver.OracleDriver");
                Connection con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:8080:xe","system","Rish200295");  
                Statement stmt = con.createStatement();
                ResultSet tq=stmt.executeQuery("select * from emp");
                this.rs = tq;
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(PMOStaffingDAO.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(PMOStaffingDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
	
    public int insertStaffingData()
    {
    	return insertCnt;
    }
	
	public int updateStaffingData()
    {
		return updateCnt;
    }
	
	public ResultSet readStaffingData()
    {
    	return rs;
    }
	
	public int deleteStaffingData()
    {
		return deleteCnt;
    }

}
