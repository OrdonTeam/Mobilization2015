package com.mobilization;

import android.support.annotation.DrawableRes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public final class ViewAdapter {

    private final int drawableIcon;
    private final String text;

    public ViewAdapter(@DrawableRes int drawableIcon, String text) {
        this.drawableIcon = drawableIcon;
        this.text = text;
    }

    public void bind(ViewHolder holder) {
        holder.drawableView.setImageResource(drawableIcon);
        holder.textView.setText(text);
    }

    public static List<ViewAdapter> longRandomList() {
        List<ViewAdapter> adapters = new ArrayList<>();
        Random random = new Random();
        List<Integer> drawables = Arrays.asList(R.drawable.circle1, R.drawable.circle2, R.drawable.circle3, R.drawable.circle4, R.drawable.circle5, R.drawable.circle6, R.drawable.circle7, R.drawable.circle8);
        List<String> texts = Arrays.asList("Triangle", "Red and black", "Plus sign", "Person", "Arrow down", "Share like icon", "Arrow left", "Arrow up");
        for (int i = 0; i < 100; i++) {
            adapters.add(new ViewAdapter(
                            drawables.get(random.nextInt(drawables.size())),
                            texts.get(random.nextInt(texts.size())))
            );
        }
        return adapters;
    }
}
