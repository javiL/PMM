package com.example.projcontrolesbasicos;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	@Override
		public boolean onOptionsItemSelected(MenuItem item){
			int itemId = item.getItemId();
		
			switch(itemId) {
				case R.id.MenuOpc1:
					Intent intentBasico = new Intent(this,BotonesBasicos.class);
					startActivity(intentBasico);
					
					break;
				case R.id.MenuOpc2:
					Intent intentSeleccion = new Intent(this,BotoneSeleccion.class);
					startActivity(intentSeleccion);
					
					break;
			    case R.id.MenuOpc3:
			    	Intent intentAcercaDe = new Intent(this,AcercaDe.class);
			    	startActivity(intentAcercaDe);
		}
		return super.onOptionsItemSelected(item);
	}
	
}
