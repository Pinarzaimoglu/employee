package main;

public class Employee {

    public static final int YEAR_LIMIT = 2021;
    public static final int HOURS_LIMIT = 40;
    public static final int SALARY_LIMIT = 1000;

    private String name;
    private double salary;
    private int workHours;
    private int hireYear;

    public Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public double tax(){
        if(salary > SALARY_LIMIT)
            return (salary*3)/100;
        return 0;
    }

    public double bonus(){
        if(workHours > HOURS_LIMIT)
            return (workHours- HOURS_LIMIT)*30;
        return 0;
    }

    public double raiseSalary(){
        if (YEAR_LIMIT - hireYear < 10) {
            return (salary*5/100);
        }else if(YEAR_LIMIT -hireYear > 9 && YEAR_LIMIT -hireYear < 20){
            return (salary*10)/100;
        }else
            return (salary*15)/100;
    }

    public String toString(){
        System.out.println("Adı : " + name+"\nMaaşı : "+ salary +"\nÇalışma Saati : " + workHours);
        System.out.println("Başlangıç Yılı : " + hireYear + "\nVergi : "+ tax());
        System.out.println("Bonus : " + bonus() + " TL\n"+"Maaş Artışı : " + raiseSalary());
        System.out.println("Vergi ve Bonuslar ile birlikte maaş : " + (salary+bonus()-tax()) + "\nToplam Maaş : " + (salary+bonus()-tax()+raiseSalary()));
        return null;
    }
}