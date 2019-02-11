package pra_2019_02_11_02;

public class Main implements Dog,Cat {  //interfaceにはimplements

	public static void main(String[] args)
	{
		Main m = new Main();
		m.Cry();
		m.show_Dog();
		m.show_Cat();
	}

	@Override
	public void Cry() {
		// TODO Auto-generated method stub
		System.out.println("犬");
	}

	@Override
	public void show_Dog() {
		// TODO Auto-generated method stub
		System.out.println("犬の部分");
	}

	@Override
	public void show_Cat() {
		// TODO Auto-generated method stub
		System.out.println("猫の部分");
	}

}
