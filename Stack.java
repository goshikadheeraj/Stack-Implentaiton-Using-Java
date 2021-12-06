import java.util.NoSuchElementException;
import java.util.*;
class Stack
{
    protected int arr[];
    protected int top;
    protected int size;
    public Stack(int size)
    {
        this.size = size;
        arr = new int [size];
        top = -1;
    }
    boolean IsEmpty()
    {
        if(top==-1)
        {
            return true;
        }
        return false;
    }
    boolean IsFull()
    {
        if(top == size-1)
        {
            return true;
        }
        return false;
    }
    void Push(Scanner sc)
    {
        int Val;
        System.out.println("ENTER ANY VALUE");
        Val = sc.nextInt();
        if(IsFull())
        {
            throw new IndexOutOfBoundsException("OverFlow Exception");
        }
        else{
            System.out.println("Element Inserted");
            arr[++top] = Val;
        }
    }
    void Pop()
    {
        if(IsEmpty())
        {
            throw new NoSuchElementException("UnderFlow Exception");
        }
        else
        {
          top--;    
        }
    }
    void Peek()
    {
        if(IsEmpty())
        {
            throw new NoSuchElementException("UnderFlow Exception");
        }
        else{
            System.out.println("Peek - Element "+ arr[top]);
        }
    }
    void Display()
    {
        if(IsEmpty())
        {
            throw new NoSuchElementException("No Element In Stack");
        }
        else{
            int temp = top;
            while(temp>=0)
            {
                System.out.print(arr[temp--]+"  ");
            }
        }
        System.out.println();
    }
}
public class Main
{
	public static void main(String[] args) {
	    int Size;
	    System.out.println("ENTER THE SIZE OF THE STACK");
	    Scanner sc = new Scanner(System.in);
	    Size = sc.nextInt();
	    Stack obj = new Stack(Size);
	    int Choice;
	    outerloop:
	    while(true)
	    {
	        System.out.println("CHOOSE ANY OPERATION \n  1 - Push \n 2 - Pop \n 3 - Peek \n 4 - Display \n 5 - Exit \n ");
	        Choice = sc.nextInt();
	        switch(Choice)
	        {
	            case 1 :
	                obj.Push(sc);
	                break;
	            case 2 :
	                obj.Pop();
	                break;
	            case 3 :
	                obj.Peek();
	                break;
	            case 4 :
	                obj.Display();
	                break;
	            case 5 :
	                break outerloop;
	                
	        }
	    }
	    
	  }
}
