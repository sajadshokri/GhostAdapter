package ir.coderz.coreadaptersample.viewtypes;

import android.databinding.ViewDataBinding;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import ir.coderz.coreadaptersample.R;
import ir.coderz.coreadaptersample.databinding.TextItemBinding;

/**
 * Created by sajad on 6/30/16.
 */
public class TextHolder extends RecyclerView.ViewHolder {

    TextItemBinding binding;
//    private final TextView textView;

    public TextHolder(ViewDataBinding binding) {
        super(binding.getRoot());
        this.binding = (TextItemBinding) binding;
//        textView = (TextView) itemView.findViewById(R.id.text);
    }

//    public TextView getTextView() {
//        return textView;
//    }
}
