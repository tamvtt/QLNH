package com.nhomduan.quanlyungdungdathang.Fragment;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import com.nhomduan.quanlyungdungdathang.R;


public class LikeProductFragment extends Fragment {

    private RecyclerView rcvSanPhamYeuThich;
    private LinearLayout viewRoot;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_like_product, container, false);
    }
}