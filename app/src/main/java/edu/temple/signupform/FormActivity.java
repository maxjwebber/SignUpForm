package edu.temple.signupform;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class FormActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void confirmMessage(View v)
    {
        Toast confirmMessage = Toast.makeText(getApplicationContext(),"CONFIRMED FOR BRAWL",Toast.LENGTH_SHORT);
        confirmMessage.show();
    }
}
