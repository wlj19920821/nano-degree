package com.example.android.mynanodegreeapps;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    ;
    public void showToastMessage(String text) {
        int duration = Toast.LENGTH_SHORT;
        Context context = getApplicationContext();
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }
    public void sendMessage1(View view) {
        showToastMessage("This button will launch my spotify streamer app!");
    }
    public void sendMessage2(View view) {
        showToastMessage("This button will launch my scores app!");
    }
    public void sendMessage3(View view) {
        showToastMessage("This button will launch my library app!");
    }
    public void sendMessage4(View view) {
        showToastMessage("This button will launch my build it bigger app!");
    }
    public void sendMessage5(View view) {
       showToastMessage("This button will launch my xyz reader app!");
    }

}
