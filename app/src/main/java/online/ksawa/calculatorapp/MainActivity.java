package online.ksawa.calculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView textView = findViewById(R.id.resultTXTView);
        Button btn = findViewById(R.id.oneBTN);
        textView.setText(input_digits(btn));






    }

    public String input_digits(View view) {
        Button btn = findViewById(view.getId());

        return (String) btn.getText();
    }

    //    protected String input_digits(View view){
//        switch(view.getId()){
//            case
//        }
//    }

}