package com.example.addno;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private TextView textView;
    private Button button;
    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView=findViewById(R.id.textView);
        textView=findViewById(R.id.textView2);
        textView=findViewById(R.id.textView3);
        button=findViewById(R.id.button);
        editText=findViewById(R.id.editTextNumber);
        editText=findViewById(R.id.editTextNumber2);

        
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

//                int textView=Integer.parseInt(editText.getText().toString());
//                int textView2=Integer.parseInt(editText.getText().toString());
                int sum=Integer.parseInt(editText.getText().toString()+editText.getText().toString());


                editText.setText("add of two numbers is"+sum);

                Toast.makeText(MainActivity.this, "Thanks for choosing this app", Toast.LENGTH_SHORT).show();
            }
        });


    }
}