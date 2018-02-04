package com.jain.vasunandisant.ui.contactUs;

import android.content.Intent;

import com.jain.vasunandisant.ui.base.MvpView;

/**
 * Created by kuliza-319 on 7/6/17.
 */

public interface ContactUsMvpView extends MvpView {

    void call (Intent intent);

    void sendEmail(Intent emailIntent);
}
