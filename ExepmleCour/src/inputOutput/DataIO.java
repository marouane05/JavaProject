package inputOutput;
import java.io.*;

public class DataIO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedInputStream bis= null ; 
		BufferedOutputStream bos= null ;
		DataInputStream dis= null ;
		DataOutputStream dos=null ; 
		
		File fo=new File("fichierBis.txt");
		
		try {
			
			bos= new BufferedOutputStream(new FileOutputStream("fichier.txt"));
			dos= new DataOutputStream(bos);
			dos.writeByte(65);
			bos.close();
			
			dis=new DataInputStream(new BufferedInputStream(new FileInputStream("fichier.txt")));
			//dis=new DataInputStream(bis);
	//		int b=dis.readInt();
			dos.writeByte(65);
			dos.writeInt(80);
			dos.writeFloat(65.75f);
			dos.writeDouble(65.890d);
			bos.close();
			
			
		
			System.out.println(dis.readByte());
			System.out.println(dis.readChar());
			System.out.println(dis.readDouble());
			System.out.println(dis.readFloat());
			System.out.println(dis.readInt());
			
		//	System.out.println(b); 
		}catch(FileNotFoundException e){
			e.printStackTrace();}
			catch(IOException e) {
				e.printStackTrace();
		}
		
		
		
		
		
		

	}

}
