package com.codepractice;

import java.lang.reflect.Array;

public class ListUsingArray<T> {
	
	private static int MAX_SIZE = 5;
	int end = -1;
	T[] arr;

	public ListUsingArray(Class<T> clazz){
		arr = (T[]) Array.newInstance(clazz,MAX_SIZE);
		//arr = new int[MAX_SIZE];
	}
	
	public void add(T val){
		arr[++end] = val;
		resizeArr();
	}
	private void resizeArr(){
		if(end+1 == arr.length){
		T[] temp = (T[]) Array.newInstance(arr[0].getClass(),arr.length*2);;
		
		for(int i=0;i<arr.length;i++){
			temp[i] = arr[i];
		}
		arr = temp;
		}
	}
	
	public void add(T val,int index){
		resizeArr();
		if(index == end+1){
			add(val);
		}else{
			
			T temp = val;
			T temp2;
			for(int i=index;i<end+1;i++){
				temp2 = arr[i];
				arr[i] =  temp;
				temp=temp2;
			}
			arr[++end]=temp;
		}
	}
	public T get(int index){
		return arr[index];
	}
	
	public int size(){
		return end+1;
	}
	public void remove(){
		arr[end--] = null;
	}
	
	public void remove(int index){
		if(index == end-1){
			remove();
		}else{
			T temp =arr[end];
			T temp2;
			for(int i=end;i>index;i--){
				temp2 = arr[i-1];
				arr[i-1] = temp;
				temp= temp2;
			}
			end--;
		}
		
	}
	
}
