package com.rcceasti.car3;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class Sign_up extends AppCompatActivity {

    EditText txtEmail, txtPassword, txtConfirmpassword;
    Button btn_signup;
    private FirebaseAuth FirebaseAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        txtEmail = (EditText) findViewById(R.id.email);
        txtPassword = (EditText) findViewById(R.id.password);
        txtConfirmpassword = (EditText) findViewById(R.id.confirmpassword);
        btn_signup = (Button) findViewById(R.id.button);


        FirebaseAuth = FirebaseAuth.getInstance();

        btn_signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String email = txtEmail.getText().toString().trim();
                String password = txtPassword.getText().toString().trim();
                String confirmpassword = txtConfirmpassword.getText().toString().trim();

                if(TextUtils.isEmpty(email)){
                    Toast.makeText(Sign_up.this, "please enter email", Toast.LENGTH_SHORT).show();
                    return;
                }

                if(TextUtils.isEmpty(password)){
                    Toast.makeText(Sign_up.this, "please enter password", Toast.LENGTH_SHORT).show();
                    return;
                }

                if(TextUtils.isEmpty(confirmpassword)){
                    Toast.makeText(Sign_up.this, "please enter confirm password", Toast.LENGTH_SHORT).show();
                    return;
                }

                if(password.length() <= 8 ){
                    Toast.makeText(Sign_up.this, "please enter minimum 8 characters", Toast.LENGTH_SHORT).show();
                }
                if(password.equals(confirmpassword)){

                    FirebaseAuth.createUserWithEmailAndPassword(email, password)
                            .addOnCompleteListener(Sign_up.this, new OnCompleteListener<AuthResult>() {
                                @Override
                                public void onComplete(@NonNull Task<AuthResult> task) {
                                    if (task.isSuccessful()) {

                                        startActivity(new Intent(getApplicationContext(),MainActivity.class));
                                        Toast.makeText(Sign_up.this, "Sign_up completed", Toast.LENGTH_SHORT).show();

                                    } else {

                                        Toast.makeText(Sign_up.this, "Sign_up Failed", Toast.LENGTH_SHORT).show();



                                    }

                                    // ...
                                }
                            });


                }
            }
        });



    }
}
