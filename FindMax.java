import java.applet.*;
import java.awt.*;
import java.awt.event.*;


public abstract class FindMax extends Applet implements ActionListener {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 
	 */
	
	Label result;
	TextField in1,in2,in3;
	Button btn;
	int a=0,b=0,c=0,max;
	
	public void init(){
		result=new Label("请输入3个待比较的整数：");
		in1=new TextField(20);
		in2=new TextField(20);
		in3=new TextField(20);
		
		btn=new Button("比较");
		add(in1);
		add(in2);
		add(in3);
		add(btn);
		add(result);
		btn.addActionListener(this);
				
	}
	public void actionPerformed(ActiveEvent e){
		a=Integer.parseInt(in1.getText());
		b=Integer.parseInt(in2.getText());
		c=Integer.parseInt(in3.getText());
		if(a>b)
			if(a>c)
				max=a;
			else
				max=c;
		else
			if(b>c)
				max=b;
			else
				max=c;
		result.setText("3个数中的最大数为："+max);
	}

}
