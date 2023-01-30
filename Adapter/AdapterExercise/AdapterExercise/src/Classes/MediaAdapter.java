package Classes;

import Interfaces.AdvancedMediaPlayer;
import Interfaces.MediaPlayer;

public class MediaAdapter implements MediaPlayer {

    AdvancedMediaPlayer advancedMusicPlayer;

    /**
     * Constructor. Initiate AdvancedMediaPlayer to fit the specified audioType
     * @param audioType The provided audioType ("mp3", "mp4", "vlc", etc)
     */
    public MediaAdapter(String audioType){
        // Add code here
    }

    /**
     * Play the file using the specified audioType
     * @param audioType The provided audioType ("mp3", "mp4", "vlc", etc).
     * @param fileName The file to be played.
     */
    @Override
    public void play(String audioType, String fileName) {
        // Add code here
    }
}
