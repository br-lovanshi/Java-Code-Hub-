package Evolution5.problem3;

import java.util.HashSet;

public class Book {
    private int bookId ;
    private String  bookName ,
      author ;

    public Book(int bookId, String bookName, String author) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookId=" + bookId +
                ", bookName='" + bookName + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}

class Library{
    public static void main(String[] args) {
        HashSet<Book> booksCollection = new HashSet<>();
        booksCollection.add(new Book(1,"Name1","Author1"));
        booksCollection.add(new Book(2,"Name2","Author1"));
        booksCollection.add(new Book(3,"Name1","Author1"));
        booksCollection.add(new Book(1,"Name1","Author1"));
        booksCollection.add(new Book(2,"Name2","Author1"));
        booksCollection.add(new Book(3,"Name1","Author1"));
//if(booksCollection)
        for(Book i: booksCollection){
            System.out.println(i);
        }
    }
}