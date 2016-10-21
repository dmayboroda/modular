package com.modular.module;

import android.content.Context;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Mayboroda on 10/21/16.
 */

@Module
public final class AppModule {

    private Context context;

    AppModule(Context context) {
        this.context = context;
    }

    @Provides @Singleton
    Context provideContext() { return context; }
}
