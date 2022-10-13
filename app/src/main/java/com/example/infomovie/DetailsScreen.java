package com.example.infomovie;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import androidx.appcompat.app.AppCompatActivity;

public class DetailsScreen extends AppCompatActivity {

    TextView title, overview, rating, dates;
    ImageView image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details_screen);
        Intent intentMovie = getIntent();
        Bundle bundle = intentMovie.getExtras();
       title = findViewById(R.id.title_detail);
       overview = findViewById(R.id.overview_detail);
       rating = findViewById(R.id.rating_detail);
       dates = findViewById(R.id.date_detail);
        image = findViewById(R.id.image_detail);

        Glide.with(this)
                .load(bundle.get("large_image"))
                .into(image);

     title.setText(bundle.get("title").toString());
     overview.setText(bundle.get("overview").toString());
     rating.setText(bundle.get("rating").toString());
     dates.setText(bundle.get("date").toString());


    }
}