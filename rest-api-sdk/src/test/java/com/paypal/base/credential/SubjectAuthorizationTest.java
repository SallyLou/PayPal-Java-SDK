package com.paypal.base.credential;

import org.testng.annotations.Test;

import com.paypal.base.credential.SubjectAuthorization;

public class SubjectAuthorizationTest {

	@Test(expectedExceptions = IllegalArgumentException.class)
	public void illegalArgumentExceptionTest() {
		SubjectAuthorization subjectAuth = new SubjectAuthorization(null);
	}
}
