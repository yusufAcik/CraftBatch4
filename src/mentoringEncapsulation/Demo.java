package mentoringEncapsulation;

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
}
    public class Demo{

        public static void main(String[] args) {
            Human obj=new Human();
           // System.out.println("obj.age = " + obj.age); age private olduğu için ulaşamayız

            System.out.println("obj.getAge() = " + obj.getAge());
            obj.setAge(30);
            obj.setName("Ali");

            System.out.println(obj.getName()+obj.getAge());

        }

    }




