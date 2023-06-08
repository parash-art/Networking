
package viva;




import java.io.*;
import java.net.*;
import java.util.Scanner;
public class MyServer {
    public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
try{
ServerSocket ss=new ServerSocket(6666);
Socket s=ss.accept();//establishes connection
DataInputStream dis=new DataInputStream(s.getInputStream());
int m =dis.readInt(); //return utf to string
System.out.println("message from client "+m);
//int num=m;
//int fact=1;
//int i;
//for(i=1;i<=num;i++){
//    fact = fact*i;
//}
DataOutputStream out=new DataOutputStream(s.getOutputStream());
//out.writeInt(fact);
String smsy=sc.nextLine();
out.writeUTF(smsy);
out.flush();
ss.close();
}
catch(Exception e){
    System.out.println(e);}
}
}