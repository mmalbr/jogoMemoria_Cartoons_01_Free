package com.meafocus.memoriacartoon01;

import android.app.Application;

import com.meafocus.memoriacartoon01.utils.FontLoader;

public class GameApplication extends Application {

	@Override
	public void onCreate() {
		super.onCreate();
		FontLoader.loadFonts(this);

	}
}
