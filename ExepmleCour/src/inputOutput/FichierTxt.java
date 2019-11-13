package inputOutput;
import java.io.*;  

public class FichierTxt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
File file = new File("fichier.txt") ;
FileWriter fw ;
FileReader fr ;
try {
	fw= new FileWriter(file);
	String str= "bonjour à tous \n";
	str+= "comment allez vous? \n";
	fw.write(str);
	fw.close();
	fr=new FileReader(file);
	str=" ";
	int i = 0 ;
	while((i=fr.read()) != -1){
		str +=(char) i ;}
		System.out.println(str);
	}catch(FileNotFoundException e) {
		e.printStackTrace();
	}catch(IOException e) {
		e.printStackTrace();
	}
}

	}


