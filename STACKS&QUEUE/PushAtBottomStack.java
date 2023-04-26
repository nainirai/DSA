public static void PushAt(Stack<Integer> s,int data){
  if(s.isEmpty){
    s.push(data);
    return;
  }
  int top=s.pop();
  PushAt(s,data);
  s.push(top);
}
