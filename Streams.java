import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;

class Streams{
	public static void main(String ar[]){
		List<Integer> list = Arrays.asList(1,5,4,2,4,7);
		
		System.out.println("Even Numbers from list are : "+ list.stream().filter(e -> {
		System.out.println("e>>>"+e);
		boolean retValue = e % 2 == 0;
                System.out.println("returnValue>>>>" + retValue+"\n");
                return retValue;
		}).collect(Collectors.toList()));
		
	}
}
/*
Output : 
e>>>1
returnValue>>>>false

e>>>5
returnValue>>>>false

e>>>4
returnValue>>>>true

e>>>2
returnValue>>>>true

e>>>4
returnValue>>>>true

e>>>7
returnValue>>>>false

Even Numbers from list are : [4, 2, 4]

WAP using java 8:
Collect all  even numbers from a list using stream


*/
