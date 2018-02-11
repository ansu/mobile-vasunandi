package com.jain.vasunandisant.injection.module;
import android.content.Context;
import android.support.v7.app.AppCompatActivity;

import com.jain.vasunandisant.injection.ActivityContext;
import com.jain.vasunandisant.injection.PerActivity;
import com.jain.vasunandisant.ui.PDFList.PDFListMVPPresenter;
import com.jain.vasunandisant.ui.PDFList.PDFListMvpView;
import com.jain.vasunandisant.ui.PDFList.PDFListPresnter;
import com.jain.vasunandisant.ui.categoryList.master.CategoryItemListMvpPresenter;
import com.jain.vasunandisant.ui.categoryList.master.CategoryItemListMvpView;
import com.jain.vasunandisant.ui.categoryList.master.CategoryItemListPresenter;
import com.jain.vasunandisant.ui.contactUs.ContactUsMvpPresenter;
import com.jain.vasunandisant.ui.contactUs.ContactUsMvpView;
import com.jain.vasunandisant.ui.contactUs.ContactUsPresenter;
import com.jain.vasunandisant.ui.developerProfile.DeveloperMvpPresenter;
import com.jain.vasunandisant.ui.developerProfile.DeveloperMvpView;
import com.jain.vasunandisant.ui.developerProfile.DeveloperPresenter;
import com.jain.vasunandisant.ui.gallery.GalleryMvpPresenter;
import com.jain.vasunandisant.ui.gallery.GalleryMvpView;
import com.jain.vasunandisant.ui.gallery.GalleryPresenter;
import com.jain.vasunandisant.ui.imageFullScreenActivity.ImageFullScreenMvpPresenter;
import com.jain.vasunandisant.ui.imageFullScreenActivity.ImageFullScreenMvpView;
import com.jain.vasunandisant.ui.imageFullScreenActivity.ImageFullScreenPresenter;
import com.jain.vasunandisant.ui.landing.LandingMvpPresenter;
import com.jain.vasunandisant.ui.landing.LandingMvpView;
import com.jain.vasunandisant.ui.landing.LandingPresenter;
import com.jain.vasunandisant.ui.news.NewsCardMvpPresenter;
import com.jain.vasunandisant.ui.news.NewsCardMvpView;
import com.jain.vasunandisant.ui.news.NewsCardPresenter;
import com.jain.vasunandisant.ui.subCategory.master.SubCategoryListMvpPresenter;
import com.jain.vasunandisant.ui.subCategory.master.SubCategoryListMvpView;
import com.jain.vasunandisant.ui.subCategory.master.SubCategoryListPresenter;
import com.jain.vasunandisant.ui.videoList.VideoListMvpPresenter;
import com.jain.vasunandisant.ui.videoList.VideoListMvpView;
import com.jain.vasunandisant.ui.videoList.VideoListPresenter;

import dagger.Module;
import dagger.Provides;
import io.reactivex.disposables.CompositeDisposable;

/**
 * Created by @iamBedant on 15/03/17.
 */

@Module
public class ActivityModule {

    private AppCompatActivity mActivity;

    public ActivityModule(AppCompatActivity activity) {
        this.mActivity = activity;
    }

    @Provides
    @ActivityContext
    Context provideContext() {
        return mActivity;
    }

    @Provides
    AppCompatActivity provideActivity() {
        return mActivity;
    }

    @Provides
    CompositeDisposable provideCompositeDisposable() {
        return new CompositeDisposable();
    }

    @Provides
    @PerActivity
    LandingMvpPresenter<LandingMvpView> provideLandingPresenter(
            LandingPresenter<LandingMvpView> presenter) {
        return presenter;
    }

    @Provides
    @PerActivity
    NewsCardMvpPresenter<NewsCardMvpView> provideDescriptionCardPresenter(
            NewsCardPresenter<NewsCardMvpView> presenter) {
        return presenter;
    }

    @Provides
    @PerActivity
    SubCategoryListMvpPresenter<SubCategoryListMvpView> provideItemListPresenter(
            SubCategoryListPresenter<SubCategoryListMvpView> presenter) {
        return presenter;
    }

    @Provides
    @PerActivity
    CategoryItemListMvpPresenter<CategoryItemListMvpView> provideCategoryItemListPresenter(
            CategoryItemListPresenter<CategoryItemListMvpView> presenter) {
        return presenter;
    }


    @Provides
    @PerActivity
    ContactUsMvpPresenter<ContactUsMvpView> provideContactUsPresenter(
            ContactUsPresenter<ContactUsMvpView> presenter) {
        return presenter;
    }

    @Provides
    @PerActivity
    DeveloperMvpPresenter<DeveloperMvpView> provideDeveloperPresenter(
            DeveloperPresenter<DeveloperMvpView> presenter) {
        return presenter;
    }

    @Provides
    @PerActivity
    GalleryMvpPresenter<GalleryMvpView> provideGalleryPresenter(
            GalleryPresenter<GalleryMvpView> presenter) {
        return presenter;
    }

    @Provides
    @PerActivity
    ImageFullScreenMvpPresenter<ImageFullScreenMvpView> provideImageFullScreenPresenter(
            ImageFullScreenPresenter<ImageFullScreenMvpView> presenter) {
        return presenter;
    }

    @Provides
    @PerActivity
    VideoListMvpPresenter<VideoListMvpView> provideVideoListPresenter(
            VideoListPresenter<VideoListMvpView> presenter) {
        return presenter;
    }

    @Provides
    @PerActivity
    PDFListMVPPresenter<PDFListMvpView> providePDFListPresenter(
            PDFListPresnter<PDFListMvpView> presenter) {
        return presenter;
    }
}