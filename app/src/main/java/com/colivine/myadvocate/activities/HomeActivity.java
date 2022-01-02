package com.colivine.myadvocate.activities;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.FrameLayout;

import com.colivine.myadvocate.R;
import com.colivine.myadvocate.fragments.CaseFragment;
import com.colivine.myadvocate.fragments.DiaryFragment;
import com.colivine.myadvocate.fragments.HomeFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.tabs.TabLayout;

public class HomeActivity extends AppCompatActivity {

   // private BottomNavigationView bottomNavigationView;
//    FragmentManager fragmentManager;
//    final Fragment fragment1 = new HomeFragment();
//    final Fragment fragment2 = new CaseFragment();
//    final Fragment fragment3 = new DiaryFragment();
//    final FragmentManager fm = getSupportFragmentManager();
//    Fragment active = fragment1;
   TabLayout tabLayout;
    FrameLayout frameLayout;
    Fragment fragment = null;
    FragmentManager fragmentManager;
    FragmentTransaction fragmentTransaction;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        tabLayout=(TabLayout)findViewById(R.id.home_tab);
        frameLayout=(FrameLayout)findViewById(R.id.main_container);

        fragment = new HomeFragment();
        fragmentManager = getSupportFragmentManager();
        fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.main_container, fragment);
        fragmentTransaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        fragmentTransaction.commit();

        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                // Fragment fragment = null;
                switch (tab.getPosition()) {
                    case 0:
                        fragment = new HomeFragment();
                        break;
                    case 1:
                        fragment = new CaseFragment();
                        break;
                    case 2:
                        fragment = new DiaryFragment();
                        break;

                }
                FragmentManager fm = getSupportFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();
                ft.replace(R.id.main_container, fragment);
                ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
                ft.commit();
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });


//        bottomNavigationView=(BottomNavigationView) findViewById(R.id.btm_home_menu);
//        BottomNavigationView.OnNavigationItemSelectedListener navigationItemSelectedListener=new BottomNavigationView.OnNavigationItemSelectedListener() {
//            @Override
//            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
//
//                FragmentManager fm=null;
//                switch (item.getItemId()) {
//                    case R.id.btm_case_home:
//                        switchtoFragment1();
//                        break;
//                    case R.id.btm_case:
//                        switchtoFragment2();
//                        break;
//                    case R.id.btm_diary:
//                       switchtoFragment3();
//                        break;
//                }
//
//                return true;
//            }
//
//        };
//    }
//    public void switchtoFragment1(){
//        {
//            FragmentManager manager = getSupportFragmentManager();
//            manager.beginTransaction().replace(R.id.main_container, new HomeFragment()).commit();
//        }

//    }
//    public void switchtoFragment2(){
//        {
//            FragmentManager manager = getSupportFragmentManager();
//            manager.beginTransaction().replace(R.id.main_container, new CaseFragment()).commit();
//        }
//
//    }
//    public void switchtoFragment3(){
//        {
//            FragmentManager manager = getSupportFragmentManager();
//            manager.beginTransaction().replace(R.id.main_container, new DiaryFragment()).commit();
//        }

    }
}