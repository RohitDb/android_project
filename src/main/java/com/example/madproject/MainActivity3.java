package com.example.madproject;

import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.madproject.databinding.ActivityMain3Binding;
import android.app.Fragment;
public class MainActivity3 extends AppCompatActivity {
Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        /*
    button=findViewById(R.id.signout);
    button.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            FirebaseAuth.getInstance().signOut();
            Intent i=new Intent(MainActivity3.this,MainActivity2.class);
            startActivity(i);


        }
    }); */
    }


}