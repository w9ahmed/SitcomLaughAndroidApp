package com.asyn.sound;

import android.content.Context;
import android.media.MediaPlayer;
import android.widget.ImageButton;

public class RawPlayer {
	private MediaPlayer mediaPlayer;
	private Context context;

	public RawPlayer(Context setContext) {
		context = setContext;
	} // end constructor
	
	public RawPlayer(Context setContext, int playableMedia) {
		this(setContext);
		mediaPlayer = MediaPlayer.create(context, playableMedia);
	}

	public void setPlayableMedia(int playableMedia) {
		destroy();
		mediaPlayer = MediaPlayer.create(context, playableMedia);
	} // end method setPlayableMedia

	public int getFileDuration() {
		return mediaPlayer.getDuration();
	} // end method getFileDuration

	public void startPlayableMedia() {
		mediaPlayer.start();
	} // end method startPlayableMedia

	public MediaPlayer playMediaFile() {
		return mediaPlayer;
	} // end method playMediaFile

	public void setAndPlayMedia(int playableMedia) {
		setPlayableMedia(playableMedia);
		startPlayableMedia();
	} // end method setAndPlayMedia

	public int setAndPlayReturnFileDuration(int playableMedia) {
		setAndPlayMedia(playableMedia);
		return getFileDuration();
	} // end method setAndPlayReturnFileDuration

	public void setLoopParameters(boolean loop) {
		mediaPlayer.setLooping(loop);
	} // end method setLoopParameters

	public void setPlayRepeatMedia(int playableMedia, boolean loop) {
		setAndPlayMedia(playableMedia);
		setLoopParameters(loop);
	} // end method setPlayRepeatMedia

	public void stopPlayableMedia() {
		mediaPlayer.stop();
		mediaPlayer.release();
	} // end method stopPlayableMedia

	public void pausePlayableMedia() {
		mediaPlayer.pause();
	} // end method pausePlayableMedia

	public void destroy() {
		if (mediaPlayer != null)
			mediaPlayer.release();
	} // end method destroy
	
	public void playAndChangeButton(ImageButton button) {
		playMediaFile();
		ButtonControl.changeButtonState(button, getFileDuration());
	}

}
