class Echo {
  public static void main (String[] args) {
    int i ;
    // コマンドラインの入力文字列を表示(for文)
    for(i = 0; i < args.length; i++){
      System.out.println(args[i]);
    }
    System.out.println(i);
  }
}