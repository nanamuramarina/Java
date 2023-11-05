class Car2 {
  int no;
  int speed;
  
  Car2(){
    no = 0;
  }
  Car2(int n){
    no = n;
  }
  void run(int s) {
    speed = s;
  }
  void breake(){
    speed = 0;
  }
  void breake(int s){
    speed = speed - s;
  }
  void display(){
    System.out.println("ナンバー" + no + "の速度は" + speed + "です");
  }
}