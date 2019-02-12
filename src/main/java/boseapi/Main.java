package boseapi;

/**
 * Bose SoundTouch API
 **/

public class Main {

    public static void main(String[] args) throws Exception {

        BoseSoundTouch boseSoundTouch = new BoseSoundTouch();

        if (args != null || args.length > 0) {
            boseSoundTouch.setIP(args[0]);
        }

        String volume = boseSoundTouch.getVolume();

        System.out.println("Current Volume is : " + volume);

        String bass = boseSoundTouch.getBass();
        System.out.println("Current Bass is : " + bass);

        String now_playing = boseSoundTouch.getNowPlaying();
        System.out.println("Now Playing : " + now_playing);
    }
}