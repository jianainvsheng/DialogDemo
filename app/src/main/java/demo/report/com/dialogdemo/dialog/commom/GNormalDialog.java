package demo.report.com.dialogdemo.dialog.commom;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.StyleRes;
import android.view.View;

import demo.report.com.dialogdemo.dialog.base.BaseDialog;
import demo.report.com.dialogdemo.dialog.builder.BaseBuilder;
import demo.report.com.dialogdemo.dialog.builder.Normal.NormalBuilder;
import demo.report.com.dialogdemo.dialog.helper.BaseDialogHelper;
import demo.report.com.dialogdemo.dialog.helper.usually.UsuallyDialogHelper;

/**
 * Created by yangjian-ds3 on 2018/3/21.
 */

public class GNormalDialog< N extends BaseBuilder<N>> extends BaseDialog<N> {

    public GNormalDialog(@NonNull Context context) {
        super(context);
    }

    public GNormalDialog(@NonNull Context context, @StyleRes int themeResId) {
        super(context, themeResId);
    }

    @Override
    public BaseDialogHelper onCreateDefaultHelp(Context context, N data) {
        return new UsuallyDialogHelper(context);
    }

    public static NormalBuilder onCreateBuiler(Context context){

        return new NormalBuilder(context);
    }

    public static < N extends BaseBuilder<N>> N onCreateBuiler(N n){

        return n;
    }


    public interface PositiveCallBack {
        void onClick(View v);
    }

    public interface NegativeCallBack {
        void onClick(View v);
    }
}
