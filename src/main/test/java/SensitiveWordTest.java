import com.daojia.bst.sensitiveword.contract.ISensitiveWordService;
import com.daojia.spat.dsf.client.DSFInit;
import com.daojia.spat.dsf.client.proxy.builder.DSFProxyFactory;
import org.junit.Before;
import org.junit.Test;

import java.util.Set;

public class SensitiveWordTest {
 
    private ISensitiveWordService sws;
     
    @Before
    public void start(){
        //初始化DSF
        DSFInit.init("/opt/projects/hockdayCMSdemo/config/dsf.config");
        sws = DSFProxyFactory.create(ISensitiveWordService.class, "tcp://sensitiveWord/SensitiveWordServiceImpl");
    }

    @Test
    public void test() {
        //精准过滤，只能匹配到完整的敏感词，例如：能匹配到"信用卡套现"，不能匹配到"信#用#卡#套#现"
        System.out.println(sws.sensitiveWordFiltering("你需要信用卡套现吗？", "*"));
        //忽略符号过滤，如果敏感词之间有非数字、非英文、非汉字字符同样可以过滤出来，例如：能匹配"信用卡套现"，也能匹配"信#用#卡#套#现"
        System.out.println(sws.sensitiveWordFilteringIgnoreSign("你需要信#用#卡#套#现吗？", "*"));
        Set<String> sw = sws.querySensitiveWords("你需要信用卡套现吗？要账公司可以替你要债！");
        System.out.println(sw);
        sw = sws.querySensitiveWordsIgnoreSign("你需要信 用卡套现吗？要账，公司可以替你要、债！");
        System.out.println(sw);
    }
}