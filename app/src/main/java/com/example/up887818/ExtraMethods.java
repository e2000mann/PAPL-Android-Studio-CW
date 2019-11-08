package com.example.up887818;

import android.app.*;
import android.content.*;

public class ExtraMethods {

    //This allows me to start activities
    private Context context;

    public ExtraMethods(Context context){
        this.context = context;
    }

    public void getFired(String reason) {
        Intent i = new Intent(context, Fired.class);
        i.putExtra("reason", reason);
        context.startActivity(i);
    }

}
