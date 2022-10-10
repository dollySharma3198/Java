class Animal {
    int legs;
    String breed;
    float weight;
    char gender;

    Animal() {
        System.out.println("default constructor");

    }

    Animal(int l, String b, float w, char gen) {
        legs = l;
        breed = b;
        weight = 30.5f;
        gender = 'M';
    }

    public void showDetails()

    {
        System.out.println("legs of the animal is: " + legs);
        System.out.println("Breed of the animal is: " + breed);
        System.out.println("weight of the animal is: " + weight);
        System.out.println("gender of the animal is: " + gender);

    }
}

public class ObjectEmployee {

    public static void main(String[] args) {
        Animal a1 = new Animal(); // default constructor
        Animal a2 = new Animal(4, "labra", 50.30f, 'M');
        a2.showDetails();
    }
}
