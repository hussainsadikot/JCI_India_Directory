package com.example.android.jciindiadirectory;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.provider.ContactsContract;
import android.widget.Adapter;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class NGBProfileActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    ProfileAdapter adapter;
    List<ProfileList> profileLists;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_n_g_b_profile);
        recyclerView = findViewById(R.id.recycler_view_profile);
        profileLists = new ArrayList<>();
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));





        ArrayList<ProfileList> profileLists= new ArrayList<>();
        profileLists.add(new ProfileList(R.drawable.ic_android_dp,"1234567890","Abc","engineer","HouseName","example@email.com","Address"));
        profileLists.add(new ProfileList(R.drawable.ic_android_dp,"1234567890","Abc","engineer","HouseName","example@email.com","Address"));
        profileLists.add(new ProfileList(R.drawable.ic_android_dp,"1234567890","Abc","engineer","HouseName","example@email.com","Address"));
        profileLists.add(new ProfileList(R.drawable.ic_android_dp,"1234567890","Abc","engineer","HouseName","example@email.com","Address"));

        adapter = new ProfileAdapter(profileLists);
//        adapter.setOnItemClickListener(new ProfileAdapter().OnItemClickListener() {
//
//            @Override
//            public void onButtonClick(int position) {
//
//                Toast.makeText(NGBProfileActivity.this, "Go to List of Words", Toast.LENGTH_SHORT).show();
////                startActivity(new Intent(MainActivity.this,Main2Activity.class));
//            }
//        });
        recyclerView.setAdapter(adapter);
    }
}
