package node;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class NodeMain {

    private static ObjectMapper mapper = new ObjectMapper();
    public static void main(String[] args) {

        Address address=new Address("hNo -109,Block A, Apartment","ABCDEFDEFD","8349894884");
        NodeParent nodeParent=new NodeParent(26,"dinesh",address);
         JsonNode jsonNode= mapper.valueToTree(nodeParent);
        System.out.println("value "+jsonNode.get("age"));
        System.out.println("value "+jsonNode.get("name"));
        System.out.println("value "+jsonNode.get("address").get("hno"));
        NodeParent object=null;
        try {
             //object = mapper.treeToValue(jsonNode, NodeParent.class);
            String value=jsonNode.toString();
            object =  mapper.readValue(value,NodeParent.class);
        }
       catch (IOException e)
       {
           e.printStackTrace();
       }
        //System.gc();
        //RunTime.getRunTime().gc();

        System.out.println("object  :"+object.getName());
        System.out.println("object  :"+object.getAddress());
        List<Object> list = new ArrayList<Object>();
        while(true)
        {
           Object obj = new Object();
           list.add(obj);
        }

    }
}
