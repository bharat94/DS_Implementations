// A custom implementation of the stack data structure

//currently supports only integers, will soon be ported to support generics

//interface:
/*
	iStack() : creates an empty stack
	iStack(List <Integer>)
	iStack(int[])

	push(int)
	pop()
	size()
	invert()

*/


public class iStack{
	//start variables
	int len = 0;
	ArrayList<Integer> dataList;
	//end variables

	//start constructors 
	public iStack(){
		len = 0;
		dataList = new ArrayList<Integer>();
	}

	public iStack(List<Integer> l){
		dataList = new ArrayList(l);
		len = l.size();
	}

	public iStack(int[] arr){
		dataList = new ArrayList<Integer>();
		for(int a : arr){
			dataList.add(a);
			len++;
		}
	}
	//end constructors

	//start methods

	//pushes a value to the top of the stack
	public void push(int a){
		dataList.add(0, a);
		len++;
	}

	//returns the stack top value
	public int pop(){
		len--;
		return (int)dataList.remove(0);
	}

	//returns the length of the stack (Stack Size)
	public int size(){
		return len;
	}

	//end methods


}