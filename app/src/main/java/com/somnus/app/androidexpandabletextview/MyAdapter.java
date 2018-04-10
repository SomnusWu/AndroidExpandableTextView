package com.somnus.app.androidexpandabletextview;

import android.support.annotation.Nullable;
import android.util.SparseBooleanArray;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.ms.square.android.expandabletextview.ExpandableTextView;

import java.util.List;

/**
 * Created by Somnus on 2018/4/10.
 */

public class MyAdapter extends BaseQuickAdapter<String, BaseViewHolder> {
    public SparseBooleanArray mCollapsedStatus;

    public MyAdapter() {
        super(R.layout.item_layout);
        mCollapsedStatus = new SparseBooleanArray();
    }

    @Override
    protected void convert(BaseViewHolder helper, String item) {
        final ExpandableTextView expTv1 = (ExpandableTextView) helper.itemView.findViewById(R.id.etv);
        // IMPORTANT - call setText on the ExpandableTextView to set the text content to display
        expTv1.setText("我是很长长长长长长长长长长长长长长长长长长长长长长长长长长长长长长长长长长长长" +
                "长长长长长长长长长长长长长长长长长长长长长长长长长长长长长", mCollapsedStatus, helper.getAdapterPosition());
    }
}
