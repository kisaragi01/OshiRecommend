
/**
 *
 * @author 鈴木瑞貴
 */



public class Tsukau {

    public static void main(String[] args) {
        Saikoro saikoro1 = new Saikoro();
        Saikoro saikoro2 = new Saikoro();

        for (int i = 1; i <= 5; i++) {
            int result1 = saikoro1.furu();
            int result2 = saikoro2.furu();

            System.out.println("サイコロ1の" + i + "回目の結果: " + result1);
            System.out.println("サイコロ2の" + i + "回目の結果: " + result2);
        }
        
        
    }

}
