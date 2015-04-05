package com.lmntrx.slimcalc;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.Preference;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.CheckBox;

public class SettingsActivity extends Activity implements View.OnClickListener {

    CheckBox vibrateCB;
    CheckBox themeCB;
    Context con;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        con=getApplicationContext();

        vibrateCB=(CheckBox)findViewById(R.id.vibrate_cb);
        themeCB=(CheckBox)findViewById(R.id.theme_cb);

        loadPrefs();

        vibrateCB.setOnClickListener(this);
        themeCB.setOnClickListener(this);
    }

    public void loadPrefs(){
        loadVibratePrefs();
        loadThemePrefs();
    }

    public boolean loadVibratePrefs() {
        SharedPreferences sp= PreferenceManager.getDefaultSharedPreferences(con);
        boolean cbValue=sp.getBoolean("VIBRATE_CHECKBOX",true);
        vibrateCB.setChecked(cbValue);
        return cbValue;
    }
    public boolean loadThemePrefs() {
        SharedPreferences sp= PreferenceManager.getDefaultSharedPreferences(con);
        boolean cbValue=sp.getBoolean("THEME_CHECKBOX",true);
        themeCB.setChecked(cbValue);
        return cbValue;
    }

    public void saveVibratePrefs(String key, boolean value){
        SharedPreferences sp= PreferenceManager.getDefaultSharedPreferences(this);
        SharedPreferences.Editor edit=sp.edit();
        edit.putBoolean(key,value);
        edit.commit();
    }
    public void saveThemePrefs(String key, boolean value){
        SharedPreferences sp= PreferenceManager.getDefaultSharedPreferences(this);
        SharedPreferences.Editor edit=sp.edit();
        edit.putBoolean(key,value);
        edit.commit();
    }

    @Override
    public void onClick(View v) {
        String id=v.getId()+"";
        if (id.equals((R.id.vibrate_cb)+"")){
            saveVibratePrefs("VIBRATE_CHECKBOX", vibrateCB.isChecked());
        }
        else if (id.equals((R.id.theme_cb)+"")){
            saveThemePrefs("THEME_CHECKBOX", themeCB.isChecked());
        }



    }
}
/*
package com.lmntrx.slimcalc;

import android.app.Activity;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.os.Build;
import android.widget.CheckBox;


public class SettingsActivity extends Activity implements OnClickListener {
    CheckBox vibrateCB;
    CheckBox themeCB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
        */
/*if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.container, new PlaceholderFragment())
                    .commit();
        }*//*

       vibrateCB=(CheckBox)findViewById(R.id.vibrate_cb);
       themeCB=(CheckBox)findViewById(R.id.theme_cb);
       vibrateCB.setOnClickListener(this);

    }


    */
/**
     * A placeholder fragment containing a simple view.
     *//*

    */
/*public static class PlaceholderFragment extends Fragment {


        public PlaceholderFragment() {
        }


        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.fragment_settings, container, false);
            return rootView;

        }
        private void loadPrefs(){

        }
        private void savePrefs(String key, boolean value){

        }
        private void savePrefs(String key, String value){

        }
    }*//*

    private void loadPrefs(){

    }
    private void savePrefs(String key, boolean value){

    }
    private void savePrefs(String key, String value){

    }

    public  void onClick(View v){

    }
}
*/
