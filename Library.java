public class Library {

    
   
    public static void main(String[] args) {

      Book book1= new Book("Java","Younis");
      Book book2 = new Book("Basic","Areej");
     


     Book [] books={book1,book2};
    // for (int i =0;i<books.length;i++){
    //     books[i].print();
    // }
    
    int i=0;
    boolean flag=true;
    while(i< books.length){
        books[i].print();
        i++;
    }

    


     
     
      
        
        
    }

}
