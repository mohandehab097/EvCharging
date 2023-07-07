package com.example.evchargingapp;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.DiffUtil;

import java.util.Objects;

public class ChargerDiffUtilCallback extends DiffUtil.ItemCallback<Charger> {
    @Override
    public boolean areItemsTheSame(@NonNull Charger oldItem, @NonNull Charger newItem) {
        return oldItem.getId() == newItem.getId();
    }

    @Override
    public boolean areContentsTheSame(@NonNull Charger oldItem, @NonNull Charger newItem) {
        return Objects.equals(oldItem, newItem);
    }
}
