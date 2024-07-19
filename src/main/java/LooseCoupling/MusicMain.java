package LooseCoupling;

public class MusicMain {
    public static void main(String[] args) {
        MusicPlayer mp3Player = new MP3Player();
        MusicApp app1 = new MusicApp(mp3Player);
        app1.playMusic();

        MusicPlayer wavPlayer = new WAVPlayer();
        MusicApp app2 = new MusicApp(wavPlayer);
        app2.playMusic();
    }
}
