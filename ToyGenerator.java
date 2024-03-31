import java.util.*;

public class ToyGenerator {

    public List <Toy> GetArrayToy(){

        String[] toysArr = {"Кукла", "Машинка", "Конструктор", "Мяч", "Кубики",
                "Настольная игра", "Пазл", "Мягкая игрушка", "Робот", "Фигурка"};

//        int[] weights = {20, 40, 60};

        List <Toy> toys = new ArrayList<Toy>();

        for (int i = 0; i < toysArr.length; i++) {
            Random rand = new Random();
            int index = rand.nextInt(toysArr.length);
            int ind = rand.nextInt(10,101);
            String name = toysArr[index];
            toys.add(new Toy(i, name, ind));
        }
        return toys;
    }



}