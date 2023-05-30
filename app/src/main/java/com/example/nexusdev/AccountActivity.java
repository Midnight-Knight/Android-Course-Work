package com.example.nexusdev;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class AccountActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_account);
    }

    public void MainButton(View view)
    {
        Intent intent = new Intent(AccountActivity.this, MainActivity.class);
        startActivity(intent);
    }

    public void SearchButton(View view)
    {
        Intent intent = new Intent(AccountActivity.this, SearchActivity.class);
        startActivity(intent);
    }

    public void StorageButton(View view)
    {
        Intent intent = new Intent(AccountActivity.this, StorageActivity.class);
        startActivity(intent);
    }

    public void AccountButton(View view)
    {
        Intent intent = new Intent(AccountActivity.this, AccountActivity.class);
        startActivity(intent);
    }
}