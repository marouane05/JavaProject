package animal;

public class Animal {
	private static int nbrAnimal;
	private String nom ;
	private int age ;
	private int poid ;
	private double speed ;
	private int id ;
	
	public Animal() {
		
		
		this.setNbrAnimal(this.getNbrAnimal() + 1);
		
		
	
	}
	public Animal(String nom,int age,int speed,int id,int poid) {
		this.nom=nom ;
		this.age=age ;
		this.speed=speed ;
		this.id=id ;
		this.poid=poid ;
		setPoid(this.poid);
		setNom(this.nom);
		setAge(this.age);
		setSpeed(this.speed);
		setId(this.id);
	}
	
	

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getPoid() {
		return poid;
	}

	public void setPoid(int poid) {
		this.poid = poid;
	}

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	public String toString() {
		return "Animal :  "+this.age+" "+this.id+" "+this.nom+""+this.poid+" "+this.speed ;
	

	}
	public static int getNbrAnimal() {
		return nbrAnimal;
	}
	public static void setNbrAnimal(int nbrAnimal) {
		Animal.nbrAnimal = nbrAnimal;
	}
}
