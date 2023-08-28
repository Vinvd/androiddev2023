package vn.edu.usth.weather;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
public class WeatherActivity extends AppCompatActivity {
    private static final String TAG = "WeatherActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        ForecastFragment f = new ForecastFragment();
//        getSupportFragmentManager().beginTransaction().add(
//                R.id.activity_weather, f).commit()

        Log.i(TAG, "=====App created=====");
    }
    @Override
    protected void  onStart(){
        super.onStart();
        Log.i(TAG,"*****App Started*****");
    }
    @Override
    protected void onResume(){
        super.onResume();
        Log.i(TAG,"-----App resumed-----");
    }

    @Override
    protected void onPause(){
        super.onPause();
        Log.i(TAG,"-----App Paused-----");
    }

    @Override
    protected void onStop(){
        super.onStop();
        Log.i(TAG,"*****App Stopped*****");
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.i(TAG,"=====App Destroyed=====");
    }

}
