package ex02;

public class Hotel {
	
	private Chef chef;
	
	// Hotel은 Chef객체 없이 생성될 수 있음? -> Hotel이 Chef에 의존적임
	public Hotel(Chef chef) {
		this.chef = chef;
	}
	
	// getter
	public Chef getChef() {
		return chef;
	}

}
