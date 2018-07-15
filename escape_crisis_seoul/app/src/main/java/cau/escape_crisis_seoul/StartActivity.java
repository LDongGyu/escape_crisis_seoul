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

        /*처음 전화걸기 버튼을 눌렀을시 지정한 전화번호로 이동하는것 내용저장*/
        Button callButton = (Button)findViewById(R.id.call_button);
        callButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent i = new Intent(Intent.ACTION_DIAL,
                        Uri.parse("tel:01046537612"));
                startActivity(i);
            }
        });


    }


}
