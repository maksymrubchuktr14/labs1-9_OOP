package Lab6;

class Phone {
    Integer number; // Поле number більше не є статичним
    String model;
    Integer weight;

    public Phone(Integer number, String model, Integer weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }
    public Phone(){}

    public static void printphone(Phone[] phones) {
        for (int i = 0; i < phones.length; i++) {
            System.out.println("Phone " + (i + 1) + ":");
            System.out.println("Number: " + phones[i].number);
            System.out.println("Model: " + phones[i].model);
            System.out.println("Weight: " + phones[i].weight);
            System.out.println();
        }
    }

    public void receiveCall(String callerName) {
        System.out.println("Дзвонить " + callerName);
    }

    public Integer getNumber() {
        return number;
    }
     public static void printnumbers (Phone[] phones) {
         for (int i = 0; i < phones.length; i++) {
             if (i == 0) {
                 phones[i].receiveCall("Arsen");
                 System.out.println("Номер телефону: " + phones[i].getNumber());
             } else if (i == 2) {
                 phones[i].receiveCall("Petro");
                 System.out.println("Номер телефону: " + phones[i].getNumber());
             } else {
                 phones[i].receiveCall("Olexiy");
                 System.out.println("Номер телефону: " + phones[i].getNumber());
             }
         }
     }
    public static void sendMessage(Integer... phoneNumbers) {
        System.out.println("Відправлено повідомлення на наступні номери:");
        for (Integer number : phoneNumbers) {
            System.out.println(number);
        }
}}
