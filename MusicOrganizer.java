import java.util.ArrayList;

/**
 * A class to hold details of audio files.
 * 
 * @author David J. Barnes and Michael Kölling
 * @version 7.0
 */
public class MusicOrganizer
{
    // An ArrayList for storing the file names of music files.
    private ArrayList<String> files;
        
    /**
     * Create a MusicOrganizer
     */
    public MusicOrganizer()
    {
        files = new ArrayList<>();
    }
    
    /**
     * Add a file to the collection.
     * @param filename The file to be added.
     */
    public void addFile(String filename)
    {
        files.add(filename);
    }
    
    /**
     * Return the number of files in the collection.
     * @return The number of files in the collection.
     */
    public int getNumberOfFiles()
    {
        return files.size();
    }
    
    /**
     * List a file from the collection.
     * @param index The index of the file to be listed.
     */
    public void listFile(int index)
    {
        boolean validity = validIndex(index);
        if(validity == true) {
            String filename = files.get(index);
            System.out.println(filename);
        }
        else{
            System.out.println("unavailable");
        }
    }
    /**
     * List all file from the collection.
     * @param index The index of the file to be listed.
     */
    public void listAllFiles()
    {   
        for(String filename : files){
            System.out.println(filename);
        }
    }
    // Question 5. 
    // You could, but it would be very impractical, because
    // if you had a limited amount of print methods in listAllFiles,
    // the listAllFiles method would not be able to take in account added files.
    // So theoretically, you'd need an infinite amount of println.
    
    public void listWithIndex()
    {
        for(String filename : files){
            int position = files.indexOf(filename);
            System.out.println(position + ": " + filename);
        }
        
    }
    /**
     * Remove a file from the collection.
     * @param index The index of the file to be removed.
     */
    public void removeFile(int index)
    {
        boolean validity = validIndex(index);
        if(validity == true) {
            String filename = files.get(index);
            System.out.println("Removed: " + filename);
            files.remove(index);
        }
        else{
            System.out.println("unavailable");
        }
    }
    public void checkIndex(int index)
    {   
        int filesSize = files.size()-1;
        if(index >= 0 && index <= filesSize){
            
        }
        else{
            System.out.println("error");
        }
    }
    public boolean validIndex(int index)
    {
        int filesSize = files.size()-1;
        if (index >= 0 && index <= filesSize){
            return true;   
        }
        else{
            return false;
        }
    }
    /**
     * List the names of files matching the given search string
     * @param searchString The string to match.
     */
    public void listMatching(String searchString)
    {
        boolean match = true;
        for(String filename : files){
            if(filename.contains(searchString)){
                // A match.
                System.out.println(filename);
                match = true;
            }
            else{
                match = false;
            }
        }
        if(match == false){
            System.out.println("No file names match found");
        }
    }
}
