package ir.coderz.coreadaptersample.viewtypes;

import android.view.View;
import android.widget.TextView;

import ir.coderz.coreadaptersample.R;
import ir.coderz.ghostadapter.GhostViewHolder;

/**
 * Created by sajad on 6/30/16.
 */
public class TextHolder extends GhostViewHolder {

    private final TextView textView;

    public TextHolder(View itemView) {
        super(itemView);
        textView = itemView.findViewById(R.id.text);
    }

    public TextView getTextView() {
        return textView;
    }
}
