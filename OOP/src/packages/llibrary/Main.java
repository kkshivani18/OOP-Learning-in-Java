package packages.llibrary;

import packages.llibrary.models.User;
import packages.llibrary.models.Book;
import packages.llibrary.services.LibraryServices;
import packages.llibrary.utils.InputValidator;

public class Main {
    public static void main(String[] args) {
        LibraryServices libSer = LibraryServices.getInstance();

        Book b1 = new Book("Psychology of Money", "Carl Newport", 9781109320321L, 1);
        Book b2 = new Book("Sherlock Holmes", "Arthur Doyle", 2345678723458L, 2);
        Book b3 = new Book("Murder of Roger Arckyord", "Agatha Cristie", 7812093467195L, 3);

        User u1 = new User("Shivani", 8928943);
        User u2 = new User("Khushi",3456889);

        if(InputValidator.isValidISBN(b1.getIsbn()) && InputValidator.isValidISBN(b2.getIsbn()) && InputValidator.isValidISBN(b3.getIsbn())){
            libSer.addBook(b1);
            libSer.addBook(b2);
            libSer.addBook(b3);

            libSer.addUser(u1);
            libSer.addUser(u2);
        }

        libSer.displayAllBooks();
        libSer.displayAllUsers();
    }
}
