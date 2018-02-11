package com.jain.vasunandisant.ui.PDFList;

import com.jain.vasunandisant.ui.base.MvpPresenter;

/**
 * Created by kuliza-282 on 11/02/18.
 */

public interface PDFListMVPPresenter<V extends  PDFListMvpView> extends MvpPresenter<V> {
    void getCategoryItemData(String categoryId);

    void getSubCategoryItemData(String categoryId, String subcategoryId);
}
