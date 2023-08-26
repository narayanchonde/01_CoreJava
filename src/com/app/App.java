package com.app;
class Super {
    public int index = 1;
}

class App extends Super {

    public App(int index) {
        index = index;
    }

    public static void main(String args[]) {
        App myApp = new App(10);
        System.out.println(myApp.index);
    }
}
/*
 * [Choose the correct OUTPUT] :
A. 0
B. 10
C. 1  <==ans by creating parent ref variable we can call only parent memeber or parent member of method but we can not call child data 
D. Compile time error

 */
///ans => 1