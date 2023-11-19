import java.util.Scanner;

public class Pen {
    private String name, price, brand, color, material, ink, thickness;
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
        System.out.print("Loai muc: ");
        this.ink = sc.nextLine();
        System.out.print("Do min: ");
        this.thickness = sc.nextLine();
    }

    String getName() {
        return name;
    }

    String[] getMainList() {
        String[] mains = { name, price, brand };
        return mains;
    }

    String[] getOthersList() {
        String[] others = { color, material, ink, thickness };
        return others;
    }

    boolean compare(String s) {
        return (name.equals(s) || price.equals(s) || brand.equals(s) || color.equals(s) || material.equals(s)
                || ink.equals(s) || thickness.equals(s));
    }
}
