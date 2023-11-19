import java.util.ArrayList;
import java.util.Scanner;

public class Library {
    private ArrayList<Book> bookList = new ArrayList<>();
    private ArrayList<Pen> penList = new ArrayList<>();
    private ArrayList<Pencil> pencilList = new ArrayList<>();
    private ArrayList<Notebook> notebookList = new ArrayList<>();

    public ArrayList<Book> getBookList() {
        return bookList;
    }

    public ArrayList<Notebook> getNotebookList() {
        return notebookList;
    }

    public ArrayList<Pen> getPenList() {
        return penList;
    }

    public ArrayList<Pencil> getPencilList() {
        return pencilList;
    }

    void addNotebook(Notebook n) {
        notebookList.add(n);
    }

    void addPencil(Pencil n) {
        pencilList.add(n);
    }

    void addPen(Pen n) {
        penList.add(n);
    }

    void addBook(Book n) {
        bookList.add(n);
    }

    void deleteBook(String name) {
        for (int i = 0; i < bookList.size(); i++) {
            if (bookList.get(i).getName().equals(name)) {
                bookList.remove(i);
                return;
            }
        }
    }

    void deletePen(String name) {
        for (int i = 0; i < bookList.size(); i++) {
            if (penList.get(i).getName().equals(name)) {
                penList.remove(i);
                return;
            }
        }
    }

    void deletePencil(String name) {
        for (int i = 0; i < bookList.size(); i++) {
            if (pencilList.get(i).getName().equals(name)) {
                pencilList.remove(i);
                return;
            }
        }
    }

    void deleteNotebook(String name) {
        for (int i = 0; i < bookList.size(); i++) {
            if (notebookList.get(i).getName().equals(name)) {
                notebookList.remove(i);
                return;
            }
        }
    }

    void editBook(String name) {
        deleteBook(name);
        Book book = new Book();
        book.setAtrributes();
        bookList.add(book);
    }

    void editPencil(String name) {
        deletePencil(name);
        Pencil pencil = new Pencil();
        pencil.setAtrributes();
        pencilList.add(pencil);
    }

    void editPen(String name) {
        deletePen(name);
        Pen pen = new Pen();
        pen.setAtrributes();
        penList.add(pen);
    }

    void editNotebook(String name) {
        deleteNotebook(name);
        Notebook notebook = new Notebook();
        notebook.setAtrributes();
        notebookList.add(notebook);
    }

    void search(String query) {
        ArrayList<Book> tempBooks = new ArrayList<>();
        ArrayList<Pen> tempPens = new ArrayList<>();
        ArrayList<Pencil> tempPencils = new ArrayList<>();
        ArrayList<Notebook> tempNotebooks = new ArrayList<>();
        for (Book book : bookList) {
            if (book.compare(query)) {
                tempBooks.add(book);
            }
        }
        for (Pen pen : penList) {
            if (pen.compare(query)) {
                tempPens.add(pen);
            }
        }
        for (Pencil pencil : pencilList) {
            if (pencil.compare(query)) {
                tempPencils.add(pencil);
            }
        }
        for (Notebook notebook : notebookList) {
            if (notebook.compare(query)) {
                tempNotebooks.add(notebook);
            }
        }

        listBooks(tempNotebooks, tempPencils, tempPens, tempBooks);
    }

