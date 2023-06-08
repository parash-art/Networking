
package viva;



import java.io.*;
import java.net.*;
import java.util.Scanner;
public class MyClient {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
try{
Socket s=new Socket("192.168.1.143",6666);
DataOutputStream dout=new DataOutputStream(s.getOutputStream());
int m = sc.nextInt();
dout.writeUTF("The number is"+m);
dout.flush();
DataInputStream in = new DataInputStream(s.getInputStream());
String smy = in.readUTF();
    System.out.println("Message from server"+smy);
dout.close();
s.close();
}catch(Exception e){
    System.out.println(e);}
}
}