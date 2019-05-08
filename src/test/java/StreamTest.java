import org.junit.Test;
import test.Aitem;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamTest {
    @Test
    public void testStream() throws Exception{
        System.out.println("hahha");
        List<Aitem> AList = new ArrayList<Aitem>();
        Aitem item = new Aitem(123L, "testname");
        Aitem item1 = new Aitem(1233L, "testname1");
        AList.add(item);
        AList.add(item1);
        Optional<Aitem> firstA = AList.stream().filter(a -> "testname".equals(a.getUserName())).findFirst();
        if (firstA.isPresent()) {
            Aitem a = firstA.get();
            System.out.println(a.getUserName() + " name is ");
        } else {
            System.out.println("no no no");
        }
        List<Aitem> listAitem = AList.stream().filter(a -> "testname".equals(a.getUserName())).collect(Collectors.toList());
        System.out.println(listAitem);
        List<Long> listAll = AList.stream().map(Aitem::getId).collect(Collectors.toList());
        System.out.println(listAll);
    }
}
