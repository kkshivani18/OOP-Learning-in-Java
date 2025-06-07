package packages.llibrary.models;

public class Book {
    private String title;
    private String author;
    private long isbn;
    private static int bookCount;

    public Book(String title, String author, long isbn, int bookCount) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        bookCount++;
    }

    public String getTitle(){
        return title;
    }

    public String getAuthor(){
        return author;
    }

    public static int getBookCount(){
        return bookCount;
    }

    public long getIsbn(){
        return isbn;
    }

//    You should also use @Override when overriding any method from a superclass
//    or implementing methods from an interface.
//    The use of @Override has nothing to do with whether you use private or public variables.
//    It's solely about method overriding.

    @Override
    public String toString(){
        return "Title: " + title + "\n" + "Author: " + author + "\n" + "ISBN: " + isbn;
    }
}
