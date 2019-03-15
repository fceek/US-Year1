import java.util.ArrayList;

public class MusicOrganizer
{
    
    private ArrayList<String> files;
        
    /**
     * Create a MusicOrganizer
     */
    public MusicOrganizer()
    {
        files = new ArrayList<String>();
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
        if (validindex(index)) {
            String filename = files.get(index);
            System.out.println(filename);
        }
    }
    
    public void listAllFiles() {
        for (String song : files) {
            System.out.println(song);
        }
    }
    
    /**
     * Remove a file from the collection.
     * @param index The index of the file to be removed.
     */
    public void removeFile(int index)
    {
        if (validindex(index)) {
            files.remove(index);
        }
    }
    
    private boolean validindex(int index) {
        boolean valid = index >= 0 && index < files.size();
        if (!valid) System.out.println("Invalid Index!");
        return valid;
    }
}
