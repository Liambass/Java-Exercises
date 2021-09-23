Consider the following class, which takes in a new MorseTranslator object and uses its translate() function on a String passed into it:
```
public class Runner {
    public static void main(String[] args) {
        MorseTranslator translator = new MorseTranslator();
        System.out.println(translator.translate(".--- .- ...- .- / .. ... / -.-. --- --- .-.. / --- -.-"));
    }
}
```
Write the MorseTranslator class, using a HashMap, to complete this exercise.
