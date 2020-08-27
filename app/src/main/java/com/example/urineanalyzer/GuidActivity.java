package com.example.urineanalyzer;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.animation.ArgbEvaluator;
import android.app.ProgressDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;

public class GuidActivity extends AppCompatActivity {

    ViewPager viewPager;
    Adapter adapter;
    List<Model> models;
    Integer[] colors = null;

    private ProgressDialog progressDialog;
    private LinearLayout getData_Linear_btn;

    ArgbEvaluator argbEvaluator = new ArgbEvaluator();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guid);
        //Test
        getData_Linear_btn = findViewById(R.id.getData_Linear_btn);

        models = new ArrayList<>();
        models.add(new Model(R.drawable.a_1, "STEP 1", "첫 번째 사용설명 란"));
        models.add(new Model(R.drawable.a_2, "STEP 2", "두 번째 사용설명 란"));
        models.add(new Model(R.drawable.a_3, "STEP 3", "세 번째 사용설명 란"));
        models.add(new Model(R.drawable.a_4, "STEP 4", "네 번째 사용설명 란"));

        adapter = new Adapter(models,this);

        viewPager = findViewById(R.id.viewPager);
        viewPager.setAdapter(adapter);
        viewPager.setPadding(130, 120, 130, 0);

        Integer[] colors_temp = {
                getResources().getColor(R.color.color_White),
                getResources().getColor(R.color.color_White),
                getResources().getColor(R.color.color_White),
                getResources().getColor(R.color.color_White)
        };
        colors = colors_temp;

        getData_Linear_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                progressDialog = new ProgressDialog(GuidActivity.this);

                progressDialog.show();
                progressDialog.setContentView(R.layout.progress_dialog);

                progressDialog.getWindow().setBackgroundDrawableResource(android.R.color.transparent); // 투명 컬러

            }
        });

        viewPager.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
                if (position < (adapter.getCount() -1) && position < (colors.length - 1)) {
                    viewPager.setBackgroundColor((Integer) argbEvaluator.evaluate(positionOffset, colors[position], colors[position + 1]));

                }

                else {
                    viewPager.setBackgroundColor(colors[colors.length - 1]);
                }
            }

            @Override
            public void onPageSelected(int position) {

            }
            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });

    }
}