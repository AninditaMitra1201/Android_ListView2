package com.example.listview2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.List;

    public class MainActivity extends AppCompatActivity {
        String uname[] = {"username1", "username2", "username3", "username4", "username5", "username6", "username7", "username8", "username9", "username10", "username11", "username12", "username13", "username14", "username15"};
        String msg[] = {"This is a sample message", "This is a sample message", "This is a sample message", "This is a sample message", "This is a sample message", "This is a sample message", "This is a sample message", "This is a sample message", "This is a sample message", "This is a sample message", "This is a sample message", "This is a sample message", "This is a sample message", "This is a sample message", "This is a sample message"};
        String time[] = {"09:30 PM", "09:30 PM", "09:30 PM", "09:30 PM", "09:30 PM", "09:30 PM", "09:30 PM", "09:30 PM", "09:30 PM", "09:30 PM", "09:30 PM", "09:30 PM", "09:30 PM", "09:30 PM", "09:30 PM"};
        int dp[] = {R.drawable.tree, R.drawable.tree, R.drawable.tree, R.drawable.tree, R.drawable.tree, R.drawable.tree, R.drawable.tree, R.drawable.tree, R.drawable.tree, R.drawable.tree, R.drawable.tree, R.drawable.tree, R.drawable.tree, R.drawable.tree, R.drawable.tree};
        private List<Oblist> arr;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            ListView myList = findViewById(R.id.myList);

            for (int i = 0; i < uname.length; i++) {
                Oblist oblist = new Oblist(uname[i], msg[i], time[i], dp[i]);
                arr.add(oblist);
            }
            MyArrayAdapter myAdapter = new MyArrayAdapter(this,R.layout.chatview,arr);
            myList.setAdapter(myAdapter);
        }
    }