package labFinal;

public class HardDrive {
	public static final String[] hardDrive ={"Seagate 400GB SATA 100 $","Dell 800GB HDD 150 $","MSI 400GB SSD 200 $","Samsung 250GB SSD 70 $"};
	public static final String[][] hardDriveSplit={hardDrive[0].split(" "),hardDrive[1].split(" "),hardDrive[2].split(" "),hardDrive[3].split(" ")};
	public static final int[] harddriveprice={Integer.parseInt(hardDriveSplit[0][3]),Integer.parseInt(hardDriveSplit[1][3]),Integer.parseInt(hardDriveSplit[2][3]),Integer.parseInt(hardDriveSplit[3][3])};
}
