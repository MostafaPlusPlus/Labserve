package com.project.labserve;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.labserve.R;

public class LabReservation extends Activity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_labreservation);

        TextView show = findViewById(R.id.textView2);

    }
}
