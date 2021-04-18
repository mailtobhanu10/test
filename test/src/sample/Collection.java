package sample;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Collection {
	public void m()
	{
	//HashSet n=new HashSet();
	ArrayList n=new ArrayList();
	n.add("bhanu");
	n.add("hari");
	n.add("prakash");
	n.add("bhanu");
	n.add("ganesh");
	Iterator itr=n.iterator();  
	while(itr.hasNext()){  
	System.out.println(itr.next()); 


	}
	
	}

	public static void main(String[] args) {
		Collection b=new Collection();
		b.m();
		
	}

}
