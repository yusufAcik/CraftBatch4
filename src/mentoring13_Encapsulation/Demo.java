package mentoring13_Encapsulation;

 class Human {
    private int age;
    private String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age){
        this.age=age;
    }

    public String getName() {
        return name;
    }

    public void setName(String n){
        this.name=name;
    }

    public Human(){ // default constructor
        age=12;
        name="Ahmet";
        System.out.println("in constructor");
    }

     public Human(int age, String name) {
         this.age = age;
         this.name = name;
         System.out.println("in constructor para");
     }
 }
    public class Demo{

        public static void main(String[] args) {
            Human obj=new Human();
           // System.out.println("obj.age = " + obj.age); age private olduğu için ulaşamayız

            System.out.println("obj.getAge() = " + obj.getAge());
            obj.setAge(30);
            obj.setName("Ali");

            System.out.println(obj.getName()+obj.getAge());

            Human obj1=new Human(42,"Mehmet");

            System.out.println(obj.getName()+":"+obj.getAge());
            System.out.println(obj1.getName()+":"+obj1.getAge());

        }

    }

    /*
    variables ve Metodlar           -> küçük harfle başlar  slow();
    class ve constructor metodlar   -> büyük harfle başlar  Slow();ff

     */




