package ch1;

public class Zhaoyun {

	public static void main(String[] args) {
		Context context=new Context(new First());
		context.operate();
		 context=new Context(new Second());
		context.operate();

		 context=new Context(new Three());
		context.operate();


	}

}
