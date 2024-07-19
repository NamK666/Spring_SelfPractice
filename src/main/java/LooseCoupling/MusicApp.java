package LooseCoupling;

public class MusicApp {
    private MusicPlayer musicPlayer;

    public MusicApp(MusicPlayer musicPlayer) {
        this.musicPlayer = musicPlayer;
    }

    public void playMusic(){
        musicPlayer.play();
    }
}
