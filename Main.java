
import java.util.Scanner;





/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Room
 */
public class Main {
    public static void main(String[] args) {
    
      // TernayOperator();
      //nese();
      //boyukunuTap();
      //boyukunuTapAsan();
      ikininKokleri();
    
    }
    
        static void TernayOperator(){
                     //Ternay operator           //Nested Ternay
             int data = 14;
             int number = (data==15)? 15 : (30>40)? 30:40 ;
                                   //True : False
              System.out.println(number);

            if(data==15)
            {
                number = 15;
            }
            else{

                if(30>40)
                {
                  number = 30;
                }
                else{
                    number =40;
                }

            }
              System.out.println(number);
        }

        static void nese(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("nese yaz: ");
        int nese = scanner.nextInt();
        switch(nese){
            case 1 :
                System.out.println("1");
                break;
            case 2 :
                System.out.println("4");
                break;
            case 3 : 
                System.out.println("9");
                break;
            default :
                System.out.println("islemir");
                break;
            case 4 : 
                System.out.println("16");
                break;
        }
        
        
    }
    
        static void boyukunuTap(){
            Scanner scanner = new Scanner(System.in);
            System.out.print("birinci reqemi yaz(a): ");
            int a = scanner.nextInt();
            System.out.print("ikincii reqemi yaz(b): ");
            int b = scanner.nextInt();
            System.out.print("ucuncu reqemi yaz(c): ");
            int c = scanner.nextInt();
            
            if (a>b) {
                if (a>c) {
                    System.out.println("a boyukdur");}
                    else if(c>a){
                          System.out.println("c boyukdu");  
                            }else{
                        System.out.println("a = c>b");
                    }
               } else if(b>a){
                        if(b>c){
                            System.out.println("b boyukdu");
                        }else if(c>b){
                            System.out.println("c boyukdu");
                        }else{
                            System.out.println("b=c>a");
                        }
                        }else{
                   if(c>a){
                       System.out.println("c boyukdu");
                   }else if(a>c){
                       System.out.println("a=b>c");
                   }
                   else{
                       System.out.println("a=b=c");
                   }
               }
                
            
        }
    
        static void boyukunuTapAsan(){
                int a = 5;
                int b = 4;
                int c= 2;
                if((a>b)&&(a>c)){
                    System.out.println("a boyukdu");
        }else if((b>a)&&(b>c)){
                    System.out.println("b boyukdu");
        }else if((c>a)&&(c>b)){
                    System.out.println("c boyukdu");
}
        }
        
        static void ikininKokleri(){
            int j = 1;
            for (int i = 2; i < 100000; i*=2,j++) {
                System.out.println("2 ustu " + j + " = " + i);
            }
        }
                
    }
    
    


