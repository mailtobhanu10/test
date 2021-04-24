package onlyselenium;

import java.io.BufferedReader;
import java.io.FileReader;



public class NotepadRead  {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		String str;
		FileReader fr=new FileReader("F:\\data.txt");
		BufferedReader br=new BufferedReader(fr) ;
		while((str=br.readLine())!=null)
		{
			System.out.println(str);
		}
		br.close();

	}

}
