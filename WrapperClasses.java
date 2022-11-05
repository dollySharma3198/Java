import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

class WrapperClasses
{
    public static void main(String[] args) 
    {
        // int num=57; //primitive
        // Integer num2=89;
        // System.out.println(num2);

        // System.out.println(num2);

        // ArrayList<int> al=new ArrayList<>(); //error

        // Float f=67.89f;
        // Double d=78.0;
        // Character c='A';
        //Autoboxing refers to the conversion of a primitive value into an object of the corresponding wrapper class is called autoboxing.
        // int num=65;
        // Integer inum=num; //auto-boxing
        // System.out.println(inum);

        // Integer iw=78;
        // int ipr=iw;//unboxing 
        // System.out.println(ipr);

        // ArrayList list=new ArrayList();
        // list.add("AMan");
        // list.add(55);//auto-boxing

        // for (Object object : list) {
        //     System.out.println(object);
        // }

        // ArrayList<Integer> list=new ArrayList<Integer>();
        // list.add(55);//auto-boxing
        // list.add(35);//auto-boxing
        // list.add(65);//auto-boxing
        // list.add(85);//auto-boxing
        // list.add("AMan");

        // Collections.sort(list);

        // System.out.println(list);

        // for (int i = 0; i < list.size(); i++) 
        // {
        //     System.out.println(list.get(i)+" is of type "+list.get(i).getClass().getName());
        // }

        // Employee e1=new Employee();
        // e1.setId(101);
        // e1.setName("aman");
        // e1.setSalary(56778.8899);
        // System.out.println(e1);
        // Employee e2=new Employee(102,"Naman",678.89);
        

        ArrayList<Employee> empList=new ArrayList<>();
        // empList.add(e1);
        // empList.add(e2);

        // System.out.println(empList);

        // for (Employee emp : empList) {
        //     System.out.println("Id :"+emp.getId());
        //     System.out.println("Name :"+emp.getName());
        //     System.out.println("Salary :"+emp.getSalary());
        // }

        // Collection<Integer> col=new ArrayList<>();
        // col.add(67);
        // col.add(67);
        // col.add(67);
        // col.add(67);
        // col.add(67);

        // System.out.println(col);

        List<Integer> list=List.of(67,89,75,45,97);
        System.out.println(list);

        Integer arr[]={10,39,47,228,98,34};

        List<Integer> larr =Arrays.asList(arr);
        System.out.println(larr);

        //Qes. Explore all the methods of ArrayList
    }
}
