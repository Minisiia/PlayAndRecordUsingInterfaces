package play_and_record;

public class Main {
    public static void main(String[] args) {
        System.out.println("Play & Record");
        Player player = new Player();
        player.play();
        player.pause();
        player.stop();
        player.record();
        System.out.println("Тільки Play");
        Playable sound1 = new Player();
        sound1.play();
        sound1.pause();
        sound1.stop();
        //sound1.record(); в інтерфейсі Playable немає методу record();
        System.out.println("Тільки Record");
        Recordable sound2 = new Player();
        sound2.record();
        sound2.pause();
        sound2.stop();
        // sound1.play(); в інтерфейсі Recordable немає методу play();
    }
}
