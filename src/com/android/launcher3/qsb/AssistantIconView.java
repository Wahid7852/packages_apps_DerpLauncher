package com.android.launcher3.qsb;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.android.launcher3.R;
import com.android.launcher3.qsb.QsbContainerView;

public class AssistantIconView extends ImageView {

    public AssistantIconView(Context context, AttributeSet attrs) {
        super(context, attrs);
        setScaleType(ScaleType.CENTER);
        setOnClickListener(view -> {
            Intent intent = new Intent(Intent.ACTION_MAIN);
            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
            intent.setAction("com.google.android.googlequicksearchbox.MUSIC_SEARCH");
            context.startActivity(intent);
        });
    }

    public AssistantIconView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        setScaleType(ScaleType.CENTER);
        setOnClickListener(view -> {
            Intent intent = new Intent(Intent.ACTION_MAIN);
            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
            intent.setAction("com.google.android.googlequicksearchbox.MUSIC_SEARCH");
            context.startActivity(intent);
        });
    }

}
