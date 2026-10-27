import java.util.*;
public class quadirent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the values of x and y:");
        int x = sc.nextInt();
        int y = sc.nextInt();
        if(x>0 && y>0){
            System.out.println("1 quadirent");
        }
        else if(x<0 && y>0){
             System.out.println("2 quadirent");
        }
         else if(x<0 && y<0){
             System.out.println("3 quadirent");
        }
         else if(x>0 && y<0){
             System.out.println("4 quadirent");
        } 
        else if(x == 0 && y!=0 || x!=0 && y==0){
            System.out.println("on axis");
        }
        sc.close();
    }
}
