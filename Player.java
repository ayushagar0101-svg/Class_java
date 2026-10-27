public class Player {
    private String name;
    private int score;
    int a,b;
    Player(String name,int score){
        this.name = name;
        this.score= score;
    }
    void display(Player p1,Player p2){
        if(p1.score>p2.score){
            System.out.print("1");
        }
        else{
            System.out.print("2");

        }
    }
    public static void main(String[] args) {
        Player p = new Player("Ayush",90 );
        Player p1 = new Player("Vishal",30);
        p.display(p,p1);

    }
}
