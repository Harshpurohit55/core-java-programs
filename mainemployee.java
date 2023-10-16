import java.util.*;
class mainemployee 
{
    public static void main(String[] args) 
    {
        Scanner sc= new Scanner(System.in);
        Scanner sc2= new Scanner(System.in);
        emplo e1= new emplo();
        System.out.println("Enter employee Id , Name, Salary");
        e1.id=sc.nextInt();
        e1.name=sc2.nextLine();
        e1.salary=sc.nextInt();
        System.out.println("Employee id :" +e1.id+"\n Employee name :" +e1.name +"\n Employee Salary :" +e1.salary);
        sc.close();
        sc2.close();
    }
    
    
}
