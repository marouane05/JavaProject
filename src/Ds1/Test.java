/***** ZAIL ISHAK *****/

package Ds1;

public class Test {

	public static void main(String[] args) {

        String f = "C:\\Users\\Client12\\Desktop\\ZailIshak\\DS1\\file.txt";
        String f2 = "file2.txt";
        MyBuffer buffer = new MyBuffer(100);

//        procssor.start();
//        procssor2.start();
        new Lecteur(f,"Thread1",buffer).start();
        //new Lecteur(f2,"Thread1",buffer).start();

}
}
