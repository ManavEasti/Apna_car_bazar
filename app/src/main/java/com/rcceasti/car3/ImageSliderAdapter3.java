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

public class ImageSliderAdapter3 extends SliderViewAdapter<SliderViewHolder3>{

    Context context;
    int setTotalCount;
    String ImageLink;

    public ImageSliderAdapter3(Context context, int setTotalCount){
        this.setTotalCount = setTotalCount;
        this.context = context;
    }


    @Override
    public SliderViewHolder3 onCreateViewHolder(ViewGroup parent) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.slider_layout3,parent,false);
        return new SliderViewHolder3(view);
    }


    @Override
    public void onBindViewHolder(final SliderViewHolder3 viewHolder, final int position) {
        FirebaseDatabase.getInstance().getReference("Links3").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
             switch (position){
                 case 0:
                     ImageLink = dataSnapshot.child("1").getValue().toString();
                     Glide.with(viewHolder.itemView).load(ImageLink).into(viewHolder.sliderImageView3);
                     break;
                 case 1:
                     ImageLink = dataSnapshot.child("2").getValue().toString();
                     Glide.with(viewHolder.itemView).load(ImageLink).into(viewHolder.sliderImageView3);
                     break;
                 case 2:
                     ImageLink = dataSnapshot.child("3").getValue().toString();
                     Glide.with(viewHolder.itemView).load(ImageLink).into(viewHolder.sliderImageView3);
                     break;
                 case 3:
                     ImageLink = dataSnapshot.child("4").getValue().toString();
                     Glide.with(viewHolder.itemView).load(ImageLink).into(viewHolder.sliderImageView3);
                     break;
                 case 4:
                     ImageLink = dataSnapshot.child("5").getValue().toString();
                     Glide.with(viewHolder.itemView).load(ImageLink).into(viewHolder.sliderImageView3);
                     break;
                 case 5:
                     ImageLink = dataSnapshot.child("6").getValue().toString();
                     Glide.with(viewHolder.itemView).load(ImageLink).into(viewHolder.sliderImageView3);
                     break;
                 case 6:
                     ImageLink = dataSnapshot.child("7").getValue().toString();
                     Glide.with(viewHolder.itemView).load(ImageLink).into(viewHolder.sliderImageView3);
                     break;
                 case 7:
                     ImageLink = dataSnapshot.child("8").getValue().toString();
                     Glide.with(viewHolder.itemView).load(ImageLink).into(viewHolder.sliderImageView3);
                     break;
                 case 8:
                     ImageLink = dataSnapshot.child("9").getValue().toString();
                     Glide.with(viewHolder.itemView).load(ImageLink).into(viewHolder.sliderImageView3);
                     break;
                 case 9:
                     ImageLink = dataSnapshot.child("10").getValue().toString();
                     Glide.with(viewHolder.itemView).load(ImageLink).into(viewHolder.sliderImageView3);
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

class SliderViewHolder3 extends SliderViewAdapter.ViewHolder {
    ImageView sliderImageView3;
    View itemview3;
    public SliderViewHolder3(View itemView) {
        super(itemView);
        this.itemview3 = itemView;
        sliderImageView3 = itemView.findViewById(R.id.imageView3);
    }
}
