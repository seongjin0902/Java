package ch08ex;

public class C03ComputerMain {

	public static void main(String[] args) {

		C03Computer LGGram1010 = new C03Computer();

		LGGram1010.SerialNo="1010";
		LGGram1010.CPUSpec="I7";
		LGGram1010.RAMSpec="16G";
		LGGram1010.DISKSpec="2TB";
		LGGram1010.PowerON();
		LGGram1010.ShowInfo();
		LGGram1010.PowerOFF();
		
		
		
		
	}

}
