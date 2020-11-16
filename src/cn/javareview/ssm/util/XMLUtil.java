package cn.javareview.ssm.util;

import java.io.File;
import java.io.FileWriter;  
import java.io.IOException;  
import java.io.InputStream;
import java.io.StringWriter;  
import java.net.URL;   
  
import javax.xml.bind.JAXBContext;  
import javax.xml.bind.JAXBException;  
import javax.xml.bind.Marshaller;  
import javax.xml.bind.Unmarshaller;  
import cn.javareview.ssm.po.UserParams;
  
  
public class XMLUtil {
	//java类转xml
	public void java2xml(UserParams p){
//		System.out.println(java.net.URLEncoder.encode("的","utf-8"));
//        List<UserParams> l = new ArrayList<UserParams>();
        
        StringWriter writer = new StringWriter();
//        InputStream read = getClassLoader.getSystemResourceAsStream("cn/javareview/ssm/util/userParams.xml");
        FileWriter fw;
		try {
			//*Emergency absolute route
			fw = new FileWriter("D:/J2EE workspace/Java_Review2016/src/cn/javareview/ssm/util/userParams.xml",false);
//			fw = new FileWriter(read.toString());
			JAXBContext context = JAXBContext.newInstance(UserParams.class);
	        Marshaller m = context.createMarshaller();
	        m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
	        m.setProperty(Marshaller.JAXB_ENCODING, "UTF-8"); //防止文件中文乱码
	        m.marshal(p, writer);
	        m.marshal(p, fw);//==fw.write(xml);
	        String xml = writer.toString();
	        fw.flush();//是清空，非刷新
//	        fw.write(xml);
	        fw.close();
//	        fw.flush();
//	        fw.close();
//	        System.out.println(xml);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	//  xml文件转java类  
	public UserParams xml2java(){
        JAXBContext context2;
        UserParams p2 = null;
		try {
			context2 = JAXBContext.newInstance(UserParams.class);
			Unmarshaller unmarshaller = context2.createUnmarshaller();
	           //class目录 jaxb/bin
	           //URL xmlFileUrl = ClassLoader.getSystemResource("");
//	           URL xmlFileUrl = ClassLoader.getSystemResource("cn/javareview/ssm/util/userParams.xml");
//	           System.out.println(xmlFileUrl.getPath());
			//*Emergency absolute route
	           p2 = (UserParams) unmarshaller.unmarshal(new File("D:/J2EE workspace/Java_Review2016/src/cn/javareview/ssm/util/userParams.xml"));
	              //  SAXReader reader = new SAXReader();
	           //  Document document = reader.read(new File(
	           //Test.class.getClassLoader().getResource("com/test/person.xml").getPath()));
	           // Person p2 = (Person) unmarshaller.unmarshal(new StringReader(document.asXML()));
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        return p2;
	}
}