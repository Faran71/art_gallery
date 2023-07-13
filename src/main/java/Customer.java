public class Customer{
    
    private String name;
    private double wallet;

    public Customer(String inputName, double inputWallet){
        this.name = inputName;
        this.wallet = inputWallet;
    }

    public String getName(){
        return this.name;
    }
    public double getWallet(){
        return this.wallet;
    }

    public void setWallet(double newWallet){
        this.wallet = newWallet;
    }
    
    
}
