package hhh.zjh.com.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {
    private Intent intent;
    private Bundle bundle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        Bundle bundle=this.getIntent().getExtras();
        int checkedId=bundle.getInt("checkedId");
        String sexText = "";
        if(checkedId==R.id.a){
            sexText="正确";
        }
        else{
            sexText="错误";
        }
        TextView tv1=(TextView)findViewById(R.id.display);
        tv1.setText("你的答案:"+sexText);
        Button btn_back=(Button)findViewById(R.id.btn_back);
        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ResultActivity.this.setResult(RESULT_OK,intent);
                ResultActivity.this.finish();
            }
        });
    }
}
