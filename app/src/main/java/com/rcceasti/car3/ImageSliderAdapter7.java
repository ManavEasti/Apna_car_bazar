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

public class ImageSliderAdapter7 extends SliderViewAdapter<SliderViewHolder7>{

    Context context;
    int setTotalCount;
    String ImageLink;

    public ImageSliderAdapter7(Context context, int setTotalCount){
        this.setTotalCount = setTotalCount;
        this.context = context;
    }


    @Override
    public SliderViewHolder7 onCreateViewHolder(ViewGroup parent) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.slider_layout7,parent,false);
        return new SliderViewHolder7(view);
    }


    @Override
    public void onBindViewHolder(final SliderViewHolder7 viewHolder, final int position) {
        FirebaseDatabase.getInstance().getReference("Links7").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
             switch (position){
                 case 0:
                     ImageLink = dataSnapshot.child("1").getValue().toString();
                     Glide.with(viewHolder.itemView).load(ImageLink).into(viewHolder.sliderImageView7);
                     break;
                 case 1:
                     ImageLink = dataSnapshot.child("2").getValue().toString();
                     Glide.with(viewHolder.itemView).load(ImageLink).into(viewHolder.sliderImageView7);
                     break;
                 case 2:
                     ImageLink = dataSnapshot.child("3").getValue().toString();
                     Glide.with(viewHolder.itemView).load(ImageLink).into(viewHolder.sliderImageView7);
                     break;
                 case 3:
                     ImageLink = dataSnapshot.child("4").getValue().toString();
                     Glide.with(viewHolder.itemView).load(ImageLink).into(viewHolder.sliderImageView7);
                     break;
                 case 4:
                     ImageLink = dataSnapshot.child("5").getValue().toString();
                     Glide.with(viewHolder.itemView).load(ImageLink).into(viewHolder.sliderImageView7);
                     break;
                 case 5:
                     ImageLink = dataSnapshot.child("6").getValue().toString();
                     Glide.with(viewHolder.itemView).load(ImageLink).into(viewHolder.sliderImageView7);
                     break;
                 case 6:
                     ImageLink = dataSnapshot.child("7").getValue().toString();
                     Glide.with(viewHolder.itemView).load(ImageLink).into(viewHolder.sliderImageView7);
                     break;
                 case 7:
                     ImageLink = dataSnapshot.child("8").getValue().toString();
                     Glide.with(viewHolder.itemView).load(ImageLink).into(viewHolder.sliderImageView7);
                     break;
                 case 8:
                     ImageLink = dataSnapshot.child("9").getValue().toString();
                     Glide.with(viewHolder.itemView).load(ImageLink).into(viewHolder.sliderImageView7);
                     break;
                 case 9:
                     ImageLink = dataSnapshot.child("10").getValue().toString();
                     Glide.with(viewHolder.itemView).load(ImageLink).into(viewHolder.sliderImageView7);
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

class SliderViewHolder7 extends SliderViewAdapter.ViewHolder {
    ImageView sliderImageView7;
    View itemview7;
    public SliderViewHolder7(View itemView) {
        super(itemView);
        this.itemview7 = itemView;
        sliderImageView7 = itemView.findViewById(R.id.imageView7);
    }
}
