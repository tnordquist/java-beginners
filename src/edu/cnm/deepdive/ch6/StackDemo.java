package edu.cnm.deepdive.ch6;

public class StackDemo {

  public static void main(String[] args) {
    Stack s1 = new Stack(10);
    char name[] = {'T', 'o', 'm'};

    Stack s2 = new Stack(name);

    char ch;
    int i;

    // put some charcters into s1
    for(i=0; i < 10; ++i) {
      s1.put((char) ('A' + i));
    }

    // construct stack from another stack
    Stack s3 = new Stack(s1);

    // show the stacks.
    System.out.print("Contents of s1: ");
    for(i = 0; i < 10; ++i) {
      ch = s1.get();

      System.out.print(ch);
    }

    System.out.println("\n");

    System.out.print("Contents of s2: ");
    for(i=0; i < 3; ++i) {
      ch = s2.get();
      System.out.print(ch);
    }
    System.out.println("\n");

    System.out.print("Contents of s3: ");
    for(i=0;i < 10; ++i) {
      ch = s3.get();
      System.out.print(ch);
    }
  }

}
