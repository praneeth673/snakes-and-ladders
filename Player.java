package game;
public class Player {
    private String playerName;
    private int playerLocation=0;
    Player(String name)
    {
        playerName=name;
    }
    public int getplayerLocation() {
        return playerLocation;
    }
    public String getPlayerName() {
        return playerName;
    }
    public void setplayerLocation(int playerLocation) {
        this.playerLocation=playerLocation;
    }
}
