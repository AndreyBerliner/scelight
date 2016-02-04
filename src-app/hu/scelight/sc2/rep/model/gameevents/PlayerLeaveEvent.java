/*
 * Project Scelight
 * 
 * Copyright (c) 2013 Andras Belicza <iczaaa@gmail.com>
 * 
 * This software is the property of Andras Belicza.
 * Copying, modifying, distributing, refactoring without the author's permission
 * is prohibited and protected by Law.
 */
package hu.scelight.sc2.rep.model.gameevents;

import hu.scelight.gui.icon.Icons;
import hu.scelight.sc2.rep.s2prot.Event;
import hu.scelightapi.sc2.rep.model.gameevents.IPlayerLeaveEvent;
import hu.sllauncher.gui.icon.LRIcon;

import java.util.Map;

/**
 * Player leave game event.
 * 
 * @author Andras Belicza
 */
public class PlayerLeaveEvent extends Event implements IPlayerLeaveEvent {
	
	/**
	 * Creates a new {@link PlayerLeaveEvent}.
	 * 
	 * @param struct event data structure
	 * @param id id of the event
	 * @param name type name of the event
	 * @param loop game loop when the event occurred
	 * @param userId user id causing the event
	 */
	public PlayerLeaveEvent( final Map< String, Object > struct, final int id, final String name, final int loop, final int userId ) {
		super( struct, id, name, loop, userId );
	}
	
	@Override
	public LRIcon getRicon() {
		return Icons.F_DOOR_OPEN_IN;
	}
	
}
