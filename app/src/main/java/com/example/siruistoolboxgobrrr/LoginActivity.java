package com.example.siruistoolboxgobrrr;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

import com.google.firebase.auth.FirebaseAuth;

public class LoginActivity extends AppCompatActivity {

    private EditText mEmail;
    private EditText mPass;
    private Button mLogin;
    private Button mGoToSignUp;
    private FirebaseAuth fAuth;
    private TextView forgotpassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        mGoToSignUp = findViewById(R.id.btRegister);
        mGoToSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSignup();
                

            }
        });


//        FirebaseAuth mAuth;
//        mAuth = FirebaseAuth.getInstance();
    }

    private void openSignup() {
        Intent intent = new Intent(this, SignupActivity.class);
        startActivity(intent);
    }
}