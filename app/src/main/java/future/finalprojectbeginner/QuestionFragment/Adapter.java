package future.finalprojectbeginner.QuestionFragment;

/**
 * Created by wahyuwidi on 31/08/17.
 */

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;


/**
 * Created by wahyuwidi on 27/07/17.
 */

public class Adapter extends FragmentPagerAdapter {
    public Adapter(FragmentManager manager){

        super(manager);
    }

    @Override
    public Fragment getItem(int position) {

        switch (position){
            case 0:
                Question1 q1=new Question1();
                return q1;
            case 1:
                Question2 q2=new Question2();
                return q2;
            case 2:
                Question3 q3=new Question3();
                return q3;
        }
        return null;
    }

    @Override
    public int getCount() {

        return 3;
    }
    @Override
    public CharSequence getPageTitle(int position) {

        switch (position){
            case 0:
                return "Question 1";
            case 1:
                return "Question 2";
            case 2:
                return "Question 3";
        }
        return null;
    }
}