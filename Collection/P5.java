//WAP to store data related to item in Vector and after that sort the data.

package Collection;

import java.util.Collections;
import java.util.Vector;

public class P5 {

	public static void main(String[] args) {
		Vector<String> vector=new Vector<>();
		vector.add("vabhav");
		vector.add("amol");
		vector.add("nitin");
		vector.add("sharad");
		vector.add("baji");
			
		Collections.sort(vector);
		System.out.println(vector);
		}
	}
