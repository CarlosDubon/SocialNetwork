package com.example.carlos.socialnetwork;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    ImageView logoNetwork;
    TextView nameNetwork;
    TextView descriptionNetwork;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        logoNetwork = findViewById(R.id.image_network);
        nameNetwork = findViewById(R.id.text_name);
        descriptionNetwork = findViewById(R.id.text_description);

        Intent callingIntent = getIntent();
        String intentType = callingIntent.getType();
        String intentAction = callingIntent.getAction();

        if(Intent.ACTION_SEND.equals(intentAction) && intentType != null){
            if(intentType.equals("text/plain")){
                handdleRecivedText(callingIntent);
            }
        }
    }

    /*Verificar lo obtenido*/
    private void handdleRecivedText(Intent intent){
        String srcImage = intent.getStringExtra("IMAGE_P");
        String name = intent.getStringExtra("TITLE_P");
        String description = intent.getStringExtra("DESCRIPTION_P");

        Log.d("REQUEST",srcImage);

        if(srcImage != null && name != null && description != null){
            logoNetwork.setImageResource(getImageId(this,srcImage));
            nameNetwork.setText(name);
            descriptionNetwork.setText(description);
            Log.d("REQUEST",getImageId(this,srcImage)+"");
        }
    }
    private static int getImageId(Context context, String imageName) {
        return context.getResources().getIdentifier("drawable/" + imageName, null, context.getPackageName());
    }
}
