package hw_1;

import org.apache.pdfbox.exceptions.*;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import java.io.IOException;

/**
 * Created by bkolev on 4.12.2014 г..
 */
public class DeckOfCards {
    public static void main(String[] args) throws IOException, COSVisitorException {

        String[] cards = {"A","K","D", "J", "10", "9", "8", "7", "6", "5", "4", "3", "2"};
        String[] colors = {"\u2660", "\u2665", "\u2666", "\u2663"};

        int colorsLen = colors.length;
        int cardsLen = cards.length;

        for (int i = 0; i < colorsLen; i++) {
            for (int j = 0; j < cardsLen; j++) {
                System.out.println(cards[j] + new String(colors[i].getBytes("UTF-8")));
            }
        }

        //todo: dependencies needed - 'http://pdfbox.apache.org/dependencies.html'
        /*PDDocument document = new PDDocument();
        PDPage blankPage = new PDPage();
        document.addPage( blankPage );
        document.save("BlankPage.pdf");
        document.close();*/

    }
}
