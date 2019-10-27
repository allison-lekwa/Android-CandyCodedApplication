package com.pluralsight.candycoded;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

import static android.net.Uri.parse;

public class InfoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);

        Uri uri = parse("android.resource://com.codeschool.candycoded/" + R.drawable.store_front);
        ImageView candyStoreImageView = (ImageView)findViewById(R.id.image_view_candy_store);
        Picasso.with(this).
                load(uri).
                into(candyStoreImageView);


    }

    // ***
    // TODO - Task 2 - Launch the Google Maps Activity
    // ***

    // ***
    // TODO - Task 3 - Launch the Phone Activity
    // ***

    // The createMapIntent method -->

    public void createMapIntent(View view){

        //creates the Uri
        Uri uri = Uri.parse("geo:0,0?q=618 E South St Orlando, FL 32801");

        // creates the mapIntent
        Intent mapIntent = new Intent(Intent.ACTION_VIEW, uri);

        //make the intent explicit
        mapIntent.setPackage("com.google.android.apps.maps");

        mapIntent.resolveActivity(getPackageManager());

        //Start the mapIntent
        startActivity(mapIntent);
    }

    // The createPhoneIntent method -->
    public void createPhoneIntent(View view){

        //creates the ACTION_DIAL intent
        Intent intent = new Intent(Intent.ACTION_DIAL);

        //creates the Uri
        Uri uri = Uri.parse("tel:0123456789");

        //sets the intent data
         intent.setData(uri);

         //start the intent activity
        startActivity(intent);





    }
}
