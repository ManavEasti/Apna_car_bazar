package com.rcceasti.car3;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.smarteist.autoimageslider.SliderView;

public class MainActivity extends AppCompatActivity {

    SliderView sliderView, sliderView1, sliderView2, sliderView3,sliderView4,sliderView5, sliderView6, sliderView7,sliderView8,sliderView9;
    int TotalCounts;
    BottomNavigationView bottomNavigationView;
    boolean doubleBackToExitPressedOnce = false;
    Button call1,call2,call3,call4,call5,call6,call7,call8,call9,call10;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        call1 = (Button) findViewById(R.id.call1);
        call2 = (Button) findViewById(R.id.call2);
        call3= (Button) findViewById(R.id.call3);
        call4= (Button) findViewById(R.id.call4);
        call5= (Button) findViewById(R.id.call5);
        call6= (Button) findViewById(R.id.call6);
        call7= (Button) findViewById(R.id.call7);
        call8= (Button) findViewById(R.id.call8);
        call9= (Button) findViewById(R.id.call9);
        call10= (Button) findViewById(R.id.call10);

        sliderView = findViewById(R.id.imageSlider);
        sliderView1 = findViewById(R.id.imageSlider1);
        sliderView2 = findViewById(R.id.imageSlider2);
        sliderView3 = findViewById(R.id.imageSlider3);
        sliderView4 = findViewById(R.id.imageSlider4);
        sliderView5= findViewById(R.id.imageSlider5);
        sliderView6 = findViewById(R.id.imageSlider6);
        sliderView7 = findViewById(R.id.imageSlider7);
        sliderView8 = findViewById(R.id.imageSlider8);
        sliderView9= findViewById(R.id.imageSlider9);



        FirebaseDatabase.getInstance().getReference("Links").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                Long counts = dataSnapshot.getChildrenCount();
                TotalCounts = counts.intValue();

                sliderView.setSliderAdapter(new ImageSliderAdapter(MainActivity.this, TotalCounts));
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });

        FirebaseDatabase.getInstance().getReference("Links1").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                Long counts = dataSnapshot.getChildrenCount();
                TotalCounts = counts.intValue();

                sliderView1.setSliderAdapter(new ImageSliderAdapter1(MainActivity.this, TotalCounts));
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });

        FirebaseDatabase.getInstance().getReference("Links2").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                Long counts = dataSnapshot.getChildrenCount();
                TotalCounts = counts.intValue();

                sliderView2.setSliderAdapter(new ImageSliderAdapter2(MainActivity.this, TotalCounts));
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });

        FirebaseDatabase.getInstance().getReference("Links3").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                Long counts = dataSnapshot.getChildrenCount();
                TotalCounts = counts.intValue();

                sliderView3.setSliderAdapter(new ImageSliderAdapter3(MainActivity.this, TotalCounts));
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });

        FirebaseDatabase.getInstance().getReference("Links4").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                Long counts = dataSnapshot.getChildrenCount();
                TotalCounts = counts.intValue();

                sliderView4.setSliderAdapter(new ImageSliderAdapter4(MainActivity.this, TotalCounts));
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });

        FirebaseDatabase.getInstance().getReference("Links5").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                Long counts = dataSnapshot.getChildrenCount();
                TotalCounts = counts.intValue();

                sliderView5.setSliderAdapter(new ImageSliderAdapter5(MainActivity.this, TotalCounts));
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });

        FirebaseDatabase.getInstance().getReference("Links6").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                Long counts = dataSnapshot.getChildrenCount();
                TotalCounts = counts.intValue();

                sliderView6.setSliderAdapter(new ImageSliderAdapter6(MainActivity.this, TotalCounts));
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });

        FirebaseDatabase.getInstance().getReference("Links7").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                Long counts = dataSnapshot.getChildrenCount();
                TotalCounts = counts.intValue();

                sliderView7.setSliderAdapter(new ImageSliderAdapter7(MainActivity.this, TotalCounts));
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });

        FirebaseDatabase.getInstance().getReference("Links8").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                Long counts = dataSnapshot.getChildrenCount();
                TotalCounts = counts.intValue();

                sliderView8.setSliderAdapter(new ImageSliderAdapter8(MainActivity.this, TotalCounts));
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });

        FirebaseDatabase.getInstance().getReference("Links9").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                Long counts = dataSnapshot.getChildrenCount();
                TotalCounts = counts.intValue();

                sliderView9.setSliderAdapter(new ImageSliderAdapter9(MainActivity.this, TotalCounts));
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
















        call1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel: 8839640035"));
                startActivity(intent);
            }
        });  call2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel: 8839640035"));
                startActivity(intent);
            }
        });  call3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel: 8839640035"));
                startActivity(intent);
            }
        });  call4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel: 8839640035"));
                startActivity(intent);
            }
        });  call5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel: 8839640035"));
                startActivity(intent);
            }
        });
        call6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel: 8839640035"));
                startActivity(intent);
            }
        });
        call7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel: 8839640035"));
                startActivity(intent);
            }
        });
        call8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel: 8839640035"));
                startActivity(intent);
            }
        });
        call9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel: 8839640035"));
                startActivity(intent);
            }
        });
        call10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel: 8839640035"));
                startActivity(intent);
            }
        });




















        bottomNavigationView = (BottomNavigationView) findViewById(R.id.bottom_navigation_view);
        bottomNavigationView.setSelectedItemId(R.id.action_homepage);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {

                switch (menuItem.getItemId()) {

                    case R.id.action_homepage:

                        break;

                    case R.id.action_viewlist:

                        startActivity(new Intent(getApplicationContext(),TopCars.class));

                        break;


                    case R.id.action_profile:
                        startActivity(new Intent(getApplicationContext(),profile.class));


                        break;

                }
                return true;
            }
        });




    }

    @Override public void onBackPressed() { if (doubleBackToExitPressedOnce)
    { super.onBackPressed(); Intent intent = new Intent(Intent.ACTION_MAIN);
        intent.addCategory(Intent.CATEGORY_HOME); intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent); finish(); System.exit(0); return; }
        this.doubleBackToExitPressedOnce = true;
        Toast.makeText(this, "Please click BACK again to exit", Toast.LENGTH_SHORT).show();
        new Handler().postDelayed(new Runnable()
        { @Override public void run() { doubleBackToExitPressedOnce=false; } }, 2000); }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.share_menu,menu);
        return super.onCreateOptionsMenu(menu);



    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.share:
                Intent sharingIntent = new Intent(Intent.ACTION_SEND);
                sharingIntent.setType("text/plain");
                String shareBody = "https://drive.google.com/open?id=1xa5KUu6JUB7VL7ggoaYdz-O3BT43NC3C";
                String shareSubject = "Apna Car Bazar";

                sharingIntent.putExtra(Intent.EXTRA_TEXT, shareBody);
                sharingIntent.putExtra(Intent.EXTRA_SUBJECT, shareSubject);

                startActivity(Intent.createChooser(sharingIntent, "Share with"));

                break;

        }


        return super.onOptionsItemSelected(item);

    }

}