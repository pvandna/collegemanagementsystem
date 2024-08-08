
package college.management.system;
import java.sql.*;

public class conn {
    Connection c;
    Statement s;
    conn()
    {
        try
        {
          Class.forName("com.mysql.cj.jdbc.Driver");
          c=DriverManager.getConnection("jdbc:mysql://localhost:3306/collegemanagementsystm","root","vandna");
          s=c.createStatement();
         
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
