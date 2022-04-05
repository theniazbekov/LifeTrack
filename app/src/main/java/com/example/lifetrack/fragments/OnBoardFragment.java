package com.example.lifetrack.fragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.lifetrack.R;
import com.example.lifetrack.adapter.BoardAdapter;
import com.example.lifetrack.databinding.FragmentOnBoardBinding;
import com.example.lifetrack.model.BoardClient;
import com.example.lifetrack.model.BoardModel;

import java.util.ArrayList;


public class OnBoardFragment extends Fragment implements OnItemClick {
FragmentOnBoardBinding binding;
BoardAdapter adapter;
ArrayList<BoardModel>list;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
    binding = FragmentOnBoardBinding.inflate(getLayoutInflater());
    return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initAdapter();

    }

    private void initAdapter() {
       list = BoardClient.getList();
       adapter = new BoardAdapter(list,this);
       binding.pager.setAdapter(adapter);
       binding.wormDotsIndicator.setViewPager2(binding.pager);

    }

    @Override
    public void itemClick(int position){
        if (position ==0 || position == 1){
            binding.pager.setCurrentItem(binding.pager.getCurrentItem() + 1);
        }else {
            Navigation.findNavController(requireView()).navigate(R.id.taskFragment);
        }
    }
    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
        list.clear();
    }

}
