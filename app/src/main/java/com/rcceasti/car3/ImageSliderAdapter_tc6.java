package com.rcceasti.car3;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;

import com.bumptech.glide.Glide;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.smarteist.autoimageslider.SliderViewAdapter;

public class ImageSliderAdapter_tc6 extends SliderViewAdapter<SliderViewHolder_tc6>{

    Context context;
    int setTotalCount;
    String ImageLink;

    public ImageSliderAdapter_tc6(Context context, int setTotalCount){
        this.setTotalCount = setTotalCount;
        this.context = context;
    }


    @Override
    public SliderViewHolder_tc6 onCreateViewHolder(ViewGroup parent) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.top6,parent,false);
        return new SliderViewHolder_tc6(view);
    }


    @Override
    public void onBindViewHolder(final SliderViewHolder_tc6 viewHolder, final int position) {
        FirebaseDatabase.getInstance().getReference("Top6").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
             switch (position){
                 case 0:
                     ImageLink = dataSnapshot.child("1").getValue().toString();
                     Glide.with(viewHolder.itemView).load(ImageLink).into(viewHolder.sliderImageView_tc6);
                     break;
                 case 1:
                     ImageLink = dataSnapshot.child("2").getValue().toString();
                     Glide.with(viewHolder.itemView).load(ImageLink).into(viewHolder.sliderImageView_tc6);
                     break;
                 case 2:
                     ImageLink = dataSnapshot.child("3").getValue().toString();
                     Glide.with(viewHolder.itemView).load(ImageLink).into(viewHolder.sliderImageView_tc6);
                     break;
                 case 3:
                     ImageLink = dataSnapshot.child("4").getValue().toString();
                     Glide.with(viewHolder.itemView).load(ImageLink).into(viewHolder.sliderImageView_tc6);
                     break;
                 case 4:
                     ImageLink = dataSnapshot.child("5").getValue().toString();
                     Glide.with(viewHolder.itemView).load(ImageLink).into(viewHolder.sliderImageView_tc6);
                     break;
                 case 5:
                     ImageLink = dataSnapshot.child("6").getValue().toString();
                     Glide.with(viewHolder.itemView).load(ImageLink).into(viewHolder.sliderImageView_tc6);

                     break;
                 case 6:
                     ImageLink = dataSnapshot.child("7").getValue().toString();
                     Glide.with(viewHolder.itemView).load(ImageLink).into(viewHolder.sliderImageView_tc6);
                     break;
                 case 7:
                     ImageLink = dataSnapshot.child("8").getValue().toString();
                     Glide.with(viewHolder.itemView).load(ImageLink).into(viewHolder.sliderImageView_tc6);
                     break;
                 case 8:
                     ImageLink = dataSnapshot.child("9").getValue().toString();
                     Glide.with(viewHolder.itemView).load(ImageLink).into(viewHolder.sliderImageView_tc6);
                     break;
                 case 9:
                     ImageLink = dataSnapshot.child("10").getValue().toString();
                     Glide.with(viewHolder.itemView).load(ImageLink).into(viewHolder.sliderImageView_tc6);
                     break;
             }

            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });

    }


    @Override
    public int getCount() {
        return setTotalCount;
    }
}

class SliderViewHolder_tc6 extends SliderViewAdapter.ViewHolder {
    ImageView sliderImageView_tc6;
    View itemview_tc6;
    public SliderViewHolder_tc6(View itemView) {
        super(itemView);
        this.itemview_tc6 = itemView;
        sliderImageView_tc6 = itemView.findViewById(R.id.top66);
    }
}
