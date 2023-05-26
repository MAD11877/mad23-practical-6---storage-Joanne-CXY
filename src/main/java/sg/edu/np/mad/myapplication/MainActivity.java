package sg.edu.np.mad.myapplication;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.btnMessage);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMessageActivity();
            }
        });
    }

    public void openMessageActivity() {
        Intent intent = new Intent(this, MessageActivity.class);
        startActivity(intent);
    }

    public void displayToast(View v) {
        Toast.makeText(MainActivity.this, "Followed", Toast.LENGTH_SHORT).show();

    }

    public void showAlertDialog(View v) {
        Toast.makeText(MainActivity.this, "Followed", Toast.LENGTH_SHORT).show();
    }
}