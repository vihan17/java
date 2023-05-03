package bank;

import java.sql.*;
import com.mysql.cj.jdbc.Driver;
import java.sql.ResultSet;

/*public class conn {

    Connection c;
    Statement s;

    public conn() {
        try {
            Class.forName("driver");
            c = DriverManager.getConnection("jdbc:mysql:///bankmanagementsystem", "root", "Vihan@1712");
            s = c.createStatement();
        } catch (SQLException e) {
            System.out.println('e');
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}*/
public class conn {

    public static void main(String[] args){

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc-test","root","Vihan@1712");
            Statement s=c.createStatement();

            ResultSet resultSet=s.executeQuery("select * from signup");

            while(resultSet.next()){
                System.out.println(resultSet.getString("dob"));
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}