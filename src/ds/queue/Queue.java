package ds.queue;

public class Queue {
	
	private int maxSize; // initialize set number of slots
	private long [] queueArray; // slots to maintain the data
	private int front; // position of front element
	private int rear; // position of back element
	private int nItems; // counter for number of items in queue
	
	public Queue(int size){
		this.maxSize = size;
		this.queueArray = new long[size];
		front = 0; // index of first slot
		rear = -1; // no item in array yet (no last)
		nItems = 0; // no elements in array
	}
	
	public void insert(long j){
		rear++;
		queueArray[rear] = j;
		nItems++;
	}
	
	public long remove(){
		long temp = queueArray[front];
		front++;
		if(front == maxSize){
			front = 0; // set front back to 0 to utilize entire array
		}
		nItems--;
		return temp;
	}
	
	public long peekFront(){
		return queueArray[front];
	}
	
	public boolean isEmpty(){
		return (nItems == 0);
	}
	
	public boolean isFull(){
		return (nItems == maxSize);
	}
	
	public void view(){
		System.out.print("[ ");
		for(int i = 0; i < queueArray.length; i++){
			System.out.print(queueArray[i] + " ");
		}
		System.out.print("]");
	}
	
}
