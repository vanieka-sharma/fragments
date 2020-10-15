package com.example.assignment;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.pm.PackageManager;
import android.os.Bundle;
import android.view.Menu;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.example_menu, menu);
        return true;
    }
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.qiuz:
                Intent quiz =
                        getPackageManager().getLaunchIntentForPackage("com.example.checkbox");
                startActivity(quiz);
                return true;
            case R.id.secondactivity:
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                startActivity(intent);
                return true;
            case R.id.fragment:
                FragmentManager fragmentManager = getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                BlankFragment blankFragment = new BlankFragment();
                fragmentTransaction.replace(R.id.fragment,blankFragment,null);
                fragmentTransaction.commit();
                return true;
            case R.id.emergency:
                Intent emergency= getPackageManager().getLaunchIntentForPackage("com.example.mydevice");
                startActivity(emergency);
                return true;

        }
        return true;
    }

}
