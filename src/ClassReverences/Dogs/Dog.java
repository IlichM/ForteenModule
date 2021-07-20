package ClassReverences.Dogs;

class Dog {
    int size;
    String name;

    void bark() {
        if(size > 70) {
            System.out.println("ГАВ мазер факкер!");
        } else if(size > 16) {
            System.out.println("ВУФ Вуффф ага!");
        } else {
            System.out.println("Тяф тяф...");
        }
    }
}

class DogTestDrive {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.size = 80;
        dog1.bark();

        Dog dog2 = new Dog();
        dog2.size = 20;
        dog2.bark();

        Dog dog3 = new Dog();
        dog3.size = 10;
        dog3.bark();
    }
}
