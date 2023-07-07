import java.util.HashMap;
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();
        String C  = sc.next();
        String result = "";
        HashMap<String,String> map = new HashMap<>();
        map.put("black","0");
        map.put("brown","1");
        map.put("red","2");
        map.put("orange","3");
        map.put("yellow","4");
        map.put("green","5");
        map.put("blue","6");
        map.put("violet","7");
        map.put("grey","8");
        map.put("white","9");

        result = map.get(A) + map.get(B);
        for(int i = 0; i < Integer.parseInt(map.get(C)); i++){
            if(map.get(C).equals("black")){
                break;
            }
            result += "0";
        }
        System.out.println(Long.parseLong(result));


    }
    }

