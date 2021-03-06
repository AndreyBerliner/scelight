/*
 * Project Scelight
 * 
 * Copyright (c) 2013 Andras Belicza <iczaaa@gmail.com>
 * 
 * This software is the property of Andras Belicza.
 * Copying, modifying, distributing, refactoring without the author's permission
 * is prohibited and protected by Law.
 */
package hu.sllauncher.bean.settings.type;

import hu.scelightapibase.bean.settings.type.IMultilineStringSetting;
import hu.scelightapibase.bean.settings.type.ISetting;
import hu.scelightapibase.bean.settings.type.ISettingsGroup;
import hu.scelightapibase.bean.settings.type.viewhints.IViewHints;
import hu.scelightapibase.util.ISkillLevel;

/**
 * A multi-line string setting.
 * 
 * <p>
 * It does not provide any new methods or attributes, its purpose is to create a different setting component for it.
 * </p>
 * 
 * @author Andras Belicza
 */
public class MultilineStringSetting extends StringSetting implements IMultilineStringSetting {
	
	/**
	 * Creates a new {@link MultilineStringSetting}.
	 * 
	 * @param id setting id
	 * @param parent parent setting to be added to
	 * @param group settings group this setting belongs to (within a setting node page)
	 * @param skillLevel setting skill level
	 * @param name setting name
	 * @param viewHints optional view hints of the setting
	 * @param defaultValue default setting value
	 */
	public MultilineStringSetting( final String id, final ISetting< ? > parent, final ISettingsGroup group, final ISkillLevel skillLevel, final String name,
	        final IViewHints viewHints, final String defaultValue ) {
		super( id, parent, group, skillLevel, name, viewHints, defaultValue );
	}
	
}
