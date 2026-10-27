public class P {
    void display(){
        System.out.println("parent display");
    }

class C extends P
{
   
    void display1(){
        System.out.println("child display");
    }
}

    public static void main(String[] args) {
        C c1 = new C();
        c1.super.display();
    }
}

