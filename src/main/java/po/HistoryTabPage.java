package po;

import base.mathods.BaseMethods;
import org.openqa.selenium.By;

public class HistoryTabPage extends BaseMethods {
    private static final By firstHeadingHistory = By.xpath("//h1[@id='firstHeading']");
    private static final By historyButton = By.xpath("//li[@id='ca-history']");

    public HistoryTabPage searchHistoryButton() {
        click(historyButton);
        return this;
    }
    public String getHeadingOfHistory(){return getText(firstHeadingHistory);}
}
