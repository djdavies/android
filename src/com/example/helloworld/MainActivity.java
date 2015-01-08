package com.example.helloworld;

import android.support.v7.app.ActionBarActivity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends ActionBarActivity {

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
    
    public void onBtnClicked(View v){
    	if(v.getId() == R.id.button1){
    		Button b1 = (Button) findViewById(R.id.button1);
    		EditText e1 = (EditText)findViewById(R.id.hexCode);
    		String text = e1.getText().toString();
    		//if(e1.getText().toString().contains(".*[#0123456789abcdef].*")) { 
	    		if(text.length() == 7) {
	    			b1.setTextColor(Color.parseColor(e1.getText().toString()));
	    			b1.setBackgroundColor(Color.parseColor(e1.getText().toString()));
	    		} else {
	    			Toast.makeText(getApplicationContext(), "Not enough characters/non-hex char used", Toast.LENGTH_SHORT).show();
	    		}	
    		//}
    	}
    }
}