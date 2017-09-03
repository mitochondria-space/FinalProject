package future.finalprojectbeginner;


import android.support.design.widget.TabLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import android.support.v4.view.ViewPager;
import android.os.Bundle;

import android.view.View;

import android.widget.TextView;

import future.finalprojectbeginner.QuestionFragment.Question1;
import future.finalprojectbeginner.QuestionFragment.Question2;
import future.finalprojectbeginner.QuestionFragment.Question3;

public class QuestionActivity extends AppCompatActivity implements TabLayout.OnTabSelectedListener,
        Question1.setScore1,
        Question2.setScore2,
        Question3.setScore3{
    ViewPager viewPager;
    TabLayout tabLayout;
    TextView coba;
    int q1;
    int q2;
    int q3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question);
        coba=(TextView)findViewById(R.id.coba);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setElevation(0f);
        setUpPagerandTabs();
    }

    private void setUpPagerandTabs(){
        future.finalprojectbeginner.QuestionFragment.Adapter adapter=new future.finalprojectbeginner.QuestionFragment.Adapter(getSupportFragmentManager());
        viewPager=(ViewPager)findViewById(R.id.container);
        viewPager.setAdapter(adapter);

        tabLayout=(TabLayout)findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(viewPager);
        tabLayout.addOnTabSelectedListener(this);

    }

    @Override
    public void onTabSelected(TabLayout.Tab tab) {
        viewPager.setCurrentItem(tab.getPosition());
    }

    @Override
    public void onTabUnselected(TabLayout.Tab tab) {

    }

    @Override
    public void onTabReselected(TabLayout.Tab tab) {

    }

    @Override
    public void setScore1(Integer score) {
        q1=score;
    }


    @Override
    public void setScore2(Integer score) {
        q2=score;
    }

    @Override
    public void setScore3(Integer score) {
        q3=score;
    }

    public void submit(View view){
        coba.setText("Your Score is " + String.valueOf(q1+q2+q3));
    }
}
