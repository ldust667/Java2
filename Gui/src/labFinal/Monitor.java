package labFinal;

public class Monitor {
	public static final String[] monitor={"No Monitor","Acer S200HQL Cb 110 $","Acer S230HL Abd 150 $","LG Electronics IPS 300 $","Dell 19 Monitor-E1916H 110 $"};
	public static final String[][] monitorSplit={monitor[1].split(" "),monitor[2].split(" "),monitor[3].split(" "),monitor[4].split(" ")};
	public static final int[] monitorPrice={0,Integer.parseInt(monitorSplit[0][3]),Integer.parseInt(monitorSplit[1][3]),Integer.parseInt(monitorSplit[2][3])};
}
