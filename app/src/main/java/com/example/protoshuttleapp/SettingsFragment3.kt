package com.example.protoshuttleapp

import android.os.Bundle
import androidx.preference.PreferenceFragmentCompat

class SettingsFragment3 : PreferenceFragmentCompat() {

    override fun onCreatePreferences(savedInstanceState: Bundle?, rootKey: String?) {
        setPreferencesFromResource(R.xml.root_preferences, rootKey)
    }
}