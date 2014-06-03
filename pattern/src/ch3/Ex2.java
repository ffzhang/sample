package ch3;

public class Ex2 {

	private String str="test1";
	private String str2;

	public Ex2(String str2){
		System.out.println(str);
		System.out.println(this.str2);
		this.str2=str2;
		System.out.println(this.str2);
	}

	public static void main(String[] args) {
		new Ex2("test2");

	}

}
