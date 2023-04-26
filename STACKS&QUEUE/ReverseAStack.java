public static void PushAt(Stack<Integer> s,int data){
  if(s.isEmpty){
    s.push(data);
    return;
  }
  int top=s.pop();
  PushAt(s,data);
  s.push(top);
}

public static ovid reverseStack(Stack<Integer> s){
  if(s.isEmpty){
    return;
  }
  int top=s.pop();
  reverseStack(s);
  PushAt(s, top);
}
public static void printStack(Stack<Integer> s){
  while(!s.isEmpty()){
    System.out.println(s.pop());
  }
}


public static void main(String args[]){
  Stack<Integer> s=new Stack<>();
  s.push(1);
   s.push(2);
   s.push(3);
  
  printStack();
  reverseStack();
  
}
