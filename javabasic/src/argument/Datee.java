package argument;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
public class Datee {

	public static void main(String[] args) throws ParseException {
		

		Date d = new Date();
		System.out.println(d);
		System.out.println(d.getTime());
		
		
		SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/YYYY");
		String aa = sdf.format(d);
		System.out.println(aa);
		
		
		String bb = "05/03/1993";
		Date d1 = sdf.parse(bb);
		System.out.println(d1);
		 
		
		
		 
		
		
	}
	

}
