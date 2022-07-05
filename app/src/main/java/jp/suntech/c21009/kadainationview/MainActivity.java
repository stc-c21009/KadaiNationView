package jp.suntech.c21009.kadainationview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView lvMenu = findViewById(R.id.lvMenu);
        lvMenu.setOnItemClickListener(new ListItemListener());
    }

    private class ListItemListener implements AdapterView.OnItemClickListener {

        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

            //String item = (String) parent.getItemAtPosition(position);
            TextView tvText = (TextView) view;
            String item = tvText.getText().toString();
            String show = "あなたが選んだ国名: " + item;
            //Toast.makeText(MainActivity.this, show, Toast.LENGTH_LONG).show();

            TextView output = findViewById(R.id.textView);
            output.setText(show);
        }
    }
}