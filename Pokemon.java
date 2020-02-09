import java.io.*;
import java.util.*;
import java.util.Scanner;

public class Pokemon{
    Scaner sc = new Scanner(System.in  );
    int level;
    int maxhp;
    int hp; 
    int exp;
    int maxexp;
    int attack;
    int defense;
    String name;
    

    public Pokemon()
    {
        level=1;
        maxhp=100;
        hp=maxhp;
        exp= 0;
        defense =0;
    }
    public String setName(){
        System.out.println("What your name Pokemon Trainer ??? ");
        name = sc.nextLine();
         return "" ;
    }    
    public String startGame(){
        int i;
        for(i=0;i<15;i++ ){
          if(i == 2){
            exp += 6;
            System.out.println(" exp :"+exp);
   
          }
          else if(exp >= 18){
            hp -= 15;
            exp = 0;
            System.out.println(" exp :"+exp);
            System.out.println(" hp:"+hp);
          }
          else if(i == 14){
            i = 0;
          }
          else if(hp <= 0){
            System.out.println("!!! DEAD !!!");
            break;    
          }
        }
        return "";
      }
}