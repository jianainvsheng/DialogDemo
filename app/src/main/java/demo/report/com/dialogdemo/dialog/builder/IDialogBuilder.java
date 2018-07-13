package demo.report.com.dialogdemo.dialog.builder;

import android.app.Dialog;
import android.support.annotation.StyleRes;

import demo.report.com.dialogdemo.dialog.helper.BaseDialogHelper;

/**
 * Created by yangjian-ds3 on 2018/3/21.
 */

public interface IDialogBuilder<D extends IDialogBuilder<D>> {

    /**
     * the theme in the dialog
     * @return
     */
     @StyleRes int getThemeStyleResId();

    /**
     * set the theme style id
     * @param themeStyleResId
     */
     D setThemeStyleResId(@StyleRes int themeStyleResId);

    /**
     * return the need helper
     * @return
     */
     Class<? extends BaseDialogHelper<D>> getHelperClass();


    /**
     * set helper class
     * @param cls
     * @return
     */
    public D setHelperClass(Class<? extends BaseDialogHelper<D>> cls);

    /**
     * create dialog
     * @return
     */
    public Dialog build();

}
