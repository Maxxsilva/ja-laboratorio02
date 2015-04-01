package com.example.laboratorio02;

import android.app.Activity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;
import android.widget.TextView;

public class MainActivity extends Activity {
	
	private TextView t1, t2;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		 t1 = (TextView)findViewById(R.id.editText1);
		 t2 = (TextView)findViewById(R.id.editText2);
	}
	
	public void onClickBotaoOK(View view) {
		if (TextUtils.isEmpty(t1.getText()) || TextUtils.isEmpty(t2.getText())) {
			Toast.makeText(this, "Campos não podem ser vazios!", Toast.LENGTH_SHORT).show();
		} else {
			Toast.makeText(this, "Logando do sistema aguarde...", Toast.LENGTH_LONG).show();
		}
	}
	
	public void onClickBotaoCancelar(View view) {
		Toast.makeText(this, "Limpando os dados...", Toast.LENGTH_LONG).show();
		t1.setText("");
		t2.setText("");
		// retornando o foco para o primeiro campo
		t1.requestFocus();
	}
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
