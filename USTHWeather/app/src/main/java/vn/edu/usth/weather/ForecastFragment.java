package vn.edu.usth.weather;

import android.graphics.Color;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Random;

public class ForecastFragment extends Fragment {
    View view;
    ArrayList<String> weather = new ArrayList<>();
    ArrayList<String> weekdays = new ArrayList<>();
    Random random = new Random();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_forecast, container, false);
        view.setBackgroundColor(Color.parseColor("#00FFFFFF"));


        weather.add("@drawable/sunny");
        weather.add("@drawable/snowy");
        weather.add("@drawable/rainy");
        weather.add("@drawable/rain_thunder");
        weather.add("@drawable/partly_cloudy");

        String randomWeather = weather.get(random.nextInt(weather.size()));
        ImageView imageView = view.findViewById(R.id.iconWeather);
        int resourceId = getResources().getIdentifier(randomWeather, "drawable", getActivity().getPackageName());
        imageView.setImageResource(resourceId);

        weekdays.add("Monday");
        weekdays.add("Tuesday");
        weekdays.add("Wednesday");
        weekdays.add("Thursday");
        weekdays.add("Friday");
        weekdays.add("Saturday");
        weekdays.add("Sunday");

        String randomWeekdays = weekdays.get(random.nextInt(weekdays.size()));
        TextView textView = view.findViewById(R.id.weekdaysName);
        textView.setText(randomWeekdays);

        return view;
    }
}