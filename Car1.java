class Car1{
  int no;
  int speed;

  void setNo(int n){
    no = n;
  }
  void run(int s) {
    speed = s;
  }
  void break(){
    speed = 0;
  }
  void break(int s){
    speed = speed-s;
  }
  void display(){
    System.out.println("ナンバー" + no + "の速度は" + speed + "です");
  }
  }
}