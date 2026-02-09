/******************************************************************************

Welcome to GDB Online.
  GDB online is an online compiler and debugger tool for C, C++, Python, PHP, Ruby, 
  C#, OCaml, VB, Perl, Swift, Prolog, Javascript, Pascal, COBOL, HTML, CSS, JS
  Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
public class Main
{


static Scanner reader=new Scanner(System.in);

///////////////////////////////////////////////////////////////

public static void printOdd(BinNode<Integer> t) {
    if (t!=null){
      printOdd(t.getLeft());
      printOdd(t.getRight());
      
      if (t.getValue()<0)
      System.out.println(t.getValue());
    }
}

///////////////////////////////////
/*
public static void printEven(BinNode<Integer> t) { 

if (t==null)
return; 


if(t.getValue()%2==0)
if (!t.hasLeft()||t.getLeft().getValue%2==0){
if (!t.hasRight()||t.getRight().getValue%2==0){
    System.out.println(t.getValue());
} 

printEven(t.getLeft());
printEven(t.getRight());
    
}
}
**/




//////////////////////////////////

public static int printEvenb(BinNode<Integer> t) {

    if (t == null)
        return 0; 

    int count = 0;

    if (t.getValue() % 2 == 0)
        if (!t.hasLeft() || t.getLeft().getValue() % 2 == 0)
            if (!t.hasRight() || t.getRight().getValue() % 2 == 0) {
                System.out.println(t.getValue());
                count = 1;
            }

    return count + printEvenb(t.getLeft()) + printEvenb(t.getRight());
}


/////////////////////////////
public static boolean hasEvenC(BinNode<Integer> t) {

    if (t == null)
        return false;

    if (t.getValue() % 2 == 0)
        if (!t.hasLeft() || t.getLeft().getValue() % 2 == 0)
            if (!t.hasRight() || t.getRight().getValue() % 2 == 0)
                return true;

    return hasEvenC(t.getLeft()) || hasEvenC(t.getRight());
}

///////////////////////////////

public static boolean allEvenD(BinNode<Integer> t) {

    if (t == null)
   return true;  
    if (t.getValue() % 2 != 0)
    return false;
    if (t.hasLeft() && t.getLeft().getValue() % 2 != 0)
   return false;
    if (t.hasRight() && t.getRight().getValue() % 2 != 0)
        return false;
return allEvenD(t.getLeft()) && allEvenD(t.getRight());
}








/////////////////////////////
public static int ex12(BinNode<Integer> t) {
int count=0;
if (t==null)
return 0; 


if(t.getValue()>=10&&t.getValue()<100)
count=1;

return count+ex12(t.getLeft())+ ex12(t.getRight());

    
}

//////////////////////////////////
public static <T> int ex14(BinNode<T> t) {
int count=0;
if (t==null)
return 0; 


if(t.getLeft()==null&&t.getRight()==null)
count=1;

return count+ex14(t.getLeft())+ ex14(t.getRight());

    
}
///////////////////////////////
public static int ex16(BinNode<Integer> t) {
if (t==null)
return 0; 


if(t.getLeft()!=null&&t.getRight()!=null)
return t.getValue()+ex16(t.getLeft())+ ex16(t.getRight());

return ex16(t.getLeft())+ ex16(t.getRight());

    
}

/////////////////////////////
public static int ex17(BinNode<Integer> t) {
int count=0;
if (t==null)
return 0; 


if((t.getLeft()!=null&&t.getRight()!=null)&&(t.getLeft().getLeft()!=null&&t.getLeft().getRight()!=null&&t.getRight().getRight()!=null&&t.getRight().getLeft()!=null))
count=1;

return count+ex17(t.getLeft())+ ex17(t.getRight());



    
}

////////////////////////////
public static boolean ex18(BinNode<Integer> t1,BinNode<Integer> t2) {
if (t1==null)
    return true;
if (t2 == null) 
    return false;
if (t1.getValue()!=t2.getValue())
    return false;
    
return ex18(t1.getLeft(),t2.getLeft())&&ex18(t1.getRight(),t2.getRight());
}

