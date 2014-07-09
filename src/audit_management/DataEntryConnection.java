/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package audit_management;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author VIDURA
 */
public class DataEntryConnection {
    
    java.sql.Connection con;
    Statement stmt;
    ResultSet rs;
    int loadedEmployeeID;
    int loadedPaymentID;
    int loadedReceiptID;
    
    DataEntryConnection(){} //constructor
    
    public void getEmployee(int ID, Employee employee){
        
        loadedEmployeeID = ID;
        
        try{
            String host = "jdbc:mysql://localhost:3306/account";
            String userName = "root";
            String passWord = "";            
            con = DriverManager.getConnection(host, userName, passWord);
            
            Statement stat = con.createStatement();     
            String SQL = "SELECT * FROM employee";
            rs = stat.executeQuery( SQL );  

            rs.next();
            while(ID != rs.getInt("ID")){
                if(!rs.next()){
                    employee.errorMsg = "Record not found";
                    stat.close();
                    rs.close();
                    return;
                }
            }
            
            int id_col = rs.getInt("ID");
            String id = Integer.toString( id_col );
            String first_name = rs.getString("FirstName");
            String last_name = rs.getString("LastName");
            String job = rs.getString("JobTitle");
            double salary = rs.getDouble("Salary");
            String branch = rs.getString("Branch");
            
            employee.setFirstName(first_name);
            employee.setLastName(last_name);
            employee.setJobTitle(job);
            employee.setSalary(salary);
            employee.setOtherDetails(branch);
            con.close();
        }
        catch(SQLException e){
            System.out.println(e.getMessage());
        }        
    }
    public void setEmployee(Employee employee){
        
        try{
            String host = "jdbc:mysql://localhost:3306/account";
            String userName = "root";
            String passWord = "";            
            con = DriverManager.getConnection(host, userName, passWord);
            
            Statement stat = con.createStatement(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_UPDATABLE);     
            String SQL = "SELECT * FROM employee";
            rs = stat.executeQuery( SQL );  
       
            rs.next();
            while(loadedEmployeeID != rs.getInt("ID")){
                rs.next();
            }
            
            rs.updateInt( "ID", employee.getID());
            rs.updateString( "FirstName", employee.getFirstName());
            rs.updateString( "lastName", employee.getLastName());
            rs.updateString( "JobTitle", employee.getJobTitle());
            rs.updateDouble("Salary", employee.getSalary());
            rs.updateString("Branch", employee.getOtherDetails());
            
            rs.updateRow( ); 
            stat.close();
            rs.close();
            con.close();
        }
        catch(SQLException e){
            System.out.println(e.getMessage());
        }            
    }  
    public void addEmployee(Employee employee){
        try{
            String host = "jdbc:mysql://localhost:3306/account";
            String userName = "root";
            String passWord = "";            
            con = DriverManager.getConnection(host, userName, passWord);
            
            Statement stat = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);     
            String SQL = "SELECT * FROM employee";
            rs = stat.executeQuery( SQL );  
            
            rs.next();
            while(!rs.isAfterLast()){
                if(employee.getID() == rs.getInt("ID")){
                    employee.errorMsg = "ID is not unique";
                    stat.close();
                    rs.close();
                    return;
                }
                rs.next();
            }

            rs.moveToInsertRow();

            rs.updateInt( "ID", employee.getID());
            rs.updateString( "FirstName", employee.getFirstName());
            rs.updateString( "lastName", employee.getLastName());
            rs.updateString( "JobTitle", employee.getJobTitle());
            rs.updateDouble("Salary", employee.getSalary());
            rs.updateString("Branch", employee.getOtherDetails());
            
            rs.insertRow();
            stat.close();
            rs.close();
          
        }
        catch(SQLException e){
            System.out.println(e.getMessage());
        }             
    }
    
    
    public void getPayment(int ID, Payment payment){
        
        loadedPaymentID = ID;
       
        try{
            String host = "jdbc:mysql://localhost:3306/account";
            String userName = "root";
            String passWord = "";            
            con = DriverManager.getConnection(host, userName, passWord);
            
            Statement stat = con.createStatement();     
            String SQL = "SELECT * FROM payment";
            rs = stat.executeQuery( SQL );  

            rs.next();
            while(ID != rs.getInt("ID")){
                if(!rs.next()){
                    payment.errorMsg = "Record not found";
                    stat.close();
                    rs.close();
                    con.close();
                    return;
                }
            }
            
            int id_col = rs.getInt("ID");
            String id = Integer.toString( id_col );
            //String name = rs.getString("Payment_Name");
            String date = rs.getString("Date");
            String type = rs.getString("Type");
            double amount = rs.getDouble("Amount");
            String description = rs.getString("Description");
            
           // payment.setName(name);
            payment.setDate(date);
            payment.setAmmout(amount);
            payment.setType(type);
            payment.setDescription(description);
            stat.close();
            rs.close();
            con.close();
        }
        catch(SQLException e){
            System.out.println(e.getMessage());
        }        
    }    
    public void setPayment(Payment payment){
        
        try{
            String host = "jdbc:mysql://localhost:3306/account";
            String userName = "root";
            String passWord = "";            
            con = DriverManager.getConnection(host, userName, passWord);
            
            Statement stat = con.createStatement(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_UPDATABLE);     
            String SQL = "SELECT * FROM payment";
            rs = stat.executeQuery( SQL );  
            
            rs.next();
            while(loadedPaymentID != rs.getInt("ID")){
                rs.next();
            }
            
            rs.updateInt( "ID", payment.getID());
          //  rs.updateString( "Payment_Name", payment.getName());
            rs.updateString( "Date", payment.getDate());
            rs.updateString( "Type", payment.getType());
            rs.updateDouble("Amount", payment.getAmount());
            rs.updateString("Description", payment.getDescription());
            
            rs.updateRow( ); 
            stat.close();
            rs.close();
        }
        catch(SQLException e){
            System.out.println(e.getMessage());
        }     

    }    
    public void addPayment(Payment payment){
        try{
            String host = "jdbc:mysql://localhost:3306/account";
            String userName = "root";
            String passWord = "";            
            con = DriverManager.getConnection(host, userName, passWord);
            
            Statement stat = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);     
            String SQL = "SELECT * FROM payment";
            rs = stat.executeQuery( SQL );  
            
            rs.next();
            while(!rs.isAfterLast()){
                if(payment.getID() == rs.getInt("ID")){
                    payment.errorMsg = "ID is not unique";
                    stat.close();
                    rs.close();
                    return;
                }
                rs.next();
            }

            rs.moveToInsertRow();

            rs.updateInt( "ID", payment.getID());
          //  rs.updateString( "Payment_Name", payment.getName());
            rs.updateString("Date", payment.getDate());
            rs.updateDouble("Amount", payment.getAmount());
            rs.updateString( "Type", payment.getType());
            rs.updateString( "Description", payment.getDescription());
            
            rs.insertRow();
            stat.close();
            rs.close();
          
        }
        catch(SQLException e){
            System.out.println(e.getMessage());
        }             
    }    
    
    
    public void getReceipt(int ID, Receipt receipt){
        
        loadedReceiptID = ID;
       
        try{
            String host = "jdbc:mysql://localhost:3306/account";
            String userName = "root";
            String passWord = "";            
            con = DriverManager.getConnection(host, userName, passWord);
            
            Statement stat = con.createStatement();     
            String SQL = "SELECT * FROM receipt";
            rs = stat.executeQuery( SQL );  

            rs.next();
            while(ID != rs.getInt("ID")){
                if(!rs.next()){
                    receipt.errorMsg = "Record not found";
                    stat.close();
                    rs.close();
                    con.close();
                    return;
                }
            }
            
            int id_col = rs.getInt("ID");
            String id = Integer.toString( id_col );
           // String name = rs.getString("Receipt_Name");
            String date = rs.getString("Date");
            String type = rs.getString("Type");
            double amount = rs.getDouble("Amount");
            String description = rs.getString("Description");
            
          //  receipt.setName(name);
            receipt.setDate(date);
            receipt.setAmount(amount);
            receipt.setType(type);
            receipt.setDescription(description);
            stat.close();
            rs.close();
            con.close();
        }
        catch(SQLException e){
            System.out.println(e.getMessage());
        }        
    }    
    public void setReceipt(Receipt receipt){
        
        try{
            String host = "jdbc:mysql://localhost:3306/account";
            String userName = "root";
            String passWord = "";            
            con = DriverManager.getConnection(host, userName, passWord);
            
            Statement stat = con.createStatement(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_UPDATABLE);     
            String SQL = "SELECT * FROM receipt";
            rs = stat.executeQuery( SQL );  
            
            rs.next();
            while(loadedReceiptID != rs.getInt("ID")){
                rs.next();
            }
            
            rs.updateInt( "ID", receipt.getID());
           // rs.updateString( "Receipt_Name", receipt.getName());
            rs.updateString( "Date", receipt.getDate());
            rs.updateString( "Type", receipt.getType());
            rs.updateDouble("Amount", receipt.getAmount());
            rs.updateString("Description", receipt.getDescription());
            
            rs.updateRow( ); 
            stat.close();
            rs.close();
        }
        catch(SQLException e){
            System.out.println(e.getMessage());
        }     

    }    
    public void addReceipt(Receipt receipt){
        try{
            String host = "jdbc:mysql://localhost:3306/account";
            String userName = "root";
            String passWord = "";            
            con = DriverManager.getConnection(host, userName, passWord);
            
            Statement stat = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);     
            String SQL = "SELECT * FROM receipt";
            rs = stat.executeQuery( SQL );  
            
            rs.next();
            while(!rs.isAfterLast()){
                if(receipt.getID() == rs.getInt("ID")){
                    receipt.errorMsg = "ID is not unique";
                    stat.close();
                    rs.close();
                    return;
                }
                rs.next();
            }

            rs.moveToInsertRow();

            rs.updateInt( "ID", receipt.getID());
           // rs.updateString( "Receipt_Name", receipt.getName());
            rs.updateString("Date", receipt.getDate());
            rs.updateDouble("Amount", receipt.getAmount());
            rs.updateString( "Type", receipt.getType());
            rs.updateString( "Description", receipt.getDescription());
            
            rs.insertRow();
            stat.close();
            rs.close();
          
        }
        catch(SQLException e){
            System.out.println(e.getMessage());
        }             
    }    
        
}



