package DAOs;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import entity.CGangjwa;

public class DAO {
	public Object read(String fileName) {
		Object object = null;
		try {
			ObjectInputStream in;
			in = new ObjectInputStream(new FileInputStream(fileName));
			object = in.readObject();
			in.close();
		} catch (IOException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	public void write(Object object, String fileName) {
		// serialize
		try {
			ObjectOutputStream out = 
					new ObjectOutputStream(new FileOutputStream(fileName));
			out.writeObject(object);
			out.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

	