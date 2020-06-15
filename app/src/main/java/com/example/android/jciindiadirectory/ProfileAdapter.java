package com.example.android.jciindiadirectory;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ProfileAdapter extends RecyclerView.Adapter<ProfileAdapter.ProfileViewHolder> {
    private ArrayList<ProfileList> mProfileList;


    public static class ProfileViewHolder extends RecyclerView.ViewHolder{
        public ImageView mImageView;
        public TextView mProfileName,mProfileTitle,mHouseName,mPhoneNumber,mEmail,mAddress;


        public ProfileViewHolder(@NonNull View itemView) {
            super(itemView);
            mImageView =itemView.findViewById(R.id.image_propic);
            mProfileName =itemView.findViewById(R.id.name_tv);
            mProfileTitle =itemView.findViewById(R.id.designation_tv);
            mHouseName =itemView.findViewById(R.id.house_name_tv);
            mPhoneNumber =itemView.findViewById(R.id.phone_number_tv);
            mEmail =itemView.findViewById(R.id.email_tv);
            mAddress =itemView.findViewById(R.id.address_tv);



        }
    }

    @NonNull
    @Override
    public ProfileViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View viewProfile = LayoutInflater.from(parent.getContext()).inflate(R.layout.ngbprofile_card_container,parent,false);
        ProfileAdapter.ProfileViewHolder pvh = new ProfileAdapter.ProfileViewHolder(viewProfile);
        return pvh;
    }
    public ProfileAdapter( ArrayList<ProfileList> profileArrayList){
        mProfileList =profileArrayList;
    }

    @Override
    public void onBindViewHolder(@NonNull ProfileViewHolder holder, int position) {
        ProfileList currentProfile = mProfileList.get(position);
        holder.mImageView.setImageResource(currentProfile.getmImageProfile());
        holder.mPhoneNumber.setText(currentProfile.getmPhoneNumber());
        holder.mProfileName.setText(currentProfile.getmName());
        holder.mProfileTitle.setText(currentProfile.getmTitle());
        holder.mEmail.setText(currentProfile.getmEmail());
        holder.mHouseName.setText(currentProfile.getmHouseName());
        holder.mAddress.setText(currentProfile.getmAddress());
    }

    @Override
    public int getItemCount() {
        return mProfileList.size();
    }
}
