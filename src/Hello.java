public class Hello {
    public static void main(String[] args) {
        byte b = 127;
        b ++; // 정수의 overflow

        int i = (char)b;

        int[] score; // 배열을 선언한다.
        score = new int[5]; // 배열을 생성한다. (5개의 int 값을 저장할 수 있는 공간 생성)

        score[0] = 100;
        score[1] = 90;
        score[2] = 80;
        score[3] = 70;
        score[4] = 60;

        System.out.println(score[1]);


        System.out.println(i);
        System.out.println(b);
        System.out.println("Hello World!"); // 화면에 글자 출력

        Tv t;
        t = new Tv();
        t.channel = 7;
        t.channelDown();
        System.out.println(t.channel);
    }
}
