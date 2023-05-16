package day48_OOP_Review.ScrumTeam;

public class Spotify {

    public static void main(String[] args) {


    String departmentName="Spotify";
    ProductOwner po = new ProductOwner("Dağhan",30,'M',50000,321321,departmentName);
    BusinessAnalyst ba= new BusinessAnalyst("Ümit",36,'M',45000,300400,departmentName);
    ScrumMaster sm = new ScrumMaster("Emine",34,'F',42000,400500,departmentName);

    Tester tester1 = new Tester("Uğur",30,'M',30000,321645,departmentName,"Java");
    Tester tester2 = new Tester("Ali",30,'M',32000,321646,departmentName,"Java");
    Tester tester3 = new Tester("Eda",30,'F',27000,321647,departmentName,"Java");

    Tester[] testers={tester1,tester2};

    Developer developer1 = new Developer("İsa",28,'M',25000,678543,departmentName,"Phyton");
    Developer developer2 = new Developer("Ahmet",28,'M',25000,678543,departmentName,"Phyton");
    Developer developer3 = new Developer("Emine",28,'F',25000,678543,departmentName,"Phyton");
    Developer developer4 = new Developer("Ziya",28,'M',25000,678543,departmentName,"Phyton");
    Developer developer5 = new Developer("Nuran",28,'F',25000,678543,departmentName,"Phyton");

    Developer [] developers = {developer1,developer2,developer3,developer4};

    ScrumTeam scrumTeam = new ScrumTeam(po,ba,sm);

    scrumTeam.addDeveloper(developer5);
    scrumTeam.addDeveloper(developers);

    scrumTeam.addTester(tester3);
    scrumTeam.addTester(testers);

        System.out.println(scrumTeam);

        System.out.println("------------------");

        for (Tester tester : scrumTeam.testers) {
            System.out.println(tester.name);
            System.out.println(tester.getId());
        }











}
}