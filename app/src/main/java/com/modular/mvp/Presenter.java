package com.modular.mvp;

import java.lang.ref.WeakReference;

/**
 * Created by Mayboroda on 11/2/16.
 */

public abstract class Presenter <V extends BaseView>{

    private WeakReference<V> reference;
    private boolean isLoaded;

    public final void register(V view){
        if (view == null) throw new NullPointerException("view can't be null");
        if (reference != null) unregister(reference.get());
        reference = new WeakReference<>(view);
        if (!isLoaded) {
            isLoaded = true;
        }
    }

    public final void unregister(V view) {
        if (view == null) throw new NullPointerException("view can't be null");
        isLoaded = false;
        reference = null;
    }


}
