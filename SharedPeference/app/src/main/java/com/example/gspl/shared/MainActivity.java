package com.example.gspl.shared;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText edit1;
    EditText edit2;
    EditText edit3;
    EditText edit4;
    Button button;
    SharedPreferences sharedPreferences;
    SharedPreferences.Editor editor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edit1=findViewById(R.id.edt1);
        edit2=findViewById(R.id.edt2);
        edit3=findViewById(R.id.edt3);
        edit4=findViewById(R.id.edt4);
        button=findViewById(R.id.but);

        sharedPreferences=getSharedPreferences("hello",MODE_PRIVATE);

        editor=sharedPreferences.edit();




        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent n=new Intent(MainActivity.this,Main2Activity.class);

                startActivity(n);




                String d1=edit1.getText().toString();
                String d2=edit2.getText().toString();
                String d3=edit3.getText().toString();
                String d4=edit4.getText().toString();

                editor.putString("hell",d1);
                editor.putString("hel",d2);
                editor.putString("he",d3);
                editor.putString("h",d4);

                editor.commit();

                Toast.makeText(MainActivity.this, "saved", Toast.LENGTH_SHORT).show();






            }
        });

    }
}
