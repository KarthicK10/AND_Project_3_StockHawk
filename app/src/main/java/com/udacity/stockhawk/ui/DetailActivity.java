package com.udacity.stockhawk.ui;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.data.LineDataSet;
import com.udacity.stockhawk.R;

import java.util.ArrayList;

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
        LineChart lineChart = (LineChart) findViewById(R.id.chart);
        ArrayList<Entry> entries = new ArrayList<>();
        entries.add(new Entry(4f, 0));
        entries.add(new Entry(6f, 1));
        entries.add(new Entry(8f, 2));
        entries.add(new Entry(2f, 3));
        entries.add(new Entry(10f, 4));
        LineDataSet dataSet = new LineDataSet(entries, getString(R.string.chartYAxis));
        ArrayList<String> labels = new ArrayList<>();
        labels.add("January");
        labels.add("February");
        labels.add("March");
        labels.add("Apri");
        labels.add("May");
        labels.add("June");
        labels.add("July");
        LineData lineData = new LineData(labels, dataSet);
        lineChart.setData(lineData);
        lineChart.setDescription(getString(R.string.chartDescription));
    }
}
