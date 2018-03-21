package com.woodman.androidstart.Fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.woodman.androidstart.R;

/**
 * Created by Zver on 17.03.2018.
 */

public class GalleryFragment extends Fragment {

    private static final String ARG1="NAME";
    private String name;

    private ImageView imageViewAvatar;
    private TextView textViewName;

    public GalleryFragment() {
    }

    public static GalleryFragment newInstance(String name) {
        GalleryFragment fragment = new GalleryFragment();
        Bundle arg = new Bundle();
        arg.putString(ARG1,name);
        fragment.setArguments(arg);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if(getArguments()!=null){
            name=getArguments().getString(ARG1);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_gallery, container, false);
        getActivity().setTitle(getString(R.string.fragment_gallery_title));
        imageViewAvatar = view.findViewById(R.id.image_view_avatar_fragment_gallery);
        textViewName = view.findViewById(R.id.text_view_name_fragment_gallery);

        imageViewAvatar.setBackgroundResource(R.drawable.ic_account);
        textViewName.setText(name);

        return view;
    }
}
