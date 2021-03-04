import java.io.Serializable;
class student implements Serializable
{
  int header;
  String data;
  String course;
  int tailer;

  student(int id,String name,String course,int tailer)
   {
    this.header=id;
    this.data=name;
    this.course=course;
    this.tailer=tailer;
    
   }
  void showDetails()
   {
    System.out.println("Id:"+header);
    System.out.println("Name:"+data);
    System.out.println("Course:"+course);
    System.out.println("Teller"+tailer);
   }  
}
