import java.io.InputStreamReader;
import java.io.IOException;
import java.io.BufferedReader;

public class Project{
    String name="Arisha";
    int phn_num=123; 
    String verif_name;
    int verif_num;
    int attempts=0;
    char[] characters;
    int rply;
    int tries=3;
    final String message="gjggdkjk";
    final int key=5;

Project(){
}   
public void check()throws IOException{
    System.out.println("Message:"+message);
    System.out.println("To decrypt this message please verify yourself:");
    System.out.println("You have 3 attempts:");
    do{
     if(attempts==3){
      break;
    }
    System.out.println("Enter name: ");
    BufferedReader reader= new BufferedReader(new InputStreamReader(System.in));
    verif_name=reader.readLine();
    System.out.println("Enter Phone Number: ");
    verif_num=Integer.parseInt(reader.readLine());
    attempts++;
    tries--;
    if(attempts==3){
      System.out.println("You've entered wrong information 3 times!:");
      break;
    }
    if(verif_name.equals(name) && verif_num==phn_num){
      System.out.println("Information matched: ");
      System.out.println(message);
      response();
      break;
    }
    else if(!verif_name.equals(name)){
        System.out.println("Invalid name:");
        System.out.printf("You have %d attempts left: ",tries);
    }
    else if(verif_num!=phn_num){
        System.out.println("Invalid number:");
        System.out.printf("You have %d attempts left: ",tries);
    }
  }
  while(attempts!=3);
}
public void response()throws IOException{
    characters= message.toCharArray();
         System.out.print("Decrypted message: ");
        for(char c: characters){
              c+=key;
              System.out.print(c);
        }
}
public static void main(String[] args)throws IOException{
     Project p= new Project();
     p.check();
}
}

























