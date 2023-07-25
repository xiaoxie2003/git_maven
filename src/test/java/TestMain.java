import org.junit.Before;
import org.junit.Test;
import yc.xx.JiSuan;

public class TestMain {
    private JiSuan jiSuan;

    @Before
    public void brforeJS(){
        jiSuan = new JiSuan();
    }

    @Test
    public void add(){
        jiSuan.add(3,4);
    }
}
