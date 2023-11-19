import java.util.Scanner;

public class Pencil {
    private String name, price, brand, color, material, type;
    Scanner sc = new Scanner(System.in);

    void setAtrributes() {
        System.out.print("Ten: ");
        this.name = sc.nextLine();
        System.out.print("Gia: ");
        this.price = sc.nextLine();
        System.out.print("Thuong hieu: ");
        this.brand = sc.nextLine();
        System.out.print("Mau sac: ");
        this.color = sc.nextLine();
        System.out.print("Chat lieu: ");
        this.material = sc.nextLine();
        System.out.print("Do cung: ");
        this.type = sc.nextLine();
    }

    String getName() {
        return name;
    }

    String[] getMainList() {
        String[] mains = { name, price, brand };
        return mains;
    }

    String[] getOthersList() {
        String[] others = { color, material, type };
        return others;
    }

    boolean compare(String s) {
        return (name.equals(s) || price.equals(s) || brand.equals(s) || color.equals(s) || material.equals(s)
                || type.equals(s));
    }
}
