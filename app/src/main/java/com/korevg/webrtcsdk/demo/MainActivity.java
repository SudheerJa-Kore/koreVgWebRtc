package com.korevg.webrtcsdk.demo;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.korevg.mv.webrtcsdk.session.AudioCodesSession;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView sdkStatus = findViewById(R.id.sdk_status);
        sdkStatus.setText(getString(R.string.sdk_linked, AudioCodesSession.class.getSimpleName()));
    }
}
