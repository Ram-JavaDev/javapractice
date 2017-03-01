package com.codepractice;

public class ListUsingArrayTest {
	public  static void main(String[] args){
		ListUsingArray<Integer> list = new ListUsingArray<>(Integer.class);
		//ListUsingArray list = new ListUsingArray();
		for(int i=0;i<6;i++){
			list.add(i+1);
		}
		//list.remove();
		System.out.println("::"+list.size());
		list.remove(3);
		System.out.println("::"+list.size());
		for(int i=0;i<list.size();i++){
			System.out.println(i+1+"::ListUsingArrayTest.main()::"+list.get(i));
		}
	}
}
