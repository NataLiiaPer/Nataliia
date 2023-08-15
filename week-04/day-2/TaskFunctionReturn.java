public class TaskFunctionReturn {
    public static void main(String[] args) {
numberToFind(5);

        }

//        public static String numberToFind (int x){
//        int[] array = {1,-5,10,3,7,1,10};
//
//        for (int i = 0;i<array.length; i++) {
//            if (array[i] == x) {
//           //     System.out.println("true");
//                return ("true"); // the end of the method
//            }
//        }
//        return ("false");
//    }


    public static void numberToFind (int x){
        int[] array = {1,-5,10,3,7,1,10};

        for (int i = 0;i<array.length; i++) {
            if (array[i] == x) {
                   System.out.println("true");
                return ; // the end of the method
            }
        }
        System.out.println("false");
    }
}

//    cviceni na vyuziti return
//
//        vytvor funkci ktera bude prijimat pole int a int toFind. Funkce vrati true pokud pole obsahuje toFind,
//        vrati false pokud ho neobsahuje
//        priklad
//
//        [1,-5,10,3,7,1,10], toFind: 10
//        true
//
//        [1,-5,10,3,7,1,10], toFind: 60
//        false
//
//        vymyslel jsem to ted z hlavy takze je mozne ze to pujde vyresit i jinak