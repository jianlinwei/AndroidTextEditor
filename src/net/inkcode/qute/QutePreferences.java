

package net.inkcode.qute;

import android.os.Bundle;
import android.preference.PreferenceActivity;

public class QutePreferences extends PreferenceActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            addPreferencesFromResource(R.xml.preferences);
    }
}
