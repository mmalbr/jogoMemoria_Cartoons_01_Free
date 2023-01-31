package com.meafocus.memoriacartoon01.common;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.fragment.app.FragmentActivity;

import com.meafocus.memoriacartoon01.engine.Engine;
import com.meafocus.memoriacartoon01.events.EventBus;

public class Shared {

	@SuppressLint("StaticFieldLeak")
	public static Context context;
	public static FragmentActivity activity; // it's fine for this app, but better move to weak reference
	@SuppressLint("StaticFieldLeak")
	public static Engine engine;
	public static EventBus eventBus;

}
