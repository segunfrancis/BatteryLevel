package com.example.computer.batterylevel;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private ImageView batteryImage;
    private int imageLevel = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        batteryImage = findViewById(R.id.battery_image);
    }

    private void showToast(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }

    public void increaseBatteryLevel(View view) {
        if (imageLevel == 6) {
            showToast("Can't go any higher");
            return;
        } else {
            imageLevel++;
            batteryImage.setImageLevel(imageLevel);
        }
    }

    public void decreaseBatteryLevel(View view) {
        if (imageLevel == 0) {
            showToast("Can't go any lower");
            return;
        } else {
            imageLevel--;
            batteryImage.setImageLevel(imageLevel);
        }
    }
}
