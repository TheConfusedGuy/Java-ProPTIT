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
                    System.out.print("Tu khoa: ");
                    String query = sc.nextLine();
                    admin.search(query);
                }
                if (input.equals("2")) {
                    admin.listBooks();
                }
                if (input.equals("3")) {
                    System.out.println("1.Vo ghi");
                    System.out.println("2.But chi");
                    System.out.println("3.But muc");
                    System.out.println("4.Sach");
                    System.out.print("San pham muon them: ");
                    int type = Integer.valueOf(sc.nextLine());
                    switch (type) {
                        case 1:
                            Notebook n = new Notebook();
                            n.setAtrributes();
                            admin.addNotebook(n);
                            break;
                        case 2:
                            Pencil pc = new Pencil();
                            pc.setAtrributes();
                            admin.addPencil(pc);
                            break;
                        case 3:
                            Pen p = new Pen();
                            p.setAtrributes();
                            admin.addPen(p);
                            break;
                        case 4:
                            Book b = new Book();
                            b.setAtrributes();
                            admin.addBook(b);
                            break;
                        default:

                    }
                }
                if (input.equals("4")) {
                    System.out.print("Nhap san pham can xoa: ");
                    System.out.print("1.Vo ghi");
                    System.out.print("2.But chi");
                    System.out.print("3.But muc");
                    System.out.print("4.Sach");
                    String name = sc.nextLine();
                    admin.deleteProduct(Integer.valueOf(name));

                }
                if (input.equals("5")) {
                    System.out.print("Nhap san pham can sua: ");
                    System.out.print("1.Vo ghi");
                    System.out.print("2.But chi");
                    System.out.print("3.But muc");
                    System.out.print("4.Sach");
                    String name = sc.nextLine();
                    admin.editProduct(Integer.valueOf(name));
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
                    System.out.print("Tu khoa: ");
                    String query = sc.nextLine();
                    guest.search(query);
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
        System.out.println("1.Tim san pham");
        System.out.println("2.Xem danh sach san pham");
        System.out.println("3.Ket thuc chuong trinh");
        System.out.print("Lua chon: ");
    }

    private static void displayAdminMenu() {
        System.out.println();
        System.out.println("1.Tim san pham");
        System.out.println("2.Xem danh sach san pham");
        System.out.println("3.Them san pham");
        System.out.println("4.Xoa san pham");
        System.out.println("5.Sua san pham");
        System.out.println("6.Thoat admin");
        System.out.println("7.Ket thuc chuong trinh");
        System.out.print("Lua chon: ");
    }
}