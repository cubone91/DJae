package com.dj.djae.Adapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;
import com.dj.djae.Fragment.LikeFragment;
import com.dj.djae.Fragment.ProfileFragment;

public class ContentsPagerAdapter extends FragmentStatePagerAdapter {
    private int mPageCount;

    public ContentsPagerAdapter(FragmentManager fm, int pageCount) {
        super(fm);
        this.mPageCount = pageCount;
    }


    @Override

    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                ProfileFragment profileFragment = new ProfileFragment();
                return profileFragment;
            case 1:
                LikeFragment likeFragment = new LikeFragment();
                return likeFragment;
            default:
                return null;
        }
    }


    @Override

    public int getCount() {

        return mPageCount;

    }
}
