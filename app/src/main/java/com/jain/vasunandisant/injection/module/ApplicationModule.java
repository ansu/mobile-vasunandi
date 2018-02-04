
package com.jain.vasunandisant.injection.module;

import android.app.Application;
import android.content.Context;

import com.jain.vasunandisant.data.AppDataManager;
import com.jain.vasunandisant.data.DataManager;
import com.jain.vasunandisant.data.local.prefs.AppPreferencesHelper;
import com.jain.vasunandisant.data.local.prefs.PreferencesHelper;
import com.jain.vasunandisant.data.remote.ApiHeader;
import com.jain.vasunandisant.data.remote.ApiHelper;
import com.jain.vasunandisant.data.remote.AppApiHelper;
import com.jain.vasunandisant.injection.ApiInfo;
import com.jain.vasunandisant.injection.ApplicationContext;
import com.jain.vasunandisant.injection.DatabaseInfo;
import com.jain.vasunandisant.injection.PreferenceInfo;
import com.jain.vasunandisant.utils.AppConstants;
import com.jain.vasunandisant.BuildConfig;

import dagger.Module;
import dagger.Provides;
import javax.inject.Singleton;

/**
 * Created by @iamBedant on 15/03/17.
 */

@Module
public class ApplicationModule {

    private final Application mApplication;

    public ApplicationModule(Application application) {
        mApplication = application;
    }

    @Provides
    @ApplicationContext
    Context provideContext() {
        return mApplication;
    }

    @Provides
    Application provideApplication() {
        return mApplication;
    }

    @Provides
    @DatabaseInfo
    String provideDatabaseName() {
        return AppConstants.DB_NAME;
    }

    @Provides
    @ApiInfo
    String provideApiKey() {
        return BuildConfig.PASSWORD;
    }

    @Provides
    @PreferenceInfo
    String providePreferenceName() {
        return AppConstants.PREF_NAME;
    }

    @Provides
    @Singleton
    DataManager provideDataManager(AppDataManager appDataManager) {
        return appDataManager;
    }


    @Provides
    @Singleton
    PreferencesHelper providePreferencesHelper(AppPreferencesHelper appPreferencesHelper) {
        return appPreferencesHelper;
    }

    @Provides
    @Singleton
    ApiHelper provideApiHelper(AppApiHelper appApiHelper) {
        return appApiHelper;
    }

    @Provides
    @Singleton
    ApiHeader.ProtectedApiHeader provideProtectedApiHeader(@ApiInfo String apiKey,
                                                           PreferencesHelper preferencesHelper) {
        return new ApiHeader.ProtectedApiHeader(
                apiKey,
                "",
                "");
    }

}
