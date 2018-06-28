package ru.startandroid.mixcollors;

import android.graphics.Color;
import android.graphics.ColorSpace;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    private int mixColors(int red, int green, int blue){
         int mix = Color.rgb(red, green, blue);
         return mix;
    }

    int redColor;
    int greenColor;
    int blueColor;

    TextView redText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final LinearLayout layout = findViewById(R.id.layout);
        SeekBar red = findViewById(R.id.red);
        final SeekBar green = findViewById(R.id.green);
        SeekBar blue = findViewById(R.id.blue);
        red.setMax(255);
        green.setMax(255);
        blue.setMax(255);
        redText = findViewById(R.id.redNumber);
        TextView greenText = findViewById(R.id.greenNumber);
        TextView blueText = findViewById(R.id.blueNumber);
        red.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                redColor = progress;
                layout.setBackgroundColor(mixColors(redColor, greenColor, blueColor));
                /*redText.setText(progress);*/
                //es knayes xi chi ashxatum?

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        green.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                greenColor = progress;
                layout.setBackgroundColor(mixColors(redColor, greenColor, blueColor));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        blue.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                blueColor = progress;
                layout.setBackgroundColor(mixColors(redColor, greenColor, blueColor));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

    }
}
