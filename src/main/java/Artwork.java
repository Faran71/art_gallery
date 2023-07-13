public class Artwork {
    
    private String title;
    private String artist;
    private double price;
    
    public Artwork(String inputTitle, String inputArtist, double inputPrice){
        this.title = inputTitle;
        this.artist = inputArtist;
        this.price = inputPrice;
    }
    
    public String getTitle(){
        return this.title;
    }
    public double getPrice() {
        return this.price;
    }
    public String getArtist(){
        return this.artist;
    }
    
    public void setTitle(String newTitle){
        this.title = newTitle;
    }
    public void setPrice(double newPrice){
        this.price = newPrice;
    }
    public void setArtist(String newArtist){
        this.artist = newArtist;
    }
    
    
    
}
