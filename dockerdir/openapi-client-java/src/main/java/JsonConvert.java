import com.alibaba.fastjson.JSON;

/**
 * Created by dmz on 2016/9/12.
 */
class A{
    private Boolean isA;

    public String getIsB() {
        return isB;
    }

    public void setIsB(String isB) {
        this.isB = isB;
    }

    private String isB;
    public Boolean getIsA() {
        return isA;
    }

    public void setIsA(Boolean a) {
        isA = a;
    }
}
public class JsonConvert {
    public static void main(String[] args) {
        String str = "{\"isA\":false}";
        A a = JSON.parseObject(str, A.class);
        System.out.println(a);
    }
}
