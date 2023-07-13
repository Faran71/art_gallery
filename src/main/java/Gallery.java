import java.util.ArrayList;

public class Gallery {

    private String name;
    private double till;
    private ArrayList<Artwork> stock;
    private Customer customer;

    public Gallery(String inputName){
        this.name = inputName;
        this.till = 0;

        Artwork artworkOne = new Artwork("Mona Lisa","Da Vinci",50);
        Artwork artworkTwo = new Artwork("Head of a Women","Da Vinci",60);
        Artwork artworkThree = new Artwork("Starry Night","Da Vinci", 70);
        this.stock = new ArrayList<Artwork>();
        this.stock.add(artworkOne);
        this.stock.add(artworkTwo);
        this.stock.add(artworkThree);

        customer = new Customer("Ed",500);
        
    }


    public String getName(){
        return this.name;
    }
    public void setName(String newName){
        this.name = newName;
    }

    public double getTill() {
        return till;
    }
    public void addToTill(double addTill) {
        this.till += addTill;
    }
    public void removeFromTill(double removeTill){
        this.till -= removeTill;
    }


    public ArrayList<Artwork> getStock(){
        return this.stock;
    }

    public void addArtwork(Artwork artworkAddition){
        this.stock.add(artworkAddition);
    }
    public void removeArtwork(int index){
        this.stock.remove(index);
    }
    public void sellArtwork(String artTitle){
        double artworkPrice = 0;
        for (Artwork artwork : this.stock){
            if (artwork.getTitle() == artTitle){
                artworkPrice = artwork.getPrice();
            }
        }
        
        customer.removeWallet(artworkPrice);
        this.till += artworkPrice;
    }
    public double getCustomerWallet(){
        return customer.getWallet();
    }



}