    void listBooks(ArrayList<Notebook> notebooks, ArrayList<Pencil> pencils, ArrayList<Pen> pens,
            ArrayList<Book> books) {
        int type;
        System.out.print("Ban muon hien thi danh sach(1) hay bang(2): ");

        Scanner sc = new Scanner(System.in);
        type = sc.nextInt();
        System.out.println("\nDanh sach san pham:");
        if (type == 1) {
            for (Notebook notebook : notebooks) {
                System.out.println("------");
                System.out.print("Ten san pham: ");
                System.out.println(notebook.getMainList()[0]);
                System.out.print("Gia ban: ");
                System.out.println(notebook.getMainList()[1]);
                System.out.print("Thuong hieu: ");
                System.out.println(notebook.getMainList()[2]);
                System.out.print("So trang: ");
                System.out.println(notebook.getOthersList()[0]);
                System.out.print("Loai vo: ");
                System.out.println(notebook.getOthersList()[1]);
                System.out.print("Mau sac: ");
                System.out.println(notebook.getOthersList()[2]);
                System.out.print("Chat lieu: ");
                System.out.println(notebook.getOthersList()[3]);
                System.out.print("Kich thuoc: ");
                System.out.println(notebook.getOthersList()[4]);
            }
            for (Pencil pencil : pencils) {
                System.out.println("------");

                System.out.print("Ten san pham: ");
                System.out.println(pencil.getMainList()[0]);
                System.out.print("Gia ban: ");
                System.out.println(pencil.getMainList()[1]);
                System.out.print("Thuong hieu: ");
                System.out.println(pencil.getMainList()[2]);
                System.out.print("Mau sac: ");
                System.out.println(pencil.getOthersList()[0]);
                System.out.print("Chat lieu: ");
                System.out.println(pencil.getOthersList()[1]);
                System.out.print("Do cung: ");
                System.out.println(pencil.getOthersList()[2]);
            }
            for (Pen pen : pens) {
                System.out.println("------");

                System.out.print("Ten san pham: ");
                System.out.println(pen.getMainList()[0]);
                System.out.print("Gia ban: ");
                System.out.println(pen.getMainList()[1]);
                System.out.print("Thuong hieu: ");
                System.out.println(pen.getMainList()[2]);
                System.out.print("Mau sac: ");
                System.out.println(pen.getOthersList()[0]);
                System.out.print("Chat lieu: ");
                System.out.println(pen.getOthersList()[1]);
                System.out.print("Loai muc: ");
                System.out.println(pen.getOthersList()[2]);
                System.out.print("Do min: ");
                System.out.println(pen.getOthersList()[3]);
            }
            for (Book book : books) {
                System.out.println("------");

                System.out.print("Ten san pham: ");
                System.out.println(book.getMainList()[0]);
                System.out.print("Gia ban: ");
                System.out.println(book.getMainList()[1]);
                System.out.print("Thuong hieu: ");
                System.out.println(book.getMainList()[2]);
                System.out.print("Tac gia: ");
                System.out.println(book.getOthersList()[0]);
                System.out.print("The loai: ");
                System.out.println(book.getOthersList()[1]);
                System.out.print("Nam xuat ban: ");
                System.out.println(book.getOthersList()[2]);
                System.out.print("Ngon ngu: ");
                System.out.println(book.getOthersList()[3]);
            }

        } else {
            System.out
                    .println(String.format("%25s %5s %15s %5s %20s %5s %25s", "Ten san pham", "|", "Gia ban", "|",
                            "Thuong hieu", "|", "Thong tin them"));
            System.out.println(String.format("%s",
                    "----------------------------------------------------------------------------------------------------------------"));
            for (Notebook notebook : notebooks) {
                System.out
                        .println(String.format("%25s %5s %15s %5s %20s %5s %25s", notebook.getMainList()[0], "|",
                                notebook.getMainList()[1], "|",
                                notebook.getMainList()[2], "|", "So trang: " + notebook.getOthersList()[0]));
                System.out
                        .println(String.format("%25s %5s %15s %5s %20s %5s %25s", "", "|", "", "|",
                                "", "|", "Loai vo: " + notebook.getOthersList()[1]));
                System.out
                        .println(String.format("%25s %5s %15s %5s %20s %5s %25s", "", "|", "", "|",
                                "", "|", "Mau sac: " + notebook.getOthersList()[2]));
                System.out
                        .println(String.format("%25s %5s %15s %5s %20s %5s %25s", "", "|", "", "|",
                                "", "|", "Chat lieu: " + notebook.getOthersList()[3]));
                System.out
                        .println(String.format("%25s %5s %15s %5s %20s %5s %25s", "", "|", "", "|",
                                "", "|", "Kich thuoc: " + notebook.getOthersList()[4]));
                System.out.println(String.format("%s",
                        "----------------------------------------------------------------------------------------------------------------"));
            }
            for (Pencil pencil : pencils) {
                System.out
                        .println(String.format("%25s %5s %15s %5s %20s %5s %25s", pencil.getMainList()[0], "|",
                                pencil.getMainList()[1], "|",
                                pencil.getMainList()[2], "|", "Mau sac: " + pencil.getOthersList()[0]));
                System.out
                        .println(String.format("%25s %5s %15s %5s %20s %5s %25s", "", "|", "", "|",
                                "", "|", "Chat lieu: " + pencil.getOthersList()[1]));
                System.out
                        .println(String.format("%25s %5s %15s %5s %20s %5s %25s", "", "|", "", "|",
                                "", "|", "Do cung: " + pencil.getOthersList()[2]));

                System.out.println(String.format("%s",
                        "----------------------------------------------------------------------------------------------------------------"));
            }
            for (Pen pen : pens) {
                System.out
                        .println(String.format("%25s %5s %15s %5s %20s %5s %25s", pen.getMainList()[0], "|",
                                pen.getMainList()[1], "|",
                                pen.getMainList()[2], "|", "Mau sac: " + pen.getOthersList()[0]));
                System.out
                        .println(String.format("%25s %5s %15s %5s %20s %5s %25s", "", "|", "", "|",
                                "", "|", "Chat lieu: " + pen.getOthersList()[1]));
                System.out
                        .println(String.format("%25s %5s %15s %5s %20s %5s %25s", "", "|", "", "|",
                                "", "|", "Mau muc: " + pen.getOthersList()[2]));
                System.out
                        .println(String.format("%25s %5s %15s %5s %20s %5s %25s", "", "|", "", "|",
                                "", "|", "Do min: " + pen.getOthersList()[3]));
                System.out.println(String.format("%s",
                        "----------------------------------------------------------------------------------------------------------------"));
            }
            for (Book book : books) {
                System.out
                        .println(String.format("%25s %5s %15s %5s %20s %5s %25s", book.getMainList()[0], "|",
                                book.getMainList()[1], "|",
                                book.getMainList()[2], "|", "Tac gia: " + book.getOthersList()[0]));
                System.out
                        .println(String.format("%25s %5s %15s %5s %20s %5s %25s", "", "|", "", "|",
                                "", "|", "The loai: " + book.getOthersList()[1]));
                System.out
                        .println(String.format("%25s %5s %15s %5s %20s %5s %25s", "", "|", "", "|",
                                "", "|", "Nam xuat ban: " + book.getOthersList()[2]));
                System.out
                        .println(String.format("%25s %5s %15s %5s %20s %5s %25s", "", "|", "", "|",
                                "", "|", "Ngon ngu: " + book.getOthersList()[3]));
                System.out.println(String.format("%s",
                        "----------------------------------------------------------------------------------------------------------------"));
            }
        }
    }
}
