public class Book {

    private String name;
    private BookType BookType;
    private String author;
    private int year;

    public Book(String name, BookType BookType, String author, int year) {
        this.name = name;
        this.BookType = BookType;
        this.author = author;
        this.year = year;
    }

    public String getName(){
        return this.name;
    }
    public BookType getBookType(){
        return this.BookType;
    }
    public String getAuthor(){
        return this.author;
    }
    public int getYear(){
        return this.year;
    }
}
