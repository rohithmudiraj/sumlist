package listSumNum;

import java.util.ArrayList;
import java.util.Scanner;

public class ListSum {
	
	private ArrayList<Integer> store= new ArrayList<>();
	
	private void addToList(int n) {
		store.add(n);
	}
	
	private boolean check(ArrayList<Integer> demo,int n) {
		boolean flag= false;
		while(flag!=true) {
			for(int i=0;i<demo.size()-1;i++) {
				
				for(int j=i+1;j<=demo.size()-1;j++) {
					if(demo.get(i)+demo.get(j)==n) {
						flag=true;
						
					//	System.out.println(demo.get(i)+demo.get(j));
						return true;
									}
					else {
					//	System.out.println(demo.get(i)+" "+demo.get(j));

					//	System.out.println("fail");
						
					}
				}
			}
			return false;
		}
		return true;
		
	}
	

	public static void main(String[] args) {
		System.out.println("enter a number:");
		
		Scanner sc = new Scanner(System.in);
		int k= sc.nextInt();
		System.out.println(k);

		ListSum oj = new ListSum();
		oj.addToList(4);
		oj.addToList(7);
		oj.addToList(1);
		oj.addToList(-3);
		oj.addToList(2);
		
		if(oj.check(oj.store,k)) {
			System.out.println("it is true");
		}

		

		
	}

}
