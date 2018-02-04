package com.jain.vasunandisant.ui.subCategory.master;

import com.jain.vasunandisant.data.remote.model.subcategories.Response;
import com.jain.vasunandisant.injection.PerActivity;
import com.jain.vasunandisant.ui.base.MvpPresenter;

/**
 * Created by @iamBedant on 01/06/17.
 */

@PerActivity
public interface SubCategoryListMvpPresenter<V extends SubCategoryListMvpView> extends MvpPresenter<V> {
    void getCategoryData(String categoryId);

    void itemClicked(Response mItem);
}
