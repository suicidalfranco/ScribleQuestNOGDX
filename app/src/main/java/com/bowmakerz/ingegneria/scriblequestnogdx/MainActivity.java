package com.bowmakerz.ingegneria.scriblequestnogdx;

import com.bowmakerz.ingegneria.scriblequestnogdx.util.SystemUiHider;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.Animation;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

import static com.bowmakerz.ingegneria.scriblequestnogdx.R.anim.monk;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        final ImageView Monk = (ImageView) findViewById(R.id.imageView5);
        Monk.setBackgroundResource(R.anim.monk);
        Monk.setOnClickListener(new View.OnClickListener() {

            @Override
        public void onClick(View v) {
                AnimationDrawable anim = (AnimationDrawable) Monk.getBackground();
                anim.start();
            }
        });

        final ImageButton worldButton = (ImageButton) findViewById(R.id.imageButton1);
        final ImageButton pvpButton = (ImageButton) findViewById(R.id.imageButton2);
        final ImageButton settingsButton = (ImageButton) findViewById(R.id.imageButton3);

        worldButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, WorldActivity.class);
                startActivity(intent);
            }
        });
        pvpButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, PvpActivity.class);
                startActivity(intent);
            }
        });
        settingsButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, SettingsActivity.class);
                startActivity(intent);
            }
        });

    }
}
