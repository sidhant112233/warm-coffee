public class illustrat {
    public static void main(String[] args) {
       student s = new student();
       student.id i = s.new id();
       student.name n = s.new name();
        i.get();
        n.show();
    }
}

class student{
    int id = 1;
    String name = "vdac";
    
    class id{
        void get(){
            System.out.println("id = "+id);
        }
        }    
    class name{
        void show(){
            System.out.println("name = "+name);
        }
    }
    } 




    
