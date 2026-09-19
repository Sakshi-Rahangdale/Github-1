public class Payment{
    private String customerName;
    private String upiId;
    private double amount;

    public Payment(String customerName , String upiId , double amount){
       setCustomerName(customerName);
       setupiId(upiId);
       setAmount(amount);
    }

    public String getCustomerName(){
        return customerName;
    }

    public void setCustomerName(String customerName){
        if(customerName == null || customerName.isBlank()){
            System.out.println("Customer Name cannot be empty");
            return;
        }
        this.customerName = customerName;
    }

    public void setupiId(String upiId){
        if(upiId == null || upiId.isBlank()){
            System.out.println("UPI ID cannot be empty");
            return;

        }
        this.upiId = upiId;
    }

    public void setAmount(double amount){
        if(amount <=0){
            System.out.println("Amount cannot be negative");
        }
        this.amount = amount;
    }

    void displayPaymentDetails(){
        System.out.println("====PAYMENT DETAILS====");
        System.out.println("Customer Name:" + customerName);
        System.out.println("UPI ID:" + upiId);
        System.out.println("Amount:" + amount);
        System.out.println("=======================");


    }
}