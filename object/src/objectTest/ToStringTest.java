package objectTest;

class Sports{
	private String type; 
	private int total; 
	
	public Sports() {
		// TODO Auto-generated constructor stub
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}
	
	

	
	
}

public class ToStringTest {
	public static void main(String[] args) {
		Sports sports = new Sports();  
		System.out.println(sports);
	}
}
