package com.dicoding.kampusindonesia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

public class DetailKampus extends AppCompatActivity {

    public static final String ITEM_EXTRA = "item_extra";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_kampus);
/*
        ImageView imgPhoto = findViewById(R.id.imgPhoto);
        TextView tvName = findViewById(R.id.tvName);
        TextView tvDetail = findViewById(R.id.tvDetail);

        Kampus kampus = getIntent().getParcelableExtra(ITEM_EXTRA);

        int imageResuorce= getResources().getIdentifier(kampus.getPhoto(), null, getPackageName());

        Glide.with(this)
                .load(imageResuorce)
                .apply(new RequestOptions().override(150,150))
                .into(imgPhoto);
        tvName.setText(kampus.getName());
        tvDetail.setText(kampus.getDetail());


        if (getSupportActionBar() != null){
            getSupportActionBar().setTitle("Detail");
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }*/
    }
}