package spoj.com;
import java.util.*;
public class nextGreater {
	
	// int [] arr= {13,11,21,2};
  public static void printNGE() {
	  Scanner sc=new Scanner (System.in);
	  int n=sc.nextInt();
	  int [] arr =new int[n];
	  Stack<Integer> st=new Stack<>();
	  int nge[] =new int[n];
	  //int nge[]= new int[arr.length];
	 
  for(int i=0;i<n;i++) {
	  arr[i]=sc.nextInt();
	  
  }
 
  
  for(int i=n-1;i>=0;i--) {
	  if(!st.empty()&& st.peek()<=arr[i])
	  {
		  st.pop();
	  }
 nge[i]=st.empty()?-1:st.peek();
 //nge[i]=st.empty()? st.peek() : -1;
	  st.push(arr[i]);
  }
  for(int i=0;i<n;i++) {
	  System.out.print(" "+nge[i]);
  }}
  public static void main(String[] args){
	  
	  printNGE();
  }
  }

