package Lab6;

class Person {
    String fullName;
    Integer age;

    public Person (String fullName, Integer age){
        this.fullName = fullName;
        this.age = age;
    }
    public Person () {
        this.fullName = "Person_1";
        this.age = 19;
}
    public void move() {
        System.out.println(fullName + " moves.");
    }

    public void talk() {
        System.out.println(fullName + " talks.");
    }
    public String getFullName() {
        return fullName;
    }

    public int getAge() {
        return age;
    }
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setAge(int age) {
        this.age = age;
    }

}

