package com.meafocus.memoriacartoon01.events.ui;

import com.meafocus.memoriacartoon01.events.AbstractEvent;
import com.meafocus.memoriacartoon01.events.EventObserver;
import com.meafocus.memoriacartoon01.themes.Theme;

public class ThemeSelectedEvent extends AbstractEvent {

	public static final String TYPE = ThemeSelectedEvent.class.getName();
	public final Theme theme;

	public ThemeSelectedEvent(Theme theme) {
		this.theme = theme;
	}

	@Override
	protected void fire(EventObserver eventObserver) {
		eventObserver.onEvent(this);
	}

	@Override
	public String getType() {
		return TYPE;
	}

}
