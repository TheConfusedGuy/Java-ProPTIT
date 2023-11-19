import java.util.Scanner;

public class Notebook {
    private String name, price, brand, pageCount, type, color, material, size;
    Scanner sc = new Scanner(System.in);

    void setAtrributes() {
        System.out.print("Ten: ");
        this.name = sc.nextLine();
        System.out.print("Gia: ");
        this.price = sc.nextLine();
        System.out.print("Thuong hieu: ");
        this.brand = sc.nextLine();
        System.out.print("So trang: ");
        this.pageCount = sc.nextLine();
        System.out.print("Loai vo: ");
        this.type = sc.nextLine();
        System.out.print("Mau sac: ");
        this.color = sc.nextLine();
        System.out.print("Chat lieu: ");
        this.material = sc.nextLine();
        System.out.print("Kich thuoc: ");
        this.size = sc.nextLine();
    }

    String getName() {
        return name;
    }

    String[] getMainList() {
        String[] mains = { name, price, brand };
        return mains;
    }

    String[] getOthersList() {
        String[] others = { pageCount, type, color, material, size };
        return others;
    }

    boolean compare(String s) {
        return (name.equals(s) || price.equals(s) || brand.equals(s) || pageCount.equals(s) || type.equals(s)
                || color.equals(s) || material.equals(s) || size.equals(s));
    }
}
