public class Song
{
    // instance variables - replace the example below with your own
    private int rating;
    private String title;
    private double price;
    private boolean favorite;
    private double totalCost = 0.0;
    private int numSongs = 0;
    private int totalRatings = 0;

    /**
     * Constructor for objects of class Song
     */
    
    public Song() {
       rating = 0;
       title = "";
       price = 0.0; // double initialized to display price of Song
       favorite = false; // instance of Song, purring it in favorites list
    }
    
    public Song(String title, double price) {
        this.title = title;
        this.price = price;
    }
    
    public Song(String title, double price, int rating) {
        this.title = title;
        this.price = price;
        this.rating = rating;
        totalCost += price;
        numSongs += 1;
        totalRatings += rating;
    }
    
    public String getTitle() {
        return title;
    }
    
    public void setTitle(String t) {
        title = t;
    }
    
    public int getRating() {
        return rating;
    }
    
    public void setRating(int r) {
        rating = r;
    }

    public double getPrice() { // accessor of Song, for instance Price 
        return price;
    }
    
    public void setPrice(double p) { // sets price to a double for setPrice() in MediaLib
        price = p;
    }
    
    public boolean isFavorite() { // constructor of Song, labeling song as a favorite
        return favorite;
    }
    
    public void addToFavorites() { // will be called in main MediaLib class
        favorite = true;
    }
    
}
