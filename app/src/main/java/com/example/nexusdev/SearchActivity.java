package com.example.nexusdev;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class SearchActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getSupportActionBar().hide();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);
        Fragment fragment = new SearchFragment();
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.startFragment, fragment);
        fragmentTransaction.commit();
    }

    public void CardSearch(View view)
    {
        Context context = getApplicationContext();
        CharSequence text = "Недоступно";
        int duration = Toast.LENGTH_SHORT;
        Toast.makeText(context, text, duration).show();
    }

    public void MainButton(View view)
    {
        Intent intent = new Intent(SearchActivity.this, MainActivity.class);
        startActivity(intent);
    }

    public void SearchButton(View view)
    {
        Intent intent = new Intent(SearchActivity.this, SearchActivity.class);
        startActivity(intent);
    }

    public void StorageButton(View view)
    {
        Intent intent = new Intent(SearchActivity.this, StorageActivity.class);
        startActivity(intent);
    }

    public void AccountButton(View view)
    {
        Intent intent = new Intent(SearchActivity.this, AccountActivity.class);
        startActivity(intent);
    }
}