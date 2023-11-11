public class Guest {
    Library library;

    Guest(Library l) {
        library = l;
    }

    void search(String category, String query) {
        library.search(category, query);
    }

    void listBooks() {
        library.listBooks();
    }
}
