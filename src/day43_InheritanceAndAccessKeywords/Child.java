package day43_InheritanceAndAccessKeywords;

public class Child  extends Parent{
    int x;

    public Child(String parentName){
        super(parentName);
    }
    // üst klass ta boş konstructor yoksa
    // alt klas ın constructor ı
    // en az üst klasın constructor ı kadar şartı sağlamak zorunda
    // super(parametre) şeklinde üst klas ın cons una atıf yapıyoruz

    public void childMethod(){
        System.out.println(x); // metodun x i
        System.out.println(this.x); // Child class ının x i
        System.out.println(super.x);  // Parent class ının x i
    }
}
