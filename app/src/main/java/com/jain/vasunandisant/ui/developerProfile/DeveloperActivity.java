package com.jain.vasunandisant.ui.developerProfile;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;

import com.jain.vasunandisant.ui.base.BaseActivity;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import io.iamBedant.starter.utils.GoogleAnalyticsManager;

public class DeveloperActivity extends BaseActivity implements DeveloperMvpView {

    @Inject
    DeveloperMvpPresenter<DeveloperMvpView> mPresenter;

    @BindView(com.jain.vasunandisant.R.id.toolbar)
    Toolbar mToolbar;

    private String mHeading = "Developers";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(com.jain.vasunandisant.R.layout.activity_developer);
        GoogleAnalyticsManager.trackGoogleAnalyticsEvent(GoogleAnalyticsManager.DEVELOPERS_SCREEN_VISITED);
        setUp();
    }

    @Override
    protected void setUp() {
        getActivityComponent().inject(this);
        setUnBinder(ButterKnife.bind(this));
        mPresenter.onAttach(DeveloperActivity.this);

        mToolbar.setTitle(mHeading);
        setSupportActionBar(mToolbar);

        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
    }

    @OnClick({ com.jain.vasunandisant.R.id.bt_fb_ansu,
             com.jain.vasunandisant.R.id.bt_in_ansu})
    void socialIconClicked(View v){
        Intent browserIntent = null;
        switch (v.getId()){

            case com.jain.vasunandisant.R.id.bt_fb_ansu:
                browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/ansu.jn"));
                GoogleAnalyticsManager.trackGoogleAnalyticsEvent(GoogleAnalyticsManager.DEVELOPERS_SOCIAL_FB);
                break;

            case com.jain.vasunandisant.R.id.bt_in_ansu:
                browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.linkedin.com/in/ansujain/"));
                GoogleAnalyticsManager.trackGoogleAnalyticsEvent(GoogleAnalyticsManager.DEVELOPERS_SOCIAL_IN);
                break;
           

        }
        startActivity(browserIntent);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == android.R.id.home) {
            finish();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

}
