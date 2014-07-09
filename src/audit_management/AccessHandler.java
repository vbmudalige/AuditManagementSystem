package audit_management;

import java.sql.*;
import javax.swing.JOptionPane;
//This class is to handle different access levels by using auditlogin database
class AccessHandler {
    
    String url = "jdbc:mysql://localhost/auditlogin";
    String uname = "root";
    String upsw = "";
    
    //This method writes data to the database in the sign up procedure
    public boolean connect_To_Write(String index, String firstName, String lastName, String position, String username, String password, String confirmPassword){

        try{
            Class.forName("com.mysql.jdbc.Driver");
        }catch(ClassNotFoundException e){
            System.out.println(e.getMessage());
        }
        try{
            
            java.sql.Connection con = DriverManager.getConnection(url, uname, upsw);
            Statement statement = con.createStatement();
                                 
            if(password.equals(confirmPassword)){
               PreparedStatement stmt = con.prepareStatement("INSERT INTO users (ID, FirstName, LastName, Position, UserName, Password, ConfirmPassword) VALUES (?,?,?,?,?,?,?)");
               stmt.setString(1,index);
               stmt.setString(2,firstName);
               stmt.setString(3,lastName);
               stmt.setString(4,position);
               stmt.setString(5,username);
               stmt.setString(6,password);
               stmt.setString(7,confirmPassword);
                           
               stmt.execute();
               statement.close();
               con.close();
               return true;
            }
            else{
              JOptionPane.showMessageDialog(null, "The entered passwords are not matching with each other");  
            }
            return false;
        }
        catch(SQLException e){
            System.out.println(e.getMessage());
            return false;
        }
    }
    
    //Retrieves data from the auditlogin database when users login.
    public boolean connect_To_Read(String index, String username, String password){
       
        try{
            Class.forName("com.mysql.jdbc.Driver");
        }catch(ClassNotFoundException e){
            System.out.println(e.getMessage());
        }
        try{
            
            java.sql.Connection con = DriverManager.getConnection(url, uname, upsw);
            Statement statement = con.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM auditlogin.users");
            boolean found = false;
            
            while(resultSet.next()){
                if(resultSet.getString(1).equals(index)){
                    if(resultSet.getString("UserName").equals(username)&&resultSet.getString("Password").equals(password)){
                       this.userAuthentication(resultSet.getString("Position"));
                       found=true;
                       return true;
                    }
                }
                //resultSet.next();
            }
            
            if(!found){
                JOptionPane.showMessageDialog(null, "The entered username and password are not matching with each other"); 
            }
            return false;
        }
        catch(SQLException e){
            System.out.println(e.getMessage());
            return false;
        }
    } 
    
    //This method provides corresponding user access levels to the users that log in
    public boolean userAuthentication(String position){
        
        DataEntryWindow dataEntryWindow = new DataEntryWindow();
        AccountantWindow accountantWindow = new AccountantWindow();
        DeputyCommissionerWindow CommissionerWindow = new DeputyCommissionerWindow();
        //Select the particular user access level through the if else condition.
        if(position.equals("dataentry")){
            dataEntryWindow.setVisible(true);
            return true;
        }   
        //else{
        else if (position.equals("accountant")) {
                accountantWindow.setVisible(true);
                return true;
            }
           // else{
        else if (position.equals("commisioner")) {
                    CommissionerWindow.setVisible(true);
                    return true;
                }
              else{
                   JOptionPane.showMessageDialog(null, "Please enter your valid position");
                   return false;
                }
            
        }
}
