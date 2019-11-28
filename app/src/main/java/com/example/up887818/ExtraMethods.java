package com.example.up887818;

import android.app.*;
import android.content.*;

import static androidx.core.app.NavUtils.navigateUpTo;

public class ExtraMethods {

    //This allows me to start activities
    private Activity activity;
    private Context context;

    public ExtraMethods(Activity a, Context c){
        this.activity = a;
        this.context = c;
    }

    public void setVariables(Activity a, Context c){
        this.activity = a;
        this.context = c;
    }

    public void getFired(String reason) {
        Intent i = new Intent(context, Fired.class);
        i.putExtra("reason", reason);
        context.startActivity(i);
    }

    public void checkIfGameFinished(int day){
        Intent i;
        if (day == 5){
            i = new Intent(context, Finished.class);
            context.startActivity(i);
        } else {
            i = new Intent(context, Temp.class);
            navigateUpTo(activity, i);
        }
    }

}
