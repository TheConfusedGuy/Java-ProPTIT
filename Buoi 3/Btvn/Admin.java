public class Admin extends Guest {
    Library library;

    Admin(Library l) {
        super(l);
        library = l;
    }

    void addBook(String name, String author, String genre) {
        library.addBook(name, author, genre);
    }

    void deleteBook(String name) {
        library.deleteBook(name);
    }

    void editBook(String oldName, String newName, String author, String genre) {
        library.editBook(oldName, newName, author, genre);
    }

}
