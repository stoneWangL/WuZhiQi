package com.example.stonewang.wuzhiqi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private WuzhiqiPanel wuzhiqiPanel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        wuzhiqiPanel = (WuzhiqiPanel) findViewById(R.id.id_wuziqi);
        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                wuzhiqiPanel.start();
            }
        });
    }
}
