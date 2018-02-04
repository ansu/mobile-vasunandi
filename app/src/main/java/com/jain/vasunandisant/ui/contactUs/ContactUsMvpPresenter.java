package com.jain.vasunandisant.ui.contactUs;

import com.jain.vasunandisant.injection.PerActivity;
import com.jain.vasunandisant.ui.base.MvpPresenter;

/**
 * Created by kuliza-319 on 7/6/17.
 */
@PerActivity
public interface ContactUsMvpPresenter<V extends ContactUsMvpView> extends MvpPresenter<V> {

    void phoneClicked(String phoneNumber);

    void emailClicked(String email);
}
