package com.jain.vasunandisant.ui.developerProfile;

import javax.inject.Inject;

import com.jain.vasunandisant.data.DataManager;
import com.jain.vasunandisant.ui.base.BasePresenter;
import io.reactivex.disposables.CompositeDisposable;

/**
 * Created by kuliza-319 on 7/6/17.
 */

public class DeveloperPresenter<V extends DeveloperMvpView> extends BasePresenter<V>
    implements DeveloperMvpPresenter<V>{

    @Inject
    public DeveloperPresenter(DataManager dataManager, CompositeDisposable compositeDisposable) {
        super(dataManager, compositeDisposable);
    }
}
