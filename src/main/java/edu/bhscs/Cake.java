package edu.bhscs;

public class Cake {

  private int candle; // 蜡烛数量
  private String name; // 蛋糕名字
  private int width; // 蛋糕宽度
  private int height; // 蛋糕高度
  private String frosting; // 装饰

  // ===== Constructor 保持兼容 Baker.bakes =====
  public Cake(int candle, String name) {
    this.candle = candle;
    this.name = name;
    this.height = 5; // 默认高度
    this.frosting = "#"; // 默认装饰
    this.width = Math.max(name.length() + 6, candle * 3);
  }

  // ===== 可调高度和 frosting =====
  public void setHeight(int h) {
    this.height = h;
  }

  public void setFrosting(String f) {
    this.frosting = (f.length() == 0) ? "#" : f;
  }

  public int getCandle() {
    return candle;
  }

  public String getName() {
    return name;
  }

  public int getWidth() {
    return width;
  }

  public int getHeight() {
    return height;
  }

  // ===== Draw cake on table =====
  public void draw(Table t) {
    int tableWidth = t.getWidth();
    int offset; // 蛋糕绘制左边起点

    // ===== 考虑两种情况 =====
    if (tableWidth >= width) {
      // 桌子比蛋糕宽 → 居中蛋糕
      offset = (tableWidth - width) / 2;
    } else {
      // 蛋糕比桌子宽 → 蛋糕从最左开始画，桌子底部对齐
      offset = 0;
    }

    // ===== 顶部蜡烛 =====
    for (int s = 0; s < offset; s++)
      System.out.print(" ");
    int candleSpace = width - candle;
    int leftSpace = candleSpace / 2;
    for (int i = 0; i < leftSpace; i++)
      System.out.print(" ");
    for (int i = 0; i < candle; i++)
      System.out.print("|");
    System.out.println();

    // ===== 顶部蛋糕边 =====
    for (int s = 0; s < offset; s++)
      System.out.print(" ");
    for (int i = 0; i < width; i++)
      System.out.print("=");
    System.out.println();

    // ===== 蛋糕主体 =====
    for (int h = 0; h < height; h++) {
      for (int s = 0; s < offset; s++)
        System.out.print(" ");
      System.out.print("|");

      if (h == height / 2) {
        // 中间显示名字
        int space = width - name.length() - 2;
        int left = space / 2;
        int right = space - left;
        for (int i = 0; i < left; i++)
          System.out.print(frosting.charAt(0));
        System.out.print(name);
        for (int i = 0; i < right; i++)
          System.out.print(frosting.charAt(0));
      } else {
        // 普通蛋糕层
        for (int i = 0; i < width - 2; i++)
          System.out.print(frosting.charAt(0));
      }

      System.out.println("|");
    }

    // ===== 底部 =====
    for (int s = 0; s < offset; s++)
      System.out.print(" ");
    for (int i = 0; i < width; i++)
      System.out.print("-");
    System.out.println();

    // ===== 绘制桌子 =====
    t.draw();
  }
}
