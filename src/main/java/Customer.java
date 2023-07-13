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

    public void addWallet(double newAddWallet){
        this.wallet += newAddWallet;
    }
    public void removeWallet(double newRemoveWallet){
        this.wallet -= newRemoveWallet;
    }


}
