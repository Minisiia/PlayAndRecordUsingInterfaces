package play_and_record;

public class Main {
    public static void main(String[] args) {
        System.out.println("Play & Record");
        Player player = new Player();
        player.play();
        player.pause();
        player.stop();
        player.record();
    }
}
