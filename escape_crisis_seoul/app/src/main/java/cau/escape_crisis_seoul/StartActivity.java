package cau.escape_crisis_seoul;

import android.os.Bundle;
import android.net.Uri;
import android.content.Intent;
import android.app.Activity;
//import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class StartActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

        /*일단 응급버튼만 구현*/
        ImageButton dmdrmqButton = (ImageButton)findViewById(R.id.dmdrmqdmdrmqButton);
        dmdrmqButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent i = new Intent(StartActivity.this,
                        EmergencyActivity.class);
                startActivity(i);
            }
        });

    }


}
