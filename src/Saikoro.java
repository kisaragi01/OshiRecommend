
/**
 *
 * @author 
 */
import java.util.Random;

public class Saikoro {
    //フィールド
    private int atai;

    //メソッド
    public int furu() {
        Random rand = new Random();
        atai = rand.nextInt(12) + 1; // 1から12までの乱数を生成
        return atai;
    }
}
