// Block Scope

class Scope{
	public static void main(String[] args){
	 int x;

	 x= 10 ;
	 if(x == 10){
	   int y = 20;
	     System.out.println("x and y: " + x + " " + y);
	     x = y * 2;
	 }
	 //y = 100;   //if not you will get error
	 System.out.println("x is: " + x);
	}

}