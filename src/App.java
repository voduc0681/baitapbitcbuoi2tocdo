class Car {
    private int speed = 0;
    public int upTo20() {
      speed += 20;
      return speed;
    }
    public int upTo40() {
      speed += 20;
      return speed;
    }
    public int upTo60() {
      speed += 20;
      return speed;
    }
    public static void main(String[] args) {
      Car car1 = new Car();
      int toLanThu1 = car1.upTo20();
      System.out.printf("Tốc độ xe trong lần tăng thứ nhất: %d km/h\n", toLanThu1);
      int toLanThu2 = car1.upTo40();
      System.out.printf("Tốc độ xe trong lần tăng thứ hai: %d km/h\n", toLanThu2);
      int toLanThu3 = car1.upTo60();
      System.out.printf("Tốc độ xe trong lần tăng thứ ba: %d km/h\n", toLanThu3);
      int toLanThu4 = car1.upTo20();
      System.out.printf("Tốc độ xe trong lần tăng thứ tư: %d km/h\n", toLanThu4);
    }
  }
  