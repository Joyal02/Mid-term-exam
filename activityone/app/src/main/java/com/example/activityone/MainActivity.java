package com.example.activityone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {
    private Button activitytwobtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        activitytwobtn = (Button) findViewById(R.id.activitytwobtn);
activitytwobtn.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        openActivity2();
    }
});
    }
    public void openActivity2() {
        Intent intent = new Intent(this, Activity2.class);
        startActivity(intent);
    }
}