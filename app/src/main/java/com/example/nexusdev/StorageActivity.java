package com.example.nexusdev;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class StorageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getSupportActionBar().hide();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_storage);
        Fragment fragment = new StorageFragment();
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.startFragment, fragment);
        fragmentTransaction.commit();
    }

    public void MainButton(View view)
    {
        Intent intent = new Intent(StorageActivity.this, MainActivity.class);
        startActivity(intent);
    }

    public void SearchButton(View view)
    {
        Intent intent = new Intent(StorageActivity.this, SearchActivity.class);
        startActivity(intent);
    }

    public void StorageButton(View view)
    {
        Intent intent = new Intent(StorageActivity.this, StorageActivity.class);
        startActivity(intent);
    }

    public void AccountButton(View view)
    {
        Intent intent = new Intent(StorageActivity.this, AccountActivity.class);
        startActivity(intent);
    }
}