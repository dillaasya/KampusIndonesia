package com.dicoding.kampusindonesia;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvKampus;
    private ArrayList<Kampus> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvKampus = findViewById(R.id.rv_kampus);
        rvKampus.setHasFixedSize(true);

        list.addAll(KampusData.getListData());

        showRecyclerList();
    }
    private void showRecyclerList(){
        rvKampus.setLayoutManager(new LinearLayoutManager(this));
        Adapter kampusAdapter = new Adapter(list);
        rvKampus.setAdapter(kampusAdapter);
        
        //jika salah satu list ditekan
        /*
        listKampusAdapter.setOnItemClickCallback(new Adapter.OnItemClickCallback() {
            @Override
            public void onItemClicked(Kampus kampus) {
                Intent moveIntent = new Intent(MainActivity.this,DetailKampus.class);
                moveIntent.putExtra(DetailKampus.ITEM_EXTRA, (Parcelable) kampus);
                startActivity(moveIntent);
            }
        });*/
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        setMode(item.getItemId());
        return super.onOptionsItemSelected(item);
    }

    public void setMode(int selectedMode) {
        if (selectedMode == R.id.action_about) {
            Intent moveIntent = new Intent(MainActivity.this, Tentang.class);
            startActivity(moveIntent);
        }


    }
}