package tech.luksha.bottomnavigationbardemo;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomNavigationView bottomNavigationView = (BottomNavigationView)
                findViewById(R.id.bottom_navigation);

        final TextView textView = (TextView) findViewById(R.id.textView);

        bottomNavigationView.setOnNavigationItemSelectedListener(
                new BottomNavigationView.OnNavigationItemSelectedListener() {
                    @Override
                    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                        switch (item.getItemId()) {
                            case R.id.action_chat:
                                textView.setText(getResources().getString(R.string.text_chat));
                                break;
                            case R.id.action_offers:
                                textView.setText(getResources().getString(R.string.text_offers));
                                break;
                            case R.id.action_notifications:
                                textView.setText(getResources().getString(R.string.text_notifications));
                                break;
                        }
                        return true;
                    }
                });
    }
}
