package ir.coderz.coreadaptersample.viewtypes;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import ir.coderz.coreadaptersample.R;

/**
 * Created by sajad on 6/30/16.
 */
public class AnotherHolder extends RecyclerView.ViewHolder {
    private final Button button;
    private final TextView text;

    public AnotherHolder(View itemView) {
        super(itemView);
        button = itemView.findViewById(R.id.button);
        text = itemView.findViewById(R.id.text);
    }

    public Button getButton() {
        return button;
    }

    public TextView getText() {
        return text;
    }
}
