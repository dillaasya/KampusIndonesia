package com.dicoding.kampusindonesia;

import android.os.Bundle;
import android.widget.ImageView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

public class Tentang extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.about);

        ImageView imgProfile = findViewById(R.id.foto_profil);

        int image = R.drawable.profilnew;

        Glide.with(this)
                .load(image)
                .apply(new RequestOptions().override(300,300))
                .into(imgProfile);

        if (getSupportActionBar() != null){
            getSupportActionBar().setTitle("About");
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }


    }
    @Override
    public boolean onSupportNavigateUp(){
        finish();
        return true;
    }
}
