package Model;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class FileWorker implements Serializable, ReadAndWrite{
    @Override
    public void write(Object obj, String path){
        try {
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(
                new FileOutputStream(path));
        
        objectOutputStream.writeObject(obj);        
        objectOutputStream.close();
        System.out.println("Recording in file was successful");
        }
        catch (Exception e) {
            System.out.println("Something went wrong");
        }
    }
    
    @Override
    public void read(Object obj, String path) {
        try {
        ObjectInputStream objectInputStream = new ObjectInputStream(
                new FileInputStream(path));
        obj = (Object) objectInputStream.readObject();        
        objectInputStream.close();
        System.out.println("Reading from file was successful");
        }
        catch (Exception e) {
            System.out.println("Something went wrong");        
        }
        
    }    
}
