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

    Network network = new Network();
    ArrayList<Network> networkListObejct = new ArrayList<>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_network_list,container,false);
        networkListObejct = network.getListNetworks();
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
            bundle.putString("IMAGE",networkListObejct.get(position).getImagen());
            bundle.putString("TITLE",networkListObejct.get(position).getNombre());
            bundle.putString("DESCRIPTION",networkListObejct.get(position).getDescripcion());

            intent.putExtras(bundle);
            startActivity(intent);

        }
    }
}
