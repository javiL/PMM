package com.example.projcontrolesbasicos;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class PantSaludo extends Activity{
	
	@Override
	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.pantsaludo);
		
		TextView txtSaludo = (TextView)findViewById(R.id.TxtSaludo);
		Bundle bundle = this.getIntent().getExtras();
		
		txtSaludo.setText("Hola " + bundle.getString("NOMBRE"));
		
	}
}
