package com.example.timeconvertor2;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class MainActivity extends AppCompatActivity {

    Button convertButton;
    TextView resultTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        convertButton = findViewById(R.id.convertButton);
        resultTextView = findViewById(R.id.resultTextView);

        convertButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm");
                dateFormat.setTimeZone(TimeZone.getTimeZone("Europe/Brussels"));
                Date belgiumTime = new Date();
                String belgiumTimeStr = dateFormat.format(belgiumTime);

                dateFormat.setTimeZone(TimeZone.getTimeZone("Asia/Karachi"));
                Date pakistanTime = new Date();
                String pakistanTimeStr = dateFormat.format(pakistanTime);

                resultTextView.setText("Belgium Time: " + belgiumTimeStr + " ---> Pakistan Time: " + pakistanTimeStr);
            }
   });
}
}