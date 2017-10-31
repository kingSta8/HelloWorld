public class PhraseOMatic {
    public static void main (String[] args) {

    String[] WordListOne = {"дикий", "опасный", "сильный", "независимый", "целенаправленный", "умный", "невероятный", "блистающий"};
    String[] WordListTwo = {"восхитительный", "доверчивый", "невозможный", "невыносимый", "яркий", "пылающий","плавающий", "строчный", "дымчатый", "кричащий", "обморочный", "умирающий"};
    String[] WordListThree = {"сон.", "обед.", "восторг.", "металл.", "образец.", "пункт назначения.", "крик.", "удар.", "замок.", "корабль."};

    int oneLength = WordListOne.length;
    int twoLength = WordListTwo.length;
    int threeLength = WordListThree.length;

    int rand1 = (int) (Math.random()*oneLength);
    int rand2 = (int) (Math.random()*twoLength);
    int rand3 = (int) (Math.random()*threeLength);

    String phrase = WordListOne[rand1]+" "+WordListTwo[rand2]+" "+WordListThree[rand3];
    System.out.println("Все, что нам нужно - это "+phrase);
    }
}
