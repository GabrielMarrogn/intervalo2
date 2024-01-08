import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int qtd = sc.nextInt();
        int num;
        int dentro = 0;
        int fora = 0;

        
        for(int i = 0; i < qtd; i++){
            num = sc.nextInt();
            if(num >=0 && num<=20){
                dentro++;
            }else{
                fora++;
            }
        }

        sc.close();
        System.out.println(dentro +" in");
        System.out.println(fora +" out");
    }
}
