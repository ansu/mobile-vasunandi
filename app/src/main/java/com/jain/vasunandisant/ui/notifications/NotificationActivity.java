package com.jain.vasunandisant.ui.notifications;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import io.iamBedant.starter.utils.GoogleAnalyticsManager;

public class NotificationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(com.jain.vasunandisant.R.layout.activity_notification);
        GoogleAnalyticsManager.trackGoogleAnalyticsEvent(GoogleAnalyticsManager.NOTIFICATION_SCREEN_VISITED);
    }
}
