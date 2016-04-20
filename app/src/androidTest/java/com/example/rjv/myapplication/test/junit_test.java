package com.example.rjv.myapplication.test;
import android.test.ActivityInstrumentationTestCase2;
import android.widget.TextView;

import com.example.rjv.myapplication.MainActivity;
import com.example.rjv.myapplication.R;

/**
 * Created by RJV on 4/17/16.
 */
public class junit_test extends ActivityInstrumentationTestCase2<MainActivity>{
    MainActivity mainActivity;
    public junit_test()
    {
        super(MainActivity.class);
    }
    public void test_first()
    {
        mainActivity=getActivity();

        TextView textView = (TextView) mainActivity.findViewById(R.id.tv1);
        String tester = textView.getText().toString();

        assertEquals("Byre", tester);


    }
}
