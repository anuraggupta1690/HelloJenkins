public class Hello{

public static void main(String args[]){

for(int i=1;i<=10;i++){


System.out.println("hello******"+i);

try{
Thread.sleep(1000);}
catch(Exception e){System.out.println(e);}
}
}
}