package packages.llibrary.services;

import packages.llibrary.models.Book;
import packages.llibrary.models.User;
import java.util.ArrayList;
import java.util.List;

public class LibraryServices {

    private static LibraryServices instance;

    private List<Book> books;
    private List<User> users;

    private LibraryServices() {
        books = new ArrayList<>();
        users = new ArrayList<>();
    }

    public static LibraryServices getInstance(){
        if(instance == null){
            instance = new LibraryServices();
        }
        return instance;
    }

    public void addBook(Book book){
        books.add(book);
        System.out.println("Book added: " + book.getTitle() + "\n");
    }

    public void addUser(User user){
        users.add(user);
        System.out.println("User added: " + user.getName() + "\n");
    }

    public void displayAllBooks(){
        System.out.println("All Books: " + "\n");
        for(Book b : books){
            System.out.println(b);
        }
    }

    public void displayAllUsers(){
        System.out.println("All Users: " + "\n");
        for(User u: users){
            System.out.println(u);
        }
    }
}
