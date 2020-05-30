package com.rcceasti.car3;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.smarteist.autoimageslider.SliderView;

public class TopCars extends AppCompatActivity {

    SliderView sliderView11, sliderView22, sliderView33, sliderView44,sliderView55,sliderView66,sliderView77,sliderView88,sliderView99,sliderView1010;
    int TotalCounts;

    BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_top_cars);


        sliderView11 = findViewById(R.id.Topc1);
        sliderView22 = findViewById(R.id.Topc2);
        sliderView33 = findViewById(R.id.Topc3);
        sliderView44 = findViewById(R.id.Topc4);
        sliderView55 = findViewById(R.id.Topc5);
        sliderView66 = findViewById(R.id.Topc6);
        sliderView77 = findViewById(R.id.Topc7);
        sliderView88 = findViewById(R.id.Topc8);
        sliderView99 = findViewById(R.id.Topc9);
        sliderView1010 = findViewById(R.id.Topc10);



        FirebaseDatabase.getInstance().getReference("Top1").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                Long counts = dataSnapshot.getChildrenCount();
                TotalCounts = counts.intValue();

                sliderView11.setSliderAdapter(new ImageSliderAdapter_tc1(TopCars.this, TotalCounts));
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
        FirebaseDatabase.getInstance().getReference("Top2").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                Long counts = dataSnapshot.getChildrenCount();
                TotalCounts = counts.intValue();

                sliderView22.setSliderAdapter(new ImageSliderAdapter_tc2(TopCars.this, TotalCounts));
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });


        FirebaseDatabase.getInstance().getReference("Top3").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                Long counts = dataSnapshot.getChildrenCount();
                TotalCounts = counts.intValue();

                sliderView33.setSliderAdapter(new ImageSliderAdapter_tc3(TopCars.this, TotalCounts));
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
        FirebaseDatabase.getInstance().getReference("Top4").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                Long counts = dataSnapshot.getChildrenCount();
                TotalCounts = counts.intValue();

                sliderView44.setSliderAdapter(new ImageSliderAdapter_tc4(TopCars.this, TotalCounts));
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
        FirebaseDatabase.getInstance().getReference("Top5").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                Long counts = dataSnapshot.getChildrenCount();
                TotalCounts = counts.intValue();

                sliderView55.setSliderAdapter(new ImageSliderAdapter_tc5(TopCars.this, TotalCounts));
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
        FirebaseDatabase.getInstance().getReference("Top6").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                Long counts = dataSnapshot.getChildrenCount();
                TotalCounts = counts.intValue();

                sliderView66.setSliderAdapter(new ImageSliderAdapter_tc6(TopCars.this, TotalCounts));
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
        FirebaseDatabase.getInstance().getReference("Top7").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                Long counts = dataSnapshot.getChildrenCount();
                TotalCounts = counts.intValue();

                sliderView77.setSliderAdapter(new ImageSliderAdapter_tc7(TopCars.this, TotalCounts));
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
        FirebaseDatabase.getInstance().getReference("Top8").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                Long counts = dataSnapshot.getChildrenCount();
                TotalCounts = counts.intValue();

                sliderView88.setSliderAdapter(new ImageSliderAdapter_tc8(TopCars.this, TotalCounts));
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
        FirebaseDatabase.getInstance().getReference("Top9").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                Long counts = dataSnapshot.getChildrenCount();
                TotalCounts = counts.intValue();

                sliderView99.setSliderAdapter(new ImageSliderAdapter_tc9(TopCars.this, TotalCounts));
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
        FirebaseDatabase.getInstance().getReference("Top10").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                Long counts = dataSnapshot.getChildrenCount();
                TotalCounts = counts.intValue();

                sliderView1010.setSliderAdapter(new ImageSliderAdapter_tc10(TopCars.this, TotalCounts));

            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });





























        bottomNavigationView = (BottomNavigationView) findViewById(R.id.bottom_navigation_view);
        bottomNavigationView.setSelectedItemId(R.id.action_viewlist);



        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {



                switch (menuItem.getItemId()) {

                    case R.id.action_profile:
                        startActivity(new Intent(getApplicationContext(),profile.class));

                        break;

                    case R.id.action_homepage:
                        startActivity(new Intent(getApplicationContext(),MainActivity.class));
                        break;

                    case R.id.action_viewlist:




                        break;

                }
                return true;
            }
        });









    }


    @Override
    public void onBackPressed() {
        super.onBackPressed();
        startActivity(new Intent(getApplicationContext(),MainActivity.class));

    }
}
