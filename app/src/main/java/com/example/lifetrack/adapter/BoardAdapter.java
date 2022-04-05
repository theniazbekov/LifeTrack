package com.example.lifetrack.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.lifetrack.databinding.ItemBoardBinding;
import com.example.lifetrack.fragments.OnBoardFragment;
import com.example.lifetrack.fragments.OnItemClick;
import com.example.lifetrack.model.BoardModel;

import java.util.ArrayList;

public class BoardAdapter extends RecyclerView.Adapter<BoardAdapter.BoardViewHolder> {
   ArrayList<BoardModel> list;
   OnItemClick onItemClick;

   public BoardAdapter(ArrayList<BoardModel> list, OnBoardFragment onBoardFragment){
       this.list = list;
   }


    @NonNull
    @Override
    public BoardAdapter.BoardViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ItemBoardBinding binding = ItemBoardBinding.inflate(LayoutInflater.from(parent.getContext()), parent,false);
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
       ItemBoardBinding binding;

        public BoardViewHolder(@NonNull ItemBoardBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }

        public void onBind(BoardModel boardModel) {
            binding.boardImg.setImageResource(boardModel.getImage());
            binding.descriptionTv.setText(boardModel.getDescription());
            binding.nextBtn.setText(boardModel.getButtonText());
            binding.nextBtn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    onItemClick.itemClick(getAdapterPosition());
                }
            });


        }
    }
}
