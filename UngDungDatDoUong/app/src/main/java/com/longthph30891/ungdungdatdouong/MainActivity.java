package com.longthph30891.ungdungdatdouong;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

import com.longthph30891.ungdungdatdouong.databinding.ActivityMainBinding;
import com.longthph30891.ungdungdatdouong.fragment.CartFragment;
import com.longthph30891.ungdungdatdouong.fragment.FavoriteFragment;
import com.longthph30891.ungdungdatdouong.fragment.HomeFragment;
import com.longthph30891.ungdungdatdouong.fragment.MyProfileFragment;
import com.longthph30891.ungdungdatdouong.fragment.VoucherFragment;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.bottomNavigationView.setOnItemSelectedListener(item -> {

            int id = item.getItemId();
            if(id == R.id.navigation_home){
                relaceFragment(new HomeFragment());


            }else if(id == R.id.navigation_favorte){
                relaceFragment(new FavoriteFragment());

            }else if(id == R.id.navigation_voucher){
                relaceFragment(new VoucherFragment());

            }else if(id == R.id.navigation_gio){
                relaceFragment(new CartFragment());

            }else if(id == R.id.navigation_in4){
                relaceFragment(new MyProfileFragment());

            }


            return true;
        });
    }

    private void relaceFragment (Fragment fragment){
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.fragment_layout, fragment);
        fragmentTransaction.commit();
    }
}