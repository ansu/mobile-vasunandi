package com.jain.vasunandisant.ui.gallery;

import com.jain.vasunandisant.injection.PerActivity;
import com.jain.vasunandisant.ui.base.MvpPresenter;

/**
 * Created by kuliza-303 on 07/06/17.
 */


@PerActivity
public interface GalleryMvpPresenter<V extends GalleryMvpView> extends MvpPresenter<V> {

    void getCategoryItemData(String categoryId);

    void getSubCategoryItemData(String categoryId, String subCategoryId);
}