class BoolTest{
	public static void main(String[] args){
	boolean b;

    //System.out.println("b is "+ b);
	b = false;
	System.out.println("b is "+ b);

	b = true;
	System.out.println("b is "+ b);

	// a boolean value can control the if statements
	if(b)
		System.out.println("This is executed");
		b = false;
	if(b)
		System.out.println("This is not executed");

	//outcome of relational operater is a boolean value
			System.out.println("10 > 9 is " + (10>9));



	}
}