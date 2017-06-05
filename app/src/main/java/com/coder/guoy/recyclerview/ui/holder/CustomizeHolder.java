package com.coder.guoy.recyclerview.ui.holder;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.coder.guoy.recyclerview.R;
import com.coder.guoy.recyclerview.base.MvvmBaseActivity;
import com.coder.guoy.recyclerview.databinding.ActivityCustomizeHolderBinding;
import com.coder.guoy.recyclerview.ui.ClassificationActivity;
import com.coder.guoy.recyclerview.ui.PlayMusic;
import com.coder.guoy.recyclerview.ui.PlayTextView;
import com.coder.guoy.recyclerview.ui.tagcloud.TagCloudActivity;

/**
 * @Version:
 * @Author:
 * @CreateTime:2017年6月1日
 * @Descrpiton:自定义
 */
public class CustomizeHolder extends MvvmBaseActivity<ActivityCustomizeHolderBinding> implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customize_holder);
        showContentView();
        bindingView.customize.textviewTitle.setText("Customize|自定义");
        bindingView.customize.toolbarBack.setOnClickListener(this);
        bindingView.btnTagcloud.setOnClickListener(this);
        bindingView.btnCombination.setOnClickListener(this);
        bindingView.btnRecttextview.setOnClickListener(this);
        bindingView.btnView.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.toolbar_back:
                finish();
                break;
            case R.id.btn_tagcloud:
                startActivity(new Intent(CustomizeHolder.this, TagCloudActivity.class));
                break;
            case R.id.btn_combination:
                startActivity(new Intent(CustomizeHolder.this, ClassificationActivity.class));
                break;
            case R.id.btn_recttextview:
                startActivity(new Intent(CustomizeHolder.this, PlayTextView.class));
                break;
            case R.id.btn_view:
                startActivity(new Intent(CustomizeHolder.this, PlayMusic.class));
                break;
        }
    }
}
