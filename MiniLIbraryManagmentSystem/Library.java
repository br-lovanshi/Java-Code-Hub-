package MiniLIbraryManagmentSystem;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Library {

		
		static List<Book> addBooks = new ArrayList<>();
	
	void addBook(Book book)throws BookException {
	
		
		if(addBooks.contains(book)) {
			throw new BookException("Booke is Alredy Exist");
			
		}else {
			addBooks.add(book);
			System.out.println("Book added successfully");}
	
	}
	
	List viewAllBooks()throws BookException {
		
		if(addBooks.isEmpty()) {
			throw new BookException("Please add Book First it's Empty");
		}
		else {
		
//			Collections.sort(addBooks,(b1,b2)-> b1.getBookName() > b2.getBookName() ? +1:-1);
		
		return addBooks;
		}
	}
	 List viewBooksByAuthor(String author)throws BookException{
		 
		List<Book> newList =  addBooks.stream().filter(i -> i.getAuthor() == author).collect(Collectors.toList());
		
		if(newList.isEmpty()) {
			throw new BookException("this author name book is not exist in library ");
			
		}else
		
		return newList;
		 
	 }
	  static List getBookByISBN(int isbn)throws BookException{
		 
		 List<Book> newList = addBooks.stream().filter(i -> i.getIsbn() == isbn).collect(Collectors.toList());
		 
		 if(newList.isEmpty()) {
			 throw new BookException("Invalid isbn number or isbn number book is not present ");
		 }
		 else {
			 return newList;
		 }
	 }
	
	
	
	
	public static void main(String[] args) {
		Library lb = new Library();
//		List<Book> book = new ArrayList<>();
		
		try {
			
//				lb.addBooks(new Book(101, "Java", "Bruce Eckel"));
			
			lb.addBook(new Book(101, "Java", "Bruce Eckel"));
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.getMessage();
		}
		
	try {
		List<Book> ans = lb.viewAllBooks();
		System.out.println(ans);
	} catch (BookException e) {
		// TODO Auto-generated catch block
		System.out.println(e.getMessage());
	}
		
		try {
		System.out.println(	lb.viewBooksByAuthor("Brce Eckel"));
		} catch (BookException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		

		try {
			System.out.println(getBookByISBN(101));
		} catch (BookException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		try {
			lb.addBook(new Book(102, "RichDadPoorDad", "Robert K."));
		} catch (BookException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
	}
}
