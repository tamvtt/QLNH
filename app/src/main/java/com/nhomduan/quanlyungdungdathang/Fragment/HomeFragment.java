package com.nhomduan.quanlyungdungdathang.Fragment;


import static com.nhomduan.quanlyungdungdathang.Activity.FlashActivity.userLogin;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import com.nhomduan.quanlyungdungdathang.Activity.ProductActivity;
import com.nhomduan.quanlyungdungdathang.Activity.SearchActivity;
import com.nhomduan.quanlyungdungdathang.Activity.ShowProductActivity;
import com.nhomduan.quanlyungdungdathang.Model.Product;
import com.nhomduan.quanlyungdungdathang.R;

public class HomeFragment extends Fragment {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    private TextView tvTenNguoiDung;
    private TextView tvTimKiem;

    private RecyclerView recyclerViewPopular;

    private ImageView imgSanPhamKhuyenMais;
    private RecyclerView rcvSanPhamKhuyenMai;

    private ImageView imgMoiNhat;
    private RecyclerView rcvSanPhamMoiNhat;

    View view;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view =  inflater.inflate(R.layout.fragment_home, container, false);
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initView(view);
        setUpTvHoTen();
        setUpTvTimKiem();
    }

    private void setUpTvTimKiem() {
        tvTimKiem.setOnClickListener(v -> {
            Intent intent = new Intent(getContext(), SearchActivity.class);
            startActivity(intent);
        });
    }

    private void setUpTvHoTen() {
        String hoTen = userLogin.getName();
        if (hoTen != null) {
            tvTenNguoiDung.setText("Hi " + hoTen);
        } else {
            String userName = userLogin.getUsername();
            tvTenNguoiDung.setText("Hi " + userName);
        }
    }

    private void initView(View view) {
        tvTenNguoiDung = view.findViewById(R.id.tvTenNguoiDung);
        tvTimKiem = view.findViewById(R.id.tvTimKiem);
        recyclerViewPopular = view.findViewById(R.id.recyclerViewPopular);
        imgSanPhamKhuyenMais = view.findViewById(R.id.imgSanPhamKhuyenMais);
        rcvSanPhamKhuyenMai = view.findViewById(R.id.rcvSanPhamKhuyenMai);
        imgMoiNhat = view.findViewById(R.id.imgMoiNhat);
        rcvSanPhamMoiNhat = view.findViewById(R.id.rcvSanPhamMoiNhat);
    }
}