package TestPage;

import java.util.ArrayList;
import java.util.List;

public class MainTest {

    public static void main(String[] args) {

        PageParam pageParamA =new PageParam("aa","taa");
        PageParam pageParamB =new PageParam("bb","tbb");
        PageParam pageParamC =new PageParam("cc","tcc");
        PageParam pageParamD =new PageParam("dd","tdd");

        List<PageParam> pageParamList=new ArrayList<PageParam>();
        pageParamList.add(pageParamA);
        pageParamList.add(pageParamB);
        pageParamList.add(pageParamC);
       // pageParamList.add(pageParamD);

        List<PageParam> pageParamSecond=new ArrayList<PageParam>();
        pageParamSecond.add(pageParamA);
        pageParamSecond.add(pageParamB);
        pageParamSecond.add(pageParamC);
        pageParamSecond.add(pageParamD);

        for(PageParam pageParam:pageParamSecond)
        {
            pageParamList.stream();
            if(pageParamList.stream().anyMatch(e->(e.getName().equals(pageParam.getName()) && e.getType().equals(pageParam.getType()))))
            {
                System.out.println(pageParam.getName() +" present");
            }
            else
            {
                System.out.println(pageParam.getName() +" not present");
            }
        }

    }
}
