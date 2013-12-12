package org.jbehave.web;

import org.jbehave.business.Steps;
import org.jbehave.business.StockAlertStatus;
import org.jbehave.core.annotations.*;
import org.mockito.internal.matchers.And;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

@Steps
public class TradingServiceWebSteps {

    private final String GIVER_NAME = "John";
    private final String RECIPIENT_NAME = "James";
    private final String FEEDBACK = "You're kool";

	@Autowired
	@Qualifier("insertFeedbackPage")
	private InsertStockPage insertStockPage;
	@Autowired
	@Qualifier("showFeedbackPage")
	private ShowStockStatusPage showStockStatusPage;




    @BeforeStory
    public void setUp(){
        insertStockPage.open();
    }

    @AfterStory
    public void tearDown(){
        insertStockPage.close();
    }
	@When("I submit a feedback with my name, the recipient’s name and the feedback")
	public void newStockDataIsProvided() {
		insertStockPage.fillForm(GIVER_NAME, RECIPIENT_NAME, FEEDBACK);
		insertStockPage.submitForm();
	}

	@Then("I should see the feedback")
	public void shouldShowFeedbackContent() {
		assertThat(showStockStatusPage.getFeedbackContent(), is(FEEDBACK));
	}

	@Then("I should see the recipient’s name")
	public void shouldShowReceiversName() {
		assertThat(showStockStatusPage.getRecipientsName(), is(RECIPIENT_NAME));
	}

	@Then("I should see my name")
	public void shouldShowGiversName() {
		assertThat(showStockStatusPage.getFeedbackContent(), is(GIVER_NAME));
	}
}
