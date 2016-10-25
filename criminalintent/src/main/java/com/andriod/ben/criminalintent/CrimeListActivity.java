package com.andriod.ben.criminalintent;

import android.support.v4.app.Fragment;


/**
 * Created by Ben on 9/18/2016.
 */
public class CrimeListActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment(){
        return new CrimeListFragment();
    }

}
