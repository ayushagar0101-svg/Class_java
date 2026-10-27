import java.util.*;
class main {
    public static float add(float a,float b){
        return a/b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float x = sc.nextFloat();
        float y = sc.nextFloat();
        if (y==0){
            System.out.println("invalid");
        }
        else{
        System.out.println(add(x,y));
}}
}