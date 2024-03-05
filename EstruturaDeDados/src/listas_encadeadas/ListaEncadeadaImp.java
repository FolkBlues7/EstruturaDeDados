package listas_encadeadas;

public class ListaEncadeadaImp<T> implements MyInterfaceList<T> {

	class Node{
		Node proximo;
		T data;
		
		 public Node(T data) 
	        {        	
	            this.data = data;    
	            proximo = null;
	        } 
	}
	
	private Node head;
	private Node tail;
	private int size;
		
	public ListaEncadeadaImp() {
		this.head = null;
		this.tail = null;
		this.size = 0;
	}

	@Override
	public void addFirst(T value) {
		Node novo = new Node(value);
		if (head == null) {
			head = novo;
			tail = novo;
		} else {
			novo.proximo = head;
			head = novo;
		}
		size++;
	}

	@Override
	public void addLast(T value) {
		Node novo = new Node(value);
		if (head == null) {
			head = novo;
			tail = novo;
		} else {
			tail.proximo = novo;
			tail = novo;
		}
		size++;
	}

	@Override
	public boolean addAfter(T dado, T crit) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public T peekFirst() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public T peekLast() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public T search(T crit) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public T removeFirst() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public T removeLast() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public T remove(T crit) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void showReverse() {
		// TODO Auto-generated method stub
		
	}
	
	
}
