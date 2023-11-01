class StuSample3 {
  public static void main(String[] args) {
    Student stu1 = new Student("菅原");
    Student stu2 = new Student("村山", 75, 100);

    stu1.setScore(90, 80);
    stu1.display();
    stu2.display();
  }
}
