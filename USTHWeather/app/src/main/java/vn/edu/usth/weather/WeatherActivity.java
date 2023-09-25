package vn.edu.usth.weather;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.util.Log;
public class WeatherActivity extends AppCompatActivity {
    private static final String TAG = "WeatherActivity";

//    private void createFragment(Fragment fragment){
//        FragmentManager fragmentManager = getSupportFragmentManager();
//        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
//        fragmentTransaction.replace(R.id.frameLayout,fragment);
//        fragmentTransaction.commit();
//    }
    ForecastFragment forecastFragment = new ForecastFragment();

    ForecastFragment forecastFragment2 = new ForecastFragment();

    ForecastFragment forecastFragment3 = new ForecastFragment();
    FragmentManager fragmentManager = getSupportFragmentManager();
    FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fragmentTransaction.add(R.id.linearLayout,forecastFragment);
        fragmentTransaction.add(R.id.linearLayout,forecastFragment2);
        fragmentTransaction.add(R.id.linearLayout,forecastFragment3);
        fragmentTransaction.commit();
//        createFragment(new ForecastFragment());

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
