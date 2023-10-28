class NonObject {
  public static void main(String[] args) {
    // データの代入
    int[] score1 = {80, 100, 75, 90};
    int[] score2 = {90, 80, 85, 70};
    String[] studentName = {"菅原", "村山", "寺島", "須藤"};
    String[] subjectName = {"数学", "英語"};

    // データの表示
    for (int i = 0; i < studentName.length; i++) {
      System.out.println(studentName[i] + "さんの" + subjectName[i] + "の点数: " + score1[i] + "点");
    }
  }
}

