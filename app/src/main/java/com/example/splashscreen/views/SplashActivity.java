package com.example.splashscreen.views;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import com.example.splashscreen.MainActivity;
import com.example.splashscreen.R;

public class SplashActivity extends Activity {

    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        imageView = (ImageView) findViewById(R.id.splashlogo);

        Animation animation = AnimationUtils.loadAnimation(this, R.anim.fadeout);

        imageView.startAnimation(animation);

        new Handler() .postDelayed(new Runnable() {
            @Override
            public void run() {

                Intent panggil = new Intent(SplashActivity.this, MainActivity.class);
                startActivity(panggil);
                finish();
            }
        }, 5000);
    }
}
