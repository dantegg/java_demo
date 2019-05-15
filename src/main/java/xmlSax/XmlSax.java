package xmlSax;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

public class XmlSax {

    static final String xml_url = "http://rss.sina.com.cn/blog/index/cul.xml";
    public static void main(String... args) throws Exception {
        SAXParserFactory spf = SAXParserFactory.newInstance();
        SAXParser saxParser = spf.newSAXParser();
        saxParser.parse(xml_url, new MyHandler());

    }

}
