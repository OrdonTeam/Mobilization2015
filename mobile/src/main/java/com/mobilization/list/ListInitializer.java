package com.mobilization.list;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.mobilization.R;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public final class ListInitializer {

    public static void initList(Context context, View view) {
        RecyclerView recycler = (RecyclerView) view.findViewById(R.id.list);
        recycler.setLayoutManager(new LinearLayoutManager(context));
        recycler.setAdapter(new ListAdapter(longRandomList()));
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
