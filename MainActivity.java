package clz.project.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView p,t,r;
    Button btn;
    String a,b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        p=findViewById(R.id.p);
        t=findViewById(R.id.t);
        btn=findViewById(R.id.click);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                sendata();
            }
        });
    }

    private void sendata() {
        a=p.getText().toString();
        b=t.getText().toString();

        Intent intent= new Intent(MainActivity.this,MainActivity2.class);

        intent.putExtra(MainActivity2.A,a);
        intent.putExtra(MainActivity2.B,b);
        startActivity(intent);

    }
}

