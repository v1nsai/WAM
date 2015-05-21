package com.rileinc.wam;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;


public class WAM_Activity extends Activity {

    //private ImageView mole1, mole2, mole3, mole4, mole5, mole6, mole7, mole8, mole9, mole10, mole11, mole12;
    private ImageView[] mole = new ImageView[12];
    private int[] moleId = new int[12];
    //private int moles=1;
    private String maybe;
    Context context = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.wam_view_layout);

        mole[1] = (ImageView) findViewById(R.id.mole1);
        mole[1].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context, "Whooo", Toast.LENGTH_SHORT).show();
            }
        });

        for (int i = 0; i < 13; i++) {
            mole[i] = (ImageView) findViewById(moleId[i]);
            mole[i].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    //do stuff eventually
                }
            });
        }

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_wam_, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


    public void startGame() {

    }
}