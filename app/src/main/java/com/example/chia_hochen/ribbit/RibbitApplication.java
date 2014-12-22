package com.example.chia_hochen.ribbit;

import android.app.Application;

/**
 * Created by chia-ho.chen on 12/22/14.
 */
public class RibbitApplication extends Application {

    public void onCreate() {
        super.onCreate();

        Parse.enableLocalDatastore(this);

        Parse.initialize(this, "v8nRtGAEodwS4YBsrFvkAw3oYBC1kWCzEc0LT9VY", "DYDqOruxAwd94GPlYsNRJZxfUewAIu41TIVSDe3s");

    }
}
