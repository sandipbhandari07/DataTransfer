package clz.project.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    TextView name,name11;
    public static final String A= "A";
    public static final String B="B";
    private String a,b;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        name=findViewById(R.id.name1);
        name11=findViewById(R.id.name2);

        Intent intent=getIntent();
        a=intent.getStringExtra(A);
        b=intent.getStringExtra(B);

        name.setText(a);
        name11.setText(b);
    }
}