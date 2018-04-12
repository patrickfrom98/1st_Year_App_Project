package uk.ac.hud.u1756102.parkrun;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class SplashActivity extends AppCompatActivity {
    private TextView textview;
    private ImageView imageview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        textview = (TextView) findViewById(R.id.splash_textview);
        imageview = (ImageView) findViewById(R.id.splash_imageview);

        Animation splashAnim = AnimationUtils.loadAnimation(this, R.anim.splash_animation);
        splashAnim.setRepeatCount(2);
        textview.startAnimation(splashAnim);
        imageview.startAnimation(splashAnim);

        final Intent intent = new Intent(SplashActivity.this, MainActivity.class);
        Thread timer = new Thread() {
            public void run() {
                try {
                    sleep(5000);
                } catch (Exception e) {
                    e.printStackTrace();
                } finally {
                    startActivity(intent);
                    finish();
                }
            }
        };

        timer.start();
    }
}
