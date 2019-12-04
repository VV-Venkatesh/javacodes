import java.io.*;
import java.util.*;
import java.math.*;
class FlamesCalculator{
	public static void main(String[] args) {
		String name1,name2;
		int keyLen;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your Name :)");
		name1= sc.nextLine();
        System.out.println("Enter Your Partner Name :)");
        name2=sc.nextLine();
        keyLen=keyFinder(name1,name2);
        System.out.println("Relation between "+name1+" and "+name2+" is "+flamesResult(keyLen)+"!!");
	}
	public static int keyFinder(String text1,String text2){
		int count1=0,count2=0,flag;
		char[] t1=text1.toCharArray();
		char[] t2=text2.toCharArray();
        for (int i=0;i<text1.length() ;i++ ) {
        	flag=0;
        	for (int j=0; j<text2.length();j++ ) {
        		if(t1[i]==t2[j]){
        			t2[j]=' ';
        			flag=1;
        			break;
        		}
             }
        	if(flag==0)
        		count1++;
        }
        t1=text1.toCharArray();
		t2=text2.toCharArray();
         for (int i=0;i<text2.length() ;i++ ) {
        	flag=0;
        	for (int j=0; j<text1.length();j++ ) {
        		if(t2[i]==t1[j]){
        			t1[j]=' ';
        			flag=1;
        			break;
        		}
             }
        	if(flag==0)
        		count2++;
        }
        return count1+count2;
	}
	public static String flamesResult(int kl){
		 List<String> flames=new ArrayList<>();
		 flames.add("Friendship");
		 flames.add("Love");
		 flames.add("Affection");
		 flames.add("Marriage");
		 flames.add("Enemies");
		 if(kl==1){
		 	return flames.get(0);
		 }
		 else{
            int i=flames.size(),adder=0;
            
            while(i>1){
            	int n=flames.size();
            	int aux=(kl%n)+adder;
            	if(aux==0){
            		aux=n;
            	}
            	if(aux>n){
            		aux=aux%n;
            	}
            	adder=aux-1;
                flames.remove(aux-1);
                i--;
            }
		 }
        return flames.get(0);
       
	}
}