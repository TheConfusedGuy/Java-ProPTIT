import java.util.List;
import java.util.Scanner;

class main {

    public static void main(String[] args) {
        Library l = new Library();
        Admin admin = new Admin(l);
        Guest guest = new Guest(l);

        Login(admin, guest);
    }

    private static void Login(Admin admin, Guest guest) {
        System.out.print("Ten dang nhap: ");

        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        // System.out.print(input);

        if (input.equals("admin")) {
            while (true) {
                displayAdminMenu();
                input = sc.nextLine();
                if (input.equals("1")) {
                    System.out.println("Truong tim kiem: ");
                    System.out.println("1.Ten");
                    System.out.println("2.Tac gia");
                    System.out.println("3.The loai");
                    String category = sc.nextLine();
                    System.out.print("Lua chon: ");

                    System.out.print("Gia tri tim kiem: ");
                    String query = sc.nextLine();
                    admin.search(category, query);
                }
                if (input.equals("2")) {
                    admin.listBooks();
                }
                if (input.equals("3")) {
                    System.out.print("Nhap ten sach: ");
                    String name = sc.nextLine();
                    System.out.print("Nhap ten tac gia: ");
                    String author = sc.nextLine();
                    System.out.print("Nhap the loai: ");
                    String genre = sc.nextLine();

                    admin.addBook(name, author, genre);
                }
                if (input.equals("4")) {
                    System.out.print("Nhap ten sach can xoa: ");
                    String name = sc.nextLine();
                    admin.deleteBook(name);

                }
                if (input.equals("5")) {
                    System.out.print("Nhap ten sach can sua: ");
                    String oldName = sc.nextLine();
                    System.out.print("Nhap ten sach moi: ");
                    String newName = sc.nextLine();
                    System.out.print("Nhap ten tac gia moi: ");
                    String author = sc.nextLine();
                    System.out.print("Nhap the loai moi: ");
                    String genre = sc.nextLine();

                    admin.editBook(oldName, newName, author, genre);
                }
                if (input.equals("6")) {
                    Login(admin, guest);
                    return;
                }
                if (input.equals("7")) {
                    return;
                }

            }
        } else {
            while (true) {
                displayGuestMenu();
                input = sc.nextLine();
                if (input.equals("1")) {
                    System.out.println("Truong tim kiem: ");
                    System.out.println("1.Ten");
                    System.out.println("2.Tac gia");
                    System.out.println("3.The loai");
                    System.out.print("Lua chon: ");

                    String category = sc.nextLine();
                    System.out.print("Gia tri tim kiem: ");
                    String query = sc.nextLine();
                    guest.search(category, query);
                }
                if (input.equals("2")) {
                    guest.listBooks();
                }
                if (input.equals("3")) {
                    return;
                }
            }
        }
    }

    private static void displayGuestMenu() {
        System.out.println();
        System.out.println("1.Tim sach");
        System.out.println("2.Xem danh sach sach");
        System.out.println("3.Ket thuc chuong trinh");
        System.out.print("Lua chon: ");
    }

    private static void displayAdminMenu() {
        System.out.println();
        System.out.println("1.Tim sach");
        System.out.println("2.Xem danh sach sach");
        System.out.println("3.Them sach");
        System.out.println("4.Xoa sach");
        System.out.println("5.Sua sach");
        System.out.println("6.Thoat admin");
        System.out.println("7.Ket thuc chuong trinh");
        System.out.print("Lua chon: ");
    }
}