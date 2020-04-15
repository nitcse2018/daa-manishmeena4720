import java.awt.*;
import java.awt.event.*;
import java.io.FileWriter;
import java.io.IOException;
public class GUI {
	GUI()
	   {    
	      Frame fr=new Frame();       
	      Label lb = new Label("CANDIDATE DATA",Label.CENTER);
	      fr.add(lb);
	      lb.setBounds(170, 70, 200, 30);
	      lb.setFont(new Font("Arial", Font.PLAIN, 20));
	      
	      Label lb1 = new Label("  Full_name: ");
	      fr.add(lb1);
	      lb1.setBounds(100, 120, 120, 20);
	      TextField t1 = new TextField();
	      fr.add(t1);
	      t1.setBounds(250, 120, 190, 20);           
	      
	      Label lb2 = new Label("  Email_Id: ");
	      fr.add(lb2);
	      lb2.setBounds(100, 150, 120, 20);
	      TextField t2 = new TextField();
	      fr.add(t2);
	      t2.setBounds(250, 150, 190, 20);
	      
	      Label lb3 = new Label("  Phone_no.: ");
	      fr.add(lb3);
	      lb3.setBounds(100, 180, 120, 20);
	      TextField t3 = new TextField();
	      fr.add(t3);
	      t3.setBounds(250, 180, 190, 20);
	      
	      Label lb4 = new Label("  Address: ");
	      fr.add(lb4);
	      lb4.setBounds(100, 210, 120, 20);
	      TextField t4 = new TextField();
	      t4.doLayout();
	      fr.add(t4);
	      t4.setBounds(250, 210, 190, 40);
	      
	      Label lb5 = new Label("  D.O.B: ");
	      fr.add(lb5);
	      lb5.setBounds(100, 260, 120, 20);
	      TextField t5a = new TextField();
	      fr.add(t5a);
	      t5a.setBounds(250, 260, 30, 20);
	      Label lb5a = new Label("/",Label.CENTER);
	      fr.add(lb5a);
	      lb5a.setBounds(285, 260, 10, 20);
	      TextField t5b = new TextField();
	      fr.add(t5b);
	      t5b.setBounds(300, 260, 30, 20);
	      Label lb5b = new Label("/",Label.CENTER);
	      fr.add(lb5b);
	      lb5b.setBounds(335, 260, 10, 20);
	      TextField t5c = new TextField();
	      fr.add(t5c);
	      t5c.setBounds(350, 260, 50, 20);
	      
	      Label lb6 = new Label("  Qualification: ");
	      fr.add(lb6);
	      lb6.setBounds(100, 290, 120, 20);
	      Choice c1=new Choice();  
	        c1.setBounds(250, 290, 190, 20);  
	        c1.add("B.Tech. pursuing");  
	        c1.add("B.Tech.");  
	        c1.add("M.Tech.");  
	        fr.add(c1);
	      
	      Label lb7 = new Label("  Skills: ");
	      fr.add(lb7);
	      lb7.setBounds(100, 320, 120, 20);
	      TextField t7 = new TextField();
	      fr.add(t7);
	      t7.setBounds(250, 320, 190, 20);
	      
	      Label lb8 = new Label("  Work_Sample_Link: ");
	      fr.add(lb8);
	      lb8.setBounds(100, 350, 120, 20);
	      TextField t8 = new TextField();
	      fr.add(t8);
	      t8.setBounds(250, 350, 190, 20);
	      
	      Label lb9 = new Label("  Additional_info*: ");
	      fr.add(lb9);
	      lb9.setBounds(100, 380, 120, 20);
	      TextField t9 = new TextField();           
	      fr.add(t9);
	      t9.setBounds(250, 380, 190, 20);
	      
	      Button b=new Button("Submit"); 
	      fr.add(b);
	      b.setBounds(200,420,70,30);  
	      b.addActionListener(new ActionListener() {  
	            public void actionPerformed(ActionEvent e) {       
	                String name=t1.getText();
	                String email=t2.getText();
	                String phone=t3.getText();
	                String address=t4.getText();
	                String dob=t5a.getText()+"/"+t5b.getText()+"/"+t5c.getText();
	                String qual=c1.getSelectedItem();
	                String skill=t7.getText();
	                String link=t8.getText();
	                String misc=t9.getText();
	        		FileWriter fw = null;
					try {
						fw = new FileWriter("C:/Users/HTC/Desktop/output.csv",true);
					} catch (IOException e19) {
						// TODO Auto-generated catch block
						e19.printStackTrace();
					}
	                try {
						fw.write("\n\n\nName:,");
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
						fw.write("\nHighest_qualification:,");
					} catch (IOException e8) {
						// TODO Auto-generated catch block
						e8.printStackTrace();
					}
	                try {
						fw.write(qual);
					} catch (IOException e7) {
						// TODO Auto-generated catch block
						e7.printStackTrace();
					}
	                try {
						fw.write("\nSkills:,");
					} catch (IOException e6) {
						// TODO Auto-generated catch block
						e6.printStackTrace();
					}
	                try {
						fw.write(skill);
					} catch (IOException e5) {
						// TODO Auto-generated catch block
						e5.printStackTrace();
					}
	                try {
						fw.write("\nWork_link:,");
					} catch (IOException e4) {
						// TODO Auto-generated catch block
						e4.printStackTrace();
					}
	                try {
						fw.write(link);
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
	               }  
	               });
	      
	      fr.setSize(530, 500);
	      fr.setTitle("Candidate_Details");
	      fr.setLayout(null);
	      fr.setResizable(false);
	      fr.setVisible(true);
	      fr.setBackground(Color.ORANGE);
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