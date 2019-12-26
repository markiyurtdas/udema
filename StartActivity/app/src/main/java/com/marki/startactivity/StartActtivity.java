package com.marki.startactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.marki.startactivity.model.Course;
import com.marki.startactivity.model.User;
import com.marki.startactivity.model.Video;

import java.util.HashMap;

public class StartActtivity extends AppCompatActivity {


    public static HashMap<String, Course> courseList = new HashMap<>();
    public static HashMap<String, Video> videoList = new HashMap<>();
    public static HashMap<String, User> userList = new HashMap<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_acttivity);



    }



}
