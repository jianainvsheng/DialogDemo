package demo.report.com.dialogdemo;

import android.app.Dialog;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import demo.report.com.dialogdemo.dialog.commom.GNormalDialog;
import demo.report.com.dialogdemo.test.newtest.OrderfillDeclareHelper;
import demo.report.com.dialogdemo.test.newtest.testbuilder.TestNormalBuilder;
import demo.report.com.dialogdemo.test.newtest.testhelper.TestHelper;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View view){
        if(view.getId() == R.id.GCommonDialog_new_Test){

            Dialog dialog = GNormalDialog.onCreateBuiler(this)
                    .setContent("你好我是新版本GCommonDialog")
                    .setThemeStyleResId(R.style.dialog_style)
                    .setNegativeName("cancle")
                    .setPositiveName("ok").build();
            dialog.show();
        }else if(view.getId() == R.id.OrderfillDeclareDialog_new_Test){

            Dialog dialog = GNormalDialog.onCreateBuiler(this)
                    .setContent("大家好我是新版本OrderfillDeclareDialog")
                    .setPositiveName("ok")
                    .setThemeStyleResId(R.style.dialog_style)
                    .setHelperClass(OrderfillDeclareHelper.class)
                    .build();
            dialog.show();

        }else if(view.getId() == R.id.OrderfillDeclareDialog_new_Builder_test){
            Dialog dialog = GNormalDialog.onCreateBuiler(new TestNormalBuilder(this))
                    .setThemeStyleResId(R.style.dialog_style)
                    .setHelperClass(TestHelper.class)
                    .setTest("你好")
                    .build();
            dialog.show();
        }
    }
}
