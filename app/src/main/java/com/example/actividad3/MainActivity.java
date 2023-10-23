package com.example.actividad3;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {
    ProgressBar pb1;
    Button btn1;
    int counter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pb1 = findViewById(R.id.progressBar);
        btn1 = findViewById(R.id.btn_ingresar);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pb1.setVisibility(View.VISIBLE);

                Timer timer = new Timer();
                TimerTask timerTask = new TimerTask() {
                    @Override
                    public void run() {
                        counter++;

                        pb1.setProgress(counter);
                        if(counter == 5){
                            timer.cancel();

                            Intent opcion = new Intent(MainActivity.this, MapActivity.class);
                            startActivity(opcion);
                        }
                    }
                };
                timer.schedule(timerTask, 100, 100);
            }
        });
    }
}