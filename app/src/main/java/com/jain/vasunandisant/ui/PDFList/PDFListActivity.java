package com.jain.vasunandisant.ui.PDFList;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.jain.vasunandisant.data.remote.model.categoryItems.CategoryItemData;
import com.jain.vasunandisant.ui.base.BaseActivity;
import com.jain.vasunandisant.ui.webView.WebViewActivity;
import com.jain.vasunandisant.utils.AppConstants;

import java.util.List;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;
import io.iamBedant.starter.utils.GoogleAnalyticsManager;

/**
 * Created by kuliza-282 on 11/02/18.
 */

public class PDFListActivity extends BaseActivity implements PDFListMvpView{

    private boolean mTwoPane;

    @Inject
    PDFListMVPPresenter<PDFListMvpView> mPresenter;

    String mCategoryName;
    String categoryId, subcategoryId;
    Boolean is_pdf = false;
    @BindView(com.jain.vasunandisant.R.id.toolbar)
    Toolbar mToolbar;

    @BindView(com.jain.vasunandisant.R.id.categoryitem_list)
    RecyclerView mRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(com.jain.vasunandisant.R.layout.activity_video_list);
        setUp();
//
        categoryId = getIntent().getExtras().getString(AppConstants.CATEGORY_ID);
        subcategoryId = getIntent().getExtras().getString(AppConstants.SUB_CATEGORY_ID);
        mCategoryName = getIntent().getExtras().getString(AppConstants.CATEGORY_NAME);
        is_pdf = getIntent().getExtras().getBoolean(AppConstants.IS_PDF);

        setUp();

        if(subcategoryId==null || subcategoryId.isEmpty()) {
            mPresenter.getCategoryItemData(categoryId);
            GoogleAnalyticsManager.trackGoogleAnalyticsEvent(GoogleAnalyticsManager.VIDEO_SCREEN_VISITED+"_"+categoryId);
        }else {
            mPresenter.getSubCategoryItemData(categoryId,subcategoryId);
            GoogleAnalyticsManager.trackGoogleAnalyticsEvent(GoogleAnalyticsManager.VIDEO_SCREEN_VISITED+"_"+categoryId+"_"+subcategoryId);
        }


        mPresenter.getCategoryItemData(categoryId);
    }

    @Override
    protected void setUp() {
        getActivityComponent().inject(this);
        setUnBinder(ButterKnife.bind(this));
        mPresenter.onAttach(PDFListActivity.this);

        mToolbar.setTitle(mCategoryName);
        setSupportActionBar(mToolbar);

        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
        if (findViewById(com.jain.vasunandisant.R.id.item_detail_container) != null) {
            mTwoPane = true;
        }
    }

    @Override
    public void setData(List<CategoryItemData.Response> response) {
        mRecyclerView.setAdapter(new PDFListActivity.SimpleItemRecyclerViewAdapter(response));
        DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(mRecyclerView.getContext(),
                DividerItemDecoration.VERTICAL);
        mRecyclerView.addItemDecoration(dividerItemDecoration);
        GoogleAnalyticsManager.trackGoogleAnalyticsEvent(GoogleAnalyticsManager.VIDEO_SCREEN_LOADED);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == android.R.id.home) {
            finish();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    public class SimpleItemRecyclerViewAdapter
            extends RecyclerView.Adapter<PDFListActivity.SimpleItemRecyclerViewAdapter.ViewHolder> {

        private final List<CategoryItemData.Response> mValues;

        public SimpleItemRecyclerViewAdapter(List<CategoryItemData.Response> items) {
            mValues = items;
        }

        @Override
        public PDFListActivity.SimpleItemRecyclerViewAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View view = LayoutInflater.from(parent.getContext())
                    .inflate(com.jain.vasunandisant.R.layout.item_video, parent, false);
            return new PDFListActivity.SimpleItemRecyclerViewAdapter.ViewHolder(view);
        }

        @Override
        public void onBindViewHolder(final PDFListActivity.SimpleItemRecyclerViewAdapter.ViewHolder holder, final int position) {
            holder.mItem = mValues.get(position);
            holder.mIdView.setText(mValues.get(position).getTitle()+"");
            holder.mContentView.setText(mValues.get(position).getSubtitle()+"");
            if (TextUtils.isEmpty(holder.mItem.getLogo())){
                holder.mImageView.setVisibility(View.GONE);
            } else {
                holder.mImageView.setVisibility(View.VISIBLE);
                Glide.with(PDFListActivity.this).load(holder.mItem.getLogo()).into(holder.mImageView);
            }
            holder.mView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                        Context context = v.getContext();
                        Intent intent = new Intent(context, WebViewActivity.class);
                        intent.putExtra(AppConstants.WEBVIEW_CONTENT, mValues.get(position).getLink());
                        intent.putExtra(AppConstants.WEBVIEW_TITLE,mValues.get(position).getTitle());
                        context.startActivity(intent);

                }
            });
        }

        @Override
        public int getItemCount() {
            return mValues.size();
        }

        public class ViewHolder extends RecyclerView.ViewHolder {
            public final View mView;
            public final TextView mIdView;
            public final TextView mContentView;
            public final ImageView mImageView;
            public CategoryItemData.Response mItem;

            public ViewHolder(View view) {
                super(view);
                mView = view;
                mIdView = (TextView) view.findViewById(com.jain.vasunandisant.R.id.id);
                mImageView = (ImageView) view.findViewById(com.jain.vasunandisant.R.id.logo);
                mContentView = (TextView) view.findViewById(com.jain.vasunandisant.R.id.content);
            }

            @Override
            public String toString() {
                return super.toString() + " '" + mContentView.getText() + "'";
            }
        }
    }
}
