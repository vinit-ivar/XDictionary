package tweaks.vinit.xdictionary;

import android.os.Bundle;
import android.preference.PreferenceActivity;

public class DictSettings extends PreferenceActivity {

	@Override
	public void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		getFragmentManager().beginTransaction().replace(android.R.id.content, new SettingsFragment()).commit();
	}
	
	
}
