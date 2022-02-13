package kodlamaio.northwind.core.utilities.results;

public class DataResult<T> extends Result{//T data ile döndüreceği veri verildi
	//belli bir datayı gondermek istediğimizde
	private T data;
	public DataResult(T data, boolean success, String message) {
		super(success, message); //super base classın constructoını calsıtırır yanı Result sınıfının
		this.data= data;
	}
	
	public DataResult(T data, boolean success) {
		super(success); 
		this.data= data;
	}
	
	public T getData() {
		return this.data;
	}

}
