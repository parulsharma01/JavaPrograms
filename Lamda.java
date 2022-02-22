interface Operations{
	boolean greaterNumber(int a, int b);
}
interface IncrementByOne{
	int perform(int a);
}
interface Concatenate{
	String perform(String a, String b);
}
interface ToUpperCase{
	String perform(String a);
}
class Lamda{
	static void greaterNumber(int a,int b, Operations op){
		System.out.println(op.greaterNumber(a,b));
	}
	
	static	IncrementByOne incrementByOne  = a -> ++a;
	static	Concatenate concatenate = (a,b) -> a+b;
	static	ToUpperCase toUpperCase = a -> a.toUpperCase();
	public static void main(String ar[]){
		greaterNumber(12,42,(a,b)->a>b);
		System.out.println(""+incrementByOne.perform(12)
		+concatenate.perform("Parul","Sharma")
		+toUpperCase.perform("Hello"));
	}
}
/*
Write the following a functional interface and implement it using lambda:
First number is greater than second number or not Parameter (int ,int ) Return boolean
Increment the number by 1 and return incremented value Parameter (int) Return int
Concatination of 2 string Parameter (String , String ) Return (String)
Convert a string to uppercase and return . Parameter (String) Return (String)

*/
