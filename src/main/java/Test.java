import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.IOException;

public class Test {
    public static void main(String[] args) throws IOException {
        String url = "https://en.wikipedia.org/wiki/Elon_Musk";
        String param1 = "Tesla";
        String param2 = "Musk";
        String param3 = "Gigafactory";
        String param4 = "Elon Mask";


        Document document = Jsoup.connect(url).get();
        Elements elements1= document.getElementsContainingOwnText(param1);
        Elements elements2 = document.getElementsContainingOwnText(param2);
        Elements elements3 = document.getElementsContainingOwnText(param3);
        Elements elements4 = document.getElementsContainingOwnText(param4);

        int sum = elements1.size()+elements2.size()+elements3.size()+elements4.size();

        System.out.println(url+" "+elements1.size()+" "+elements2.size()+" "+elements3.size()+" "+elements4.size()+" " + sum);
        System.out.println("Numbers are");
        System.out.println("          "+param1+" - "+elements1.size()+" hits");
        System.out.println("          "+param2+" - "+elements2.size()+" hits");
        System.out.println("          "+param3+" - "+elements3.size()+" hits");
        System.out.println("          "+param4+" - "+elements4.size()+" hits");
        System.out.println("          "+"Total - "+sum +" hits");



    }
}
