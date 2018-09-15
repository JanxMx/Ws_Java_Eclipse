package generics.comparable;

public class GenericVO<T> {
	private T first;
	private T second;
	
	public GenericVO(){
		first = null;
		second = null;
	}
	
	public GenericVO(T first, T second){
		this.first = first;
		this.second = second;
	}
	
	public T getFirst(){
		return first;
	}
	
	public T getSecond() {
		return second;
	}
	
	public void setFirst(T newValue) {
		first = newValue;
	}
	
	public void setSecond(T newValue) {
		second = newValue;
	}
}
