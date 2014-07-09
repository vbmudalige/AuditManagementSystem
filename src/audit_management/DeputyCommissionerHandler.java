/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package audit_management;

import java.sql.Date;
import javax.swing.JOptionPane;
 
/**
 *
 * @author VIDURA
 */
public class DeputyCommissionerHandler{
    
    private Employee employee;
    private Receipt receipt;
    private Payment payment;
    private Connection connection;
    //Retrieve ID from the
    public void getEmployee(int ID){
        employee = new Employee(ID);
        connection = new Connection();
        connection.getEmployee(ID, employee);    
    }
    /*public void setEmployee(){
        connection.setEmployee(employee);
    }/*
    /*public void addEmployee(int ID, String first, String last, String job, double salary, String details){
        employee = new Employee(ID, first, last, job, salary, details);
        employee.errorMsg = null;
        connection = new Connection();
        connection.addEmployee(employee);
    }*/
    public int getEmployeeID(){
        return employee.getID();
    }
    public String getEmployeeFirstName(){
        return employee.getFirstName();
    }
    public String getEmployeeLastName(){
        return employee.getLastName();
    }
    public String getJobTitle(){
        return employee.getJobTitle();
    }
    public double getSalary(){
        return employee.getSalary();
    }
    public String getOtherDetails(){
        return employee.getOtherDetails();
    }
    
    /*public void setEmployeeID(int ID){
        employee.setID(ID);
    }
    public void setFirstName(String name){
        employee.setFirstName(name);
    }
    public void setLastName(String name){
        employee.setLastName(name);
    }
    public void setJobTitle(String job){
        employee.setJobTitle(job);
    }
    public void setSalary(double sal){
        employee.setSalary(sal);
    }
    public void setOtherDetails(String details){
        employee.setOtherDetails(details);
    }*/
    public String getErrorMsg(){
        return employee.errorMsg;
    }
    
    
    
    public void getPayment(int ID){
        payment = new Payment(ID);
        connection = new Connection();
        connection.getPayment(ID, payment);    
    }
    /*public void setPayment(){
        connection.setPayment(payment);
    }*/
    /*public void addPayment(int ID, String date, double ammount, String type, String description){
        payment = new Payment(ID, date, ammount, type, description);
        payment.errorMsg = null;
        connection = new Connection();
        connection.addPayment(payment);
    }*/
    public int getPaymentID(){
        return payment.getID();
    }
    public String getPaymentDate(){
        return payment.getDate();
    }
    public double getPaymentAmmount(){
        return payment.getAmount();
    }
    public String getPaymentType(){
        return payment.getType();
    }
    public String getPaymentDescription(){
        return payment.getDescription();
    }
    
    /*public void setPaymentID(int ID){
        payment.setID(ID);
    }
    public void setPaymentDate(String date){
        payment.setDate(date);
    }
    public void setPaymentAmmount(double ammount){
        payment.setAmmout(ammount);
    }
    public void setPaymentType(String type){
        payment.setType(type);
    }
    public void setPaymentDescription(String description){
        payment.setDescription(description);
    }*/
    public String getPaymentErrorMsg(){
        return payment.errorMsg;
    }    
    
    
    
    
    public void getReceipt(int ID){
        receipt = new Receipt(ID);
        connection = new Connection();
        connection.getReceipt(ID, receipt);    
    }
    /*public void setReceipt(){
        connection.setReceipt(receipt);
    }*/
    /*public void addReceipt(int ID, String date, double ammount, String type, String description){
        receipt = new Receipt(ID, date, ammount, type, description);
        receipt.errorMsg = null;
        connection = new Connection();
        connection.addReceipt(receipt);
    }*/
    public int getReceiptID(){
        return receipt.getID();
    }
    public String getReceiptDate(){
        return receipt.getDate();
    }
    public double getReceiptAmmount(){
        return receipt.getAmount();
    }
    public String getReceiptType(){
        return receipt.getType();
    }
    public String getReceiptDescription(){
        return receipt.getDescription();
    }
    
    /*public void setReceiptID(int ID){
        receipt.setID(ID);
    }
    public void setReceiptDate(String date){
        receipt.setDate(date);
    }
    public void setReceiptAmmount(double ammount){
        receipt.setAmount(ammount);
    }
    public void setReceiptType(String type){
        receipt.setType(type);
    }
    public void setReceiptDescription(String description){
        receipt.setDescription(description);
    }*/
    public String getReceiptErrorMsg(){
        return receipt.errorMsg;
    }
    
    public java.sql.Connection getConnector(){
        if(connection.con == null){
            return null;
        }else{
            return connection.con;
        }
    }
}
