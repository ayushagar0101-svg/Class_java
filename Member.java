public class Member {
    private int memberid;
    private String name;
    private int bookissued;

    Member(int memberid,String name,int bookissued){
        this.memberid= memberid;
        this.name=name;
        this.bookissued= bookissued;
    }
    Member(String name){
        this.name= name;
    }
    public  void issueBook(){
        System.out.println(memberid+ " "+name+" "+bookissued);
    }
    public static void main(String[] args) {
        Member m = new Member(123,"Ayush",3);
        Member m1 = new Member("Vishal");
        m.issueBook();
        m1.issueBook();
    }
}
