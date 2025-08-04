import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Library {

    public static void main(String[] args) {
        // Book boo1=;

        // Book [] books={};
        List <Book>books=new ArrayList<Book>();
        Scanner sacn = new Scanner(System.in);
        int input = 0;

        while (input != 4) {
            System.out.println("Menu:\n 1- Add Book \n 2-Remove Book \n 3-Print All Books \n 4-Exit");
            input = sacn.nextInt();
            System.out.println("our input = " + input);


            switch (input) {
                case 1:
                    System.out.println("adding book");
                    System.out.println("Enter Book title:");
                    String t=sacn.next();
                    
                    System.out.println("Enter Book Auther:");
                    String a=sacn.next();

                    Book boo=new Book(t, a);
                    books.add(boo);
                    break;
                case 2:
                    System.out.println("removing");
                    for(int i =0;i<books.size();i++){
                        System.out.print(i+" - ");
                        books.get(i).print();
                    }
                    System.out.println("Enter Book Number to remove");
                    int ch=sacn.nextInt();
                    if(ch>books.size()){
                        System.out.println("Number is not Valid");
                        break;
                        
                    }
                    books.remove(ch);
                case 3:
                    System.out.println("print:");
                    for(int i =0;i<books.size();i++){
                        books.get(i).print();
                    }
                    break;
                case 4:
                    System.out.println("Exit");
                    break;
                default:
                 System.out.println("Numbers not included");

            }

            System.out.println("********************************");
            System.out.println("********************************");
        }

    }

}
