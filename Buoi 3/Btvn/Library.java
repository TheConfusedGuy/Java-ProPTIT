import java.util.ArrayList;

public class Library {
    private ArrayList<Book> bookList = new ArrayList<>();

    void addBook(String name, String author, String genre) {
        bookList.add(new Book(name, author, genre));
    }

    void deleteBook(String name) {
        for (int i = 0; i < bookList.size(); i++) {
            if (bookList.get(i).name.equals(name)) {
                bookList.remove(i);
                return;
            }
        }
        System.out.println("Khong tim thay sach");
    }

    void editBook(String oldName, String newName, String author, String genre) {
        for (Book book : bookList) {
            if (book.name.equals(oldName)) {
                book.name = newName;
                book.author = author;
                book.genre = genre;
                return;
            }
        }
        System.out.println("Khong tim thay sach");
    }

    void search(String category, String query) {
        if (category.equals("1")) {
            for (Book book : bookList) {
                if (book.name.equals(query)) {
                    System.out.println(book.name + " | " + book.author + " | " + book.genre);
                    return;
                }
            }
            System.out.println("Khong tim thay sach");

        } else if (category.equals("2")) {
            for (Book book : bookList) {
                if (book.author.equals(query)) {
                    System.out.println(book.name + " | " + book.author + " | " + book.genre);
                    return;
                }
            }
            System.out.println("Khong tim thay sach");
        } else if (category.equals("3")) {
            for (Book book : bookList) {
                if (book.genre.equals(query)) {
                    System.out.println(book.name + " | " + book.author + " | " + book.genre);
                    return;
                }
            }
            System.out.println("Khong tim thay sach");
        }
    }

    void listBooks() {
        System.out.println("All books:");
        for (Book book : bookList) {
            System.out.println(book.name + " | " + book.author + " | " + book.genre);
        }
    }
}
