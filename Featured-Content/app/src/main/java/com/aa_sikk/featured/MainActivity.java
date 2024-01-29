package com.aa_sikk.featured;

import android.os.Bundle;
import android.view.MenuItem;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.material.bottomnavigation.BottomNavigationView;


public class MainActivity extends AppCompatActivity
        implements BottomNavigationView
        .OnNavigationItemSelectedListener {

    BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottomNavigationView
                = findViewById(R.id.bottomNavigationView);

        bottomNavigationView
                .setOnNavigationItemSelectedListener(this);
        bottomNavigationView.setSelectedItemId(R.id.video);
    }
    VideosFrag videosFrag = new VideosFrag();
    ArticlesFrag articlesFrag = new ArticlesFrag();

    @Override
    public boolean
    onNavigationItemSelected(@NonNull MenuItem item)
    {

        int itemId = item.getItemId();
        if (itemId == R.id.video) {
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.flFragment, videosFrag)
                    .commit();
            return true;
        } else if (itemId == R.id.article) {
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.flFragment, articlesFrag)
                    .commit();
            return true;
        }
        return false;
    }
}
