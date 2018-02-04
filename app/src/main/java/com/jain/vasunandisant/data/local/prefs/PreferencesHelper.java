package com.jain.vasunandisant.data.local.prefs;

import com.jain.vasunandisant.data.remote.model.Category;

import io.reactivex.Observable;

/**
 * Created by @iamBedant on 31/05/17.
 */

public interface PreferencesHelper {

    Observable<Category> getCategoryFromDisk();

    void saveCategoryToDisk(Category category);
}