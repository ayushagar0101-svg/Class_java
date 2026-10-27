public class Book{
   private String title;
    private String author;
   private  int price;
    Book(String title,String author,int price){
        this.title= title;
        this.author= author;
        this.price = price;
    }
    
    Book(String title,String author){
        this.title= title;
        this.author= author;
    }
    void display(){
        System.out.println(title+" "+author+" "+ price);
    }
    public static void main(String[] args) {
        Book b = new Book("java","RD raman",1200);
        Book b1 = new Book("python","KM Robert");
        b.display();
        b1.display();
    }
}