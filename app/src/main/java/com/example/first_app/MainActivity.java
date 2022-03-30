package com.example.first_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import android.widget.Button;
import android.widget.TextView;
import android.widget.EditText;

import com.google.firebase.auth.FirebaseAuth;


public class MainActivity extends AppCompatActivity {
private Button button;
private TextView textView;
private EditText editText;
    private android.view.View.OnClickListener View;
    FirebaseAuth auth;

    //  TextView text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
Toast.makeText(this, "Hii!!", Toast.LENGTH_SHORT).show();
button = findViewById(R.id.button5);
textView=findViewById(R.id.textView11);
editText=findViewById(R.id.editTextTextPersonName8);


//button.setOnClickListener(new View.OnClickListener(){
//@Override
//    public void onClick(View view){
//    Toast.makeText(MainActivity.this
//            , "Claculating", Toast.LENGTH_SHORT).show();
//    String s = editText.getText().toString();
//    int kg=Integer.parseInt(s);
//    double pound= 2.20462*kg;
//    textView.setText("        The corresponding value in pound is "+pound);
//}a
//});

    }
    public void calculate(View view){
        String s = editText.getText().toString();
        int kg=Integer.parseInt(s);
        double pound= 2.20462*kg;
        textView.setText("   The corresponding value in pound is "+pound);
    }
}