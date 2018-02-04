package com.jain.vasunandisant.ui.videoList;

import com.jain.vasunandisant.data.remote.model.categoryItems.CategoryItemData;
import com.jain.vasunandisant.ui.base.MvpView;

import java.util.List;

/**
 * Created by kuliza-319 on 15/6/17.
 */

public interface VideoListMvpView extends MvpView {
    void setData(List<CategoryItemData.Response> response);
}
