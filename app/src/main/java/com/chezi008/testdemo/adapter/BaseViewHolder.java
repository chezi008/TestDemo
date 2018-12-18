package com.chezi008.testdemo.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.SparseArray;
import android.view.View;

/**
 * @author sailor
 * @description
 * @time 2018/11/21
 */
public class BaseViewHolder extends RecyclerView.ViewHolder {
    private SparseArray<View> mViews;
    private View mView;

    public BaseViewHolder(@NonNull View itemView) {
        super(itemView);
        this.mView = itemView;
        mViews = new SparseArray<>();
    }

    public <T extends View> T getView(int viewId) {
        View view = mViews.get(viewId);
        if (view == null) {
            view = mView.findViewById(viewId);
            mViews.put(viewId, view);
        }
        return (T) view;
    }

    public View getRootView() {
        return mView;
    }
}
