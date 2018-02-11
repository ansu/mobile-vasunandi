package com.jain.vasunandisant.ui.PDFList;

import com.jain.vasunandisant.data.remote.model.categoryItems.CategoryItemData;
import com.jain.vasunandisant.ui.base.MvpView;

import java.util.List;

/**
 * Created by kuliza-282 on 11/02/18.
 */

public interface PDFListMvpView extends MvpView {
    void setData(List<CategoryItemData.Response> response);

}
