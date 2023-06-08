package com.loop.test.day08_webtables_config;

import com.loop.test.base.TestBase;
import com.loop.test.utilities.DocuportConstants;
import com.loop.test.utilities.DocuportUtilities;
import org.testng.annotations.Test;

public class T1_login_docuport extends TestBase {
    @Test
    public void test_login_logout(){
        DocuportUtilities.login(driver, DocuportConstants.CLIENT);
        DocuportUtilities.logOut(driver);

        DocuportUtilities.login(driver, DocuportConstants.ADVISOR);
        DocuportUtilities.logOut(driver);

        DocuportUtilities.login(driver, DocuportConstants.SUPERVISOR);
        DocuportUtilities.logOut(driver);

        DocuportUtilities.login(driver, DocuportConstants.EMPLOYEE);
        DocuportUtilities.logOut(driver);
    }
}
