import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileAccess {

	public static void main(String[] args){
		// file opening:
		// 1) an object refers to file on disk
		// 2) read the file (line by line)
		// 3) close the file (the object is no more referring to the file)
		BufferedReader r;
		try {
			r = new BufferedReader(new FileReader("filename.txt"));
			while(true) {
				String line = r.readLine();
				if(null==line) break;
				System.out.println(line);
			}
			r.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		/************************************************************/
		//after an exception is thrown. --> if no one caught, the program stop eventually
		try {
			new FileReader("filename.txt");
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}
		/************************************************************/
		BufferedReader br = openFile("filename.txt");
		//getException(br); 
		// un commenting needs main throws Exception (.......
		/************************************************************/
		try {
			PrintWriter pr = new PrintWriter(new FileWriter("filename.txt"));
			while(true) {
				pr.println("line");
			}
		}catch (IOException e) {
			e.printStackTrace();
		}
	}

	// throws exception after catching it, don't know, what to do
	private static void getException(BufferedReader br) throws Exception {
		try {
			br.readLine();
		} catch (IOException e) {
			throw new Exception(e);
		}
	}

	// loop until buffer reader gets reference to the file (BAD CODE)
	private static BufferedReader openFile(String string) {
		BufferedReader br = null;
		int count = 0;
		while (br == null && count < 5) {
			try {
				br = new BufferedReader(new FileReader(string));
			} catch (IOException e) {
				System.out.println("bad file:" + string);
			}
			count++;
		}
		return br;
	}

}
