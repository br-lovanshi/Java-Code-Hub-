package Sprint3EvalProblem5;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

public class Serializations {

	public static void main(String[] args) throws IOException {
		
		
		List<Student> st =new  ArrayList<>();
		st.add( new Student(1, "a", 100, "a@Gmail.com","1234", new Address("MP","Indore","012339")));
		st.add( new Student(12, "a", 1200, "a@Gmail.com","1234", new Address("UP","Lakhnow","49449")));
		st.add(new Student(13, "a", 10, "a@Gmail.com", "1234",new Address("AP","manali","053539")));
		st.add( new Student(14, "a", 101, "a@Gmail.com", "1234",new Address("MP","bhopal","01232")));
		st.add( new Student(15, "a", 1020, "a@Gmail.com","1234", new Address("MH","pune","0139")));
		
		File f = new File("Studentdata.txt");
		f.createNewFile();
//		System.out.println(f.exists());
		
		FileOutputStream os = new FileOutputStream(f);
		
		ObjectOutputStream ous = new ObjectOutputStream(os);
		
		
		ous.writeObject(st);
		
		ous.flush();
		ous.close();
		System.out.println("Success");
	}
}
