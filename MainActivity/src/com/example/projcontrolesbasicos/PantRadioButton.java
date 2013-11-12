package com.example.projcontrolesbasicos;

import android.app.Activity;
import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class PantRadioButton extends Activity{
	
	@Override
	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.pantradiobutton);
		
		
		final TextView lblMensaje = (TextView)findViewById(R.id.lblMensaje);
		final RadioGroup rgOpciones = (RadioGroup)findViewById(R.id.gruporb);
		rgOpciones.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
	    
			@Override
			public void onCheckedChanged(RadioGroup group, int checkedId) {
				int selected = rgOpciones.getCheckedRadioButtonId();
			    RadioButton b = (RadioButton)findViewById(selected);
				lblMensaje.setText("Has seleccionado: " +b.getText());
			}
		});
		
	}
}
