package future.finalprojectbeginner.QuestionFragment;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioGroup;

import future.finalprojectbeginner.R;

/**
 * Created by wahyuwidi on 31/08/17.
 */

public class Question1 extends Fragment{

    setScore1 score1;
    RadioGroup radioGroup;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView=inflater.inflate(R.layout.question1, container, false);
        radioGroup=rootView.findViewById(R.id.rg1);
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener(){
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId)
            {
                switch(checkedId)
                {
                    case R.id.a1:
                       passScore(0);
                        break;
                    case R.id.b1:
                        passScore(0);
                        break;
                    case R.id.c1:
                        passScore(10);
                        break;
                }
            }
        });
        return rootView;
    }

    public interface setScore1{
      void setScore1(Integer score);
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        score1=(setScore1) context;
    }

    public void passScore(Integer score){
        score1.setScore1(score);
    }

}
