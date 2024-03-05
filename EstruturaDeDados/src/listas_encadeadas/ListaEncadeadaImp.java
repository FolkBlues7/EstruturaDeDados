package listas_encadeadas;

public class ListaEncadeadaImp<T> implements MyInterfaceList<T> {

	class Node {
		Node proximo;
		T data;

		public Node(T data) {
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
		Node novo = new Node(dado);
		Node referencia = searchNode(crit);
		if (referencia == null) {
			return false;
		} else {
			if (referencia.proximo == null) {
				tail = novo;
			}
			novo.proximo = referencia.proximo;
			referencia.proximo = novo;
			size++;
			return true;
		}
	}

	@Override
	public T peekFirst() {
		if (head == null) {
			System.out.println("Lista vazia!");
			return null;
		} else {
			return head.data;
		}
	}

	@Override
	public T peekLast() {
		if (head == null) {
			System.out.println("Lista vazia!");
			return null;
		} else {
			return tail.data;
		}
	}

	public Node searchNode(T crit) {
		Node p = head;
		while (p != null) {
			if (p.proximo.equals(crit)) {
				return p;
			}
			p = p.proximo;
		}
		return null;
	}

	@SuppressWarnings("unchecked")
	@Override
	public T removeFirst() {
		if (head == null) {
			System.out.println("Fila vazia!");
			return null;
		} else {
			Node dadoRemovido = head;
			if (head == tail) {
				head = null;
				tail = null;
			} else {
				head = head.proximo;
			}
			size--;
			return (T) dadoRemovido;
		}
	}

	@Override
	public T removeLast() {
		
		if (head == null) {
			System.out.println("Lista vazia!");
			return null;
		} else {
			if (head == tail) {
				head = null;
				tail = null;
				size--;
				return null;
			} else {
				Node ultimo = tail;
				Node p = head;
				while (p.proximo != tail.data){
					p = p.proximo;
				}
				tail = p;
				p.proximo = null;
				size--;
				return ultimo.data;
			}
			
		}
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

	@Override
	public T search(T crit) {
		// TODO Auto-generated method stub
		return null;
	}

}
