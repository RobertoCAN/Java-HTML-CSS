package sussinclyPart2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class TesteAnimal {
	
	public static void main(String[] args) throws FileNotFoundException, IOException {
		Animal stego = new Animal("Stegosaurus", 12.5f , true);
		Animal croc = new Animal("Crovodile", 3.2f , false);
		Animal mozzie = new Animal("Mosquito", 0.2f, false);
		
		stego.print();
		croc.print();
		mozzie.print();
		
		File file = new File("animals.dat");
		
		FileOutputStream fileOutput = new FileOutputStream(file);
		
		ObjectOutputStream objectOutput = new ObjectOutputStream(fileOutput);
		
		objectOutput.writeObject(stego);
		objectOutput.writeObject(croc);
		objectOutput.writeObject(mozzie);
		
		objectOutput.close();
		fileOutput.close();
	}
}
