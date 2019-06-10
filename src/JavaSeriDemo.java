import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class JavaSeriDemo {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		WriteToFile();
		ReadFromFile();
	}

	//Read from file or network,Convert to Obj
	public static void ReadFromFile() throws FileNotFoundException, IOException, ClassNotFoundException
	{
		File ff = new File("./tempFile");
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream(ff));
		Object obj = ois.readObject();
		System.out.println(obj);
	}
	
	//Serialize and Send to network,save to file
	public static void WriteToFile() throws FileNotFoundException, IOException
	{
	    Seobj sj = new Seobj();
        sj.SetAge(10);
        sj.SetName("Wabinogi");
		System.out.println(sj);
		
		//Write sj to file
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("./tempFile"));
		oos.writeObject(sj);
	}
	
}
