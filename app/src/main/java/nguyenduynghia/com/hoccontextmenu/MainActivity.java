package nguyenduynghia.com.hoccontextmenu;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import java.util.zip.Inflater;

import nguyenduynghia.com.hoccontextmenu.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {


    ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        addControlls();
    }

    private void addControlls() {

        registerForContextMenu(binding.button);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        MenuInflater menuInflater=getMenuInflater();
        menuInflater.inflate(R.menu.main_context_menu,menu);

    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId())
        {
            case R.id.mnuMauDo:
                binding.button.setTextColor(Color.RED);
                break;
            case  R.id.mnuMauVang:
                binding.button.setTextColor(Color.YELLOW);
                break;
            case R.id.mnuMauXanh:
                binding.button.setTextColor(Color.BLUE);
                break;
        }

        return super.onContextItemSelected(item);
    }
}
