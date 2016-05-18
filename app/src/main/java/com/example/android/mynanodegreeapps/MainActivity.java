package com.example.android.mynanodegreeapps;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    ;
    public void sendMessage(View view) {
        CharSequence text = "This button will launch my capstone app!";
        int duration = Toast.LENGTH_SHORT;
        Context context = getApplicationContext();
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }
    public void sendMessage1(View view) {
        CharSequence text = "This button will launch my spotify streamer app!";
        int duration = Toast.LENGTH_SHORT;
        Context context = getApplicationContext();
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }
    public void sendMessage2(View view) {
        CharSequence text = "This button will launch my scores app!";
        int duration = Toast.LENGTH_SHORT;
        Context context = getApplicationContext();
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }
    public void sendMessage3(View view) {
        CharSequence text = "This button will launch my library app!";
        int duration = Toast.LENGTH_SHORT;
        Context context = getApplicationContext();
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }
    public void sendMessage4(View view) {
        CharSequence text = "This button will launch my build it bigger app!";
        int duration = Toast.LENGTH_SHORT;
        Context context = getApplicationContext();
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }
    public void sendMessage5(View view) {
        CharSequence text = "This button will launch my xyz reader app!";
        int duration = Toast.LENGTH_SHORT;
        Context context = getApplicationContext();
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }

}
