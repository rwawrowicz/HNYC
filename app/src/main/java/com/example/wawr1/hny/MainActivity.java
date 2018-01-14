package com.example.wawr1.hny;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void getCurrentYear(android.view.View view) {
        TextView current_year_view = (TextView)findViewById(R.id.current_year);
        int year = Calendar.getInstance().get(Calendar.YEAR);
        current_year_view.setText(String.valueOf(year));
    }




}
