package ch08ex;

public class C03Computer {
	
	String SerialNo;
	String RAMSpec;
	String DISKSpec;
	String CPUSpec;
	
	void PowerON()
	{
		System.out.println(SerialNo+"의 전원을 켭니다");
	}
	void PowerOFF()
	{
		System.out.println(SerialNo+"의 전원을 끕니다");
	}
	void ShowInfo()
	{
		System.out.printf("SerialNo : %s / RAMSpec : %s / DISKSpec : %s / CPUSpec : %s\n",SerialNo,RAMSpec,DISKSpec,CPUSpec);
	}

}
