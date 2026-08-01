interface Walkable{
    void walk();
}

interface Talkable{
    void talk();
}

class WalkableImpl implements Walkable{
    public void walk(){
        System.out.println("Normal Walk robot");
    }
}

class NotWalkableImpl implements Walkable{
    public void walk(){
        System.out.println("Cannot Walk robot");
    }
}

class TalkableImpl implements Talkable{
    public void talk(){
        System.out.println("Normal Talk robot");
    }
}

class NotTalkableImpl implements Talkable{
    public void talk(){
        System.out.println("Cannot Talk robot");
    }
}

public class Robot{
    private Walkable walkable;
    private Talkable talkable;
    public Robot(Walkable walkable, Talkable talkable) {
        this.walkable = walkable;
        this.talkable = talkable;
    }
    public void walk() {
        walkable.walk();
    }
    public void talk() {
        talkable.talk();
    }
    public static void main(String[] args){
        Robot robot = new Robot(new NotWalkableImpl(), new TalkableImpl());
        robot.walk();
        robot.talk();
    }
}