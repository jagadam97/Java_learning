package HackerRank.data_structure;

import java.util.*;
// Write your class
class Checker implements Comparator<Player> {
    @Override
    public int compare(Player a,Player b){
        int res=-1;
        if(a.score==b.score) return a.name.compareToIgnoreCase(b.name);
        if(a.score>b.score) res=-1;
        else res=1;
        return res;
    }
}

class Player{
    String name;
    int score;
    
    Player(String name, int score){
        this.name = name;
        this.score = score;
    }
}

public class comparator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        Player[] player = new Player[n];
        Checker checker = new Checker();
        
        for(int i = 0; i < n; i++){
            player[i] = new Player(scan.next(), scan.nextInt());
        }
        scan.close();
     
        Arrays.sort(player, checker);
        for(int i = 0; i < player.length; i++){
            System.out.printf("%s %s\n", player[i].name, player[i].score);
        }
    }
}

