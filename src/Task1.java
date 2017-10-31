public class Task1 {
    public static void main(String[] args) {

        String[] LetterList = {"a","b","c","d","e"};
        String[] NumberList = {"0","2","4","6","8"};

        /*int LetterLength = LetterList.length;
        int NumberLength = NumberList.length;*/

        for (int x=0; x<=5; x++) {
            System.out.print(String.join(NumberList[x],LetterList[x]));
        }
    }
}
