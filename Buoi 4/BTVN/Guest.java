public class Guest {
    Library library;

    Guest(Library l) {
        library = l;
    }

    void search(String query) {
        library.search(query);
    }

    void listBooks() {
        System.out.println("\nDanh sach san pham:");
        library.listBooks(library.getNotebookList(), library.getPencilList(), library.getPenList(),
                library.getBookList());
        ;
    }
}
