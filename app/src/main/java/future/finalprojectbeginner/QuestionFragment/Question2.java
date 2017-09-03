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

public class Question2 extends Fragment {
   RadioGroup radioGroup;
   setScore2 score2;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView=inflater.inflate(R.layout.question2, container, false);
        radioGroup=rootView.findViewById(R.id.rg2);
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener(){
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId)
            {
                switch(checkedId)
                {
                    case R.id.a2:
                        passScore(0);
                        break;
                    case R.id.b2:
                        passScore(10);
                        break;
                    case R.id.c2:
                        passScore(0);
                        break;
                }
            }
        });
        return rootView;
    }

    public interface setScore2{
        void setScore2(Integer score);
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        score2=(setScore2) context;
    }

    public void passScore(Integer score){
        score2.setScore2(score);
    }
}
