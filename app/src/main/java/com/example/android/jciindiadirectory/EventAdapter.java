package com.example.android.jciindiadirectory;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class EventAdapter extends RecyclerView.Adapter<EventAdapter.EventViewHolder> {
    private ArrayList<Event> mEventList;
    private OnItemClickListener mListener;



    public interface OnItemClickListener {
//        void onItemClick(int position);

        void onButtonClick(int position);
    }
    public void setOnItemClickListener(OnItemClickListener listener) {
        mListener = listener;
    }

    @NonNull
    @Override
    public EventViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.event_recyclerview_layout,parent,false);
        EventViewHolder evh = new EventViewHolder(v,mListener);
        return evh;
    }

    @Override
    public void onBindViewHolder(@NonNull EventViewHolder holder, int position) {

            Event currentEvent = mEventList.get(position);
            holder.mTitle.setText(currentEvent.getTitle());
            holder.mDescription.setText(currentEvent.getDescription());


    }
    public EventAdapter(ArrayList<Event> eventArrayList){
        mEventList =eventArrayList;
    }

    @Override
    public int getItemCount() {
        return mEventList.size();
    }

    public static class EventViewHolder extends RecyclerView.ViewHolder{

        public TextView mTitle,mDescription;


        public EventViewHolder(@NonNull View itemView,final OnItemClickListener listener) {
            super(itemView);
            mDescription = itemView.findViewById(R.id.tv_event_container);
            mTitle =itemView.findViewById(R.id.tv_event_title);
            mTitle.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (listener != null) {
                        int position = getAdapterPosition();
                        if (position != RecyclerView.NO_POSITION) {
                            listener.onButtonClick(position);

                        }

                    }

                }
            });
        }






    }


}
