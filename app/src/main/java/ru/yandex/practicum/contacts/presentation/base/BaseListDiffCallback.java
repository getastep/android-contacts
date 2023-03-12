package ru.yandex.practicum.contacts.presentation.base;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.DiffUtil;

public class BaseListDiffCallback<S extends ListDiffInterface<S>> extends DiffUtil.ItemCallback<S> {
    @Override
    public boolean areContentsTheSame(@NonNull S oldItem, @NonNull S newItem) {
        return oldItem.equals(newItem);
    }

    @NonNull
    @Override
    public Object getChangePayload(@NonNull S oldItem, @NonNull S newItem) {
        return newItem;
    }

    @Override
    public boolean areItemsTheSame(@NonNull S newItem, @NonNull S oldItem) {
        return oldItem.theSameAs(newItem);
    }


}
