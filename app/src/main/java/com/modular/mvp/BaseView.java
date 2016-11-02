package com.modular.mvp;

/**
 * Created by Mayboroda on 10/31/16.
 */

public interface BaseView {

    void showProgress();
    void showContent();
    void showEmpty();
    void showError(Throwable throwable);
}
