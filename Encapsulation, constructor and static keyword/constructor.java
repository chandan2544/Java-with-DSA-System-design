class student{
        private int age;
        private String name;

// constructor is used to set and initialize the value at same time
        student(String name,int age){
            this.name=name;
            this.age=age;
        }

        // // setters
        // void setAge(int age){
        //     this.age=age;
        // }

        //getters
        public int getAge(){
            return age;
        }

        // // setters
        // void setName(String name){
        //     this.name=name;
        // }

        //getters
        public String getName(){
            return name;
        }
    }
    public  class constructor {
    
        public static void main(String[] args) {
            student obj=new student("chandan",18);

    //     obj.setAge(18);
    //    obj.setName("jdshgfjh");
        int Stud1Age=obj.getAge();
        String Stud1Name=obj.getName();

        System.out.println(Stud1Age);
        System.out.println(Stud1Name);
        }
    }