package pier;

public class Test {

    public static void main(String[] args) {
        De de1 = new De(0, 6);
        De de2 = new De(1, 6);
        De de3 = new De(2, 6);
        
        de1.piper();
        de2.piper();
        de3.piper();
        de1.lancer();
        de2.lancer();
        de3.lancer();

        
        System.out.println(de1);
        System.out.println(de2);
        System.out.println(de3);
    }

}
