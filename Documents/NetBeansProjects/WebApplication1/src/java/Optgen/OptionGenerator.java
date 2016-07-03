package Optgen;
import java.util.ArrayList;


public class OptionGenerator {
    public String[] generateNorm(String s){
        String[] ret = null;
        if (s.equals("OnBoarding")){
            ret = new String[5];
            ret[0] = ("Future OnBoarding");
            ret[1] = ("Add New Employee");
            ret[2] = ("Send Induction mail");
            ret[3] = ("Activate Employee");
            ret[4] = ("Mail To Manager");
        } else if (s.equals("OffBoarding")){
            ret = new String[3];
            ret[0] = "Thanks Mail";
            ret[1] = "Deactivate Employee";
            ret[2] = "Update Release Plan";
        } else if (s.equals("EmployeeUpdates")){
            ret = new String[7];
            ret[0] = "Update Employee Details";
            ret[1] = "Realign Reporting";
            ret[2] = "Broadcast Mail";
            ret[3] = "Download CV";
            ret[4] = "Upload CV";
            ret[5] = "Profile Proposals";
            ret[6] = "Profile Feedback";
        } else if (s.equals("Reports")){
            ret = new String[13];
            ret[0] = "HC By Tower BAM";
            ret[1] = "Band Mix By Tower BAM";
            ret[2] = "Onboarding Report";
            ret[3] = "Offboarding Report";
            ret[4] = "AttritionDashboard";
            ret[5] = "Roll Off Dashboard";
            ret[6] = "Assignment End Alerts";
            ret[7] = "xIDEA Resources";
            ret[8] = "Current Resources";
            ret[9] = "Account Tenurity";
            ret[10] = "HC Projection";
            ret[11] = "Band Mix Projection";
            ret[12] = "Organization Chart";
        }
        return ret;
    }
}
