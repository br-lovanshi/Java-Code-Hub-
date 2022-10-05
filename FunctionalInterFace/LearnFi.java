package FunctionalInterFace;

//@FunctionalInterface
//interface inter {
//	void sayHello(String name);
//}

//class greet implements inter {
//
//	@Override
//	public void sayHello(String name) {
//		// TODO Auto-generated method stub
//		System.out.println("hello  " + name);
//		
//	}
	
	
//}
//
//interface sum {
//	int sumit(int a,int b);
//}

interface PrintDetails {
	
	void print(Student student);
}
public class LearnFi {
public static void main(String[] args) {
	
	PrintDetails i = s -> {
		System.out.println(s.getName());
		System.out.println(s.getId());
		System.out.println(s.getMarks());
	};
	i.print(new Student(1,"brajesh",999));
	i.print(new Student(3,"br",99));
//	inter i = new greet();
//	i.sayHello("brajesh");
	
//	Lamda expresiton 
//	
//	inter i = (name) -> {
//		System.out.println("hello " + name);
//	};
//	
//	inter i = name -> System.out.println("hello " + name);
//	i.sayHello("brajesh");
	
//	sum i = (a,b) -> {
//		return a+b;
//	}
//	;
	
	
//	sum i  =(a,b) ->  a+b;
//	int ans = i.sumit(10, 30);
//	System.out.println(ans);
	
	
}
}
