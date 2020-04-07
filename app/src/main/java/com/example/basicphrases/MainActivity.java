package com.example.basicphrases;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    String TAG = "Project";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void playPhrase(View view) {
        //Triggers when a button is pressed
        Button buttonPressed = (Button) view;
        Log.w(TAG, "Button Pressed:" + buttonPressed.getTag().toString());
        //This code allows the media player to take the name directly from the button tag and play that specific file
        MediaPlayer mediaPlayer = MediaPlayer.create(this,getResources().getIdentifier(buttonPressed.getTag().toString(), "raw", getPackageName()));
       //starts the playing of the media
        mediaPlayer.start();

    }
}


