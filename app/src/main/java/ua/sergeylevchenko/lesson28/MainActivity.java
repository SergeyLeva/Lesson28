package ua.sergeylevchenko.lesson28;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;


public class MainActivity extends AppCompatActivity {

    private double lng;
    private double lat;

    public MainActivity() {
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String geoUri = String.format("geo:%s,%s?z=15", Double.toString(lat), Double.toString(lng));
        Intent geoIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(geoUri));

        if (geoIntent.resolveActivity(getPackageManager()) != null) {
            startActivity(geoIntent);
        }
    }

}