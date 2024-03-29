package org.example.sudoku;

import android.content.Context;
import android.os.Bundle;
import android.preference.PreferenceActivity;
import android.preference.PreferenceManager;

public class Prefs extends PreferenceActivity {

	//option names and default values
	private static final String OPT_MUSIC = "music"; //needs to match keys in xml/settings.xml
	private static final boolean OPT_MUSIC_DEF = true;
	
	private static final String OPT_HINTS = "hints";
	private static final boolean OPT_HINTS_DEF = true;
	
	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		addPreferencesFromResource(R.xml.settings);
	}
	
	/**
	 * get the current value of the music option
	 * @param context
	 * @return
	 */
	public static boolean getMusic(Context context){
		return PreferenceManager.getDefaultSharedPreferences(context).getBoolean(OPT_MUSIC, OPT_MUSIC_DEF);
	}
	
	/**
	 * get the current value of the hints option
	 * @param context
	 * @return
	 */
	public static boolean getHints(Context context){
		return PreferenceManager.getDefaultSharedPreferences(context).getBoolean(OPT_HINTS, OPT_HINTS_DEF);
	}
	
}
