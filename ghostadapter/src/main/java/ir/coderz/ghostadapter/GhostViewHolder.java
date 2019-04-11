package ir.coderz.ghostadapter;

import android.view.View;

import androidx.annotation.NonNull;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;

public class GhostViewHolder extends RecyclerView.ViewHolder {
    ViewDataBinding binding;

    public GhostViewHolder(@NonNull View itemView) {
        super(itemView);
    }
}
