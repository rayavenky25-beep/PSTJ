package pstj_week3;

import java.util.*;

class Player {
    String name;
    int score;

    Player(String name, int score) {
        this.name = name;
        this.score = score;
    }
}

class Checker implements Comparator<Player> {
    @Override
    public int compare(Player a, Player b) {
        // 1. Sort in order of decreasing score
        if (a.score != b.score) {
            return Integer.compare(b.score, a.score);
        }
        // 2. Sort alphabetically by name if scores are the same
        return a.name.compareTo(b.name);
    }
}

public class JavaComparator {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        if (!scan.hasNextInt()) {
            scan.close();
            return;
        }
        
        int n = scan.nextInt();
        Player[] player = new Player[n];
        Checker checker = new Checker();
        
        for (int i = 0; i < n; i++) {
            player[i] = new Player(scan.next(), scan.nextInt());
        }
        
        scan.close();
        
        Arrays.sort(player, checker);
        
        for (int i = 0; i < player.length; i++) {
            System.out.printf("%s %s\n", player[i].name, player[i].score);
        }
    }
}