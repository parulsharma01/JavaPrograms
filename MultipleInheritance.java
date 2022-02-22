interface Parent{
	default void display(){
		System.out.println("Parent default interface implementation");
	}
}
interface Child1 extends Parent{
	default void display(){
		System.out.println("Child1 default interface implementation");
	}
}
interface Child2 extends Parent{
	default void display(){
		System.out.println("Child2 default interface implementation");
	}
}
class MultipleInheritance implements Child1,Child2{
	public void display(){
		Child1.super.display();
		Child2.super.display();
		System.out.println("Class Implementation for multiple inheritance");
	}
	public static void main(String ar[]){
		new MultipleInheritance().display();
	}
}
/*
Output : 
Child1 default interface implementation
Child2 default interface implementation
Class Implementation for multiple inheritance

Implement multiple inheritance with default method inside interface.

*/
