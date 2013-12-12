package org.jbehave.web;

import org.springframework.beans.factory.annotation.Autowired;


public class ShowStockStatusPage {

	private static final String FEEDBACK_CONTENT = "feedbackContent";
    private static final String RECIPIENTS_NAME = "recipientsName";

    @Autowired
	private PageUtils pageUtils;
	
	public String getFeedbackContent() {
		return pageUtils.getElementText(FEEDBACK_CONTENT);
	}

    public String getRecipientsName() {
        return pageUtils.getElementText(RECIPIENTS_NAME);
    }
}
