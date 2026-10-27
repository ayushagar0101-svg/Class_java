import java.util.*;

public class Cart {
    private String Name;
    private int quantity;
    private double price;

    public Cart() {
         this.Name = "no item";
        this.quantity = 0;
        this.price = 0;
    }
    void setter(String Name,int quantity,double price){
        this.Name = Name;
        this.quantity = quantity;
        this.price = price;
        // this.Name = sc.next();
    }
    void totalAmount(){
        System.out.println("Total_amount="+quantity*price);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Cart c1 = new Cart();
         String n1 = sc.next();
         int q1 = sc.nextInt();
         int p1= sc.nextInt();  
        c1.setter(n1,q1,p1);
        c1.totalAmount();
    }
}
