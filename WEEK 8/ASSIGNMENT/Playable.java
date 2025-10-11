// All classes in one file: PlayableTest.java

interface Playable {
    void play();
    void pause();
}

class MusicPlayer implements Playable {
    @Override
    public void play() {
        System.out.println("Music is playing.");
    }

    @Override
    public void pause() {
        System.out.println("Music is paused.");
    }
}

class VideoPlayer implements Playable {
    @Override
    public void play() {
        System.out.println("Video is playing.");
    }

    @Override
    public void pause() {
        System.out.println("Video is paused.");
    }
}

public class PlayableTest {
    public static void main(String[] args) {
        // Polymorphism with Playable reference
        Playable ref = new MusicPlayer();
        ref.play();
        ref.pause();

        ref = new VideoPlayer();
        ref.play();
        ref.pause();
    }
}