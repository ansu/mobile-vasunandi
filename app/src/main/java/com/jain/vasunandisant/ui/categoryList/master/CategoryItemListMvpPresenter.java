package com.jain.vasunandisant.ui.categoryList.master;

import com.jain.vasunandisant.injection.PerActivity;
import com.jain.vasunandisant.ui.base.MvpPresenter;

/**
 * Created by @iamBedant on 01/06/17.
 */

@PerActivity
public interface CategoryItemListMvpPresenter<V extends CategoryItemListMvpView> extends MvpPresenter<V> {
    void getCategoryItemData(String categoryId);

    void getSubCategoryItemData(String categoryId, String subCategoryId);
}
