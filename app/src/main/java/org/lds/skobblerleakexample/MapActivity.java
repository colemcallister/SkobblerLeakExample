package org.lds.skobblerleakexample;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

public class MapActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_map);

        SkobblerMapFragment skobblerMapFragment = SkobblerMapFragment.newInstance();
        android.app.FragmentManager fm = getFragmentManager();
        fm.beginTransaction()
          .add(R.id.frame_container, skobblerMapFragment)
          .commitAllowingStateLoss();
    }

    public static void start(Activity activity) {
        Intent intent = new Intent(activity, MapActivity.class);
        activity.startActivity(intent);
    }
}
