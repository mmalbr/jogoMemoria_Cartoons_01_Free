package com.meafocus.memoriacartoon01.events.ui;

import com.meafocus.memoriacartoon01.events.AbstractEvent;
import com.meafocus.memoriacartoon01.events.EventObserver;

/**
 * When the 'back to menu' was pressed.
 */
public class ResetBackgroundEvent extends AbstractEvent {

	public static final String TYPE = ResetBackgroundEvent.class.getName();

	@Override
	protected void fire(EventObserver eventObserver) {
		eventObserver.onEvent(this);
	}

	@Override
	public String getType() {
		return TYPE;
	}

}
