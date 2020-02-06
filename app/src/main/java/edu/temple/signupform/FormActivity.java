package edu.temple.signupform;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class FormActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void confirmMessage(View v)
    {
        EditText name = findViewById(R.id.nameInput);
        EditText password1 = findViewById(R.id.passwordInput);
        EditText password2 = findViewById(R.id.confirmInput);
        EditText email = findViewById(R.id.emailInput);
        String result;

        if (name.getText().toString().equals("")||email.getText().toString().equals("")||password1.getText().toString().equals("")||password2.getText().toString().equals(""))
            result = "Please enter all required information.";
        else if (password1.getText().toString().equals(password2.getText().toString()))
            result = "Welcome, "+name.getText()+", you are now registered.";
        else
            result = "Passwords do not match.";
        Toast confirmMessage = Toast.makeText(getApplicationContext(),result,Toast.LENGTH_SHORT);
        confirmMessage.show();
    }
}
