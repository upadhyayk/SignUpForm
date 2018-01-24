package edu.temple.signupform;

import android.app.Activity;
import android.content.Intent;
import android.icu.text.DisplayContext;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import org.w3c.dom.Text;
import java.lang.Object;


public class FormActivity extends Activity {

    Button saveButton;
    EditText name;
    EditText email;
    EditText password;
    EditText confirmPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form);

        saveButton = (Button) findViewById(R.id.button);
        name = (EditText) findViewById(R.id.nameText);
        email = (EditText) findViewById(R.id.emailText);
        password = (EditText) findViewById(R.id.passwordText);
        confirmPassword = (EditText) findViewById(R.id.confirmPasswordText);

        saveButton.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {

                String pass = password.getText().toString();
                String cPassword = confirmPassword.getText().toString();
                if (name.getText().toString().isEmpty()) {
                    Toast.makeText(getApplicationContext(), "Please enter all the information", Toast.LENGTH_LONG).show();
                }else if (email.getText().toString().isEmpty()) {
                Toast.makeText(FormActivity.this, "Please enter all the information", Toast.LENGTH_SHORT).show();
                }else if (password.getText().toString().isEmpty()) {
                Toast.makeText(FormActivity.this, "Please enter all the information", Toast.LENGTH_SHORT).show();
                }else if (confirmPassword.getText().toString().isEmpty()) {
                Toast.makeText(FormActivity.this, "Please enter all the information", Toast.LENGTH_SHORT).show();
                }else if(!(pass.equals(cPassword))) {
                Toast.makeText(FormActivity.this, "The passwords do not match", Toast.LENGTH_SHORT).show();
                }else{
                Toast.makeText(FormActivity.this, "The information has been saved", Toast.LENGTH_SHORT).show();
                }

            }
        });
    }
}


