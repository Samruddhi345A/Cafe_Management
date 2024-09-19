import java.util.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class CafeManagementSystem extends KeyAdapter implements ActionListener
{   	
	int i=0;
	Item item1[] = new Item[25];
	Frame f,mf;
	JLabel bkimage,label_menu,i1,i2,i3,i4,i5,i6,label_name,label_order,label_qty,label_total,label_tamount;
	JTextField field_name,field_order,field_qty;
	JScrollPane sp1,sp2;
	JTextArea area_orders,area_prices;
	JButton button_add,button_submit;
	
	CafeManagementSystem(){
	
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
		bkimage=new JLabel(new ImageIcon("D:\\advancejavaprograms\\CafeManagement\\cafeup.jpg"));
		label_menu=new JLabel("MENU");
		i1=new JLabel("1.Coffee");
		i2=new JLabel("2.Ice Coffee");
		i3=new JLabel("3.Tea");
		i4=new JLabel("4.Sandwich");
		i5=new JLabel("5.Chocolate Milk");
		i6=new JLabel("6.Cookies");
		label_name=new JLabel("Your Name: ");
		field_name = new JTextField(50);
		
		label_order = new JLabel("Your Order: ");
		field_order = new JTextField(2);
		
		label_qty = new JLabel("Your Order Quantity: ");	
		field_qty = new JTextField(3);
		
		button_add = new JButton("Add");
		
		area_orders = new JTextArea(10,10);
		sp1 = new JScrollPane();
		sp2 = new JScrollPane();
		area_prices = new JTextArea(10,10);
		
		label_total = new JLabel("Total Amount: ");
		
		button_submit = new JButton("Bill Amount");		
		
		label_tamount = new JLabel("...");
		
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
		label_tamount.setBounds(300,450,370,480);
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
		
		button_add.addActionListener(this);
		button_submit.addActionListener(this);
		}
	
		
	public void actionPerformed(ActionEvent ae1){
		String customerName = "";
		if(ae1.getSource()==button_add){
			customerName = field_name.getText();
			int ch = Integer.parseInt(field_order.getText());
			item1[i]=getUserChoice(ch);
			i++;
			}
		else if(ae1.getSource()==button_submit){
			Order order = new Order(customerName,item1);
			String tamount = String.valueOf(order.totalAmount);
			label_tamount.setText(tamount);
			area_orders.setText(area_orders.getText()+"");
			area_prices.setText(area_prices.getText()+"");
			}
		}
	 public class Item {        
		String name;
       		double price;
		 public Item(String name, double price) 
		{
			this.name = name;
  			this.price = price;
 		 }   
	 }    
	public class Order 
	{	
        	String customerName;      
		Item[] items;      
  		int totalAmount;      
  		public Order(String customerName, Item[] items) 
		{
			this.customerName = customerName;
   			this.items = items;
			
			calculateTotalAmount();
		}
		  public void calculateTotalAmount() {
    this.totalAmount = 0;
    for (int j = 0; j < i; j++) {
        if (items[j] != null) {
            int qty = Integer.parseInt(field_qty.getText());
            this.totalAmount += items[j].price * qty;
        }
    }
}
	  }
   
 	public Item getUserChoice(int choice) 

	{  
		 switch (choice) 
		{
            
			case 1:
			area_orders.setText(area_orders.getText() + "\n" + "1.Coffee" + "\t" + field_qty.getText());
			area_prices.setText(area_prices.getText() + "\n" + (50 * Integer.parseInt(field_qty.getText())));
			return new Item("Coffee", 50);
           
			 case 2:
              		area_orders.setText(area_orders.getText() + "\n" + "2.Ice Coffee" + "\t" + field_qty.getText());
			area_prices.setText(area_prices.getText() + "\n" + 70 * Integer.parseInt(field_qty.getText()));
 			 return new Item("Ice Coffee", 70);
           
			case 3:
              		area_orders.setText(area_orders.getText() + "\n" + "3.Tea" + "\t" + field_qty.getText());
			area_prices.setText(area_prices.getText() + "\n" + 30 * Integer.parseInt(field_qty.getText()));
			  return new Item("Tea", 30);
          
			case 4:
               		area_orders.setText(area_orders.getText() + "\n" + "4.Sandwich" + "\t" + field_qty.getText());
			area_prices.setText(area_prices.getText() + "\n" + 100 * Integer.parseInt(field_qty.getText()));
			 return new Item("Sandwich", 100);		
	
			case 5:
              		area_orders.setText(area_orders.getText() + "\n" + "5.Chocolate Milk" + "\t" + field_qty.getText());
			area_prices.setText(area_prices.getText() + "\n" + 50 * Integer.parseInt(field_qty.getText()));
			 return new Item("Chocolate Milk", 50);			

			case 6:
               		area_orders.setText(area_orders.getText() + "\n" + "6.Cookies" + "\t" + field_qty.getText());
			area_prices.setText(area_prices.getText() + "\n" + 20 * Integer.parseInt(field_qty.getText()));
			  return new Item("Cookies", 20);
			
			default:
  			System.out.println("Invalid choice. Please choose again.");
			  return new Item("nothing",0);
 		}
	 }
	public static void main(String args[]) {
       	CafeManagementSystem c =new CafeManagementSystem();	
	}

}