
/**
 * Write a description of class test here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class test
{

    /**
     * Constructor for objects of class test
     */
    public test()
    {
       //creada nueva lista de music organizer lllamada prueba
        MusicOrganizer prueba= new MusicOrganizer();
       //añadido 3 elementos a la coleccion
       prueba.addFile("pepe");
       prueba.addFile("pepa");
       prueba.addFile("pepo");
       //inprimimos por pantalla el metodo get number of files para saber si estan creados los 3 archivos
       System.out.println(prueba.getNumberOfFiles());
       //probamos listfile
       prueba.listFile(0);
       prueba.listFile(1);
       prueba.listFile(2);
       //prueba checkindex (saltara error)
       prueba.checkIndex(3);
       //pueba de valid index(false)
       prueba.validIndex(3);
       prueba.getValidIndex();
       //prueba valid index(true)
       prueba.validIndex(1);
       prueba.getValidIndex();
       //prueba removefile
       prueba.removeFile(2);
       System.out.println(prueba.getNumberOfFiles());
    }

}
