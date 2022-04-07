class Student {
    String name;
    int rollNo;
    String section;
    String branch;

    Student(){
        name= "Sai";
        rollNo = 14;
        section = "FSD";
        branch = "Software";
    }
    Student(String name1, int rollNo1, String section1, String branch1){
        name = name1;
        rollNo =rollNo1;
        section = section1;
        branch = branch1;
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student("Pavan",7,"Mechanical","Mech");

        System.out.println(s1.name);
        System.out.println(s1.rollNo);
        System.out.println(s1.section);
        System.out.println(s1.branch);

        System.out.println(s2.name);
        System.out.println(s2.rollNo);
        System.out.println(s2.section);
        System.out.println(s2.branch);

    }
}
