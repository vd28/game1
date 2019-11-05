import java.util.Scanner;

public class main {
    public static void main(String[] arg){
        Scanner in = new Scanner(System.in);

        System.out.println("1.Начать игру."+"\n"
        +"0.Выход."+"\n"
        );
        int n =  in.nextInt();

        switch (n){
            case 1:{
                Game g1 = new Game();

                int p = 2;
                System.out.println("Число сгенерировано постарайтесь угадать!" +"\n");
                for(int i=0; i <3 ; i++){
                    System.out.println("Введите число: "+"\n");
                    int g = in.nextInt();
                    if(g1.get_number() == g){
                        System.out.println("Выугадали число!\n");
                        break;
                    }
                    System.out.println("Вы не угадали число у вас осталось "+ p +" попыток.");
                    p--;
                }
                break;
            }
            case 0: {
                return;
            }
        }

    }
}
