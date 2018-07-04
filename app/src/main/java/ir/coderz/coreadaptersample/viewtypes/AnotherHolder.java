package ir.coderz.coreadaptersample.viewtypes;

import android.databinding.ViewDataBinding;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import ir.coderz.coreadaptersample.R;
import ir.coderz.coreadaptersample.databinding.AnotherLayoutBinding;

/**
 * Created by sajad on 6/30/16.
 */
public class AnotherHolder extends RecyclerView.ViewHolder {

//    private final Button button;
//    private final TextView text;
    AnotherLayoutBinding binding;

    public AnotherHolder(ViewDataBinding binding) {
        super(binding.getRoot());
        this.binding = (AnotherLayoutBinding) binding;
//        text = (TextView) itemView.findViewById(R.id.text);
//        button = (Button) itemView.findViewById(R.id.button);
    }

//    public Button getButton() {
//        return button;
//    }

//    public TextView getText() {
//        return text;
//    }
}
