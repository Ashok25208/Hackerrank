//https://www.hackerrank.com/challenges/chocolate-feast

import java.util.*;
class Solution
{
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int test=in.nextInt();
		for(int i=0;i<test;i++)
		{
			int total=in.nextInt();
			int cost=in.nextInt();
			int free=in.nextInt();
			int wrapper=total/cost;
			int eat=0;
			eat=wrapper;
			while(wrapper>=free)
			{
				int temp=wrapper/free;
				eat=eat+temp;
				wrapper=wrapper-(temp*free);
				wrapper=wrapper+temp;
			}
			System.out.println(eat);
		}	
	}
}
