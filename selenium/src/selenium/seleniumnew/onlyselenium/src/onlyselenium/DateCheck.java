package onlyselenium;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String actdate="06/16/2017";
		Date t=new Date();
		SimpleDateFormat Systemdate=new SimpleDateFormat("dd/mm"
				+ "dd/mm/yyyy");
		String sdate=Systemdate.format(t);
		if(actdate.matches(sdate))
		{
			System.out.println("date is current date");
		}
		else
		{
			System.out.println("date is not current date");
		}
	}

}
