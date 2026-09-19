abstract  class game{
    abstract void start_game();
    abstract void quit_game();
}
class  play_station extends  game{
    @Override
    void start_game(){
        System.out.println("game start if the user play");
    }
    @Override
    void quit_game() {
        System.out.println("game end if the user out");
    }
}
public class Play  {
    public static void main(String[] args) {
        play_station played=new play_station();
        played.start_game();
        played.quit_game();
    }
}
