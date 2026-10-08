// public class employeename {
//     string name;
//     int age;
//     salary double;

//     public employeename(string name, int age, double salary) {
//         this.name = name;
//         this.age = age;
//         this.salary = salary;

//         void display() {
//             System.out.println("Name: " + name);
//             System.out.println("Age: " + age);
//             System.out.println("Salary: " + salary);
//         }

//         static void main(string[] args) {
//             employeename emp1 = new employeename("Sahil", 21, 5000.0);
//             employeename emp2 = new employeename("Rohit", 22, 6000.0);

//             emp1.display();
//             emp2.display();
//         } 
        
//         static void main() {
//             greet();
//             employeename emp1 = new employeename("Sahil", 21, 5000.0);
//             employeename emp2 = new employeename("Rohit", 22, 6000.0);
//             emp1.display();
//             emp2.display();
//         }
//       }

// }



// public class employeename {
//     //instance variables
//     String name; 
//     int Id;
//     int age;
//     double salary;

//     //instance methods
//     void detail(){
//         System.out.println("Name " +name);
//         System.out.println("Id " +Id);
//         System.out.println("Age " +age);
//         System.out.println("Salary " +salary);
//     }
//     double yearypackage() {
//         return 12*salary;
//     }

//     static void main(String[] args) {
//         employeename em = new employeename();
//         em.name = "Sahil";
//         em.Id = 210;
//         em.age = 19;
//         em.salary = 5000;
//         // employeename em1 = new employeename();
//         employeename em1;
//         em1 = em;
//         em1.name = "Sagu";
//         em1.Id = 171;
//         em1.age = 19;
//         em1.salary = 7000;
//         em1.detail();
//         em.detail();
//     }
  
// }






// public class employeename {
//     // max of 3 a,b,c
//     public static void main(String[] args) {
//         int a = 10, b = 20, c = 30;
//         int max = max(a, b, c);
//         System.out.println("Max of " + a + ", " + b + ", " + c + " is: " + max);
//     }

//     static int max(int a, int b, int c) {
//         int max = a;
//         if (b>max) {
//             max = b;
//         }
//         if (c>max) {
//             max = c;
//         }
//         return max;
//     }
// }





