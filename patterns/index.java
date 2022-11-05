import java.lang.*;
import java.util.*;

class Main {
	public static void main(String args[]) {
// 1.
	int N =5;
    String ans = "";
    for(int i=1;i<=N;i++) {
        ans += "*";
    }
    
    for(int i=1;i<=N;i++) {
        System.out.println(ans);
    }
    
// 2.  
    int N =5;
    String ans = "";
  
    for(int i=1;i<=N;i++) {
        ans += "*";
        System.out.println(ans);
    }
    
// 3. 
    int N =5;
    String ans = "";
   for(int i=1;i<=N;i++) {
        ans += "*";
    }
    
    for(int i=1;i<=N;i++) {
        System.out.println(ans);
        ans = ans.substring(1,ans.length());
    }

// 4.
  int N =5 ;
  String ans ="";
  for(int i=1;i<=N;i++) {
      ans += i + " " ;
      System.out.println(ans);
  }
  
// 5.
 int N =5 ;
 String ans ="";
  for(int i=1;i<=N;i++) {
      ans += i + " " ;
      System.out.println(ans);
  }

// 6.
int N = 5;
String ans = "" ;

for(int i=1;i<=N;i++) {
    ans += "*";
    System.out.println(ans);
}

for(int i=1;i<=N;i++) {
    ans = ans.substring(1,ans.length());
    System.out.println(ans);
}

// 7.
int N = 5;
String ans = "";

for(int i=1;i<=N;i++) {
    for(int j=1;j<=N-i;j++) {
      System.out.print(" ");
    }
   ans += "*";
   System.out.println(ans);
}

// 8.

int N=5;
String ans = "";
String space = "";

for(int i=1;i<=N;i++) {
    ans += "*";
}
for(int i=1;i<=N;i++) {
    System.out.print(space);
    System.out.println(ans);
    ans = ans.substring(1,ans.length());
    space += " ";
}