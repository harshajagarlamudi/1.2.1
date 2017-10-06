/**
 * Write a description of class HelloWorld here.
 * 
 * @author CKinnard 
 * @version 4/20/16
 */
public class MediaLib
{
    public static void main()
    {
        System.out.println("Welcome to your Media Library");
        
        Song song1 = new Song("a", 1.29, 1);
        Song song2 = new Song("b", 1.29, 2);
        Song song3 = new Song("c", 1.29, 3);
        Song song4 = new Song("d", 1.29, 4);
        Song song5 = new Song("e", 1.29, 5);
        Song song6 = new Song("f", 1.29, 6);
        Song song7 = new Song("g", 1.29, 7);
        Song song8 = new Song("h", 1.29, 8);
        
        MediaFile.writeString(song1.getTitle()+"|"+song1.getRating());
        MediaFile.writeString(song2.getTitle()+"|"+song2.getRating());
        MediaFile.writeString(song3.getTitle()+"|"+song3.getRating());
        MediaFile.writeString(song4.getTitle()+"|"+song4.getRating());
        MediaFile.writeString(song5.getTitle()+"|"+song5.getRating());
        MediaFile.writeString(song6.getTitle()+"|"+song6.getRating());
        MediaFile.writeString(song7.getTitle()+"|"+song7.getRating());
        MediaFile.writeString(song8.getTitle()+"|"+song8.getRating());
        
        Movie movie1 = new Movie();
        System.out.println(movie1);
        movie1.setTitle("Johnny B. Goode");  
        System.out.println(movie1.getTitle());
        movie1.setRating(1);  
        System.out.println(movie1.getRating());
        
        Book book1 = new Book();
        System.out.println(book1);
        book1.setTitle("Johnny B. Goode");  
        System.out.println(book1.getTitle());
        book1.setRating(1);  
        System.out.println(book1.getRating());
        
        MediaFile.saveAndClose();
    }
}