package labFinal;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class MyJFrame extends JFrame implements ActionListener {
	/**
	 * 
	 */
	int noPrice=0;
	String hardDriveSelected;
	int hardDrivePrice;
	String monitorSelected;
	int monitorPrice;
	String proSelected;
	int proPrice;
	String warrantySelected;
	int warrantyPrice;
	String mouseSelected;
	int mousePrice;
	
	
	private static final long serialVersionUID = 1L;
	//data members
	
	JLabel myLabel;
	JLabel myLabel1;
	JLabel myLabel2;
	JLabel myLabel3;
	JLabel myLabel4;
	JLabel myLabel5;
	JLabel myLabel6;
	
	JButton btnSave;
	JButton btnClear;
	JButton btnDisplay;
	
	
	JTextArea myTextArea;
	
	
	
	
	JPanel myJPanel;
	JPanel myJPanel1;
	
	
	
	
	JComboBox cmbHard;
	JComboBox cmbProcessor;
	JComboBox cmbComputer;
	JComboBox cmbMonitor;
	JComboBox cmbRam;
	JComboBox cmbWarranty;
	JComboBox cmbMouse;
	
	Components choice;
	
	
	
		
	
	//constructor
	public MyJFrame(String title){
		super(title);
		this.setSize(500, 500);
		this.setLocation(300, 200);
		this.setVisible(true);
		
		this.getContentPane().setLayout(
				new BoxLayout(this.getContentPane(), BoxLayout.Y_AXIS));
		//free memory upon closing
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//set title
		
	
		
		//panel 
		myJPanel=new JPanel();
		myJPanel1=new JPanel();
		
		
		//creating a label
		 myLabel=new JLabel("Choose a hard drive: ");
		 myLabel1=new JLabel("Choose a processor: ");
		 myLabel2=new JLabel("Choose a Computer: ");
		 myLabel3=new JLabel("Choose a Monitor: ");
		 myLabel4=new JLabel("Choose Ram: ");
		 myLabel5=new JLabel("Choose if you want a warranty or not: ");
		 myLabel6=new JLabel("Select if want a gaming mouse: ");
		 
		 btnSave=new JButton("Save Config");
		 btnClear=new JButton("Clear");
		 btnDisplay=new JButton("Display");
		 
		 
		 myTextArea=new JTextArea();
		 
		 
		 
		 
		 choice=new Components();
		 
		 
		 cmbHard=new JComboBox(HardDrive.hardDrive);
		 cmbComputer=new JComboBox(Computer.computer);
		 cmbProcessor=new JComboBox(Processor.processor);
		 cmbMonitor=new JComboBox(Monitor.monitor);
		 cmbRam=new JComboBox(Ram.ram);
		cmbWarranty=new JComboBox(Components.warranty);
		cmbMouse=new JComboBox(Components.Gamingmouse);
		 
		 cmbHard.addActionListener(this);
		 cmbComputer.addActionListener(this);
		 cmbProcessor.addActionListener(this);
		 cmbMonitor.addActionListener(this);
		 cmbRam.addActionListener(this);
		 cmbWarranty.addActionListener(this);
		 cmbMouse.addActionListener(this);
		 myTextArea.setVisible(true);
		 btnSave.setEnabled(true);
		 btnDisplay.setEnabled(true);
		 btnClear.setEnabled(true);
		 btnSave.addActionListener(this);
		 btnDisplay.addActionListener(this);
		 btnClear.addActionListener(this);
		 
		// adding the button
		
		myJPanel.add(myLabel);
		myJPanel.add(cmbHard);
		myJPanel.add(myLabel1);
		myJPanel.add(cmbProcessor);
		myJPanel.add(myLabel2);
		myJPanel.add(cmbComputer);
		myJPanel.add(myLabel3);
		myJPanel.add(cmbMonitor);
		myJPanel.add(myLabel4);
		myJPanel.add(cmbRam);
		myJPanel.add(myLabel5);
		myJPanel.add(cmbWarranty);
		myJPanel.add(myLabel6);
		myJPanel.add(cmbMouse);
		myJPanel.add(btnSave);
		myJPanel.add(btnClear);
		myJPanel.add(btnDisplay);
		myJPanel1.add(myTextArea);
		
		//adding layout to see multiple components
	
	this.add(myJPanel);
	this.add(myJPanel1);
	
	
		
		//respond to a click
	
		
		
		
		
	
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		//change the buttons text
		/*JOptionPane.showMessageDialog(null, Components.hardDriveSplit);
		protected static final String[] hardDrive ={"Seagate, 400GB ,SATA, 100$","Dell, 800GB HDD, 150$","MSI ,200GB SSD, 200$"};
		protected static final String[] computer={"HP, ProDesk 600 G1 Core i7-4790 1", " Dell, 745 Mini Tower Desktop PC","Apple, Mac Pro MA356LL/A","Acer, Aspire ATC-605-UR2S","Lenovo, Ideacentre Y900"};
		protected static final String[] ram={"2X, 2GB, DDR3 RAM","2X, 4GB, DDR3 RAM","1X, 8GB, DDR3 RAM","2X, 8GB, DDR3 RAM","1X, 16GB, DDR3 RAM"};
		protected static final String[] processor={"AMD A4 Micro-6400T APU 50$","AMD Athlon II X3 405e 70$","AMD A4-6300B APU 100$","Intel Pentium E5400 @ 2.70GHz 50$","Intel Pentium B970 @ 2.30GHz 70$","Intel Core2 Duo E7600 @ 3.06GHz 100$"}; 	
	 	protected static final String[] monitor={"None","Acer S200HQL Cb $110","Acer S230HL Abd 150$","LG Electronics IPS 32MP58HQ-P 32 300$","Dell 19 Monitor - E1916H 110$"};
	 	protected static final String[] warranty={"Yes(add 50$)","No"};*/
	
		
			
			
		
		if(e.getSource().equals(btnSave))
		
		{try{
			FileOutputStream fs=new FileOutputStream("mychoices.ser");
			ObjectOutputStream cs=new ObjectOutputStream(fs);
			cs.writeObject(choice);
			cs.close();
			
			}
			catch (FileNotFoundException e1){
				e1.printStackTrace();
				
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}}
		else if (e.getSource().equals(btnClear)){
			myTextArea.setText("");
			
		}
		else
		{choice.setComputerChoice(cmbComputer.getSelectedItem().toString());
		choice.setMonitorChoice(cmbMonitor.getSelectedItem().toString());
		monitorSelected=choice.getMonitorChoice();
		monitorPrice=Monitor.monitorPrice[cmbMonitor.getSelectedIndex()];
		choice.setHardDriveChoice(cmbHard.getSelectedItem().toString());
		hardDriveSelected=choice.getHardDriveChoice();
		hardDrivePrice=HardDrive.harddriveprice[cmbHard.getSelectedIndex()];
		choice.setRamChoice(cmbRam.getSelectedItem().toString());
		choice.setProcessorChoice(cmbProcessor.getSelectedItem().toString());
		proSelected=choice.getProcessorChoice();
		proPrice=Processor.processorPrice[cmbProcessor.getSelectedIndex()];
		choice.setWarrantyChoice(cmbWarranty.getSelectedItem().toString());
		warrantySelected=choice.getWarrantyChoice();
		warrantyPrice=Components.warrantyPrice[cmbWarranty.getSelectedIndex()];
		choice.setGamingMouseChoice(cmbMouse.getSelectedItem().toString());}
		mouseSelected=choice.getGamingMouseChoice();
		mousePrice=Components.mousePrice[cmbMouse.getSelectedIndex()];
		 
		
			if (e.getSource().equals(btnDisplay)){
			 int total=hardDrivePrice+monitorPrice+proPrice+mousePrice+warrantyPrice;
		myTextArea.setText(choice.getComputerChoice()+"\n"+choice.getHardDriveChoice()+"\n"+choice.getProcessorChoice()+"\n"+
		 choice.getMonitorChoice()+"\n"+choice.getRamChoice()+"\n"+choice.getMonitorChoice()+"\n"+choice.getGamingMouseChoice()+"\n Your Total is: $"+total );
		
		}
		
		}
	}

