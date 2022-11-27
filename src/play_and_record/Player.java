package play_and_record;

public class Player implements Playable, Recordable {
    @Override
    public void play() {
        System.out.println("Play");
    }

    @Override
    public void pause() {
        System.out.println("Pause play/record");
    }

    @Override
    public void stop() {
        System.out.println("Stop play/record");
    }

    @Override
    public void record() {
        System.out.println("Record");
    }
}
