package game;
class Jump
{
    int start;
    int end;
    Jump(int start,int end)
    {
        this.start=start;
        this.end=end;
    }
    public int getTail()
    {
        return end;
    }
}

class Snakes extends Jump
{
    Snakes(int start,int end)
    {
        super(start,end);
    }
}
class Ladders extends Jump
{
    Ladders(int start,int end)
    {
        super(start,end);
    }
}
