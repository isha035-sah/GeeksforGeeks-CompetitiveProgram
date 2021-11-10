/*Constraints:
1. 1 <= T <= 100
2. 1 <= Q <= 104
3. 1 <= x <= 109

Example:
Input:
2
5
place 6
place 2
remove
place 3
remove
3
remove
place 5
remove

Output:
2 3
-1 5
*/
package spoj.com;
import java.util.*;
public class placeremove {
 public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int t=sc.nextInt();

	while(t!=0) {
	int q=sc.nextInt();
	Stack<Integer> st=new Stack<>();
		for(int i=0;i<q;i++) {
		String str=sc.next();
		int []x=new int[q];
		if(str=="place"  ) {
		x[i]=sc.nextInt();
		
		}
		st.push(x[i]);	
		
		 if(str=="remove") {
			System.out.println(st.pop());
		}
		}
		
		//System.out.println(st.peek());	
		//System.out.println(st.peek());
		
	t--;
	}
	}
	
	}



