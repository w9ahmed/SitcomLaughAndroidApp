package com.asyn.sound;


import android.os.Handler;
import android.widget.ImageButton;

import com.asyn.comedy.R;

public class ButtonControl {
	
	//private static final int TO_SECOND = 1000;
	
	private static final int ON_PLAY_IMAGE = R.drawable.button_on_play;
	private static final int TO_PLAY_IMAGE = R.drawable.play_button;
	
	public static void changeButtonState(final ImageButton button, int duration) {
		new Handler().postDelayed(new Runnable() {
			
			@Override
			public void run() {
				button.setBackgroundResource(ON_PLAY_IMAGE);
			}
		}, duration);
		button.setBackgroundResource(TO_PLAY_IMAGE);
	}
}
