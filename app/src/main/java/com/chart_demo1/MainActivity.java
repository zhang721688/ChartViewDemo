package com.chart_demo1;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.zxn.chartview.BarChartView;
import com.zxn.chartview.util.Screen;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zxn on 2020/9/3.
 */
public class MainActivity extends AppCompatActivity {

    private BarChartView columnChartView;

    public static void jumpTo(Context context) {
        Intent intent = new Intent(context, MainActivity.class);
        context.startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        initView();
    }

    private void initView() {
        columnChartView = findViewById(R.id.columnChartView);


        List<ChartEntity> list = new ArrayList<>();
        list.add(new ChartEntity("top1", 1000.00));
        list.add(new ChartEntity("top2", 5000.00));
        list.add(new ChartEntity("top3", 1820.00));
        list.add(new ChartEntity("top4", 1130.00));
        list.add(new ChartEntity("top5", 1253.00));
        List<ChartValueEntity> valueList = new ArrayList<>();
        valueList.add(new ChartValueEntity("开卡数量", Color.parseColor("#02BB9D")));
        columnChartView.setChartValueList(valueList);
        columnChartView.setList(list);
    }

    public void init(View v) {
        columnChartView.start();
    }
}
