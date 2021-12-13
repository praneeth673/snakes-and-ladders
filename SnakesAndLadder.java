package game;
import java.util.*;
public class SnakesAndLadder {
    public static void main(String[] args) {
        System.out.println("---Welcome to the snakes and ladders game---");
        Scanner scn = new Scanner(System.in);
        //taking the board size as input from the user
        System.out.println("please enter the size of the board -->");
        int bsize=scn.nextInt();
        //entering no of dices
        System.out.println("enter the no of dices");
        int diceno=scn.nextInt();
        Dice d = new Dice(diceno);
        //asking the user to set how many snakes he is willing to have in the game
        System.out.println("how many no of snakes you want in the board??");
        int snakesNo=scn.nextInt();
        scn.nextLine();
        System.out.println("enter the starting and ending positions of the snakes in board");
        HashMap<Integer,Snakes> snakeMap = new HashMap<>();
        while(snakesNo>0)
        {
             String st[]= scn.nextLine().split(" ");
             int head = Integer.parseInt(st[0]);
             int  tail= Integer.parseInt(st[1]);
             Snakes s = new Snakes(head,tail);
             snakeMap.put(head,s);
             snakesNo--;
        }
        //asking the user to set how many ladders he is willing to have in the game
        System.out.println("how many no of ladders you are wishing");
        int ladderNo = scn.nextInt();
        scn.nextLine();
        System.out.println("enter the starting and ending points of the ladders in board");
        HashMap<Integer,Ladders> ladMap=new HashMap<>();
        while(ladderNo>0)
        {
            String st[]= scn.nextLine().split(" ");
             int head = Integer.parseInt(st[0]);
             int  tail= Integer.parseInt(st[1]);
             Ladders s = new Ladders(head,tail);
             ladMap.put(head,s);
             ladderNo--;
        }
        Queue <Player> players=new LinkedList<>();
        //taking no of players
        System.out.println("Enter no of players");
        int playersno=scn.nextInt();
        scn.nextLine();
        for(int i=1;i<playersno+1;i++)
        {
            //taking user names as input
            System.out.println("enter the name of player"+i+" :");
            String pname= scn.nextLine();
            Player p = new Player(pname);
            players.add(p);
            
        }
        Board b = new Board(bsize,snakeMap,ladMap,players,d);
        b.beginGame();
        scn.close();
    }


}
