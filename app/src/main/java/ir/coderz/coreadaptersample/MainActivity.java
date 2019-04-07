package ir.coderz.coreadaptersample;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.LinearLayoutManager;
import ir.coderz.coreadaptersample.databinding.ActivityMainBinding;
import ir.coderz.coreadaptersample.viewtypes.AnotherItem;
import ir.coderz.coreadaptersample.viewtypes.TextItem;
import ir.coderz.ghostadapter.GhostAdapter;

public class MainActivity extends AppCompatActivity implements AnotherItem.OnItemClickListener {

    private ActivityMainBinding binding;

    GhostAdapter coreAdapter = new GhostAdapter();
    List<Object> coreItems = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        binding.recycler.setLayoutManager(new LinearLayoutManager(this));
        binding.recycler.setAdapter(coreAdapter);

        int x = 30;
        for (int i = 0; i < x; i++) {
            if (i % 3 == 0) {
                coreItems.add(i, new TextItem());
            } else {
                AnotherItem anotherItem = new AnotherItem(new AnotherModel(i + "", "item " + i));
                anotherItem.setOnItemClickListener(this);
                coreItems.add(i, anotherItem);

            }
        }

        coreAdapter.addItems(coreItems);
        coreAdapter.removeItemRange(8, coreAdapter.getItemCount() - 3);
    }

    @Override
    public void itemClick(View v, AnotherModel data) {
        Toast.makeText(MainActivity.this, data.message, Toast.LENGTH_SHORT).show();
    }
}
