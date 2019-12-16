package ujcv.edu.hn.book;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;


public class WelcomeActivity extends AppCompatActivity {
        public static final String user = "names";
        TextView textViewUser;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_welcome);
            textViewUser = (TextView)findViewById(R.id.titulo);
            String user = getIntent().getStringExtra("names");
            textViewUser.setText("¡Bienvenido "+ user +"!");



        }
    }

