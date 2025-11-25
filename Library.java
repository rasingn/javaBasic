import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Library {

    public static void main(String[] args) {
        int x = 0;
        Book book1 = null;

        List<Book> books = new ArrayList<Book>();
        while (x != 4) {
            System.out.println("############## Welcom to our Systems ####################");
            System.out.println("Kindly chose the menu:");
            System.out.println("1-Add book");
            System.out.println("2-delete book");
            System.out.println("3-prints all Book");
            System.out.println("4-Exit");
            Scanner scan = new Scanner(System.in);
            x = scan.nextInt();
            if (x == 1) {
                System.out.println("Enter Title");
                String title = scan.next();
                System.out.println("Enter Auther");
                String auther = scan.next();
                book1 = new Book(title, auther);
                books.add(book1);
            } else if (x == 2) {
                System.out.println("DELETE");
            } else if (x == 3) {
                for (int i = 0; i < books.size(); i++) {
                    books.get(i).print();
                }
            } else if (x == 4) {
                System.out.println("EXIT");
            } else
                System.out.println("WRONG");
        }

    }

}
