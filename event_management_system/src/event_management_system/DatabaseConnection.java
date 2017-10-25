
package event_management_system;

import com.mysql.jdbc.Connection;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;




public class DatabaseConnection {
    
        private Connection con;
        private Statement st;
        private ResultSet rs;
        
        public DatabaseConnection(){
            try {
                
                Class.forName("com.mysql.jdbc.Driver");
                con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/testing","root","");
                st = con.createStatement();
                
            } catch (Exception e) {
                System.out.println("Error : "+e);
            }
        }
        
        public void setData(String id, String name , int age , String department){
            
            String insert = "INSERT into student (id,name,age,department) values('"+id+"','"+name+"','"+age+"','"+department+"')";
            System.out.println(insert);
                    
            try {
                st.executeUpdate(insert);
            } catch (SQLException ex) {
                Logger.getLogger(DatabaseConnection.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        public void getData(){
            try {
                
                String query = "select * from student";
                rs = st.executeQuery(query);
                System.out.println("Record from execute query : ");
                while(rs.next()){
                    String id = rs.getString("id");
                    String name = rs.getString("name");
                    int age = rs.getInt("age");
                    String department = rs.getString("department");
                    System.out.println("Id : "+id + " name : "+name + " Age "+age+ " "+ "Department : "+department);
                    
                }
            } catch (Exception e) {
                System.out.println(e); 
            }
        }
        
}
