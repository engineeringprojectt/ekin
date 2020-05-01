package com.ekinyavasca.engineeringproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;

public class HomeActivity extends AppCompatActivity {
    private FirebaseAuth mAuth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        mAuth = FirebaseAuth.getInstance();
        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference myRef = database.getReference(mAuth.getCurrentUser().getUid());

        myRef=database.getReference(mAuth.getCurrentUser().getUid()).child("Instructor").child("Lecture").child("CSE224").child("Section").child("1");
        ValueEventListener postListener = new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                 List<Student> data=new ArrayList<>();
                 for(DataSnapshot dataSnapshot1:dataSnapshot.getChildren()){
                     Student inst=dataSnapshot1.getValue(Student.class);
                    data.add(inst);
                     Log.i("TEST DATA",data.get(0).getName());
                 }
            }
            @Override
            public void onCancelled(DatabaseError databaseError) {
        }  };
                 myRef.addValueEventListener(postListener);
    }
}