/////////////////////////////////////////
public static boolean ex20(BinNode<Integer> t,int n) {
if (t==null)
    return true;
if ((t.getValue()>n)&&(t.getValue()==(t.getLeft().getValue||t.getRight().getValue())))
return false;

return ex20(t.getLeft(),n)&&ex20(t.getRight(),n);
}






//////////////////////////////////////

public static boolean AllEven(BinNode<Integer> t) {

    if (t == null)
        return true; 

if(t.getLeft()==null&&t.getRight()==null){
if (t.getValue()%2==1)
return false;
  
}
 
  return ((AllEven(t.getLeft()) && AllEven(t.getRight())));
    

}


///////////////////////////
public static boolean ex3(BinNode<Integer> t) {

    if (t == null)
        return true; 

if(t.hasRight()){
if (!(t.hasLeft()))
return false;
  
}

 
  return ((ex3(t.getLeft()) && ex3(t.getRight())));
    

}


///////////////////////////

public static int count(BinNode<Integer> t, int n) {

if (t==null)
return 0;

if (t.getValue()==n)
return (1+count(t.getLeft(),n)+count(t.getRight(),n);

return count(t.getLeft(),n)+count(t.getRight(),n);



////////////////////////

public static int max(BinNode<Integer> t) {

if (t==null)
return 0;

return Math.max(t.getValue(),Math.max(max(t.getLeft()),max(t.getRight())));





///////////////////////////

public static int min(BinNode<Integer> t) {

if (t==null)
return 100000;

return Math.min(t.getValue(),Math.min(min(t.getLeft()),min(t.getRight())));


///////////////////////


public static int ex23(BinNode<Integer> t) {

return max(t)-min(t);



///////////////////////

public static int ex27(BinNode<Integer> t) {
if (!t.hasLeft()&& !t.hasRight()
return 1;

if (!t.hasLeft)
return ex27(t.getRight())+1;

if (!t.hasRight)
return ex27(t.getLeft())+1;


return Math.max(ex27(t.getLeft())+1,ex27(g.getRight())+1);


 
 
///////////////////////
public static boolean ex26(BinNode<Integer> t) {
    
return ex14(t)==Math.pow(2,ex27(t))   


///////////////////
public static boolean ex22(BinNode<Integer> t) {
if (!t.hasLeft()&& !t.hasRight()
return true;

if (!t.hasLeft())
return false;

if (!t.hasRight())
return false;

return ex22(t.getLeft())&&ex22(g.getRight());


////////////////////////
public static boolean ex21(BinNode<Integer> t) {

if (t==null)
return true;

if Math.abs(ex27(t.getLeft())-ex27(t.getRight()))<1
return true;

return ex21(t.getLeft())&&ex21(t.getRight())


/////////////////////////////




	public static void main(String[] args) {
	    
       // יוצרים עץ לבדיקה
        BinNode<Integer> n1 = new BinNode<>(2);
        BinNode<Integer> n2 = new BinNode<>(4);
        BinNode<Integer> n3 = new BinNode<>(6);
        BinNode<Integer> n4 = new BinNode<>(3);  // צומת בעייתי

        BinNode<Integer> leftSub = new BinNode<>(n1, 8, n2); // 8 עם ילדים 2 ו-4
        BinNode<Integer> rightSub = new BinNode<>(n3, 10, n4); // 10 עם 6 ו-3

        BinNode<Integer> t = new BinNode<>(leftSub, 12, rightSub); // 12 עם שני תתי עצים

      
		//System.out.println(t);

		//printOdd(t);
		
		
		//printLeft(t15);
		
		//System.out.println(printEvenb(t));
		
		System.out.println(ex12(t));
		System.out.println(ex14(t));
		System.out.println(ex16(t));
		System.out.println(ex17(t));
		
		System.out.println(AllEven(t));
		System.out.println(ex3(t));
	}
	
}
	    
	    
	    
	    
