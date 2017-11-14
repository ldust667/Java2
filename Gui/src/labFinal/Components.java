package labFinal;

import java.io.Serializable;

public class Components implements Serializable {
	private String hardDriveChoice;
	private String computerChoice;
	private String ramChoice;
	private String processorChoice;
	private String monitorChoice;
	private String warrantyChoice;
	private String gamingMouseChoice;
	private int total;
	
	
	
	
	
	
	
 	
 	public static final String[] warranty={"No Warranty","Yes Warranty( 50 $)"};
 	public static final String[] Gamingmouse={"No Gaming mouse","Yess( 30 $)"};
 	public static final String[] warrantySplit=warranty[1].split(" ");
 	public static final int[] warrantyPrice={0,Integer.parseInt(warrantySplit[2])};
 	public static final String[] GamingMouseSplit=Gamingmouse[1].split(" ");
	public static final int[] mousePrice={0, Integer.parseInt(GamingMouseSplit[1])};
	
	
	
	
	public String getHardDriveChoice() {
		return hardDriveChoice;
	}
	public void setHardDriveChoice(String hardDriveChoice) {
		this.hardDriveChoice = hardDriveChoice;
	}
	public String getComputerChoice() {
		return computerChoice;
	}
	public void setComputerChoice(String computerChoice) {
		this.computerChoice = computerChoice;
	}
	public String getRamChoice() {
		return ramChoice;
	}
	public void setRamChoice(String ramChoice) {
		this.ramChoice = ramChoice;
	}
	public String getProcessorChoice() {
		return processorChoice;
	}
	public void setProcessorChoice(String processorChoice) {
		this.processorChoice = processorChoice;
	}
	public String getMonitorChoice() {
		return monitorChoice;
	}
	public void setMonitorChoice(String monitorChoice) {
		this.monitorChoice = monitorChoice;
	}
	public String getWarrantyChoice() {
		return warrantyChoice;
	}
	public void setWarrantyChoice(String warrantyChoice) {
		this.warrantyChoice = warrantyChoice;
	}
	public String getGamingMouseChoice() {
		return gamingMouseChoice;
	}
	public void setGamingMouseChoice(String gamingMouseChoice) {
		this.gamingMouseChoice = gamingMouseChoice;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}

	public Components(String hard, String comp,String ram,String processor){
		try
		{this.setHardDriveChoice(hard);
		this.setComputerChoice(comp);
		this.setRamChoice(ram);
		this.setProcessorChoice(processor);}
		catch(Exception e){}
	}
	public Components() {
		// TODO Auto-generated constructor stub
	}
}
