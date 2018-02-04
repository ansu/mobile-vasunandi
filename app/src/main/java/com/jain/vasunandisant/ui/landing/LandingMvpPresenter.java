package com.jain.vasunandisant.ui.landing;


import com.jain.vasunandisant.data.remote.model.Category;
import com.jain.vasunandisant.injection.PerActivity;
import com.jain.vasunandisant.ui.base.MvpPresenter;

/**
 * Created by @iamBedant on 15/03/17.
 */

@PerActivity
public interface LandingMvpPresenter<V extends LandingMvpView> extends MvpPresenter<V> {


    void NavItemClicked(int nav_item);

    void getCategoryCollection();


    void dashboardClicked(Category.Response response);

}
