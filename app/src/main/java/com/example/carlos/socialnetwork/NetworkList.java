package com.example.carlos.socialnetwork;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.lang.reflect.Array;
import java.util.ArrayList;


public class NetworkList extends ListFragment implements AdapterView.OnItemClickListener {

    Network network;
    ArrayList<Network> networkListObejct = new ArrayList<>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_network_list,container,false);

        network = new Network();
        network.setImagen("ic_facebook_material_circle");
        network.setNombre("Facebook");
        network.setDescripcion("Facebook es un sitio web de redes sociales creado por Mark Zuckerberg y fundado junto a Eduardo Saverin, Chris Hughes y Dustin Moskovitz. ");
        networkListObejct.add(network);

        network = new Network();
        network.setImagen("ic_youtubematerial_circle");
        network.setNombre("Youtube");
        network.setDescripcion("YouTube es un sitio web dedicado a compartir vídeos. Presenta una variedad de clips de películas, programas de televisión y vídeos musicales, así como contenidos amateur como videoblogs y YouTube Gaming.  ");
        networkListObejct.add(network);

        network = new Network();
        network.setImagen("ic_twitter_material_circle");
        network.setNombre("Twitter");
        network.setDescripcion("Twitter es un servicio de microblogging, con sede en San Francisco, California, con filiales en San Antonio y Boston en Estados Unidos. Twitter, Inc. fue creado originalmente en California, pero está bajo la jurisdicción de Delaware desde 2007");
        networkListObejct.add(network);

        return view;
    }

    @Override
    public void onActivityCreated( Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(getActivity(),android.R.layout.simple_list_item_1,network.getListNameNetworks());

        setListAdapter(adapter);
        getListView().setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        if(getResources().getConfiguration().orientation == Configuration.ORIENTATION_PORTRAIT){
            Intent intent = new Intent(getActivity().getApplicationContext(),Main2Activity.class);
            intent.setAction(Intent.ACTION_SEND);
            intent.setType("text/plain");
            Bundle bundle = new Bundle();
            /*Error logico*/
            bundle.putString("IMAGE_P",networkListObejct.get(position).getImagen());
            bundle.putString("TITLE_P",networkListObejct.get(position).getNombre());
            bundle.putString("DESCRIPTION_P",networkListObejct.get(position).getDescripcion());

            intent.putExtras(bundle);
            startActivity(intent);

        }
    }
}
