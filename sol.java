import java.util.HashMap;

public  class sol {


    public static int lengthval(String s){

        HashMap<Character , Integer>  charmap = new HashMap<>();

        int maxlength = 0;
        int left = 0;

        for(int right =0 ;right < s.length() ; right++){

            char currentchar = s.charAt(right);

            if(charmap.containsKey(currentchar) ){

                left = Math.max(  charmap.get(currentchar) +1, left);
            }

            charmap.put(currentchar, right);

            maxlength = Math.max(maxlength, right - left +1);


        }

        return maxlength;

    }

  public static void main(String[] args) {

  System.out.println(  lengthval("abcabcbb"));
   
    
  }

    
}