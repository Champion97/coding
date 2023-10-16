 public boolean areMapsEqual(HashMap<Character,Integer> mapOne, HashMap<Character,Integer> mapTwo) {
        //  mapOne.forEach((key, value) -> {
        //     System.out.println(key + ": " + value);
        // });
        // System.out.println("=================");
        //   mapTwo.forEach((key, value) -> {
        //     System.out.println(key + ": " + value);
        // });
        if(mapOne.size() != mapTwo.size())
        return false;

        for(Map.Entry<Character,Integer> entry : mapOne.entrySet()) {
            char key = entry.getKey();
            int valueOne = entry.getValue();
            int valueTwo = mapTwo.get(key) == null? 0 : mapTwo.get(key);

            if(valueOne != valueTwo) {
                return false;
            }
        }
        return true;
    }
