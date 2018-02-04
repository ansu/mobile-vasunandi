package com.jain.vasunandisant.ui.imageFullScreenActivity;

import javax.inject.Inject;

import com.jain.vasunandisant.data.DataManager;
import com.jain.vasunandisant.ui.base.BasePresenter;
import io.reactivex.disposables.CompositeDisposable;

/**
 * Created by kuliza-319 on 8/6/17.
 */

public class ImageFullScreenPresenter<V extends ImageFullScreenMvpView> extends BasePresenter<V>
implements ImageFullScreenMvpPresenter<V>{

    @Inject
    public ImageFullScreenPresenter(DataManager dataManager, CompositeDisposable compositeDisposable) {
        super(dataManager, compositeDisposable);
    }
}
