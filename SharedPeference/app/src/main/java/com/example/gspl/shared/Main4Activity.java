package com.example.gspl.shared;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main4Activity extends AppCompatActivity {
    TextView text1;
    TextView text2;
    TextView text3;
    TextView text4;
    SharedPreferences sharedPreferences;
    SharedPreferences.Editor editor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        text1=findViewById(R.id.txt1);
        text2=findViewById(R.id.txt2);
        text3=findViewById(R.id.txt3);
        text4=findViewById(R.id.txt4);

        sharedPreferences=getSharedPreferences("hello",MODE_PRIVATE);
        editor=sharedPreferences.edit();

        String s1=sharedPreferences.getString("hell","delvalue");
        String s2=sharedPreferences.getString("hel","delvalue");
        String s3=sharedPreferences.getString("he","delvalue");
        String s4=sharedPreferences.getString("h","delvalue");

        text1.setText(s1);
        text2.setText(s2);
        text3.setText(s3);
        text4.setText(s4);



    }
}
