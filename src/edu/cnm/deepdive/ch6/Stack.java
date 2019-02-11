package edu.cnm.deepdive.ch6;

public class Stack {

  private char s[];
  private int putloc, getloc; // put and get indices

  // construct an empty Stack given it's size
  Stack(int size) {
    s = new char[size];  // allocate memory for stack
    putloc =  0;
    getloc = s.length-1;
  }

  // Construct a Stack from a Stack
  Stack(Stack ob) {
    putloc = ob.putloc;
    getloc = ob.getloc;
    s = new char[ob.s.length];

    // copy elements
    for (int i = 0; i < putloc; i++) {
      s[i] = ob.s[i];
    }
  }
    // Construct Stack with initial values
    Stack(char a[]) {
      putloc = 0;
      getloc = a.length-1;
      s = new char[a.length];

      for (int i = 0; i < a.length; ++i) {
        put(a[i]);
      }
    }
    // Put a character into the stack
  void put (char ch) {
    if(putloc == s.length) {
      System.out.println(" - Stack is full.");
      return;
    }

    s[putloc++] = ch;
  }

  // Get a character from the stack.
  char get() {
    if(getloc < 0) {
      System.out.println(" - Stack is empty.");
      return (char) 0;
    }

    return s[getloc--];

  }
}
