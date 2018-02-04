package com.jain.vasunandisant.ui.gallery;

import com.jain.vasunandisant.data.remote.model.categoryItems.CategoryItemData;
import com.jain.vasunandisant.ui.base.MvpView;

import java.util.List;

/**
 * Created by kuliza-303 on 07/06/17.
 */

public interface GalleryMvpView extends MvpView {
    void setData(List<CategoryItemData.Response> response);
}
