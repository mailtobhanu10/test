package sample;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;


public class NotepadRead {

	public static void main(String[] args) throws IOException  {
		// TODO Auto-generated method stub
FileWriter fw=new FileWriter("E:\\Program Files.txt");
BufferedWriter bw=new BufferedWriter(fw);
bw.write("bhanu is a good boy in all");
bw.newLine();
bw.write("bhanuprakash");
bw.close();
	}

}
