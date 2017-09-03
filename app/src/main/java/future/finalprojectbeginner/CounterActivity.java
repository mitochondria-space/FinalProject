package future.finalprojectbeginner;

import android.content.Intent;
import android.support.v4.app.DialogFragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class CounterActivity extends AppCompatActivity {

    int scoreA = 0;
    int scoreB = 0;
    int scoreC = 0;

    TextView A;
    TextView B;
    TextView C;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_counter);

        A = (TextView) findViewById(R.id.teamA_score);
        B = (TextView) findViewById(R.id.teamB_score);
        C = (TextView) findViewById(R.id.teamC_score);
    }

    /**
     * Scoring method for A Team
     */

    public void setScoreAInc100(View view) {
        scoreA = scoreA + 100;
        A.setText(String.valueOf(scoreA));
    }

    public void setScoreAInc50(View view) {
        scoreA = scoreA + 50;
        A.setText(String.valueOf(scoreA));
    }

    public void setScoreADec50(View view) {
        scoreA = scoreA - 50;
        if (scoreA < 0) {
            Toast.makeText(this, "Cannot set value less than 0", Toast.LENGTH_SHORT).show();
            scoreA = 0;
            A.setText(String.valueOf(scoreA));
        } else {
            A.setText(String.valueOf(scoreA));
        }
    }

    /**
     * Scoring method for B Team
     */

    public void setScoreBInc100(View view) {
        scoreB = scoreB + 100;
        B.setText(String.valueOf(scoreB));
    }

    public void setScoreBInc50(View view) {
        scoreB = scoreB + 50;
        B.setText(String.valueOf(scoreB));
    }

    public void setScoreBDec50(View view) {
        scoreB = scoreB - 50;
        if (scoreB < 0) {
            Toast.makeText(this, "Cannot set value less than 0", Toast.LENGTH_SHORT).show();
            scoreB = 0;
            B.setText(String.valueOf(scoreB));
        } else {
            B.setText(String.valueOf(scoreB));
        }
    }

    /**
     * Scoring method for C Team
     */

    public void setScoreCInc100(View view) {
        scoreC = scoreC + 100;
        C.setText(String.valueOf(scoreC));
    }

    public void setScoreCInc50(View view) {
        scoreC = scoreC + 50;
        C.setText(String.valueOf(scoreC));
    }

    public void setScoreCDec50(View view) {
        scoreC = scoreC - 50;
        if (scoreC < 0) {
            Toast.makeText(this, "Cannot set value less than 0", Toast.LENGTH_SHORT).show();
            scoreC = 0;
            C.setText(String.valueOf(scoreC));
        } else {
            C.setText(String.valueOf(scoreC));
        }
    }


    public void reset(View view) {
        scoreA=0;
        scoreB=0;
        scoreC=0;

        A.setText(String.valueOf(scoreA));
        B.setText(String.valueOf(scoreB));
        C.setText(String.valueOf(scoreC));
    }

    public void back(View view){
        Intent back=new Intent(this, MainActivity.class);
        startActivity(back);
    }



}
