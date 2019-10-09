package genericité;

public class Solo <T> {
private T valeur ;
	
	public Solo() {}
	public Solo(T valeur) {
		
		this.valeur=valeur ;
		
	}
public void setValeur(T valeur){
		this.valeur=valeur ;
	}
public T getValeur() {
	return this.valeur ;
}
	public String toString() {
		return " "+ this.valeur ;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Solo <Integer> solo1= new Solo <Integer>();
Solo <String> solo2= new Solo <String>("hi");
	}
}
