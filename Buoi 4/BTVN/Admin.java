import java.util.Scanner;

public class Admin extends Guest {
    Library library;
    Scanner sc = new Scanner(System.in);

    Admin(Library l) {
        super(l);
        library = l;
    }

    void addNotebook(Notebook n) {
        library.addNotebook(n);
    }

    void addPencil(Pencil n) {
        library.addPencil(n);
    }

    void addPen(Pen n) {
        library.addPen(n);
    }

    void addBook(Book n) {
        library.addBook(n);
    }

    void deleteProduct(int type) {
        if (type == 1) {
            System.out.println("Ten: ");
            String name = sc.nextLine();
            library.deleteNotebook(name);
        }
        if (type == 2) {
            System.out.println("Ten: ");
            String name = sc.nextLine();
            library.deletePencil(name);
        }
        if (type == 3) {
            System.out.println("Ten: ");
            String name = sc.nextLine();
            library.deletePen(name);
        }
        if (type == 4) {
            System.out.println("Ten: ");
            String name = sc.nextLine();
            library.deleteBook(name);
        }
    }

    void editProduct(int type) {
        if (type == 1) {
            System.out.println("Ten: ");
            String name = sc.nextLine();
            library.editNotebook(name);
        }
        if (type == 2) {
            System.out.println("Ten: ");
            String name = sc.nextLine();
            library.editPencil(name);
        }
        if (type == 3) {
            System.out.println("Ten: ");
            String name = sc.nextLine();
            library.editPen(name);
        }
        if (type == 4) {
            System.out.println("Ten: ");
            String name = sc.nextLine();
            library.editBook(name);
        }
    }

}
