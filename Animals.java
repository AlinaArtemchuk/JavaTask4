public class Animals {
    private static String name;
    private static String color;
  public Animals(String name, String color) {
      this.name = name;
      this.color = color;
  }
       public String getColor() {
            return color;
        }
        public void setColor (String color) {
            this.color = color;

        }
    public String getName() {
        return name;}
        public void setName (String name) {
            this.name = name;
        }
    public void sayHello (){
        System.out.println("Hello, my name is "+ name +". " + "My color is " + color+".");
    }
        public static void main(String[] args) {
        Animals Snizhok = new Animals("Snizhok", "white");
        Snizhok.sayHello();

        Animals Barsyk = new Animals("Barsyk", "red");
        Barsyk.sayHello();
  }

    };