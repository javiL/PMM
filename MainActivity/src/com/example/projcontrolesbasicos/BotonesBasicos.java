package com.example.projcontrolesbasicos;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;


public class BotonesBasicos extends Activity {

		@Override
		protected void onCreate(Bundle savedInstanceState){
			super.onCreate(savedInstanceState);
			setContentView(R.layout.pantcontrolesbasicos);
		}
		
		//ONCLICK definidos en el XML
		
		public void lanzarRadioButton(View v){
			Intent i = new Intent(this, PantRadioButton.class);
			startActivity(i);
		}
		public void lanzarCheckBox(View v){
			Intent intentCheckBox = new Intent(this, PantCheckBox.class);
			startActivity(intentCheckBox);
		}
		
		public void lanzarSaludo(View v){
			final EditText txtNombre = (EditText)findViewById(R.id.EdtNombre);
			
			Intent intentSaludo = new Intent(this, PantSaludo.class);
			Bundle bundle = new Bundle();
			bundle.putString("NOMBRE", txtNombre.getText().toString());
			
			intentSaludo.putExtras(bundle);
			
			startActivity(intentSaludo);
		}
}
