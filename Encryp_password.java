import java.io.InputStreamReader;
import java.io.IOException;
import java.io.BufferedReader;

public class Encryp_password{
    int password=1234;
    int user_pass;
    String verif_name;
    int verif_num;
    int attempts=0;
    char[] characters;
    int tries=3;
    final String message="gjggdkjk";
    final int key=5;

Encryp_password(){
}   
public void check()throws IOException{
    System.out.println("Message:"+message);
    System.out.println("To decrypt this message please verify yourself:");
    System.out.println("You have 3 attempts:");
 do{
    if(attempts==3){
      break;
    }
    System.out.println("Enter Password: ");
    BufferedReader reader= new BufferedReader(new InputStreamReader(System.in));
    user_pass=Integer.parseInt(reader.readLine());
    attempts++;
    tries--;
    if(user_pass==password){
      System.out.println("Information matched: ");
      System.out.println(message);
      response();
      break;
    }
    else if(user_pass!=password){
        System.out.println("Invalid Password:");
        System.out.printf("You have %d attempts left: ",tries);
    } 
  }
  while(attempts!=3);
}
public void response(){
    
         characters= message.toCharArray();
         System.out.print("Decrypted message: ");
        for(char c: characters){
              c+=key;
              System.out.print(c);
        }
}

public static void main(String[] args)throws IOException{
     Encryp_password p= new Encryp_password();
     p.check();
}
}

























