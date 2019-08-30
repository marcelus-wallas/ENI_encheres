package fr.eni.encheres.tools;

public class Pair<T, V> {

	public T first;
	public V second;

	public T getFirst() {
		return first;
	}
	public void setFirst(T first) {
		this.first = first;
	}
	public V getSecond() {
		return second;
	}
	public void setSecond(V second) {
		this.second = second;
	}
	public Pair(T first, V second) {
		super();
		this.first = first;
		this.second = second;
	}
	public Pair() {
		super();
	}
	@Override
	public String toString() {
		return "Pair [first=" + first + ", second=" + second + "]";
	}

}
