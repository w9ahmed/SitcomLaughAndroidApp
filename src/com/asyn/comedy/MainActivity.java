package com.asyn.comedy;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;
import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;

import com.asyn.sound.Media;
import com.asyn.sound.RawPlayer;
import com.asyn.tools.AdsLoader;
import com.google.android.gms.ads.AdView;

public class MainActivity extends Activity {

	protected ImageButton playButton;
	private RawPlayer laugh;

	private RadioGroup radioGroup;

	private static int idOfCheckBox = 0;
	
	private AdView adView;
	private AdsLoader adsLoader;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		adView = (AdView) findViewById(R.id.adView);
		radioGroup = (RadioGroup) findViewById(R.id.buttonGroup);

		playButton = (ImageButton) findViewById(R.id.playButton);
		laugh = new RawPlayer(this);
		playButton.setOnClickListener(playButtonClickListener);
		radioGroup.setOnCheckedChangeListener(radioBoxesListener);
	} // end of onCreate
	
	protected void onResume() {
		super.onResume();
		if(adsLoader == null)
			adsLoader = new AdsLoader(adView);
	};
	
	protected void onPause() {
		super.onPause();
		laugh.destroy();
	};

	OnClickListener playButtonClickListener = new OnClickListener() {

		@Override
		public void onClick(View v) {
			laugh.setAndPlayMedia(Media.getMedia(idOfCheckBox));
		}
	};

	OnCheckedChangeListener radioBoxesListener = new OnCheckedChangeListener() {

		@Override
		public void onCheckedChanged(RadioGroup group, int checkedId) {
			switch (checkedId) {
			case R.id.soundA:
				idOfCheckBox = 0;
				break;
			case R.id.soundB:
				idOfCheckBox = 1;
				break;
			case R.id.soundC:
				idOfCheckBox = 2;
				break;
			case R.id.soundD:
				idOfCheckBox = 3;
				break;
			case R.id.soundE:
				idOfCheckBox = 4;
				break;
			case R.id.soundF:
				idOfCheckBox = 5;
				break;
			case R.id.soundG:
				idOfCheckBox = 6;
				break;
			case R.id.soundCartoon:
				idOfCheckBox = 7;
				break;
			case R.id.soundGuy:
				idOfCheckBox = 8;
				break;
			case R.id.soundManAndWoman:
				idOfCheckBox = 9;
				break;
			}
		}
	};

}
