package com.example.carlos.socialnetwork;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


public class FragmentViewer extends Fragment {
    ImageView imageView;
    TextView textTitle;
    TextView textDescription;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_viewer,container,false);

        imageView = view.findViewById(R.id.image_network);
        textTitle = view.findViewById(R.id.text_name);
        textDescription = view.findViewById(R.id.text_description);

        Bundle bundle = this.getArguments();

        if(bundle != null){
            imageView.setImageResource(getImageId(getActivity(),bundle.getString("IMAGE_L")));
            textTitle.setText(bundle.getString("TITLE_L"));
            textDescription.setText(bundle.getString("DESCRIPTION_L"));
        }

        return view;
    }
    private static int getImageId(Context context, String imageName) {
        return context.getResources().getIdentifier("drawable/" + imageName, null, context.getPackageName());
    }
}
