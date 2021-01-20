package jp.ac.uryukyu.ie.e205729;
import java.util.Scanner;


public class Command extends Data {

    int result = 0;
    int sum = 0;

    //コマンドを呼び出し、指定された操作を行うメソッド
    public void Command_input(){

        System.out.printf("数値を入力して選択 \n 1:科目の単位数を記録 \n 2:現在の総単位数を表示 \n");
        
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();

        if (x == 1){
            System.out.printf("記録したい科目のジャンル名を入力してください（ex:人文系科目）");
            Scanner scanner_2 = new Scanner(System.in);
            String sb_name = scanner_2.nextLine();

            //System.out.println(sb_name);

            scanner_2.close();

            for(int i = 0; i < getSubjects().size(); i++){
                
                System.out.printf(getSubjects().get(i).getName());

                if (getSubjects().get(i).getName().equals(sb_name)){

                    System.out.printf("科目の単位数を入力してください \n");
                    Scanner scanner_3 = new Scanner(System.in);
                    int y = scanner_3.nextInt();

                    sum = getSubjects().get(i).getUnit_value() + y;
                    result = getSubjects().get(i).getUnit_value();

                    //System.out.println(y);

                    System.out.printf("単位数を登録しました");

                    scanner_3.close();
                }else{
                    System.out.printf("ジャンル名を認識できませんでした。");
                    break;
                }
                
            }
            
        }

        scanner.close();
        
        

    }



    
    

}
