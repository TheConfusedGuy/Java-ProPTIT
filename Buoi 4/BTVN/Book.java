import java.util.ArrayList;
import java.util.Scanner;

public class Book {
    private String name, author, genre, price, publisher, publishYear, language;
    Scanner sc = new Scanner(System.in);

    void setAtrributes() {
        System.out.print("Ten: ");
        this.name = sc.nextLine();
        System.out.print("Tac gia: ");
        this.author = sc.nextLine();
        System.out.print("The loai: ");
        this.genre = sc.nextLine();
        System.out.print("Gia: ");
        this.price = sc.nextLine();
        System.out.print("Nha xuat ban: ");
        this.publisher = sc.nextLine();
        System.out.print("Nam xuat ban: ");
        this.publishYear = sc.nextLine();
        System.out.print("Ngon ngu: ");
        this.language = sc.nextLine();
    }

    String getName() {
        return name;
    }

    String[] getMainList() {
        String[] mains = { name, price, publisher };
        return mains;
    }

    String[] getOthersList() {
        String[] others = { author, genre, publishYear, language };
        return others;
    }

    boolean compare(String s) {
        return (name.equals(s) || author.equals(s) || genre.equals(s) || price.equals(s) || publisher.equals(s)
                || publishYear.equals(s) || language.equals(s));
    }
}
