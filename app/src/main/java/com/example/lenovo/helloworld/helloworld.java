package com.example.lenovo.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class helloworld extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_helloworld);
        Log.i("HelloWorldLife","调用onCreate()");
    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.i("HelloWorldLife","调用onStart()");
    }
    @Override
    protected void onResume() {
        super.onResume();
        Log.i("HelloWorldLife","调用onResume()");
    }
    @Override
    protected void onPause() {
        super.onPause();
        Log.i("HelloWorldLife","调用onPause()");
    }
    @Override
    protected  void onStop() {
        super.onStop();
        Log.i("HelloWorldLife","调用onStop()");
    }
    @Override
    protected  void onDestroy() {
        super.onDestroy();
        Log.i("HelloWorldLife","调用onDestroy()");
    }
    @Override
    protected  void onRestart() {
        super.onRestart();
        Log.i("HelloWorldLife","调用onRestart()");
    }
}
