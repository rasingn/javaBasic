public class Book extends bookMark{

 private String title;
 private String auther;

 
Book(String title,String auther){
this.title=title;
this.auther=auther;


}
 void print(){
     System.out.println(title+"  "+ auther+"-"+ this.shape
     );

 }

//  void x (){
//      System.out.println("Book");
//  }



}