package com.example.projcontrolesbasicos;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class BotoneSeleccion extends Activity{
	
	@Override
	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.pantcontroleseleccion);
	}
	
	//OnClick definidos en el XML
	
	public void lanzarList(View v){
		Intent intentLista = new Intent(this, PantList.class);
		startActivity(intentLista);
	}
	
	public void lanzarSpinner(View v){
		Intent intentSpinner = new Intent(this, PantSpinner.class);
		startActivity(intentSpinner);
	}
}
