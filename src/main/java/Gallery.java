import java.util.ArrayList;

public class Gallery {

    private String name;
    private int till;
    private ArrayList<Artwork> stock;
    private ArrayList<Customer> customers;

    public Gallery(String inputName, int inputTill){
        this.name = inputName;
        this.till = inputTill;
        Artwork artworkOne = new Artwork("Mona Lisa","Da Vinci",50);
        Artwork artworkTwo = new Artwork("Head of a Women","Da Vinci",60);
        Artwork artworkThree = new Artwork("Starry Night","Da Vinci", 70);
        this.stock = new ArrayList<Artwork>();
        this.stock.add(artworkOne);
        this.stock.add(artworkTwo);
        this.stock.add(artworkThree);
        Customer customerOne = new Customer("Ed",500);
        Customer customerTwo = new Customer("Anna",1000);
        this.customers.add(customerOne);
        this.customers.add(customerTwo);
    }


    public String getName(){
        return this.name;
    }
    public void setName(String newName){
        this.name = newName;
    }

    public int getTill() {
        return till;
    }
    public void setTill(int newTill) {
        this.till = newTill;
    }

    public ArrayList<Artwork> getStock(){
        return this.stock;
    }

}
