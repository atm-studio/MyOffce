package com.tm_studio.myoffice.fragment;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.tm_studio.myoffice.R;
import com.tm_studio.myoffice.adapter.RemindListAdapter;
import com.tm_studio.myoffice.dto.OfficeDTO;

import java.util.ArrayList;
import java.util.List;

public class NotificationFragment extends AbstractTabFragment{

    private static final int LAYOUT = R.layout.fragment_notification;

    public static NotificationFragment getInstance(Context context) {
        Bundle args = new Bundle();
        NotificationFragment fragment = new NotificationFragment();
        fragment.setArguments(args);
        fragment.setContext(context);
        fragment.setTitle(context.getString(R.string.tab_item_notification));

        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(LAYOUT, container, false);

        RecyclerView rv = (RecyclerView) view.findViewById(R.id.recycleView);
        rv.setLayoutManager(new LinearLayoutManager(context));
        rv.setAdapter(new RemindListAdapter(createMockRemindListData()));

        return view;
    }

    private List<OfficeDTO> createMockRemindListData() {
        List<OfficeDTO> data = new ArrayList<>();
        data.add(new OfficeDTO("Item 1"));
        data.add(new OfficeDTO("Item 2"));
        data.add(new OfficeDTO("Item 3"));
        data.add(new OfficeDTO("Item 4"));
        data.add(new OfficeDTO("Item 5"));
        data.add(new OfficeDTO("Item 6"));

        return data;
    }

    public void setContext(Context context) {
        this.context = context;
    }

}
