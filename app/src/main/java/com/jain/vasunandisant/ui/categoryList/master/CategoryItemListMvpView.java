package com.jain.vasunandisant.ui.categoryList.master;

import java.util.List;

import com.jain.vasunandisant.data.remote.model.categoryItems.CategoryItemData;
import com.jain.vasunandisant.ui.base.MvpView;

/**
 * Created by @iamBedant on 01/06/17.
 */

public interface CategoryItemListMvpView extends MvpView {
    void setData(List<CategoryItemData.Response> response);
}
