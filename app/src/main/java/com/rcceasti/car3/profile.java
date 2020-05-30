package com.rcceasti.car3;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInClient;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.firebase.auth.FirebaseAuth;

import de.hdodenhof.circleimageview.CircleImageView;

public class profile extends AppCompatActivity {

    FirebaseAuth firebaseAuth;

    CircleImageView imageView;
    TextView name;
    Button contact,contact2,contact3,contact4 ;

    BottomNavigationView bottomNavigationView;

    GoogleSignInClient FirebaseGoogleSignInClient;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);


        firebaseAuth =FirebaseAuth.getInstance();

        setContentView(R.layout.activity_profile);

        imageView = (CircleImageView) findViewById(R.id.profilepic);
        name= (TextView) findViewById(R.id.Name);
        contact=(Button) findViewById(R.id.contact);
        contact2= (Button) findViewById(R.id.contact2);
        contact3=(Button) findViewById(R.id.contact3);
        contact4=(Button) findViewById(R.id.contact4);










        GoogleSignInAccount acct = GoogleSignIn.getLastSignedInAccount(this);
        if (acct != null) {
            String personName = acct.getDisplayName();

            Uri personPhoto = acct.getPhotoUrl();



            name.setText(personName);


            Glide.with(this).load(String.valueOf(personPhoto)).into(imageView);

    }








        contact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel: 9340812334"));
                startActivity(intent);
            }
        });

        contact2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel: 9685637303"));
                startActivity(intent);

            }
        });


        contact3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel: 8839640035"));
                startActivity(intent);

            }
        });

        contact4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel: 6263938177"));
                startActivity(intent);
            }
        });

        bottomNavigationView = (BottomNavigationView) findViewById(R.id.bottom_navigation_view);
        bottomNavigationView.setSelectedItemId(R.id.action_profile);



        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {



                switch (menuItem.getItemId()) {

                    case R.id.action_profile:


                        break;

                    case R.id.action_homepage:
                        startActivity(new Intent(getApplicationContext(),MainActivity.class));
                        break;

                    case R.id.action_viewlist:
                        startActivity(new Intent(getApplicationContext(),TopCars.class));



                        break;

                }
                return true;
            }
        });




        }

    public void signOut() {
        // [START auth_sign_out]
        FirebaseAuth.getInstance().signOut();
        startActivity(new Intent(getApplicationContext(),Sign_up.class));
        // [END auth_sign_out]



    }


    @Override
    public void onBackPressed() {
        super.onBackPressed();
        startActivity(new Intent(getApplicationContext(),MainActivity.class));

    }



}
