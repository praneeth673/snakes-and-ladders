
package game;
import java.util.HashMap;
import java.util.Queue;

import org.w3c.dom.ls.LSParser;

class Board
{
    private int boardSize;
    private HashMap<Integer, Snakes> snakes;
    private HashMap<Integer, Ladders> ladders;
    private Queue<Player> player;
    private Dice dice;
    Board(int size,HashMap<Integer,Snakes> snakemap,HashMap<Integer,Ladders> laddermap,Queue<Player> player,Dice dice)
    {
        setboardSize(size);
        snakes=snakemap;
        ladders=laddermap;
        this.player=player;
        this.dice=dice;
    }
    public void setboardSize(int boardSize) {
        this.boardSize = boardSize;
    }
    public int getboardsize()
    {
        return boardSize;
    }
    public void beginGame()
    {      

        while (true)
        {   
            //String playername=player.remove();
            Player p=player.poll();
            int pos=p.getplayerLocation();
            pos+=dice.rollDice();
            if(snakes.containsKey(pos))
            {   
                Snakes s= snakes.get(pos);
                p.setplayerLocation(s.getTail());
                System.out.println("The player "+p.getPlayerName()+" is bitten by snake at "+pos+" and moved to "+p.getplayerLocation());
            }
            else if(ladders.containsKey(pos))
            {   
                Ladders l= ladders.get(pos);
                p.setplayerLocation(l.getTail());
                System.out.println("The player "+p.getPlayerName() +" climbed a ladder at "+pos+" and moved to "+p.getplayerLocation());
            }
            else if(pos>getboardsize()){
                System.out.println("OverFlow...");
                continue;
            }
            else
            {   
                p.setplayerLocation(pos);
                System.out.println("The player "+p.getPlayerName()+" has moved to "+p.getplayerLocation());
            }
            if (pos==getboardsize())
            {
                System.out.println("The player "+p.getPlayerName()+" has won");
                break;
            }
            player.add(p);
        }

    }
    
}