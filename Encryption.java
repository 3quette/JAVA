public class Encryption{
    public static void main(String[] args){
        int key=2;
        String msg="hello world";
        char[] characters= msg.toCharArray();
        for(char c: characters){
              c+=key;
              System.out.print(c);
        }
    }
}