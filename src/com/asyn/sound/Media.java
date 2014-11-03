package com.asyn.sound;

import com.asyn.comedy.R;

public final class Media {
	
	public static final int audience_a = R.raw.audience_laugh_a;
	public static final int audience_b = R.raw.audience_laugh_b;
	public static final int audience_c = R.raw.audience_laugh_c;
	public static final int audience_d = R.raw.audience_laugh_d;
	public static final int audience_e = R.raw.audience_laugh_e;
	public static final int audience_f = R.raw.audience_laugh_f;
	public static final int audience_g = R.raw.audience_laugh_g;
	
	public static final int cartoon_laugh = R.raw.cartoon_mouse_laugh;
	public static final int guy_laugh = R.raw.guy_laugh;
	public static final int man_woman_laugh = R.raw.man_woman_laugh;
	
	public static int getMedia(int index) {
		return new int[]{audience_a, audience_b, audience_c, audience_d, audience_e, audience_f, audience_g,
				cartoon_laugh, guy_laugh, man_woman_laugh}[index];
		}
}
