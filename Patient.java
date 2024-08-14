class Patient {
    private String name;
    private int age;
    private int weight;
    private String symptoms;

    public Patient(String name, int age, int weight, String symptoms) {
       this.name = name;
       this.age = age;
       this.weight = weight;
       this.symptoms = symptoms;
    }

    public void display(){
        System.out.println("Name: " +name +", age: " + age + ", weight:" + weight +",symptoms:" + symptoms);
    }

        public static void main(String[] args) {

            Patient anjanPatient = new Patient("anjan phuyal", 22, 70, "fever");
            anjanPatient.display();

            Patient prakashPatient = new Patient("prakash ghimire", 26, 50, " mental illness");
            prakashPatient.display();

            Patient baniyaPatient = new Patient("anjan baniya", 27, 80, "depression");
            baniyaPatient.display();
        }
    
    
    
}
