package Classes;

import Interfaces.MediaPlayer;

public class AudioPlayer implements MediaPlayer {
    MediaAdapter mediaAdapter;

    /**
     * Utilize MediaAdapter to play fileName using the appropriate audioType.
     * If the media format is not supported, print out the invalid message.
     * @param audioType The provided audioType ("mp3", "mp4", "vlc", etc)
     * @param fileName The file to be played.
     */
    @Override
    public void play(String audioType, String fileName) {
        // Add code here
    }
}
