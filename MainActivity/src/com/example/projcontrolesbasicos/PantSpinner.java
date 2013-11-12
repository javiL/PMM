package com.example.projcontrolesbasicos;

import com.example.projcontrolesbasicos.R;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class PantSpinner extends Activity{
	
	private Spinner cmbOpciones;
	
	@Override
	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.pantspinner);
		
		
		cmbOpciones = (Spinner)findViewById(R.id.CmbOpciones);
		
		final String [] datos = 
				new String[]{"Soy el numero 1","Soy el segundon","Soy el madrid, tercero y gracias"};
		
		ArrayAdapter<String> adaptador =
				new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,datos);
		
		adaptador.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		
		cmbOpciones.setAdapter(adaptador);
	}
}
