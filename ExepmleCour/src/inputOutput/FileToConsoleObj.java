package inputOutput;
import java.io.*; 
import inputOutput.Game;
public class FileToConsoleObj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			ObjectInputStream ois ; 
			ObjectOutputStream oos ;
			try {
				
				
				oos=new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(new File("Game.txt"))));
				
				oos.writeObject(new Game("assasin","aventure",55.20));
				oos.writeObject(new Game("adsdds","avezzzture",50.10));
				oos.writeObject(new Game("attd","avttre",5.7));
				oos.close();
				
				ois= new ObjectInputStream(new BufferedInputStream(new FileInputStream(new File("Game.txt"))));
				
			try {
System.out.println(((Game)ois.readObject()).toString());
System.out.println(((Game)ois.readObject()).toString());
System.out.println(((Game)ois.readObject()).toString());

			}catch(ClassNotFoundException e) {
			e.printStackTrace();	
			}
		ois.close();
		
			
			}catch(FileNotFoundException e) {
				e.printStackTrace();
			}catch(IOException e) {e.printStackTrace();
	}

}
}