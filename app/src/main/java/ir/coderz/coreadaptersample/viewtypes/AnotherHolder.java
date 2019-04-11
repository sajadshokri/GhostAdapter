package ir.coderz.coreadaptersample.viewtypes;


import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import ir.coderz.coreadaptersample.R;
import ir.coderz.ghostadapter.GhostViewHolder;

/**
 * Created by sajad on 6/30/16.
 */
public class AnotherHolder extends GhostViewHolder {

    private final Button button;
    private final TextView text;

    public AnotherHolder(View itemView) {
        super(itemView);
        text = itemView.findViewById(R.id.text);
        button = itemView.findViewById(R.id.button);
    }

    public Button getButton() {
        return button;
    }

    public TextView getText() {
        return text;
    }
}
