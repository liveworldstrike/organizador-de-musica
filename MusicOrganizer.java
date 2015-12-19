import java.util.ArrayList;

/**
 * A class to hold details of audio files.
 * 
 * @author David J. Barnes and Michael KÃ¶lling
 * @version 2011.07.31
 */
public class MusicOrganizer
{
    // An ArrayList for storing the file names of music files.
    private ArrayList<String> files;
    //guarda si es true o false en los casos del metodo validindex;
    private boolean validIndex;

    /**
     * Create a MusicOrganizer
     */
    public MusicOrganizer()
    {
        files = new ArrayList<String>();
        validIndex = false;

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
        if(index >= 0 && index < files.size()) {
            String filename = files.get(index);
            System.out.println(filename);
        }
    }

    /**
     * Remove a file from the collection.
     * @param index The index of the file to be removed.
     */
    public void removeFile(int index)
    {
        if(index >= 0 && index < files.size()) {
            files.remove(index);
        }
    }

    /**
     * metodo para comprobar la organizacion y comprobacion de los incides si son correctos.
     */
    public void checkIndex(int index)
    {
        if(index < 0 || index >= files.size()){
            System.out.println("Error rango dado no es correcto,introducir rango de 0 a " + files.size());

        }
    }

    /**
     *  metodo que devuelve un valor booleano en función de si su parámetro entero es un índice válido o no para el atributo files.
     *  
     */
    public void validIndex(int index)
    {
        if(index < 0 || index >= files.size()){
            validIndex=false;

        }
        else{
            validIndex=true;
        }

    }

}
