package app.example.instagramclone;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParceApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        ParseObject.registerSubclass(Post.class);
        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("gYEuAedBRxkts5gjN56w1fyulH60sSMNqXoScSwo")
                .clientKey("nZsl2fvGqA7n02qoc2YvdUEp09IVoTMdkqbgv5aa")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
