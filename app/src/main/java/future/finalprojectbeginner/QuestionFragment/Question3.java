package future.finalprojectbeginner.QuestionFragment;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import future.finalprojectbeginner.R;

/**
 * Created by wahyuwidi on 31/08/17.
 */

public class Question3 extends Fragment{
    RadioGroup radioGroup;
    setScore3 score3;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView=inflater.inflate(R.layout.question3, container, false);
        radioGroup=rootView.findViewById(R.id.rg3);
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener(){
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId)
            {
                switch(checkedId)
                {
                    case R.id.a3:
                        passScore(0);
                        break;
                    case R.id.b3:
                        passScore(0);
                        break;
                    case R.id.c3:
                        passScore(10);
                        break;
                }
            }
        });
        return rootView;
    }

    public interface setScore3{
       void setScore3(Integer score);
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        score3=(setScore3) context;
    }

    public void passScore(Integer score){
        score3.setScore3(score);
    }

}
