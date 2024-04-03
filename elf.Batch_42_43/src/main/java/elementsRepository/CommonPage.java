package elementsRepository;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CommonPage {

	public CommonPage(SearchContext searchContext) {
		PageFactory.initElements(searchContext, this);
	}
	
	@FindBy(id="") private WebElement button;
}
