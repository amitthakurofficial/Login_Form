package com.example.thakurshab.login_form;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public void onclick(View view)
    {
        String editText=((EditText)findViewById(R.id.editText)).getText().toString();
        String editText2=((EditText)findViewById(R.id.editText2)).getText().toString();
        String editText3=((EditText)findViewById(R.id.editText3)).getText().toString();
        String editText4=((EditText)findViewById(R.id.editText4)).getText().toString();
        String editText5=((EditText)findViewById(R.id.editText5)).getText().toString();
    if(editText.equals("")||editText2.equals("")||editText3.equals("")||editText4.equals("")||editText5.equals(""))
        Toast.makeText(this, "Fill all feild First!!", Toast.LENGTH_SHORT).show();
    else

        Toast.makeText(this, "okay thank you",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
