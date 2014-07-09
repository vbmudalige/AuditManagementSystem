package audit_management;

public class Receipt {
    //The attributes for a receipt
    private int ID;
    private String name;
    private String date;
    private double ammount;
    private String type;
    private String description;
    
    public String errorMsg;
    //The following methods set valus for the attributes of receipts
    Receipt(int ID){
        this.ID = ID;
    }
    Receipt(int ID, String date, double ammount, String type, String description){
        this.ID = ID;
        this.date = date;
        this.ammount = ammount;
        this.type = type;
        this.description = description;
    }
    
    public void setID(int ID){
        this.ID = ID;
    }
    public int getID(){
        return ID;
    }
    public void setName(String name){
        this.name= name;
    }
    public String getName(){
        return name;
    }
    public void setDate(String date){
        this.date = date;
    }
    public String getDate(){
        return date;
    }
    public void setType(String type){
        this.type = type;
    }
    public String getType(){
        return type;
    }
    public void setAmount(double ammount){
        this.ammount = ammount;
    }
    public double getAmount(){
        return ammount;
    }
    public void setDescription(String description){
        this.description = description;
    }
    public String getDescription(){
        return description;
    }        
}
