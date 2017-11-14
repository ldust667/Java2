package labFinal;

public class Processor {
	public static final String[] processor={"AMD A4 Micro-6400TAPU 50 $","AMD Athlon IIX3405e 70 $","AMD A4-6300 BAPU 100 $","Intel Pentium E5400@2.70GHz 50 $","Intel Pentium B970@2.30GHz 70 $","Intel Core2Duo E7600@3.06GHz 100 $"}; 	
	public static final String[][] processorr={processor[0].split(" "),processor[1].split(" "),processor[2].split(" "),processor[3].split(" "),processor[4].split(" "),processor[5].split(" ")};
	public static final int [] processorPrice={Integer.parseInt(processorr[0][3]),Integer.parseInt(processorr[1][3]),Integer.parseInt(processorr[2][3]),Integer.parseInt(processorr[3][3]),Integer.parseInt(processorr[4][3]),Integer.parseInt(processorr[5][3])}; 
}
