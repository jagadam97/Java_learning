package HackerRank.data_structure;

import java.util.*;

class Student{
public int id;
public String name;
public double cgpa;
public Student(int id,String name,double cgpa){
    this.id=id;
    this.name=name;
    this.cgpa=cgpa;
}
public int getID(){
    return id;
}
public String getName(){
    return name;
}
public double getCGPA(){
    return cgpa;
}
}

class Priorities{
public List<Student> getStudents(List<String> events){
  List<Student> stlist = new ArrayList<>();
  for(String x:events){
     String temp[]=x.split(" ");
     if(temp[0].equals("ENTER")){
         Student st=new Student(Integer.parseInt(temp[3]),temp[1],Double.parseDouble(temp[2]));
         stlist.add(st);
         Collections.sort(stlist, new comparator());
     }
     if(temp[0].equals("SERVED")){
         if(!stlist.isEmpty())
             stlist.remove(0);
     }
  }
  return stlist;
} 
}
class comparator implements Comparator<Student>{
@Override
public int compare(Student s1,Student s2){
    int res=0;
        if(s1.getCGPA()==s2.getCGPA()){
                if(s1.getName().equals(s2.getName())) 
                return s1.getID()-s2.getID();
                else
                return s1.getName().compareTo(s2.getName());
            }
        else if(s1.getCGPA()>s2.getCGPA())
            res=-1;
        else if(s1.getCGPA()<s2.getCGPA())
            res=1;
    return res;
}
}

public class priorityQueue {
    private final static Scanner scan = new Scanner(System.in);
    private final static Priorities priorities = new Priorities();
    
    public static void main(String[] args) {
        int totalEvents = Integer.parseInt(scan.nextLine());    
        List<String> events = new ArrayList<>();
        
        while (totalEvents-- != 0) {
            String event = scan.nextLine();
            events.add(event);
        }
        
        List<Student> students = priorities.getStudents(events);
        
        if (students.isEmpty()) {
            System.out.println("EMPTY");
        } else {
            for (Student st: students) {
                System.out.println(st.getName());
            }
        }
    }
}
