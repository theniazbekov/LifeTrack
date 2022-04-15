package com.example.lifetrack.ui.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.lifetrack.data.models.OnBoardModel;
import com.example.lifetrack.databinding.ItemBoardBinding;
import com.example.lifetrack.utils.interfaces.OnItemClick;

import java.util.ArrayList;

public class BoardAdapter extends RecyclerView.Adapter<BoardAdapter.BoardViewHolder> {
    ArrayList<OnBoardModel> list = new ArrayList<>();
    OnItemClick listener;


    public BoardAdapter(ArrayList<OnBoardModel> list, OnItemClick listener) {
        this.list = list;
        this.listener = listener;
    }

    @NonNull
    @Override
    public BoardAdapter.BoardViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ItemBoardBinding binding =
                ItemBoardBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        return new BoardViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull BoardAdapter.BoardViewHolder holder, int position) {
        holder.onBind(list.get(position));

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class BoardViewHolder extends RecyclerView.ViewHolder {
        private ItemBoardBinding binding;

        public BoardViewHolder(ItemBoardBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }

        public void onBind(OnBoardModel boardModel) {
            binding.boardingAnimation.setAnimation(boardModel.getAnimation());
            binding.descriptionTv.setText(boardModel.getDescription());
            binding.nextBtn.setText(boardModel.getButtonText());
            binding.nextBtn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    listener.itemClick(getAdapterPosition());
                }
            });


        }
    }
}
