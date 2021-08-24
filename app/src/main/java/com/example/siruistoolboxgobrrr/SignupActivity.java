package com.example.siruistoolboxgobrrr;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.auth.FirebaseAuth;

public class SignupActivity extends AppCompatActivity {

    private EditText mName;
    private EditText mEmail;
    private EditText mPass;
    private EditText mUserName;
        private Button mSignUp;
    private FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        mName = findViewById(R.id.etNameSignup);
        mEmail = findViewById(R.id.etEmailSignup);
        mPass = findViewById(R.id.etPasswordSignup);
        mAuth = FirebaseAuth.getInstance();
        mSignUp = findViewById(R.id.btGo);
        mUserName = findViewById(R.id.etUserName);


        //if there is a current user
        if (mAuth.getCurrentUser() != null) {
            startActivity(new Intent(getApplicationContext(), MainActivity.class));
            finish();
            //redirect user to main activity
        }
        //https://www.youtube.com/watch?v=Z-RE1QuUWPg

    }
}