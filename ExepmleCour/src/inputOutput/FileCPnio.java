package inputOutput;
import java.io.* ;
import java.nio.* ;
import java.nio.channels.*;
public class FileCPnio {

	   
	   
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		   FileInputStream fis ;
		   BufferedInputStream bis ;
		   FileChannel fc ;
		   
		   
		try {
		fis= new FileInputStream(new File("fichier.txt"));
		bis= new BufferedInputStream(fis);
		long time= System.currentTimeMillis();
		while(bis.read()!= -1) {
			
	System.out.println("temps d'execution vs bufferedInputStream"+ (System.currentTimeMillis()-time ));
		fis= new FileInputStream(new File("fichier.txt"));
		fc=fis.getChannel() ; 
		int size= (int) fc.size() ;
		ByteBuffer bBuf=ByteBuffer.allocate(size);
		time=System.currentTimeMillis() ;
		fc.read(bBuf) ;
	//	bBuf.flip();
		System.out.println("temps d execution avec filechannel: "+(System.currentTimeMillis()-time )) ;
		byte[] tab= bBuf.array() ; 
		
		
		
		}
		

	}catch(FileNotFoundException e) {
		e.printStackTrace();
			}catch(IOException e) {e.printStackTrace();}

}
}
