package top.foxhome.demo.hellojni;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button mButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mButton = findViewById(R.id.btn);
        mButton.setOnClickListener((v) -> {
            Toast.makeText(MainActivity.this, JniUtil.getInfo(), Toast.LENGTH_SHORT).show();
        });
    }
}