import java.util.Scanner;

class Player {
    int pid;
    String pname;
    int totalRuns;
    int inningsPlayed;
    int notOutTimes;

    Player(int pid, String pname, int totalRuns, int inningsPlayed, int notOutTimes) {
        this.pid = pid;
        this.pname = pname;
        this.totalRuns = totalRuns;
        this.inningsPlayed = inningsPlayed;
        this.notOutTimes = notOutTimes;
    }

    double average() {
        return inningsPlayed == 0 ? 0 : (double) totalRuns / inningsPlayed;
    }

    @Override
    public String toString() {
        return "Player ID: " + pid + ", Name: " + pname + ", Total Runs: " + totalRuns +
               ", Innings Played: " + inningsPlayed + ", Not Out Times: " + notOutTimes +
               ", Average: " + average();
    }
}

public class CricketPlayers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of players: ");
        int n = sc.nextInt();
        sc.nextLine();  // Consume newline

        Player[] players = new Player[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for player " + (i + 1));
            System.out.print("Player ID: ");
            int pid = sc.nextInt();
            sc.nextLine();  // Consume newline

            System.out.print("Player Name: ");
            String pname = sc.nextLine();

            System.out.print("Total Runs: ");
            int totalRuns = sc.nextInt();

            System.out.print("Innings Played: ");
            int inningsPlayed = sc.nextInt();

            System.out.print("Not Out Times: ");
            int notOutTimes = sc.nextInt();
            sc.nextLine();  // Consume newline

            players[i] = new Player(pid, pname, totalRuns, inningsPlayed, notOutTimes);
        }

        double maxAverage = 0;
        Player maxPlayer = null;

        for (Player player : players) {
            if (player.average() > maxAverage) {
                maxAverage = player.average();
                maxPlayer = player;
            }
        }

        System.out.println("\nPlayer with Maximum Average:");
        if (maxPlayer != null) {
            System.out.println(maxPlayer);
        }

        sc.close();
    }
}
 