package ir.coderz.coreadaptersample.viewtypes;

import android.annotation.SuppressLint;

import ir.coderz.coreadaptersample.databinding.TextItemBinding;
import ir.coderz.ghostadapter.Binder;
import ir.coderz.ghostadapter.BindItem;
import ir.coderz.coreadaptersample.R;

/**
 * Created by sajad on 6/30/16.
 */
@BindItem(layout = R.layout.text_item, holder = TextHolder.class, binding = TextItemBinding.class)
public class TextItem {
    private TextHolder textHolder;

    @SuppressLint("SetTextI18n")
    @Binder
    public void bind(TextHolder textHolder, TextItemBinding binding) {
        binding.setItem(textHolder.getAdapterPosition());
    }
}
