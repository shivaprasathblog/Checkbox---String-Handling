package com.example.checkbox;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.EditText;

public class MainActivity extends Activity {

	EditText e1;
	CheckBox c1,c2,c3;
	String a,b,c,s,s1="";
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) 
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        e1=(EditText)findViewById(R.id.editText1);
        c1=(CheckBox)findViewById(R.id.checkBox1);
        c2=(CheckBox)findViewById(R.id.checkBox2);
        c3=(CheckBox)findViewById(R.id.checkBox3);
        
        c1.setOnCheckedChangeListener(new OnCheckedChangeListener() 
        {
			
			@Override
			public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) 
			{
				// TODO Auto-generated method stub
				
				if(isChecked==true)
				{
					a=c1.getText().toString();
					s1=s1.concat(a);
					e1.setText(s1);
					
				}
				else
				{
					s1=s1.replace(a,"");
					e1.setText(s1);
				}
			}
		});
        c2.setOnCheckedChangeListener(new OnCheckedChangeListener() 
        {
			
			@Override
			public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) 
			{
				// TODO Auto-generated method stub
				if(isChecked==true)
				{
					b=c2.getText().toString();
					s1=s1.concat(b);
					e1.setText(s1);
				}
				else
				{
					s1=s1.replace(b,"");
					e1.setText(s1);
				}
					
			}
		});
        c3.setOnCheckedChangeListener(new OnCheckedChangeListener() 
        {
	
        	@Override
        	public void onCheckedChanged(CompoundButton buttonView, boolean isChecked)
        	{
        		// TODO Auto-generated method stub
        		if(isChecked==true)
        		{
				c=c3.getText().toString();
				s1=s1.concat(c);
				e1.setText(s1);
        		}
			else
			{
				s1=s1.replace(c,"");
				e1.setText(s1);
			}
	}
});
        
    }
}