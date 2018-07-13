package demo.report.com.dialogdemo.test.newtest.testhelper;

import android.app.Dialog;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

import demo.report.com.dialogdemo.R;
import demo.report.com.dialogdemo.dialog.helper.BaseDialogHelper;
import demo.report.com.dialogdemo.test.newtest.testbuilder.TestNormalBuilder;

/**
 * Created by yangjian on 2018/3/22.
 */

public class TestHelper extends BaseDialogHelper<TestNormalBuilder> {

    private TextView mTestView;

    public TestHelper(Context context) {
        super(context);
    }

    @Override
    public View onCreateContextView(Context context) {

        View view = LayoutInflater.from(context).inflate(R.layout.test_builer_layout,null);
        mTestView = (TextView) view.findViewById(R.id.builder_test);
        return view;
    }

    @Override
    public void setBuilder(TestNormalBuilder builder, Dialog dialog) {
        super.setBuilder(builder, dialog);
        mTestView.setText(builder.test);
        mTestView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getDialog().dismiss();
            }
        });
    }
}
