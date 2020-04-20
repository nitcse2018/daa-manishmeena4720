import java.awt.*;
import java.awt.event.*;
import java.io.FileWriter;
import java.io.IOException;
public class GUI {
	GUI()
	   {    
	      Frame fr=new Frame();
	      fr.setSize(1100, 800);
	      fr.setTitle("Candidate_Details");
	      fr.setLayout(null);
	      fr.setResizable(false);
	      fr.setVisible(true);
	      fr.setBackground(Color.ORANGE);
	      

	      Label alert = new Label("DATA Submitted",Label.CENTER);
	      fr.add(alert);
	      alert.setBounds(440, 30, 220, 50);
	      alert.setFont(new Font("Arial", Font.PLAIN, 20));
	      alert.setBackground(Color.red);
	      alert.setVisible(false);
	      
	      Label lb = new Label("CANDIDATE  DETAILS",Label.CENTER);
	      fr.add(lb);
	      lb.setBounds(350, 70, 440, 60);
	      lb.setFont(new Font("Arial", Font.BOLD, 40));
	      
	      Label lbp = new Label("Personal Info",Label.CENTER);
	      fr.add(lbp);
	      lbp.setBounds(170, 170, 200, 30);
	      lbp.setFont(new Font("Arial", Font.PLAIN, 30));

	      Label lb1 = new Label("  Full_name: ");
	      fr.add(lb1);
	      lb1.setBounds(100, 220, 120, 20);
	      TextField t1 = new TextField();
	      fr.add(t1);
	      t1.setBounds(250, 220, 190, 20);    
	      /*t1.addFocusListener(new FocusListener() {
	          public void focusGained(FocusEvent e) {
	              t1.setBackground(Color.red);
	            }

			@Override
			public void focusLost(FocusEvent e) {
				// TODO Auto-generated method stub
		  }});*/
	      Label lb11 = new Label("  Guardian_name: ");
	      fr.add(lb11);
	      lb11.setBounds(100, 250, 120, 20);
	      TextField t11 = new TextField();
	      fr.add(t11);
	      t11.setBounds(250, 250, 190, 20);           
	      
	      Label lb2 = new Label("  Email_Id: ");
	      fr.add(lb2);
	      lb2.setBounds(100, 280, 120, 20);
	      TextField t2 = new TextField();
	      fr.add(t2);
	      t2.setBounds(250, 280, 190, 20);
	      
	      Label lb3 = new Label("  Phone_no.: ");
	      fr.add(lb3);
	      lb3.setBounds(100, 310, 120, 20);
	      TextField t3 = new TextField();
	      fr.add(t3);
	      t3.setBounds(250, 310, 190, 20);
	      
	      Label lb5 = new Label("  D.O.B: ");
	      fr.add(lb5);
	      lb5.setBounds(100, 340, 120, 20);
	      TextField t5a = new TextField();
	      fr.add(t5a);
	      t5a.setBounds(250, 340, 30, 20);
	      Label lb5a = new Label("/",Label.CENTER);
	      fr.add(lb5a);
	      lb5a.setBounds(285, 340, 10, 20);
	      TextField t5b = new TextField();
	      fr.add(t5b);
	      t5b.setBounds(300, 340, 30, 20);
	      Label lb5b = new Label("/",Label.CENTER);
	      fr.add(lb5b);
	      lb5b.setBounds(335, 340, 10, 20);
	      TextField t5c = new TextField();
	      fr.add(t5c);
	      t5c.setBounds(350, 340, 50, 20);
	      
	      Label lb4 = new Label("  Address: ");
	      fr.add(lb4);
	      lb4.setBounds(100, 370, 120, 20);
	      TextArea t4 = new TextArea();
	      fr.add(t4);
	      t4.setBounds(250, 370, 190, 60);
	      
	      Label lbe = new Label("Education",Label.CENTER);
	      fr.add(lbe);
	      lbe.setBounds(170, 470, 200, 30);
	      lbe.setFont(new Font("Arial", Font.PLAIN, 30));
	      
	      Label lbe1 = new Label("  12th Board:");
	      fr.add(lbe1);
	      lbe1.setBounds(100, 520, 120, 20);
	      TextField te1 = new TextField();
	      fr.add(te1);
	      te1.setBounds(250, 520, 190, 20);
	      
	      Label lbe2 = new Label("  Percentage marks: ");
	      fr.add(lbe2);
	      lbe2.setBounds(100, 550, 120, 20);
	      TextField te2 = new TextField();
	      fr.add(te2);
	      te2.setBounds(250, 550, 190, 20);
	      
	      Label lbe3 = new Label("  Graduation University:");
	      fr.add(lbe3);
	      lbe3.setBounds(100, 600, 120, 20);
	      TextField te3 = new TextField();
	      fr.add(te3);
	      te3.setBounds(250, 600, 190, 20);
	      
	      Label lbe4 = new Label("  CGPA: ");
	      fr.add(lbe4);
	      lbe4.setBounds(100, 630, 120, 20);
	      TextField te4 = new TextField();
	      fr.add(te4);
	      te4.setBounds(250, 630, 190, 20);
	      
	      Label lbs = new Label("Skills",Label.CENTER);
	      fr.add(lbs);
	      lbs.setBounds(570, 170, 200, 30);
	      lbs.setFont(new Font("Arial", Font.PLAIN, 30));
	      
	      TextField ts1 = new TextField();
	      fr.add(ts1);
	      ts1.setBounds(620, 220, 190, 20);
	      Button bs1=new Button("+"); 
	      fr.add(bs1);
	      bs1.setFont(new Font("Arial", Font.PLAIN, 20));
	      bs1.setBounds(840,220,20,20);
	      
	      TextField ts2 = new TextField();
	      fr.add(ts2);
	      ts2.setBounds(620, 250, 190, 20);
	      ts2.setVisible(false);
	      Button bs2=new Button("+"); 
	      fr.add(bs2);
	      bs2.setFont(new Font("Arial", Font.PLAIN, 20));
	      bs2.setBounds(840,220,20,20);
	      bs2.setVisible(false);
	      
	      TextField ts3 = new TextField();
	      fr.add(ts3);
	      ts3.setBounds(620, 280, 190, 20);
	      ts3.setVisible(false);
	      Button bs3=new Button("+"); 
	      fr.add(bs3);
	      bs3.setFont(new Font("Arial", Font.PLAIN, 20));
	      bs3.setBounds(840,220,20,20);
	      bs3.setVisible(false);
	      
	      TextField ts4 = new TextField();
	      fr.add(ts4);
	      ts4.setBounds(620, 310, 190, 20);
	      ts4.setVisible(false);
	      bs1.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent e){
	            	bs1.setVisible(false);
	            	ts2.setVisible(true);
	            	bs2.setVisible(true);
	            }});
	      bs2.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent e){
	            	bs2.setVisible(false);
	            	ts3.setVisible(true);
	            	bs3.setVisible(true);
	            }});
	      bs3.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent e){
	            	bs3.setVisible(false);
	            	ts4.setVisible(true);
	            }});
	      
	      Label lbx = new Label("Project links",Label.CENTER);
	      fr.add(lbx);
	      lbx.setBounds(570, 370, 300, 30);
	      lbx.setFont(new Font("Arial", Font.PLAIN, 30));
	      
	      TextField tx1 = new TextField();
	      fr.add(tx1);
	      tx1.setBounds(620, 420, 190, 20);
	      Button bx1=new Button("+"); 
	      fr.add(bx1);
	      bx1.setFont(new Font("Arial", Font.PLAIN, 20));
	      bx1.setBounds(840,420,20,20);
	      bx1.setVisible(true);
	      
	      TextField tx2 = new TextField();
	      fr.add(tx2);
	      tx2.setBounds(620, 450, 190, 20);
	      tx2.setVisible(false);
	      Button bx2=new Button("+"); 
	      fr.add(bx2);
	      bx2.setFont(new Font("Arial", Font.PLAIN, 20));
	      bx2.setBounds(840,420,20,20);
	      bx2.setVisible(false);
	      
	      TextField tx3 = new TextField();
	      fr.add(tx3);
	      tx3.setBounds(620, 480, 190, 20);
	      tx3.setVisible(false);
	      Button bx3=new Button("+"); 
	      fr.add(bx3);
	      bx3.setFont(new Font("Arial", Font.PLAIN, 20));
	      bx3.setBounds(840,420,20,20);
	      bx3.setVisible(false);
	      
	      TextField tx4 = new TextField();
	      fr.add(tx4);
	      tx4.setBounds(620, 510, 190, 20);
	      tx4.setVisible(false);
	      bx1.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent e){
	            	bx1.setVisible(false);
	            	tx2.setVisible(true);
	            	bx2.setVisible(true);
	            }
	            });
	      bx2.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent e){
	            	bx2.setVisible(false);
	            	tx3.setVisible(true);
	            	bx3.setVisible(true);
	            }
	            });
	      bx3.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent e){
	            	bx3.setVisible(false);
	            	tx4.setVisible(true);
	            }
	            });
	      
	      Label lb9 = new Label("  Additional_info*: ");
	      fr.add(lb9);
	      lb9.setBounds(620, 590, 120, 20);
	      TextArea t9 = new TextArea();           
	      fr.add(t9);
	      t9.setBounds(620, 620, 190, 50);
	      
	      Button bc=new Button("Clear");
	      fr.add(bc);
	      bc.setBounds(515,710,70,30);
	      bc.addActionListener(new ActionListener() {  
	            public void actionPerformed(ActionEvent e) {
	            	t1.setText("");
	            	t11.setText("");
	            	t2.setText("");
	            	t3.setText("");
	            	t4.setText("");
	            	t5a.setText("");
	            	t5b.setText("");
	            	t5c.setText("");
	            	te1.setText("");
	            	te2.setText("");
	            	te3.setText("");
	            	te4.setText("");
	            	ts1.setText("");
	            	ts2.setText("");
	            	ts3.setText("");
	            	ts4.setText("");
	            	tx1.setText("");
	            	tx2.setText("");
	            	tx3.setText("");
	            	tx4.setText("");
	            	t9.setText("");
	            	alert.setVisible(false);
	            	
	            }
	            });       
	      Button bx=new Button("Exit"); 
	      fr.add(bx);
	      bx.setBounds(615,710,70,30);
	      bx.addActionListener(new ActionListener() {  
	            public void actionPerformed(ActionEvent e) {
	            	System.exit(0); 
	            }});
	      
	      Button b=new Button("Submit"); 
	      fr.add(b);
	      b.setBounds(415,710,70,30);  
	      b.addActionListener(new ActionListener() {  
	            public void actionPerformed(ActionEvent e) {       
	                String name=t1.getText();
	                String guardian=t11.getText();
	                String email=t2.getText();
	                String phone=t3.getText();
	                String address=t4.getText();
	                String dob=t5a.getText()+"/"+t5b.getText()+"/"+t5c.getText();
	                String misc=t9.getText();
	                String board_12=te1.getText();
	                String marks_12=te2.getText();
	                String btech_uni=te3.getText();
	                String btech_cgpa=te4.getText();
	                String skill1=ts1.getText();
	                String skill2=ts2.getText();
	                String skill3=ts3.getText();
	                String skill4=ts4.getText();
	                String p_link1=tx1.getText();
	                String p_link2=tx2.getText();
	                String p_link3=tx3.getText();
	                String p_link4=tx4.getText();
	        		FileWriter fw = null;
					try {
						fw = new FileWriter("C:/Users/HTC/Desktop/Data.csv",true);
					} catch (IOException e19) {
						// TODO Auto-generated catch block
						e19.printStackTrace();
					}
					try {
						fw.write("\n\n\n\n*PERSONAL INFO*");
					} catch (IOException e4) {
						// TODO Auto-generated catch block
						e4.printStackTrace();
					}
	                try {
						fw.write("\nName:,");
					} catch (IOException e18) {
						// TODO Auto-generated catch block
						e18.printStackTrace();
					}
	                try {
						fw.write(name);
					} catch (IOException e17) {
						// TODO Auto-generated catch block
						e17.printStackTrace();
					}
	                try {
						fw.write("\nGuardian_Name:,");
					} catch (IOException e3) {
						// TODO Auto-generated catch block
						e3.printStackTrace();
					}
	                try {
						fw.write(guardian);
					} catch (IOException e3) {
						// TODO Auto-generated catch block
						e3.printStackTrace();
					}
	                try {
						fw.write("\nEmail_Id:,");
					} catch (IOException e16) {
						// TODO Auto-generated catch block
						e16.printStackTrace();
					}
	                try {
						fw.write(email);
					} catch (IOException e15) {
						// TODO Auto-generated catch block
						e15.printStackTrace();
					}
	                try {
						fw.write("\nPhone:,");
					} catch (IOException e14) {
						// TODO Auto-generated catch block
						e14.printStackTrace();
					}
	                try {
						fw.write(phone);
					} catch (IOException e13) {
						// TODO Auto-generated catch block
						e13.printStackTrace();
					}
	                try {
						fw.write("\nAddress:,");
					} catch (IOException e12) {
						// TODO Auto-generated catch block
						e12.printStackTrace();
					}
	                try {
						fw.write(address);
					} catch (IOException e11) {
						// TODO Auto-generated catch block
						e11.printStackTrace();
					}
	                try {
						fw.write("\nD_O_B:,");
					} catch (IOException e10) {
						// TODO Auto-generated catch block
						e10.printStackTrace();
					}
	                try {
						fw.write(dob);
					} catch (IOException e9) {
						// TODO Auto-generated catch block
						e9.printStackTrace();
					}
	                try {
						fw.write("\n\n*EDUCATION*");
					} catch (IOException e3) {
						// TODO Auto-generated catch block
						e3.printStackTrace();
					}
	                try {
						fw.write("\n12th Board:,");
					} catch (IOException e3) {
						// TODO Auto-generated catch block
						e3.printStackTrace();
					}
	                try {
						fw.write(board_12);
					} catch (IOException e3) {
						// TODO Auto-generated catch block
						e3.printStackTrace();
					}
	                try {
						fw.write("\n12th Percentage:,");
					} catch (IOException e3) {
						// TODO Auto-generated catch block
						e3.printStackTrace();
					}
	                try {
						fw.write(marks_12);
					} catch (IOException e4) {
						// TODO Auto-generated catch block
						e4.printStackTrace();
					}
	                try {
						fw.write("\nGraduation University:,");
					} catch (IOException e4) {
						// TODO Auto-generated catch block
						e4.printStackTrace();
					}
	                try {
						fw.write(btech_uni);
					} catch (IOException e4) {
						// TODO Auto-generated catch block
						e4.printStackTrace();
					}
	                try {
						fw.write("\nCgpa:,");
					} catch (IOException e3) {
						// TODO Auto-generated catch block
						e3.printStackTrace();
					}
	                try {
						fw.write(btech_cgpa);
					} catch (IOException e3) {
						// TODO Auto-generated catch block
						e3.printStackTrace();
					}
	                try {
						fw.write("\n\nSKILLS:,");
					} catch (IOException e3) {
						// TODO Auto-generated catch block
						e3.printStackTrace();
					}
	                try {
						fw.write(skill1 + ",");
					} catch (IOException e3) {
						// TODO Auto-generated catch block
						e3.printStackTrace();
					}
	                try {
						fw.write(skill2 + ",");
					} catch (IOException e3) {
						// TODO Auto-generated catch block
						e3.printStackTrace();
					}
	                try {
						fw.write(skill3 + ",");
					} catch (IOException e3) {
						// TODO Auto-generated catch block
						e3.printStackTrace();
					}
	                try {
						fw.write(skill4 + ",");
					} catch (IOException e3) {
						// TODO Auto-generated catch block
						e3.printStackTrace();
					}
	                try {
						fw.write("\nPROJECT LINKS:,");
					} catch (IOException e3) {
						// TODO Auto-generated catch block
						e3.printStackTrace();
					}
	                try {
						fw.write(p_link1 + ",");
					} catch (IOException e3) {
						// TODO Auto-generated catch block
						e3.printStackTrace();
					}
	                try {
						fw.write(p_link2 + ",");
					} catch (IOException e3) {
						// TODO Auto-generated catch block
						e3.printStackTrace();
					}
	                try {
						fw.write(p_link3 + ",");
					} catch (IOException e3) {
						// TODO Auto-generated catch block
						e3.printStackTrace();
					}
	                try {
						fw.write(p_link4 + ",");
					} catch (IOException e3) {
						// TODO Auto-generated catch block
						e3.printStackTrace();
					}
	                try {
						fw.write("\nMisc:,");
					} catch (IOException e2) {
						// TODO Auto-generated catch block
						e2.printStackTrace();
					}
	                try {
						fw.write(misc);
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
	                try {
						fw.close();
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
	                alert.setVisible(true);
	                }  
	               });
	      
	      fr.addWindowListener(new WindowAdapter(){  
	            public void windowClosing(WindowEvent e) {  
	                System.exit(0);  
	            }  
	        }); 
	   }
	public static void main(String[] args) throws IOException 
	{
		// TODO Auto-generated method stub
		GUI form = new GUI();
	}
}