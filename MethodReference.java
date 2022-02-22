interface Operations{
	int perform(int a, int b);
}

class MethodReference{
	static int add(int a,int b){
		return a+b;
	}
	static int subtract(int a,int b){
		return a-b;
	}
	
	int multiply(int a,int b){
		return a*b;
	}
	public static void main(String ar[]){
		Operations op = MethodReference::add;
		System.out.println(op.perform(12,14)); //add is static method reference
		
		op = MethodReference::subtract;
		System.out.println(op.perform(14,15)); //subtract is static method reference
		op = new MethodReference()::multiply;
		System.out.println(op.perform(4,5)); //multiply is instance method reference
		
	}
}
/*
Output : 
26
-1
20


 Using (instance) Method reference create and apply add and subtract method and using (Static) Method reference create and apply multiplication method for the functional interface created


*/
