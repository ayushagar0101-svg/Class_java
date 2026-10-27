import java.util.*;
public class Module {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Q = sc.nextInt();
        while(Q-->0){
            int u = sc.nextInt();
            int v = sc.nextInt();
            if(u>v){
                System.out.println(u-v);
            }else{
                System.out.println(v-u);
            }
        }
        
    }
}
