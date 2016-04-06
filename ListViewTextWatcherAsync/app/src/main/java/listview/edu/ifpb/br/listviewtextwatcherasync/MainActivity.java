package listview.edu.ifpb.br.listviewtextwatcherasync;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity implements View.OnClickListener{

    private EditText nomeEditText;

    private Button nomeButton;

    private String nome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nomeEditText = (EditText) findViewById(R.id.nomeEditText);

        nomeButton = (Button) findViewById(R.id.nomeButton);

        nomeButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        nome = nomeEditText.toString();

        Log.i("teste", "nome" +nome);

    }
}
