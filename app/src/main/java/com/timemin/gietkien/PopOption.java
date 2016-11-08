package com.timemin.gietkien;

import android.app.Activity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.Switch;

/**
 * Created by Leagen on 11/2/2016.
 */
public class PopOption extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.options);
        final DisplayMetrics DisOptions = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(DisOptions);
        int width = DisOptions.widthPixels;
        int heigth = DisOptions.heightPixels;
        getWindow().setLayout((int) (width * .5), (int) (heigth * .2));
        Button button = (Button) this.findViewById(R.id.btnOptionsBack);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // moveTaskToBack(true); exit all
                // Process.killProcess(Process.myPid());

            }
        });

        final Switch switchbuttonSound = (Switch) this.findViewById(R.id.swSound);
        switchbuttonSound.setChecked(true);
        switchbuttonSound.setText("Sound ON");
        switchbuttonSound.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    switchbuttonSound.setText("Sound ON");
                } else {
                    switchbuttonSound.setText("Sound OFF");

                }
            }
        });
        final Switch switchbuttonVibrate;
        switchbuttonVibrate = (Switch) this.findViewById(R.id.swVibrate);
        switchbuttonVibrate.setChecked(true);
        switchbuttonVibrate.setText("Vibrate ON");
        switchbuttonVibrate.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    switchbuttonVibrate.setText("Vibrate ON");
                } else {
                    switchbuttonVibrate.setText("Vibrate OFF");
                }
            }
        });
    }
}
