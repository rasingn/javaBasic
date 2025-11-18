public class Book {

  static String title = "Java";
  static String author = "Younis";

   // Actions -> function ->method
   static String print(String title) {
      System.out.println(title);
      return "";
   }

   public static void main(String[] args) {
      String x = "php";
      String msg=print(x);

      System.out.println(msg);
     

   }

}