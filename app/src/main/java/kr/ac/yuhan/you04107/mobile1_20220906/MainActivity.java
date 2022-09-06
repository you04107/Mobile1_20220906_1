package kr.ac.yuhan.you04107.mobile1_20220906;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = findViewById(R.id.but);
        //  Anonymous class(익명클래스) 객체
        btn.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view){
                Toast t = Toast.makeText(MainActivity.this,
                            "내일은 9월 7일 수요일입니다.", Toast.LENGTH_LONG);
                t.show();
          }
    });
}

}