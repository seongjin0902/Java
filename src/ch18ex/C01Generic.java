package ch18ex;

class 재료{
	
}
class PopCorn<T extends 재료>{
	
	private T meterial;
	
	PopCorn(T meterial){
		this.meterial=meterial;
	}
	void ShowInfo() {
		System.out.println(meterial.toString()+"맛 팝콘");
	}
}
class 캬라멜 extends 재료{
	String meterial;
	
	캬라멜(String m){
		this.meterial=m;
	}

	@Override
	public String toString() {
		return meterial;
	}
}

class 버터옥수수 extends 재료{
	String meterial;
	
	버터옥수수(String m){
		this.meterial=m;
	}

	@Override
	public String toString() {
		return meterial;
	}

}

class 민초{
	String meterial;
	
	민초(String m){
		this.meterial=m;
	}

	@Override
	public String toString() {
		return meterial;
	}

}

public class C01Generic {

	public static void main(String[] args) {
		
		PopCorn<캬라멜> ob1=new PopCorn<캬라멜>(new 캬라멜("오구"));
		ob1.ShowInfo();
		
		PopCorn<버터옥수수> ob2=new PopCorn<버터옥수수>(new 버터옥수수("뚜지"));
		ob2.ShowInfo();
		

//		PopCorn<민초> ob3=new PopCorn<민초>(new 민초("민초"));
//		ob3.ShowInfo();


	}

}
