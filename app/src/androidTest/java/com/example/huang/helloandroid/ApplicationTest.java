package com.example.huang.helloandroid;

import android.app.Application;
import android.test.ApplicationTestCase;
import android.test.ActivityInstrumentationTestCase2;
import com.example.huang.helloandroid.MainActivity;
import android.widget.TextView;

/**
 * <a href="http://d.android.com/tools/testing/testing_android.html">Testing Fundamentals</a>
 */
public class ApplicationTest extends ActivityInstrumentationTestCase2<MainActivity> {

    private MainActivity mActivity;
    private TextView mView;
    private String resourceString;
    public ApplicationTest() {
        super(MainActivity.class);
    }

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        mActivity = this.getActivity();
        mView = (TextView) mActivity.findViewById
                (com.example.huang.helloandroid.R.id.textview);
        resourceString = mActivity.getString
                (com.example.huang.helloandroid.R.string.hello);
    }

    public void testPreconditions() {
        assertNotNull(mView);
    }

    public void testText() {
        assertEquals(resourceString,(String)mView.getText());
    }

}