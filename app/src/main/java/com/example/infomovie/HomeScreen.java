package com.example.infomovie;


import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import androidx.viewpager2.widget.ViewPager2;


import android.os.Bundle;

import com.example.infomovie.fragments.NowPlaying;
import com.example.infomovie.fragments.PopularMovie;
import com.example.infomovie.fragments.UpcomingMovies;

public class HomeScreen extends FragmentActivity {
    private static final int NUM_PAGES = 3;
        private ViewPager2 viewPager;
    private FragmentStateAdapter pagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);
        // Instantiate a ViewPager2 and a PagerAdapter.
        viewPager = findViewById(R.id.pager);
        pagerAdapter = new ScreenSlidePagerAdapter(this);
        viewPager.setAdapter(pagerAdapter);

    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }
    private class ScreenSlidePagerAdapter extends FragmentStateAdapter {
        public ScreenSlidePagerAdapter(FragmentActivity fa) {
            super(fa);
        }

        @Override
        public Fragment createFragment(int position) {
            switch (position) {
                case 1:
                    return new NowPlaying();
                case 2:
                    return new UpcomingMovies();
                default:
                    return new PopularMovie();
            }
        }

        @Override
        public int getItemCount() {
            return NUM_PAGES;
        }
    }
}