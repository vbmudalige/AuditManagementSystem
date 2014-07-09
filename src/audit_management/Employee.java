package audit_management;

public class Employee {
    //The attributes of Emplyees
    private int ID;
    private String firstName;
    private String lastName;
    private String jobTitle;
    private double salary;
    private String otherDetails;
    
    public String errorMsg;
    //The following methods set values to the Employee attributes.
    Employee(int ID){
        this.ID = ID;
    }
    Employee(int ID, String first, String last, String job, double salary, String details){
        this.ID = ID;
        firstName = first;
        lastName = last;
        jobTitle = job;
        this.salary = salary;
        otherDetails = details;
    }
    
    public void setID(int ID){
        this.ID = ID;
    }
    public int getID(){
        return ID;
    }
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public String getFirstName(){
        return firstName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public String getLastName(){
        return lastName;
    }
    public void setJobTitle(String jobTitle){
        this.jobTitle = jobTitle;
    }
    public String getJobTitle(){
        return jobTitle;
    }
    public void setSalary(double salary){
        this.salary = salary;
    }
    public double getSalary(){
        return salary;
    }
    public void setOtherDetails(String otherDetails){
        this.otherDetails = otherDetails;
    }
    public String getOtherDetails(){
        return otherDetails;
    }
}
