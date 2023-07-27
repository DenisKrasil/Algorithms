package ru.geekbrains.lesson4;

public class Program {

    public static void main(String[] args) {
        System.out.println(-7 % 4);

        // HashMap<String, String> hashMap1 = new HashMap<>(4);

        // String ret = hashMap1.put("+79001112233", "Андрей");
        // ret = hashMap1.put("+79001112232", "Василий");
        // ret = hashMap1.put("+79001112234", "Александр1");
        // ret = hashMap1.put("+79001112235", "Александр2");
        // ret = hashMap1.put("+79001112236", "Александр3");
        // ret = hashMap1.put("+79001112237", "Александр4");
        // ret = hashMap1.put("+79001112212", "Александр4");
        // ret = hashMap1.put("+79001112213", "Александр4");
        // ret = hashMap1.put("+79001112214", "Александр4");

        //ret = hashMap1.get("+79001112233");

        //ret = hashMap1.remove("+79001112233");
        //ret = hashMap1.remove("+79001112233");

        //ret = hashMap1.get("+79001112233");

        HashMap<String,String> hashMap = new HashMap<>();
        hashMap.put("+79225671833", "Denis");
        hashMap.put("+79255531023","Max");
        hashMap.put("+79706571900","Helena");
        hashMap.put("+79255536743","Olga");
        hashMap.put("+79278531023","Max");
        hashMap.put("+79255947523","Pavel");
        hashMap.put("+79245821023","Igor");
        hashMap.put("+79255584950","Kate");
        hashMap.put("+79257849023","Denis");
        hashMap.put("+79394031023","Maria");
        hashMap.put("+79295031023","Alex");
        hashMap.put("+79255896723","Olga");
        hashMap.put("+79255556823","Oksana");

        hashMap.forEach(entity-> System.out.println(entity));
    }

}
