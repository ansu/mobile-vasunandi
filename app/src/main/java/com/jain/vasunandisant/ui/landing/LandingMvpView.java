
package com.jain.vasunandisant.ui.landing;

import com.jain.vasunandisant.data.remote.model.Category;
import com.jain.vasunandisant.ui.base.MvpView;

import java.util.List;

/**
 * Created by @iamBedant on 15/03/17.
 */

public interface LandingMvpView extends MvpView {


    void setData(List<Category.Response> response);

    void openNewsScreen(String id);

    void openContentList(String id, String name);

    void openGallery(String id, String name);

    void openSubcategoryScreen(String s, String name);

    void openVideoLibrary(String id, String name);

    void openPDFListActivity(String id, String name);
}
