import java.util.*;

public class Lottery {

    FileWriter fw;

    public Lottery() {
        this.fw = new FileWriter();
    }

    public void startLottery (){
        List <String> result_list = new ArrayList<>();
        ToyGenerator result = new ToyGenerator();
        List <Toy> res = result.GetArrayToy();
        System.out.println(res);
        while (!res.isEmpty()){
            Random rand = new Random();
            int weight = rand.nextInt(1, 101);

            if (weight <= 20){
                for (int j = 0; j < res.size(); j++){
                    if (res.get(j).getLossRate() > 0 && res.get(j).getLossRate() <= 20){
                        System.out.println(res.get(j));
                        result_list.add(res.get(j).toString());
                        res.remove(j);
                        break;
                    }
                }

            }

            if (weight > 20 && weight <= 40){
                for (int j = 0; j < res.size(); j++){
                    if (res.get(j).getLossRate() > 20 && res.get(j).getLossRate() <= 40){
                        System.out.println(res.get(j));
                        result_list.add(res.get(j).toString());
                        res.remove(j);
                        break;
                    }
                }

            }

            if (weight > 40 && weight <= 100){
                for (int j = 0; j < res.size(); j++){
                    if (res.get(j).getLossRate() > 40 && res.get(j).getLossRate() <= 100){
                        System.out.println(res.get(j));
                        result_list.add(res.get(j).toString());
                        res.remove(j);
                        break;
                    }
                }
            }
        }
        fw.writeInFile(result_list);
    }
}
