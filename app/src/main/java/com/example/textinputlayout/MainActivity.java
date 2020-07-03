package com.example.textinputlayout;

import androidx.appcompat.app.AppCompatActivity;

import android.nfc.Tag;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Object Tag;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ViewGroup container = findViewById(R.id.container);
        mytextview tv = new mytextview(this,"purple",android.R.color.holo_purple);
        container.addView(tv);

    }

    public  void clickHandler(View view){

        Toast.makeText(this, R.string.hello, Toast.LENGTH_LONG).show();
    }
}
