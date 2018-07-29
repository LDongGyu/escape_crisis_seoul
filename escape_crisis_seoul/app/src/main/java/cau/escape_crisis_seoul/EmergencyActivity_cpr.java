package cau.escape_crisis_seoul;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class EmergencyActivity_cpr extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_emergency_cpr);

        /*처음 전화걸기 버튼을 눌렀을시 지정한 전화번호로 이동하는것 내용저장*/
        /*
        Button callButton = (Button) findViewById(R.id.call_button);
        callButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Intent.ACTION_DIAL,
                        Uri.parse("tel:01046537612"));
                startActivity(i);
            }
        });*/
    }
}
