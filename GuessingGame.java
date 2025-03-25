import java.io.*;
import java.util.*;
class GuessingGame{
public static void main(String[] args) {
	int num,sysNum;
	Scanner sc=new Scanner(System.in);
	Random rand=new Random();
	sysNum=rand.nextInt(100);
	System.out.println("***HI THERE! WELCOME TO GUESSING GAME***\nEnter a number between 0 and 99..Try to guess the right one!");
    do{
    num=sc.nextInt();
    if(num==sysNum){
    	System.out.println("YAY!! Correct,You won the game");
    	break;
     }
    else if(num>sysNum)
    	System.out.println("oops! Select a smaller number");
    else
    	System.out.println("oops! Select a greater number");
   }while(true);
}
}
