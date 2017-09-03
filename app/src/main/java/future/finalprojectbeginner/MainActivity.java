package future.finalprojectbeginner;

import android.content.Intent;
import android.support.v4.app.DialogFragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void start(View view){
        Intent intent=new Intent(this,QuestionActivity.class);
        startActivity(intent);
    }

    public void counter(View view){
        Intent intent=new Intent(this, CounterActivity.class);
        startActivity(intent);
    }

    public void exit(View view) {
        DialogFragment fm = new ExitFragment();
        fm.show(getSupportFragmentManager(), "Dialog Exit");
    }
}
