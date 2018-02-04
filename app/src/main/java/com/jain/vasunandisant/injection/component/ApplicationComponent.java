
package com.jain.vasunandisant.injection.component;

import android.app.Application;
import android.content.Context;

import com.jain.vasunandisant.App;
import com.jain.vasunandisant.data.DataManager;
import com.jain.vasunandisant.injection.ApplicationContext;
import com.jain.vasunandisant.injection.module.ApplicationModule;

import dagger.Component;
import javax.inject.Singleton;

/**
 * Created by @iamBedant on 15/03/17.
 */
@Singleton
@Component(modules = ApplicationModule.class)
public interface ApplicationComponent {

    void inject(App app);


    @ApplicationContext
    Context context();

    Application application();

    DataManager getDataManager();
}