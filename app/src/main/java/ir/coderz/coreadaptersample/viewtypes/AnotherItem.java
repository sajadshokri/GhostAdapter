package ir.coderz.coreadaptersample.viewtypes;


import android.annotation.SuppressLint;
import android.view.View;

import ir.coderz.coreadaptersample.databinding.AnotherLayoutBinding;
import ir.coderz.ghostadapter.Binder;
import ir.coderz.ghostadapter.BindItem;
import ir.coderz.coreadaptersample.AnotherModel;
import ir.coderz.coreadaptersample.R;

/**
 * Created by sajad on 6/30/16.
 */
@BindItem(layout = R.layout.another_layout, holder = AnotherHolder.class, binding = AnotherLayoutBinding.class)
public class AnotherItem {
    private AnotherModel anotherModel;
    private OnItemClickListener onItemClickListener;

    public AnotherItem(AnotherModel anotherModel) {
        this.anotherModel = anotherModel;
    }

    @SuppressLint("SetTextI18n")
    @Binder
    public void bind(AnotherHolder viewHolder, AnotherLayoutBinding binding) {
        binding.setItem(anotherModel);
        binding.setItemClickListener(onItemClickListener);
    }

    public void setOnItemClickListener(OnItemClickListener onItemClickListener) {
        this.onItemClickListener = onItemClickListener;
    }

    public interface OnItemClickListener {
        void itemClick(View v, AnotherModel data);
    }
}
