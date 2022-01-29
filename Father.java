
public  class Father {
    
     int age;
    String profession;
    int income = 20000;
    int total_income=0;
    void age()
    {
        age = 50;
        System.out.println(age);
    }
    void profession()
    {
        profession= "farmer";
        System.out.println(profession);
    }
    void total_income()
    {
 	total_income =total_income+income;
        System.out.println(total_income);
    }

}
