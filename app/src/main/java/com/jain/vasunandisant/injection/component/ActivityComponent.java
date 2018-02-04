
package com.jain.vasunandisant.injection.component;

import com.jain.vasunandisant.injection.PerActivity;
import com.jain.vasunandisant.injection.module.ActivityModule;
import com.jain.vasunandisant.ui.categoryList.master.CategoryItemListActivity;
import com.jain.vasunandisant.ui.contactUs.ContactUsActivity;
import com.jain.vasunandisant.ui.developerProfile.DeveloperActivity;
import com.jain.vasunandisant.ui.gallery.GalleyActivity;
import com.jain.vasunandisant.ui.imageFullScreenActivity.ImageFullScreenActivity;
import com.jain.vasunandisant.ui.news.NewsCardActivity;
import com.jain.vasunandisant.ui.webView.WebViewActivity;
import com.jain.vasunandisant.ui.subCategory.master.SubCategoryListActivity;
import com.jain.vasunandisant.ui.landing.LandingActivity;
import dagger.Component;

import com.jain.vasunandisant.ui.videoList.VideoListActivity;


@PerActivity
@Component(dependencies = ApplicationComponent.class, modules = ActivityModule.class)
public interface ActivityComponent {

    void inject(LandingActivity landingActivity);
    void inject(SubCategoryListActivity subCategoryListActivity);
    void inject(NewsCardActivity newsCardActivity);
    void inject(ContactUsActivity contactUsActivity);
    void inject(DeveloperActivity developerActivity);
    void inject(GalleyActivity galleyActivity);
    void inject(WebViewActivity webViewActivity);
    void inject(CategoryItemListActivity categoryItemListActivity);
    void inject(ImageFullScreenActivity imageFullScreenActivity);
    void inject(VideoListActivity videoListActivity);
}
