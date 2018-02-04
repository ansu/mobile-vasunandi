package com.jain.vasunandisant.ui.news;


import com.jain.vasunandisant.injection.PerActivity;
import com.jain.vasunandisant.ui.base.MvpPresenter;

/**
 * Created by kuliza-303 on 31/05/17.
 */

@PerActivity
public interface NewsCardMvpPresenter<V extends NewsCardMvpView> extends MvpPresenter<V> {

    void getCategoryItemData(String categoryId);

    void getSubCategoryItemData(String mCategoryId, String msubCategoryId);
}
