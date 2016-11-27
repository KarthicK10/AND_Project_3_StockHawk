package com.udacity.stockhawk.ui;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.udacity.stockhawk.R;

/**
 * Created by KarthicK on 11/26/2016.
 *
 * Detail Activity
 * to show the Graph of selected stock's value over time.
 */

public class DetailActivity extends AppCompatActivity{

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        if(savedInstanceState == null){
            // Create the detail fragment and add it to the activity
            // using a fragment transaction.
            Bundle arguments = new Bundle();
            arguments.putParcelable(ChartFragment.STOCK_URI, getIntent().getData());
            ChartFragment detailFragment = new ChartFragment();
            detailFragment.setArguments(arguments);
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.chartContainer, detailFragment)
                    .commit();
        }
    }
}
