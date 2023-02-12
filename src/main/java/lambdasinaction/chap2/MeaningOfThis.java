package lambdasinaction.chap2;

public class MeaningOfThis
{
	// Lambda表达式引用的外部变量必须是final或者事实上的final
	public final int value = 4;
	public void doIt()
	{
		int value = 6;
		Runnable r = new Runnable(){
			public final int value = 5;
			public void run(){
				int value = 10;
				// this关键字实际上引用的是匿名内部类的对象
				System.out.println(this.value);
			}
		};
		r.run(); 
	}
	public static void main(String...args)
	{       
		MeaningOfThis m = new MeaningOfThis();
		m.doIt(); // ???   
	}
}
