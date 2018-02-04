package com.jain.vasunandisant.ui.subCategory.master;

import com.jain.vasunandisant.data.remote.model.subcategories.Response;
import com.jain.vasunandisant.ui.base.MvpView;

import java.util.List;

/**
 * Created by @iamBedant on 01/06/17.
 */

public interface SubCategoryListMvpView extends MvpView {
    void setData(List<Response> response);

    void openNewsScreen(String s);

    void openContentList(String s, String name);

    void openGallery(String s, String name);
}
