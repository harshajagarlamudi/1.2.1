
/**
 * Write a description of class LoopingMediaLib here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class LoopingMediaLib extends MediaLib
{
    public static void main()
    {
        //String songInfo = MediaFile.readString();
        //int index = 0;
        /*
        while (MediaFile.readString() != null) 
        {
            int index2 = songInfo.indexOf("|");
            songInfo = "Title: " + songInfo.substring(index, index2);
            System.out.print(songInfo);
            index = index2;
            index2 = (songInfo.substring(index, index2)).indexOf("|");
            songInfo = "Rating: " + songInfo.substring(index, index2);
            System.out.print(songInfo);
            System.out.println();
            songInfo = MediaFile.readString();
        }
        */
       
       /*
       for (int i = 1; i <= 100; i++) 
        {
            int index2 = songInfo.indexOf("|");
            songInfo = "Title: " + songInfo.substring(index, index2);
            System.out.print(songInfo);
            index = index2;
            index2 = (songInfo.substring(index, index2)).indexOf("|");
            songInfo = "Rating: " + songInfo.substring(index, index2);
            System.out.print(songInfo);
            System.out.println();
            songInfo = MediaFile.readString();
        }
        */
       MediaFile.writeString("My Favorite Songs");
       MediaFile.writeString("-----------------");
       while (MediaFile.readString() != null)
        {
            int index1 = (MediaFile.readString()).indexOf("|");
            int index2 = (MediaFile.readString()).indexOf("|");
            String title = (MediaFile.readString()).substring(index1, index2);
            int index3 = (MediaFile.readString()).indexOf("|");
            int index4 = (MediaFile.readString()).indexOf("|");
            String rating = (MediaFile.readString()).substring(index3, index4);
            MediaFile.writeString(title+"("+rating+")");
        }
    }
}
