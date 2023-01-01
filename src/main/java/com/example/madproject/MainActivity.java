 package com.example.madproject;

 import android.content.Intent;
 import android.os.Bundle;
 import android.os.Handler;
 import android.view.WindowManager;
 import android.view.animation.Animation;
 import android.view.animation.AnimationUtils;
 import android.widget.ImageView;
 import android.widget.TextView;

 import androidx.appcompat.app.AppCompatActivity;


 public class MainActivity extends AppCompatActivity {
    ImageView splashImage;
    TextView splashText;
    Animation top,bottom;
     private static int SPLASH_SCREEN=2500;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);
        splashImage=findViewById(R.id.splashImage);
        splashText=findViewById(R.id.splashText);
        top= AnimationUtils.loadAnimation(this,R.anim.top);
        bottom=AnimationUtils.loadAnimation(this,R.anim.bottom);

        splashImage.setAnimation(top);
        splashText.setAnimation(bottom);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent=new Intent(MainActivity.this,MainActivity2.class);
                startActivity(intent);
                finish();
            }
        }, SPLASH_SCREEN);

    }
}
