package com.app;

public class Scope {
	
	private static int x = 0;
    private int y;	
  

    public Scope ( ) {
	   y = x++;
    }

    public void print () {

	Scope localScope = new Scope();

	System.out.println("Instance nonStatic member=> "+y + ",Instance static member => " + x + ",LocalScope Y=> " + localScope.y + ",LocalScope x => " + localScope.x);
    }

    public static void main (String[] args) {
	for (int i = 0; i < 2; i++) {
		Scope scope = new Scope();
		scope.print();
       }
	
	
	System.out.println("*******");
	
	
	System.out.println();
    }

    
    
    
    
    *****x
}

/*[ OutPut ]for  loop iterating at that time new Operator creating object after evry object instance static 
 * variable create at only once so static area in memory only one copy create but non static member    
 * 
 * Instance nonStatic member=> 0,Instance static member => 2,LocalScope Y=> 1,LocalScope x => 2
 * Instance nonStatic member=> 2,Instance static member => 4,LocalScope Y=> 3,LocalScope x => 4
 */ 
