public class Employee {
    int id;
    String name;
    String dept;
    public int setter (int id,String name,String dept){
    this.id = id;
    this.name = name;
    this.dept= dept;
    return 0;
    }
    public int getter (){
        
        System.out.println(this.id);
        System.out.println(this.name);
        System.out.println(this.dept);
         return 0;
    } 
   
    
    public static void main(String[] args) {
        Employee g = new Employee();
        g.setter(123,"Ayush","b tech");
       g.getter();
    }
}       