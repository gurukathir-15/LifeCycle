package com.example.user.lifecycle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {


   private int arr[] = new int[6];
    public String printI(int i) {
       arr[i] = ++ arr[i];
        return Integer.toString(arr[i]);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("method onCreate  ", printI(0));
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onStart() {
        super.onStart();

        Log.d("method onStart ", printI(1));
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("method onResume", printI(2));
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("method onPause", printI(3));
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("method onStop", printI(4));
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("method onDestroy", printI(5));
    }
}


