package renu.algofocus;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button b1;
    EditText ed1,ed2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1 = findViewById(R.id.button);
        ed1 =findViewById(R.id.editText);
        ed2 =findViewById(R.id.editText2);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ed1.getText().toString().isEmpty() || ed2.getText().toString().isEmpty())
                {
                    Toast.makeText(MainActivity.this, "cannot login", Toast.LENGTH_SHORT).show();
                }else {
                    Toast.makeText(MainActivity.this, "login successfull", Toast.LENGTH_SHORT).show();
                }

            }
        });


    }
}
