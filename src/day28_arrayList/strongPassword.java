package day28_arrayList;

public class strongPassword {

    public static void main(String[] args) {

        String password = "Cydeo1990@";

        boolean r1 = password.length() >= 8 && !password.contains(" ");
        boolean r2 = false;//has upper case
        boolean r3 = false; //has lower case
        boolean r4 = false; // has special char
        boolean r5 = false; // has digit

        char[] chars = password.toCharArray();

        for (char each : chars){

            if (Character.toUpperCase(each)){
                r2 = true;
            }else if (Character.toLowerCase(each)){
                r3 = true;

            }else if (Character.isDigit(each)){
                r5 = true;

            }else {//special char
                r4=true;
            }

        }




    }



}
