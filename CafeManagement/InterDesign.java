import java.util.Scanner;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class InterDesign extends KeyAdapter{
	Frame f,mf;
	InterDesign(){
		f = new Frame();
		f.setSize(1000,1000);
		f.setVisible(true);  
      		f.setExtendedState(JFrame.MAXIMIZED_BOTH);
		ImageIcon image = new ImageIcon("D:\\advancejavaprograms\\CafeManagement\\cafeAd.jpg");
		f.add(new JLabel(image));
		f.pack();
		f.addKeyListener(this);
	}	
	public void keyPressed(KeyEvent ke){
		f.dispose();
		MenuFrame();
	}
	public void MenuFrame(){
		mf = new Frame();
		mf = new Frame();
		mf.setSize(1000,1000);
		mf.setVisible(true); 
	        Toolkit tk=Toolkit.getDefaultToolkit(); //Initializing the Toolkit class.
		Dimension screenSize = tk.getScreenSize(); //Get the Screen resolution of our device.
		mf.setSize(screenSize.width,screenSize.height); 
		int s_w = screenSize.width;
		int s_h = screenSize.height;
		mf.setLayout(null);
		mf.setBackground(new Color(51,0,0));
		JLabel bkimage=new JLabel(new ImageIcon("D:\\advancejavaprograms\\CafeManagement\\cafeup.jpg"));
		JLabel label_menu=new JLabel("MENU");
		JLabel i1=new JLabel("1.Coffee");
		JLabel i2=new JLabel("2.Ice Coffee");
		JLabel i3=new JLabel("3.Tea");
		JLabel i4=new JLabel("4.Sandwich");
		JLabel i5=new JLabel("5.Chocolate Milk");
		JLabel i6=new JLabel("6.Cookies");
		JLabel label_name=new JLabel("Your Name: ");
		JTextField field_name = new JTextField(50);
		
		JLabel label_order = new JLabel("Your Order: ");
		JTextField field_order = new JTextField(2);
		
		JLabel label_qty = new JLabel("Your Order Quantity: ");	
		JTextField field_qty = new JTextField(3);
		
		JButton button_add = new JButton("Add");
		
		JTextArea area_orders = new JTextArea(10,10);
		JScrollPane sp1 = new JScrollPane();
		JScrollPane sp2 = new JScrollPane();
		JTextArea area_prices = new JTextArea(10,10);
		
		JLabel label_total = new JLabel("Total Amount: ");
		
		JButton button_submit = new JButton("Bill Amount");		
		
		JLabel label_tamount = new JLabel("...");
		
		bkimage.setBounds(0,50,s_w,160);
		
		label_menu.setBounds((s_w/2)-8,155,(s_w/2)+8,158);
		label_menu.setFont(new Font("Serif",Font.BOLD,44));
		label_menu.setForeground(Color.WHITE);
		
		i1.setBounds(550,180,590,195);
		i1.setFont(new Font("Serif",Font.PLAIN,24));
		i1.setForeground(Color.WHITE);
		i2.setBounds(550,210,590,225);
		i2.setFont(new Font("Serif",Font.PLAIN,24));
		i2.setForeground(Color.WHITE);
		i3.setBounds(550,240,590,255);
		i3.setFont(new Font("Serif",Font.PLAIN,24));
		i3.setForeground(Color.WHITE);
		i4.setBounds(800,180,850,195);
		i4.setFont(new Font("Serif",Font.PLAIN,24));
		i4.setForeground(Color.WHITE);
		i5.setBounds(800,210,850,225);
		i5.setFont(new Font("Serif",Font.PLAIN,24));
		i5.setForeground(Color.WHITE);
		i6.setBounds(800,240,850,255);
		i6.setFont(new Font("Serif",Font.PLAIN,24));
		i6.setForeground(Color.WHITE);
		
		label_name.setBounds(130,260,200,300);
		label_name.setFont(new Font("Serif",Font.PLAIN,18));
		label_name.setForeground(Color.WHITE);
		field_name.setBounds(250,400,560,30);
		
		label_order.setBounds(130,320,200,340);
		label_order.setFont(new Font("Serif",Font.PLAIN,18));
		label_order.setForeground(Color.WHITE);
		field_order.setBounds(250,480,50,30);
		
		label_qty.setBounds(400,320,430,340);
		label_qty.setFont(new Font("Serif",Font.PLAIN,18));
		label_qty.setForeground(Color.WHITE);
		field_qty.setBounds(600,480,50,30);
		
		button_add.setBounds(700,480,100,30);
		
		sp1.setBounds(250,540,230,100);
		area_orders.setBounds(0,0,230,100);
		sp2.setBounds(550,540,130,100);
		area_prices.setBounds(0,0,130,100);
		
		label_total.setBounds(130,450,170,480);
		label_total.setFont(new Font("Serif",Font.PLAIN,18));
		label_total.setForeground(Color.WHITE);
		label_tamount.setBounds(200,450,250,480);
		label_tamount.setFont(new Font("Serif",Font.PLAIN,18));
		label_tamount.setForeground(Color.WHITE);
		button_submit.setBounds(500,680,100,30);
		
		mf.add(bkimage);
		
		mf.add(i1);	
		mf.add(i2);
		mf.add(i3);
		mf.add(i4);
		mf.add(i5);
		mf.add(i6);
		
		mf.add(label_menu);
		
		mf.add(label_name);
		mf.add(field_name);
		
		mf.add(label_order);
		mf.add(field_order);
		
		mf.add(label_qty);
		mf.add(field_qty);
		
		mf.add(button_add);
		
		sp1.add(area_orders);
		mf.add(sp1);
		sp2.add(area_prices);
		mf.add(sp2);
		
		mf.add(label_total);
		mf.add(label_tamount);
		mf.add(button_submit);
	}
	public static void main(String args[]){ 
		InterDesign d = new InterDesign();
	}
}


	
