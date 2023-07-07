package com.example.evchargingapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.ListAdapter;
import androidx.recyclerview.widget.RecyclerView;

import com.example.evchargingapp.databinding.ItemRvChargersBinding;
import com.google.protobuf.Internal;

class ChargerAdapter extends ListAdapter<Charger, ChargerAdapter.ViewHolder> {

    public ChargerAdapter() {
        super(new ChargerDiffUtilCallback());
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());

        return new ChargerAdapter.ViewHolder(ItemRvChargersBinding.inflate(inflater, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.bind(getItem(position));
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        private final ItemRvChargersBinding binding;

        public ViewHolder(@NonNull ItemRvChargersBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }

        void bind(Charger charger) {
            binding.setCharger(charger);

            binding.imageView.setImageResource(charger.getImgResource());
            binding.executePendingBindings();
        }
    }
}