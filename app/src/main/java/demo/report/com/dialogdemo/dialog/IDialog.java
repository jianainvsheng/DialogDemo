package demo.report.com.dialogdemo.dialog;

import android.content.Context;

import demo.report.com.dialogdemo.dialog.builder.IDialogBuilder;
import demo.report.com.dialogdemo.dialog.helper.BaseDialogHelper;

/**
 * Created by yangjian-ds3 on 2018/3/21.
 */

public interface IDialog<D extends IDialogBuilder<D>> {

    /**
     * init the dialog
     * @param context
     */
    public void initDialog(Context context, D data);

    /**
     * create the helper
     * @return
     */
    public BaseDialogHelper<D> onCreateHelper(Context context, D data) throws NoSuchMethodException;

}
