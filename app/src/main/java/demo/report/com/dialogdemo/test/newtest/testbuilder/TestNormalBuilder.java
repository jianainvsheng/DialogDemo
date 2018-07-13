package demo.report.com.dialogdemo.test.newtest.testbuilder;

import android.content.Context;

import demo.report.com.dialogdemo.dialog.builder.BaseBuilder;


/**
 * Created by yangjian on 2018/3/22.
 */

public class TestNormalBuilder extends BaseBuilder<TestNormalBuilder> {

    public String test;

    public TestNormalBuilder(Context context) {
        super(context);
    }

    public TestNormalBuilder setTest(String test){

        this.test = test;
        return this;
    }
}
